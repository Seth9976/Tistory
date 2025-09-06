package kotlin.io.encoding;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.b;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import wb.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\b\u0017\u0018\u0000 12\u00020\u0001:\u00011J)\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000B\u0010\fJ)\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000E\u0010\u000FJ?\u0010\u0013\u001A\u00028\u0000\"\f\b\u0000\u0010\u0012*\u00060\u0010j\u0002`\u00112\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00028\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\bJ;\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00172\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0018J;\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00172\u0006\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0016\u0010\u0019J\'\u0010\u001B\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u001A\u0010\bJ7\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u001C\u0010\fJ\'\u0010\u001F\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00172\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u001E\u0010\u0018J\u0017\u0010\"\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b \u0010!J\'\u0010\'\u001A\u00020$2\u0006\u0010#\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b%\u0010&R\u001A\u0010-\u001A\u00020(8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001A\u00100\u001A\u00020(8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b.\u0010*\u001A\u0004\b/\u0010,\u00A8\u00062"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "", "source", "", "startIndex", "endIndex", "encodeToByteArray", "([BII)[B", "destination", "destinationOffset", "encodeIntoByteArray", "([B[BIII)I", "", "encode", "([BII)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "encodeToAppendable", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "decode", "decodeIntoByteArray", "", "(Ljava/lang/CharSequence;II)[B", "(Ljava/lang/CharSequence;[BIII)I", "encodeToByteArrayImpl$kotlin_stdlib", "encodeToByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeIntoByteArrayImpl", "charsToBytesImpl$kotlin_stdlib", "charsToBytesImpl", "bytesToStringImpl$kotlin_stdlib", "([B)Ljava/lang/String;", "bytesToStringImpl", "sourceSize", "", "checkSourceBounds$kotlin_stdlib", "(III)V", "checkSourceBounds", "", "a", "Z", "isUrlSafe$kotlin_stdlib", "()Z", "isUrlSafe", "b", "isMimeScheme$kotlin_stdlib", "isMimeScheme", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.8")
@ExperimentalEncodingApi
public class Base64 {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u0017\u0010\u000B\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000B\u0010\b\u001A\u0004\b\f\u0010\nR\u0014\u0010\u000E\u001A\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000FR\u0014\u0010\u0011\u001A\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000FR\u0014\u0010\u0012\u001A\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000FR\u0014\u0010\u0013\u001A\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000FR\u0014\u0010\u0015\u001A\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001A\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000F¨\u0006\u0018"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "", "mimeLineSeparatorSymbols", "[B", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "UrlSafe", "Lkotlin/io/encoding/Base64;", "getUrlSafe", "()Lkotlin/io/encoding/Base64;", "Mime", "getMime", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "", "padSymbol", "B", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Default extends Base64 {
        public Default(DefaultConstructorMarker defaultConstructorMarker0) {
            super(false, false, null);
        }

        @NotNull
        public final Base64 getMime() {
            return Base64.e;
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() [...] // 潜在的解密器

        @NotNull
        public final Base64 getUrlSafe() {
            return Base64.d;
        }
    }

    @NotNull
    public static final Default Default = null;
    public final boolean a;
    public final boolean b;
    public static final int bytesPerGroup = 3;
    public static final byte[] c = null;
    public static final Base64 d = null;
    public static final Base64 e = null;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;

    static {
        Base64.Default = new Default(null);
        Base64.c = new byte[]{13, 10};
        Base64.d = new Base64(true, false);
        Base64.e = new Base64(false, true);
    }

    public Base64(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
        if(z && z1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public Base64(boolean z, boolean z1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(z, z1);
    }

    public static void a(int v, int v1, int v2) {
        if(v1 < 0 || v1 > v) {
            throw new IndexOutOfBoundsException("destination offset: " + v1 + ", destination size: " + v);
        }
        if(v1 + v2 >= 0 && v1 + v2 <= v) {
            return;
        }
        StringBuilder stringBuilder0 = q.u("The destination array does not have enough capacity, destination offset: ", v1, ", destination size: ", v, ", capacity needed: ");
        stringBuilder0.append(v2);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public static final byte[] access$getMimeLineSeparatorSymbols$cp() [...] // 潜在的解密器

    public final int b(byte[] arr_b, byte[] arr_b1, int v, int v1, int v2) {
        int[] arr_v = this.a ? Base64Kt.d : Base64Kt.b;
        int v3 = v;
        int v4 = -8;
        int v5 = 0;
        int v6 = v1;
    alab1:
        while(true) {
            boolean z = this.b;
            if(v6 >= v2) {
                break;
            }
            if(v4 == -8 && v6 + 3 < v2) {
                int v7 = arr_v[arr_b[v6 + 2] & 0xFF] << 6 | (arr_v[arr_b[v6 + 1] & 0xFF] << 12 | arr_v[arr_b[v6] & 0xFF] << 18) | arr_v[arr_b[v6 + 3] & 0xFF];
                if(v7 >= 0) {
                    arr_b1[v3] = (byte)(v7 >> 16);
                    int v8 = v3 + 2;
                    arr_b1[v3 + 1] = (byte)(v7 >> 8);
                    v3 += 3;
                    arr_b1[v8] = (byte)v7;
                    v6 += 4;
                    continue;
                }
            }
            int v9 = arr_b[v6] & 0xFF;
            int v10 = arr_v[v9];
            if(v10 < 0) {
                if(v10 == -2) {
                    switch(v4) {
                        case -8: {
                            throw new IllegalArgumentException("Redundant pad character at index " + v6);
                        }
                        case -4: {
                            int v11 = v6 + 1;
                            if(z) {
                                while(v11 < v2 && Base64Kt.b[arr_b[v11] & 0xFF] == -1) {
                                    ++v11;
                                }
                            }
                            if(v11 == v2 || arr_b[v11] != 61) {
                                throw new IllegalArgumentException("Missing one pad character at index " + v11);
                            }
                            v6 = v11 + 1;
                            break alab1;
                        }
                        case -6: 
                        case -2: {
                            ++v6;
                            break alab1;
                        }
                        default: {
                            throw new IllegalStateException("Unreachable");
                        }
                    }
                }
                if(z) {
                    ++v6;
                    continue;
                }
                String s = Integer.toString(v9, b.checkRadix(8));
                Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
                throw new IllegalArgumentException("Invalid symbol \'" + ((char)v9) + "\'(" + s + ") at index " + v6);
            }
            ++v6;
            v5 = v5 << 6 | v10;
            if(v4 + 6 >= 0) {
                arr_b1[v3] = (byte)(v5 >>> v4 + 6);
                v5 &= (1 << v4 + 6) - 1;
                v4 -= 2;
                ++v3;
            }
            else {
                v4 += 6;
            }
        }
        if(v4 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if(z) {
            while(v6 < v2 && Base64Kt.b[arr_b[v6] & 0xFF] == -1) {
                ++v6;
            }
        }
        if(v6 >= v2) {
            return v3 - v;
        }
        int v12 = arr_b[v6] & 0xFF;
        StringBuilder stringBuilder0 = new StringBuilder("Symbol \'");
        stringBuilder0.append(((char)v12));
        stringBuilder0.append("\'(");
        String s1 = Integer.toString(v12, b.checkRadix(8));
        Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
        stringBuilder0.append(s1);
        stringBuilder0.append(") at index ");
        throw new IllegalArgumentException(a.c(v6 - 1, " is prohibited after the pad character", stringBuilder0));
    }

    @NotNull
    public final String bytesToStringImpl$kotlin_stdlib(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(((char)arr_b[v]));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    public final int c(byte[] arr_b, int v, int v1) {
        int v2 = v1 - v;
        if(v2 == 0) {
            return 0;
        }
        if(v2 == 1) {
            throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + v + ", endIndex: " + v1);
        }
        if(this.b) {
            while(v < v1) {
                int v3 = Base64Kt.b[arr_b[v] & 0xFF];
                if(v3 < 0) {
                    if(v3 == -2) {
                        return (int)(((long)(v2 - (v1 - v))) * 6L / 8L);
                    }
                    --v2;
                }
                ++v;
            }
            return (int)(((long)v2) * 6L / 8L);
        }
        if(arr_b[v1 - 1] == 61) {
            if(arr_b[v1 - 2] == 61) {
                return (int)(((long)(v2 - 2)) * 6L / 8L);
            }
            --v2;
        }
        return (int)(((long)v2) * 6L / 8L);
    }

    @NotNull
    public final byte[] charsToBytesImpl$kotlin_stdlib(@NotNull CharSequence charSequence0, int v, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "source");
        this.checkSourceBounds$kotlin_stdlib(charSequence0.length(), v, v1);
        byte[] arr_b = new byte[v1 - v];
        int v2 = 0;
        while(v < v1) {
            int v3 = charSequence0.charAt(v);
            arr_b[v2] = v3 <= 0xFF ? ((byte)v3) : 0x3F;
            ++v2;
            ++v;
        }
        return arr_b;
    }

    public final void checkSourceBounds$kotlin_stdlib(int v, int v1, int v2) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(v1, v2, v);
    }

    public final int d(int v) {
        int v1 = (v + 2) / 3;
        int v2 = (this.b ? (v1 - 1) / 19 : 0) * 2 + v1 * 4;
        if(v2 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        return v2;
    }

    @NotNull
    public final byte[] decode(@NotNull CharSequence charSequence0, int v, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "source");
        if(charSequence0 instanceof String) {
            this.checkSourceBounds$kotlin_stdlib(((String)charSequence0).length(), v, v1);
            String s = ((String)charSequence0).substring(v, v1);
            Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
            Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
            byte[] arr_b = s.getBytes(Charsets.ISO_8859_1);
            Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
            return Base64.decode$default(this, arr_b, 0, 0, 6, null);
        }
        return Base64.decode$default(this, this.charsToBytesImpl$kotlin_stdlib(charSequence0, v, v1), 0, 0, 6, null);
    }

    @NotNull
    public final byte[] decode(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        this.checkSourceBounds$kotlin_stdlib(arr_b.length, v, v1);
        int v2 = this.c(arr_b, v, v1);
        byte[] arr_b1 = new byte[v2];
        if(this.b(arr_b, arr_b1, 0, v, v1) != v2) {
            throw new IllegalStateException("Check failed.");
        }
        return arr_b1;
    }

    public static byte[] decode$default(Base64 base640, CharSequence charSequence0, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = charSequence0.length();
        }
        return base640.decode(charSequence0, v, v1);
    }

    public static byte[] decode$default(Base64 base640, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return base640.decode(arr_b, v, v1);
    }

    public final int decodeIntoByteArray(@NotNull CharSequence charSequence0, @NotNull byte[] arr_b, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(charSequence0, "source");
        Intrinsics.checkNotNullParameter(arr_b, "destination");
        if(charSequence0 instanceof String) {
            this.checkSourceBounds$kotlin_stdlib(((String)charSequence0).length(), v1, v2);
            String s = ((String)charSequence0).substring(v1, v2);
            Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
            Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
            byte[] arr_b1 = s.getBytes(Charsets.ISO_8859_1);
            Intrinsics.checkNotNullExpressionValue(arr_b1, "getBytes(...)");
            return Base64.decodeIntoByteArray$default(this, arr_b1, arr_b, v, 0, 0, 24, null);
        }
        return Base64.decodeIntoByteArray$default(this, this.charsToBytesImpl$kotlin_stdlib(charSequence0, v1, v2), arr_b, v, 0, 0, 24, null);
    }

    public final int decodeIntoByteArray(@NotNull byte[] arr_b, @NotNull byte[] arr_b1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        Intrinsics.checkNotNullParameter(arr_b1, "destination");
        this.checkSourceBounds$kotlin_stdlib(arr_b.length, v1, v2);
        int v3 = this.c(arr_b, v1, v2);
        Base64.a(arr_b1.length, v, v3);
        return this.b(arr_b, arr_b1, v, v1, v2);
    }

    public static int decodeIntoByteArray$default(Base64 base640, CharSequence charSequence0, byte[] arr_b, int v, int v1, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if((v3 & 16) != 0) {
            v2 = charSequence0.length();
        }
        return base640.decodeIntoByteArray(charSequence0, arr_b, ((v3 & 4) == 0 ? v : 0), ((v3 & 8) == 0 ? v1 : 0), v2);
    }

    public static int decodeIntoByteArray$default(Base64 base640, byte[] arr_b, byte[] arr_b1, int v, int v1, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if((v3 & 16) != 0) {
            v2 = arr_b.length;
        }
        return base640.decodeIntoByteArray(arr_b, arr_b1, ((v3 & 4) == 0 ? v : 0), ((v3 & 8) == 0 ? v1 : 0), v2);
    }

    @NotNull
    public final String encode(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        return new String(this.encodeToByteArrayImpl$kotlin_stdlib(arr_b, v, v1), Charsets.ISO_8859_1);
    }

    public static String encode$default(Base64 base640, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return base640.encode(arr_b, v, v1);
    }

    public final int encodeIntoByteArray(@NotNull byte[] arr_b, @NotNull byte[] arr_b1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        Intrinsics.checkNotNullParameter(arr_b1, "destination");
        return this.encodeIntoByteArrayImpl$kotlin_stdlib(arr_b, arr_b1, v, v1, v2);
    }

    public static int encodeIntoByteArray$default(Base64 base640, byte[] arr_b, byte[] arr_b1, int v, int v1, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if((v3 & 16) != 0) {
            v2 = arr_b.length;
        }
        return base640.encodeIntoByteArray(arr_b, arr_b1, ((v3 & 4) == 0 ? v : 0), ((v3 & 8) == 0 ? v1 : 0), v2);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(@NotNull byte[] arr_b, @NotNull byte[] arr_b1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        Intrinsics.checkNotNullParameter(arr_b1, "destination");
        this.checkSourceBounds$kotlin_stdlib(arr_b.length, v1, v2);
        int v3 = this.d(v2 - v1);
        Base64.a(arr_b1.length, v, v3);
        byte[] arr_b2 = this.a ? new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F} : new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 0x2F};
        int v4 = this.b ? 19 : 0x7FFFFFFF;
        int v5 = v;
        while(v1 + 2 < v2) {
            int v6 = Math.min((v2 - v1) / 3, v4);
            for(int v7 = 0; v7 < v6; ++v7) {
                int v8 = arr_b[v1] & 0xFF;
                int v9 = v1 + 2;
                int v10 = arr_b[v1 + 1] & 0xFF;
                v1 += 3;
                int v11 = v10 << 8 | v8 << 16 | arr_b[v9] & 0xFF;
                arr_b1[v5] = arr_b2[v11 >>> 18];
                arr_b1[v5 + 1] = arr_b2[v11 >>> 12 & 0x3F];
                int v12 = v5 + 3;
                arr_b1[v5 + 2] = arr_b2[v11 >>> 6 & 0x3F];
                v5 += 4;
                arr_b1[v12] = arr_b2[v11 & 0x3F];
            }
            if(v6 == v4 && v1 != v2) {
                int v13 = v5 + 1;
                arr_b1[v5] = Base64.c[0];
                v5 += 2;
                arr_b1[v13] = Base64.c[1];
            }
        }
        switch(v2 - v1) {
            case 1: {
                int v14 = (arr_b[v1] & 0xFF) << 4;
                arr_b1[v5] = arr_b2[v14 >>> 6];
                arr_b1[v5 + 1] = arr_b2[v14 & 0x3F];
                int v15 = v5 + 3;
                arr_b1[v5 + 2] = 61;
                v5 += 4;
                arr_b1[v15] = 61;
                ++v1;
                break;
            }
            case 2: {
                int v16 = (arr_b[v1 + 1] & 0xFF) << 2 | (arr_b[v1] & 0xFF) << 10;
                arr_b1[v5] = arr_b2[v16 >>> 12];
                arr_b1[v5 + 1] = arr_b2[v16 >>> 6 & 0x3F];
                int v17 = v5 + 3;
                arr_b1[v5 + 2] = arr_b2[v16 & 0x3F];
                v5 += 4;
                arr_b1[v17] = 61;
                v1 += 2;
            }
        }
        if(v1 != v2) {
            throw new IllegalStateException("Check failed.");
        }
        return v5 - v;
    }

    @NotNull
    public final Appendable encodeToAppendable(@NotNull byte[] arr_b, @NotNull Appendable appendable0, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        Intrinsics.checkNotNullParameter(appendable0, "destination");
        appendable0.append(new String(this.encodeToByteArrayImpl$kotlin_stdlib(arr_b, v, v1), Charsets.ISO_8859_1));
        return appendable0;
    }

    public static Appendable encodeToAppendable$default(Base64 base640, byte[] arr_b, Appendable appendable0, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = arr_b.length;
        }
        return base640.encodeToAppendable(arr_b, appendable0, v, v1);
    }

    @NotNull
    public final byte[] encodeToByteArray(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        return this.encodeToByteArrayImpl$kotlin_stdlib(arr_b, v, v1);
    }

    public static byte[] encodeToByteArray$default(Base64 base640, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return base640.encodeToByteArray(arr_b, v, v1);
    }

    @NotNull
    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        this.checkSourceBounds$kotlin_stdlib(arr_b.length, v, v1);
        byte[] arr_b1 = new byte[this.d(v1 - v)];
        this.encodeIntoByteArrayImpl$kotlin_stdlib(arr_b, arr_b1, 0, v, v1);
        return arr_b1;
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        return this.b;
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        return this.a;
    }
}

