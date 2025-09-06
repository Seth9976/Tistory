package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\u001E\u0010\u0003\u001A\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n68#3:77\n74#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        byte[] arr_b = new byte[s.length() * 4];
        int v = s.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = s.charAt(v1);
            if(Intrinsics.compare(v2, 0x80) >= 0) {
                int v3 = s.length();
                int v4 = v1;
            label_9:
                while(v1 < v3) {
                    int v5 = s.charAt(v1);
                    if(Intrinsics.compare(v5, 0x80) < 0) {
                        int v6 = v4 + 1;
                        arr_b[v4] = (byte)v5;
                        ++v1;
                        while(true) {
                            v4 = v6;
                            if(v1 >= v3 || Intrinsics.compare(s.charAt(v1), 0x80) >= 0) {
                                continue label_9;
                            }
                            v6 = v4 + 1;
                            arr_b[v4] = (byte)s.charAt(v1);
                            ++v1;
                        }
                    }
                    if(Intrinsics.compare(v5, 0x800) < 0) {
                        int v7 = v4 + 1;
                        arr_b[v4] = (byte)(v5 >> 6 | 0xC0);
                        v4 += 2;
                        arr_b[v7] = (byte)(v5 & 0x3F | 0x80);
                    }
                    else if(0xD800 > v5 || v5 >= 0xE000) {
                        arr_b[v4] = (byte)(v5 >> 12 | 0xE0);
                        int v11 = v4 + 2;
                        arr_b[v4 + 1] = (byte)(v5 >> 6 & 0x3F | 0x80);
                        v4 += 3;
                        arr_b[v11] = (byte)(v5 & 0x3F | 0x80);
                    }
                    else {
                        if(Intrinsics.compare(v5, 0xDBFF) <= 0 && v3 > v1 + 1) {
                            int v8 = s.charAt(v1 + 1);
                            if(0xDC00 <= v8 && v8 < 0xE000) {
                                int v9 = s.charAt(v1 + 1) + (v5 << 10) - 0x35FDC00;
                                arr_b[v4] = (byte)(v9 >> 18 | 0xF0);
                                arr_b[v4 + 1] = (byte)(v9 >> 12 & 0x3F | 0x80);
                                int v10 = v4 + 3;
                                arr_b[v4 + 2] = (byte)(v9 >> 6 & 0x3F | 0x80);
                                v4 += 4;
                                arr_b[v10] = (byte)(v9 & 0x3F | 0x80);
                                v1 += 2;
                                continue;
                            }
                        }
                        arr_b[v4] = 0x3F;
                        ++v1;
                        ++v4;
                        continue;
                    }
                    ++v1;
                }
                byte[] arr_b1 = Arrays.copyOf(arr_b, v4);
                Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
                return arr_b1;
            }
            arr_b[v1] = (byte)v2;
            ++v1;
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, s.length());
        Intrinsics.checkNotNullExpressionValue(arr_b2, "copyOf(...)");
        return arr_b2;
    }

    @NotNull
    public static final String commonToUtf8String(@NotNull byte[] arr_b, int v, int v1) {
        int v19;
        int v14;
        int v13;
        int v9;
        int v6;
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(v >= 0 && v1 <= arr_b.length && v <= v1) {
            char[] arr_c = new char[v1 - v];
            int v2 = 0;
        label_4:
            while(v < v1) {
                int v3 = arr_b[v];
                if(v3 >= 0) {
                    int v4 = v2 + 1;
                    arr_c[v2] = (char)v3;
                    ++v;
                    while(true) {
                        v2 = v4;
                        if(v >= v1) {
                            continue label_4;
                        }
                        int v5 = arr_b[v];
                        if(v5 < 0) {
                            continue label_4;
                        }
                        ++v;
                        v4 = v2 + 1;
                        arr_c[v2] = (char)v5;
                    }
                }
                if(v3 >> 5 == -2) {
                    if(v1 <= v + 1) {
                        v6 = v2 + 1;
                        arr_c[v2] = '\uFFFD';
                        goto label_68;
                    }
                    else {
                        int v7 = arr_b[v + 1];
                        if((v7 & 0xC0) == 0x80) {
                            int v8 = v3 << 6 ^ (v7 ^ 0xF80);
                            if(v8 < 0x80) {
                                v6 = v2 + 1;
                                arr_c[v2] = '\uFFFD';
                            }
                            else {
                                v6 = v2 + 1;
                                arr_c[v2] = (char)v8;
                            }
                            v2 = v6;
                            v9 = 2;
                            goto label_119;
                        }
                        else {
                            v6 = v2 + 1;
                            arr_c[v2] = '\uFFFD';
                            goto label_68;
                        }
                    }
                    goto label_36;
                }
                else {
                label_36:
                    if(v3 >> 4 == -2) {
                        if(v1 <= v + 2) {
                            v6 = v2 + 1;
                            arr_c[v2] = '\uFFFD';
                            if(v1 > v + 1 && (arr_b[v + 1] & 0xC0) == 0x80) {
                                v2 = v6;
                                v9 = 2;
                                goto label_119;
                            }
                        }
                        else {
                            int v10 = arr_b[v + 1];
                            if((v10 & 0xC0) == 0x80) {
                                int v11 = arr_b[v + 2];
                                if((v11 & 0xC0) == 0x80) {
                                    int v12 = v3 << 12 ^ (v11 ^ 0xFFFE1F80 ^ v10 << 6);
                                    if(v12 < 0x800) {
                                        v13 = v2 + 1;
                                        arr_c[v2] = '\uFFFD';
                                    }
                                    else if(0xD800 > v12 || v12 >= 0xE000) {
                                        v13 = v2 + 1;
                                        arr_c[v2] = (char)v12;
                                    }
                                    else {
                                        v13 = v2 + 1;
                                        arr_c[v2] = '\uFFFD';
                                    }
                                    v2 = v13;
                                    v9 = 3;
                                }
                                else {
                                    arr_c[v2] = '\uFFFD';
                                    ++v2;
                                    v9 = 2;
                                }
                                goto label_119;
                            }
                            else {
                                v6 = v2 + 1;
                                arr_c[v2] = '\uFFFD';
                            }
                        }
                    label_68:
                        v2 = v6;
                    }
                    else if(v3 >> 3 == -2) {
                        if(v1 <= v + 3) {
                            v14 = v2 + 1;
                            arr_c[v2] = '\uFFFD';
                            if(v1 > v + 1 && (arr_b[v + 1] & 0xC0) == 0x80) {
                                if(v1 <= v + 2 || (arr_b[v + 2] & 0xC0) != 0x80) {
                                    v2 = v14;
                                    v9 = 2;
                                }
                                else {
                                    v2 = v14;
                                    v9 = 3;
                                }
                                goto label_119;
                            }
                        }
                        else {
                            int v15 = arr_b[v + 1];
                            if((v15 & 0xC0) == 0x80) {
                                int v16 = arr_b[v + 2];
                                if((v16 & 0xC0) == 0x80) {
                                    int v17 = arr_b[v + 3];
                                    if((v17 & 0xC0) == 0x80) {
                                        int v18 = v3 << 18 ^ (v17 ^ 0x381F80 ^ v16 << 6 ^ v15 << 12);
                                        if(v18 > 0x10FFFF) {
                                            v19 = v2 + 1;
                                            arr_c[v2] = '\uFFFD';
                                        }
                                        else if(0xD800 <= v18 && v18 < 0xE000) {
                                            v19 = v2 + 1;
                                            arr_c[v2] = '\uFFFD';
                                        }
                                        else if(v18 < 0x10000) {
                                            v19 = v2 + 1;
                                            arr_c[v2] = '\uFFFD';
                                        }
                                        else {
                                            arr_c[v2] = (char)((v18 >>> 10) + 0xD7C0);
                                            arr_c[v2 + 1] = (char)((v18 & 0x3FF) + 0xDC00);
                                            v19 = v2 + 2;
                                        }
                                        v9 = 4;
                                        v2 = v19;
                                    }
                                    else {
                                        arr_c[v2] = '\uFFFD';
                                        ++v2;
                                        v9 = 3;
                                    }
                                }
                                else {
                                    arr_c[v2] = '\uFFFD';
                                    ++v2;
                                    v9 = 2;
                                }
                                goto label_119;
                            }
                            else {
                                v14 = v2 + 1;
                                arr_c[v2] = '\uFFFD';
                            }
                        }
                        v2 = v14;
                    }
                    else {
                        goto label_121;
                    }
                }
                v9 = 1;
            label_119:
                v += v9;
                continue;
            label_121:
                arr_c[v2] = '\uFFFD';
                ++v;
                ++v2;
            }
            return p.concatToString(arr_c, 0, v2);
        }
        StringBuilder stringBuilder0 = new StringBuilder("size=");
        a.A(stringBuilder0, arr_b.length, " beginIndex=", v, " endIndex=");
        stringBuilder0.append(v1);
        throw new ArrayIndexOutOfBoundsException(stringBuilder0.toString());
    }

    public static String commonToUtf8String$default(byte[] arr_b, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_b.length;
        }
        return _Utf8Kt.commonToUtf8String(arr_b, v, v1);
    }
}

