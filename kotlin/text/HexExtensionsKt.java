package kotlin.text;

import a5.b;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import wb.a;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\u001A\u001D\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A1\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010\t\u001AG\u0010\u0011\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u001D\u0010\u0013\u001A\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001AG\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0012\u001A\u001D\u0010\u0004\u001A\u00020\u0003*\u00020\u00172\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0018\u001A\u001D\u0010\u0019\u001A\u00020\u0017*\u00020\u00032\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A\u001D\u0010\u0004\u001A\u00020\u0003*\u00020\u001B2\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010\u001C\u001A\u001D\u0010\u001D\u001A\u00020\u001B*\u00020\u00032\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u001D\u0010\u0004\u001A\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010\u001F\u001A\u001D\u0010 \u001A\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b \u0010!\u001A\u001D\u0010\u0004\u001A\u00020\u0003*\u00020\"2\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010#\u001A\u001D\u0010$\u001A\u00020\"*\u00020\u00032\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b$\u0010%\u00A8\u0006&"}, d2 = {"", "Lkotlin/text/HexFormat;", "format", "", "toHexString", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "", "startIndex", "endIndex", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "formattedStringLength", "(IIIIIII)I", "hexToByteArray", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "stringLength", "parsedByteArrayMaxSize", "", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToByte", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToShort", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToInt", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToLong", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,591:1\n1#2:592\n1183#3,3:593\n1183#3,3:596\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n13#1:593,3\n14#1:596,3\n*E\n"})
public final class HexExtensionsKt {
    public static final int[] a;

    static {
        int[] arr_v = new int[0x80];
        int v = 0;
        for(int v1 = 0; v1 < 0x80; ++v1) {
            arr_v[v1] = -1;
        }
        int v3 = 0;
        for(int v2 = 0; v3 < 16; ++v2) {
            arr_v["0123456789abcdef".charAt(v3)] = v2;
            ++v3;
        }
        for(int v4 = 0; v < 16; ++v4) {
            arr_v["0123456789ABCDEF".charAt(v)] = v4;
            ++v;
        }
        HexExtensionsKt.a = arr_v;
    }

    public static final long a(long v, int v1, int v2) {
        if(v1 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return (((long)v1) - 1L) * ((long)v2) + v * ((long)v1);
    }

    public static final int b(String s, int v, String s1, int v1, String s2) {
        int v2 = s1.length() + v;
        if(v2 <= v1 && p.regionMatches(s, v, s1, 0, s1.length(), true)) {
            return v2;
        }
        StringBuilder stringBuilder0 = b.w("Expected ", s2, " \"", s1, "\" at index ");
        stringBuilder0.append(v);
        stringBuilder0.append(", but was ");
        Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
        String s3 = s.substring(v, c.coerceAtMost(v2, v1));
        Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
        stringBuilder0.append(s3);
        throw new NumberFormatException(stringBuilder0.toString());
    }

    public static final void c(String s, int v, int v1, int v2, boolean z) {
        int v3 = v1 - v;
        if(z) {
            if(v3 == v2) {
                return;
            }
        }
        else if(v3 <= v2) {
            return;
        }
        Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.substring(v, v1);
        Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        StringBuilder stringBuilder0 = new StringBuilder("Expected ");
        stringBuilder0.append((z ? "exactly" : "at most"));
        stringBuilder0.append(' ');
        stringBuilder0.append(v2);
        stringBuilder0.append(" hexadecimal digits at index ");
        a.j(stringBuilder0, v, ", but was ", s1, " of length ");
        stringBuilder0.append(v3);
        throw new NumberFormatException(stringBuilder0.toString());
    }

    public static final int d(int v, String s) {
        int v1 = s.charAt(v);
        if(v1 <= 0x7F) {
            int v2 = HexExtensionsKt.a[v1];
            if(v2 >= 0) {
                return v2;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Expected a hexadecimal digit at index ", ", but was ");
        stringBuilder0.append(s.charAt(v));
        throw new NumberFormatException(stringBuilder0.toString());
    }

    public static final long e(String s, int v, HexFormat hexFormat0, int v1) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(0, v, s.length());
        String s1 = hexFormat0.getNumber().getPrefix();
        String s2 = hexFormat0.getNumber().getSuffix();
        if(s2.length() + s1.length() < v) {
            int v2 = HexExtensionsKt.b(s, 0, s1, v, "prefix");
            int v3 = v - s2.length();
            HexExtensionsKt.b(s, v3, s2, v, "suffix");
            HexExtensionsKt.c(s, v2, v3, v1, false);
            long v4 = 0L;
            while(v2 < v3) {
                v4 = v4 << 4 | ((long)HexExtensionsKt.d(v2, s));
                ++v2;
            }
            return v4;
        }
        StringBuilder stringBuilder0 = b.w("Expected a hexadecimal number with prefix \"", s1, "\" and suffix \"", s2, "\", but was ");
        Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
        String s3 = s.substring(0, v);
        Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
        stringBuilder0.append(s3);
        throw new NumberFormatException(stringBuilder0.toString());
    }

    public static final String f(long v, HexFormat hexFormat0, int v1) {
        String s = hexFormat0.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        String s1 = hexFormat0.getNumber().getPrefix();
        String s2 = hexFormat0.getNumber().getSuffix();
        boolean z = hexFormat0.getNumber().getRemoveLeadingZeros();
        StringBuilder stringBuilder0 = new StringBuilder(s2.length() + (s1.length() + (v1 >> 2)));
        stringBuilder0.append(s1);
        while(v1 > 0) {
            v1 -= 4;
            int v2 = (int)(v >> v1 & 15L);
            z = z && v2 == 0 && v1 > 0;
            if(!z) {
                stringBuilder0.append(s.charAt(v2));
            }
        }
        stringBuilder0.append(s2);
        String s3 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s3, "toString(...)");
        return s3;
    }

    public static final int formattedStringLength(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v7 = (v - 1) / v1;
        int v8 = (v1 - 1) / v2;
        int v9 = v % v1;
        if(v9 != 0) {
            v1 = v9;
        }
        int v10 = v8 * v7 + (v1 - 1) / v2;
        long v11 = (((long)v5) + 2L + ((long)v6)) * ((long)v) + (((long)(v - 1 - v7 - v10)) * ((long)v4) + (((long)v10) * ((long)v3) + ((long)v7)));
        if(!c.intRangeContains(new IntRange(0, 0x7FFFFFFF), v11)) {
            throw new IllegalArgumentException("The resulting string length is too big: " + ULong.toString-impl(v11));
        }
        return (int)v11;
    }

    public static final long g(long v, long v1, int v2) {
        return v <= 0L || v1 <= 0L ? 0L : (v + ((long)v2)) / (v1 + ((long)v2));
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final byte hexToByte(@NotNull String s, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return (byte)(((int)HexExtensionsKt.e(s, s.length(), hexFormat0, 2)));
    }

    public static byte hexToByte$default(String s, HexFormat hexFormat0, int v, Object object0) {
        if((v & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToByte(s, hexFormat0);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final byte[] hexToByteArray(@NotNull String s, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        int v = s.length();
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(0, v, s.length());
        if(v == 0) {
            return new byte[0];
        }
        BytesHexFormat hexFormat$BytesHexFormat0 = hexFormat0.getBytes();
        int v1 = hexFormat$BytesHexFormat0.getBytesPerLine();
        int v2 = hexFormat$BytesHexFormat0.getBytesPerGroup();
        String s1 = hexFormat$BytesHexFormat0.getBytePrefix();
        String s2 = hexFormat$BytesHexFormat0.getByteSuffix();
        String s3 = hexFormat$BytesHexFormat0.getByteSeparator();
        String s4 = hexFormat$BytesHexFormat0.getGroupSeparator();
        int v3 = HexExtensionsKt.parsedByteArrayMaxSize(v, v1, v2, s4.length(), s3.length(), s1.length(), s2.length());
        byte[] arr_b = new byte[v3];
        int v4 = 0;
        int v5 = 0;
        int v7 = 0;
        for(int v6 = 0; v4 < v; ++v6) {
            if(v6 == v1) {
                switch(s.charAt(v4)) {
                    case 10: {
                        ++v4;
                        break;
                    }
                    case 13: {
                        v4 = v4 + 1 >= v || s.charAt(v4 + 1) != 10 ? v4 + 1 : v4 + 2;
                        break;
                    }
                    default: {
                        StringBuilder stringBuilder0 = b.s(v4, "Expected a new line at index ", ", but was ");
                        stringBuilder0.append(s.charAt(v4));
                        throw new NumberFormatException(stringBuilder0.toString());
                    }
                }
                v6 = 0;
                v7 = 0;
            }
            else if(v7 == v2) {
                v4 = HexExtensionsKt.b(s, v4, s4, v, "group separator");
                v7 = 0;
            }
            else if(v7 != 0) {
                v4 = HexExtensionsKt.b(s, v4, s3, v, "byte separator");
            }
            int v8 = HexExtensionsKt.b(s, v4, s1, v, "byte prefix");
            HexExtensionsKt.c(s, v8, c.coerceAtMost(v8 + 2, v), 2, true);
            arr_b[v5] = (byte)(HexExtensionsKt.d(v8, s) << 4 | HexExtensionsKt.d(v8 + 1, s));
            v4 = HexExtensionsKt.b(s, v8 + 2, s2, v, "byte suffix");
            ++v5;
            ++v7;
        }
        if(v5 == v3) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, v5);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        return arr_b1;
    }

    public static byte[] hexToByteArray$default(String s, HexFormat hexFormat0, int v, Object object0) {
        if((v & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToByteArray(s, hexFormat0);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final int hexToInt(@NotNull String s, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return (int)HexExtensionsKt.e(s, s.length(), hexFormat0, 8);
    }

    public static int hexToInt$default(String s, HexFormat hexFormat0, int v, Object object0) {
        if((v & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToInt(s, hexFormat0);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final long hexToLong(@NotNull String s, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return HexExtensionsKt.e(s, s.length(), hexFormat0, 16);
    }

    public static long hexToLong$default(String s, HexFormat hexFormat0, int v, Object object0) {
        if((v & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToLong(s, hexFormat0);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final short hexToShort(@NotNull String s, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return (short)(((int)HexExtensionsKt.e(s, s.length(), hexFormat0, 4)));
    }

    public static short hexToShort$default(String s, HexFormat hexFormat0, int v, Object object0) {
        if((v & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToShort(s, hexFormat0);
    }

    public static final int parsedByteArrayMaxSize(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        long v9;
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long v7 = ((long)v5) + 2L + ((long)v6);
        long v8 = HexExtensionsKt.a(v7, v2, v4);
        if(v1 <= v2) {
            v9 = HexExtensionsKt.a(v7, v1, v4);
        }
        else {
            v9 = HexExtensionsKt.a(v8, v1 / v2, v3);
            int v10 = v1 % v2;
            if(v10 != 0) {
                v9 = HexExtensionsKt.a(v7, v10, v4) + (v9 + ((long)v3));
            }
        }
        long v11 = HexExtensionsKt.g(v, v9, 1);
        long v12 = ((long)v) - (v9 + 1L) * v11;
        long v13 = HexExtensionsKt.g(v12, v8, v3);
        long v14 = v12 - (v8 + ((long)v3)) * v13;
        long v15 = HexExtensionsKt.g(v14, v7, v4);
        return v14 - (v7 + ((long)v4)) * v15 <= 0L ? ((int)(v13 * ((long)v2) + v11 * ((long)v1) + v15)) : ((int)(v13 * ((long)v2) + v11 * ((long)v1) + v15 + 1L));
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final String toHexString(byte b, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return HexExtensionsKt.f(b, hexFormat0, 8);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final String toHexString(int v, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return HexExtensionsKt.f(v, hexFormat0, 0x20);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final String toHexString(long v, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return HexExtensionsKt.f(v, hexFormat0, 0x40);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final String toHexString(short v, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return HexExtensionsKt.f(v, hexFormat0, 16);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final String toHexString(@NotNull byte[] arr_b, int v, int v1, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(v, v1, arr_b.length);
        if(v == v1) {
            return "";
        }
        String s = hexFormat0.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        BytesHexFormat hexFormat$BytesHexFormat0 = hexFormat0.getBytes();
        int v2 = hexFormat$BytesHexFormat0.getBytesPerLine();
        int v3 = hexFormat$BytesHexFormat0.getBytesPerGroup();
        String s1 = hexFormat$BytesHexFormat0.getBytePrefix();
        String s2 = hexFormat$BytesHexFormat0.getByteSuffix();
        String s3 = hexFormat$BytesHexFormat0.getByteSeparator();
        String s4 = hexFormat$BytesHexFormat0.getGroupSeparator();
        int v4 = HexExtensionsKt.formattedStringLength(v1 - v, v2, v3, s4.length(), s3.length(), s1.length(), s2.length());
        StringBuilder stringBuilder0 = new StringBuilder(v4);
        int v5 = v;
        int v6 = 0;
        int v7 = 0;
        while(v5 < v1) {
            int v8 = arr_b[v5];
            if(v6 == v2) {
                stringBuilder0.append('\n');
                v6 = 0;
                v7 = 0;
            }
            else if(v7 == v3) {
                stringBuilder0.append(s4);
                v7 = 0;
            }
            if(v7 != 0) {
                stringBuilder0.append(s3);
            }
            stringBuilder0.append(s1);
            stringBuilder0.append(s.charAt((v8 & 0xFF) >> 4));
            stringBuilder0.append(s.charAt(v8 & 15));
            stringBuilder0.append(s2);
            ++v7;
            ++v6;
            ++v5;
        }
        if(v4 != stringBuilder0.length()) {
            throw new IllegalStateException("Check failed.");
        }
        String s5 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s5, "toString(...)");
        return s5;
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final String toHexString(@NotNull byte[] arr_b, @NotNull HexFormat hexFormat0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(hexFormat0, "format");
        return HexExtensionsKt.toHexString(arr_b, 0, arr_b.length, hexFormat0);
    }

    public static String toHexString$default(byte b, HexFormat hexFormat0, int v, Object object0) {
        if((v & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(b, hexFormat0);
    }

    public static String toHexString$default(int v, HexFormat hexFormat0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(v, hexFormat0);
    }

    public static String toHexString$default(long v, HexFormat hexFormat0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(v, hexFormat0);
    }

    public static String toHexString$default(short v, HexFormat hexFormat0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(v, hexFormat0);
    }

    public static String toHexString$default(byte[] arr_b, int v, int v1, HexFormat hexFormat0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_b.length;
        }
        if((v2 & 4) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(arr_b, v, v1, hexFormat0);
    }

    public static String toHexString$default(byte[] arr_b, HexFormat hexFormat0, int v, Object object0) {
        if((v & 1) != 0) {
            hexFormat0 = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(arr_b, hexFormat0);
    }
}

