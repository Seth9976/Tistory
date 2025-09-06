package okhttp3.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A\u0013\u0010\u0001\u001A\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "toCanonicalHost", "(Ljava/lang/String;)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class HostnamesKt {
    public static final InetAddress a(int v, int v1, String s) {
        byte[] arr_b = new byte[16];
        int v2 = 0;
        int v3 = v;
        int v4 = -1;
        int v5 = -1;
        while(v3 < v1) {
            if(v2 == 16) {
                return null;
            }
            if(v3 + 2 > v1 || !p.startsWith$default(s, "::", v3, false, 4, null)) {
                if(v2 != 0) {
                    if(p.startsWith$default(s, ":", v3, false, 4, null)) {
                        ++v3;
                        goto label_49;
                    }
                    if(p.startsWith$default(s, ".", v3, false, 4, null)) {
                        int v6 = v2 - 2;
                        int v7 = v6;
                        while(v5 < v1) {
                            if(v7 == 16) {
                                return null;
                            }
                            if(v7 != v6) {
                                if(s.charAt(v5) != 46) {
                                    return null;
                                }
                                ++v5;
                            }
                            int v8 = v5;
                            int v9 = 0;
                            while(v8 < v1) {
                                int v10 = s.charAt(v8);
                                if(Intrinsics.compare(v10, 0x30) < 0 || Intrinsics.compare(v10, 57) > 0) {
                                    break;
                                }
                                if(v9 == 0 && v5 != v8) {
                                    return null;
                                }
                                v9 = v9 * 10 + v10 - 0x30;
                                if(v9 > 0xFF) {
                                    return null;
                                }
                                ++v8;
                            }
                            if(v8 - v5 != 0) {
                                arr_b[v7] = (byte)v9;
                                v5 = v8;
                                ++v7;
                                continue;
                            }
                            return null;
                        }
                        if(v7 == v2 + 2) {
                            v2 += 2;
                            break;
                        }
                    }
                    return null;
                }
            label_49:
                v5 = v3;
            }
            else {
                if(v4 != -1) {
                    return null;
                }
                v2 += 2;
                if(v3 + 2 == v1) {
                    v4 = v2;
                    break;
                }
                v5 = v3 + 2;
                v4 = v2;
            }
            v3 = v5;
            int v11 = 0;
            while(v3 < v1) {
                int v12 = Util.parseHexDigit(s.charAt(v3));
                if(v12 == -1) {
                    break;
                }
                v11 = (v11 << 4) + v12;
                ++v3;
            }
            if(v3 - v5 != 0 && v3 - v5 <= 4) {
                int v13 = v2 + 1;
                arr_b[v2] = (byte)(v11 >>> 8 & 0xFF);
                v2 += 2;
                arr_b[v13] = (byte)(v11 & 0xFF);
                continue;
            }
            return null;
        }
        if(v2 != 16) {
            if(v4 == -1) {
                return null;
            }
            System.arraycopy(arr_b, v4, arr_b, 16 - (v2 - v4), v2 - v4);
            Arrays.fill(arr_b, v4, 16 - v2 + v4, 0);
        }
        return InetAddress.getByAddress(arr_b);
    }

    @Nullable
    public static final String toCanonicalHost(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        int v = 0;
        int v1 = -1;
        if(StringsKt__StringsKt.contains$default(s, ":", false, 2, null)) {
            InetAddress inetAddress0 = !p.startsWith$default(s, "[", false, 2, null) || !p.endsWith$default(s, "]", false, 2, null) ? HostnamesKt.a(0, s.length(), s) : HostnamesKt.a(1, s.length() - 1, s);
            if(inetAddress0 == null) {
                return null;
            }
            byte[] arr_b = inetAddress0.getAddress();
            if(arr_b.length == 16) {
                Intrinsics.checkNotNullExpressionValue(arr_b, "address");
                int v3 = 0;
                for(int v2 = 0; v2 < arr_b.length; v2 = v4 + 2) {
                    int v4;
                    for(v4 = v2; v4 < 16 && arr_b[v4] == 0 && arr_b[v4 + 1] == 0; v4 += 2) {
                    }
                    int v5 = v4 - v2;
                    if(v5 > v3 && v5 >= 4) {
                        v1 = v2;
                        v3 = v5;
                    }
                }
                Buffer buffer0 = new Buffer();
                while(v < arr_b.length) {
                    if(v == v1) {
                        buffer0.writeByte(58);
                        v += v3;
                        if(v != 16) {
                            continue;
                        }
                        buffer0.writeByte(58);
                    }
                    else {
                        if(v > 0) {
                            buffer0.writeByte(58);
                        }
                        buffer0.writeHexadecimalUnsignedLong(((long)(Util.and(arr_b[v], ((byte)0xFF)) << 8 | Util.and(arr_b[v + 1], ((byte)0xFF)))));
                        v += 2;
                    }
                }
                return "";
            }
            if(arr_b.length != 4) {
                throw new AssertionError("Invalid IPv6 address: \'" + s + '\'');
            }
            return inetAddress0.getHostAddress();
        }
        try {
            String s1 = IDN.toASCII(s);
            Intrinsics.checkNotNullExpressionValue(s1, "toASCII(host)");
            Locale locale0 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale0, "US");
            String s2 = s1.toLowerCase(locale0);
            Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).toLowerCase(locale)");
            if(s2.length() == 0) {
                return null;
            }
            int v6 = s2.length();
            for(int v7 = 0; true; ++v7) {
                if(v7 >= v6) {
                    return s2;
                }
                int v8 = s2.charAt(v7);
                if(Intrinsics.compare(v8, 0x1F) <= 0 || Intrinsics.compare(v8, 0x7F) >= 0 || StringsKt__StringsKt.indexOf$default(" #%/:?@[\\]", ((char)v8), 0, false, 6, null) != -1) {
                    break;
                }
            }
        }
        catch(IllegalArgumentException unused_ex) {
        }
        return null;
    }
}

