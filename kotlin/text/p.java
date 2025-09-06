package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IntIterator;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

public abstract class p extends o {
    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @NotNull
    public static final String capitalize(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Locale locale0 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale0, "getDefault(...)");
        return p.capitalize(s, locale0);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @LowPriorityInOverloadResolution
    @NotNull
    public static final String capitalize(@NotNull String s, @NotNull Locale locale0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(locale0, "locale");
        if(s.length() > 0) {
            int v = s.charAt(0);
            if(Character.isLowerCase(((char)v))) {
                StringBuilder stringBuilder0 = new StringBuilder();
                int v1 = Character.toTitleCase(((char)v));
                if(v1 == Character.toUpperCase(((char)v))) {
                    String s1 = s.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
                    Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type java.lang.String");
                    String s2 = s1.toUpperCase(locale0);
                    Intrinsics.checkNotNullExpressionValue(s2, "toUpperCase(...)");
                    stringBuilder0.append(s2);
                }
                else {
                    stringBuilder0.append(((char)v1));
                }
                String s3 = s.substring(1);
                Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
                stringBuilder0.append(s3);
                s = stringBuilder0.toString();
                Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            }
        }
        return s;
    }

    public static final int compareTo(@NotNull String s, @NotNull String s1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "other");
        return z ? s.compareToIgnoreCase(s1) : s.compareTo(s1);
    }

    public static int compareTo$default(String s, String s1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return p.compareTo(s, s1, z);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static String concatToString(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return new String(arr_c);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static String concatToString(@NotNull char[] arr_c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(v, v1, arr_c.length);
        return new String(arr_c, v, v1 - v);
    }

    public static String concatToString$default(char[] arr_c, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_c.length;
        }
        return p.concatToString(arr_c, v, v1);
    }

    @SinceKotlin(version = "1.5")
    public static boolean contentEquals(@Nullable CharSequence charSequence0, @Nullable CharSequence charSequence1) {
        return !(charSequence0 instanceof String) || charSequence1 == null ? StringsKt__StringsKt.contentEqualsImpl(charSequence0, charSequence1) : ((String)charSequence0).contentEquals(charSequence1);
    }

    // 去混淆评级： 低(20)
    @SinceKotlin(version = "1.5")
    public static final boolean contentEquals(@Nullable CharSequence charSequence0, @Nullable CharSequence charSequence1, boolean z) {
        return z ? StringsKt__StringsKt.contentEqualsIgnoreCaseImpl(charSequence0, charSequence1) : p.contentEquals(charSequence0, charSequence1);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @NotNull
    public static final String decapitalize(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(s.length() > 0 && !Character.isLowerCase(s.charAt(0))) {
            String s1 = s.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
            Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type java.lang.String");
            String s2 = s1.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(s2, "toLowerCase(...)");
            String s3 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
            return s2 + s3;
        }
        return s;
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @LowPriorityInOverloadResolution
    @NotNull
    public static final String decapitalize(@NotNull String s, @NotNull Locale locale0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(locale0, "locale");
        if(s.length() > 0 && !Character.isLowerCase(s.charAt(0))) {
            String s1 = s.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
            Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type java.lang.String");
            String s2 = s1.toLowerCase(locale0);
            Intrinsics.checkNotNullExpressionValue(s2, "toLowerCase(...)");
            String s3 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
            return s2 + s3;
        }
        return s;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String decodeToString(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return new String(arr_b, Charsets.UTF_8);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String decodeToString(@NotNull byte[] arr_b, int v, int v1, boolean z) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(v, v1, arr_b.length);
        if(!z) {
            return new String(arr_b, v, v1 - v, Charsets.UTF_8);
        }
        CharsetDecoder charsetDecoder0 = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction0 = CodingErrorAction.REPORT;
        String s = charsetDecoder0.onMalformedInput(codingErrorAction0).onUnmappableCharacter(codingErrorAction0).decode(ByteBuffer.wrap(arr_b, v, v1 - v)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    public static String decodeToString$default(byte[] arr_b, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_b.length;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return p.decodeToString(arr_b, v, v1, z);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final byte[] encodeToByteArray(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        byte[] arr_b = s.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
        return arr_b;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final byte[] encodeToByteArray(@NotNull String s, int v, int v1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(v, v1, s.length());
        if(!z) {
            String s1 = s.substring(v, v1);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
            Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type java.lang.String");
            byte[] arr_b = s1.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
            return arr_b;
        }
        CharsetEncoder charsetEncoder0 = Charsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction0 = CodingErrorAction.REPORT;
        ByteBuffer byteBuffer0 = charsetEncoder0.onMalformedInput(codingErrorAction0).onUnmappableCharacter(codingErrorAction0).encode(CharBuffer.wrap(s, v, v1));
        if(byteBuffer0.hasArray() && byteBuffer0.arrayOffset() == 0) {
            byte[] arr_b1 = byteBuffer0.array();
            Intrinsics.checkNotNull(arr_b1);
            if(byteBuffer0.remaining() == arr_b1.length) {
                byte[] arr_b2 = byteBuffer0.array();
                Intrinsics.checkNotNull(arr_b2);
                return arr_b2;
            }
        }
        byte[] arr_b3 = new byte[byteBuffer0.remaining()];
        byteBuffer0.get(arr_b3);
        return arr_b3;
    }

    public static byte[] encodeToByteArray$default(String s, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return p.encodeToByteArray(s, v, v1, z);
    }

    public static boolean endsWith(@NotNull String s, @NotNull String s1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "suffix");
        return z ? p.regionMatches(s, s.length() - s1.length(), s1, 0, s1.length(), true) : s.endsWith(s1);
    }

    public static boolean endsWith$default(String s, String s1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return p.endsWith(s, s1, z);
    }

    public static boolean equals(@Nullable String s, @Nullable String s1, boolean z) {
        if(s == null) {
            return s1 == null;
        }
        return z ? s.equalsIgnoreCase(s1) : s.equals(s1);
    }

    public static boolean equals$default(String s, String s1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return p.equals(s, s1, z);
    }

    @NotNull
    public static Comparator getCASE_INSENSITIVE_ORDER(@NotNull StringCompanionObject stringCompanionObject0) {
        Intrinsics.checkNotNullParameter(stringCompanionObject0, "<this>");
        Comparator comparator0 = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(comparator0, "CASE_INSENSITIVE_ORDER");
        return comparator0;
    }

    public static boolean isBlank(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(charSequence0.length() != 0) {
            IntRange intRange0 = StringsKt__StringsKt.getIndices(charSequence0);
            if(!(intRange0 instanceof Collection) || !((Collection)intRange0).isEmpty()) {
                Iterator iterator0 = intRange0.iterator();
                while(iterator0.hasNext()) {
                    if(!b.isWhitespace(charSequence0.charAt(((IntIterator)iterator0).nextInt()))) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean regionMatches(@NotNull CharSequence charSequence0, int v, @NotNull CharSequence charSequence1, int v1, int v2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        return !(charSequence0 instanceof String) || !(charSequence1 instanceof String) ? StringsKt__StringsKt.regionMatchesImpl(charSequence0, v, charSequence1, v1, v2, z) : p.regionMatches(((String)charSequence0), v, ((String)charSequence1), v1, v2, z);
    }

    public static boolean regionMatches(@NotNull String s, int v, @NotNull String s1, int v1, int v2, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "other");
        return z ? s.regionMatches(true, v, s1, v1, v2) : s.regionMatches(v, s1, v1, v2);
    }

    public static boolean regionMatches$default(CharSequence charSequence0, int v, CharSequence charSequence1, int v1, int v2, boolean z, int v3, Object object0) {
        if((v3 & 16) != 0) {
            z = false;
        }
        return p.regionMatches(charSequence0, v, charSequence1, v1, v2, z);
    }

    public static boolean regionMatches$default(String s, int v, String s1, int v1, int v2, boolean z, int v3, Object object0) {
        if((v3 & 16) != 0) {
            z = false;
        }
        return p.regionMatches(s, v, s1, v1, v2, z);
    }

    @NotNull
    public static String repeat(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v >= 0) {
            switch(v) {
                case 0: {
                    return "";
                label_16:
                    char c = charSequence0.charAt(0);
                    char[] arr_c = new char[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        arr_c[v1] = c;
                    }
                    return new String(arr_c);
                }
                case 1: {
                    return charSequence0.toString();
                label_5:
                    switch(charSequence0.length()) {
                        case 0: {
                            return "";
                        }
                        case 1: {
                            goto label_16;
                        }
                        default: {
                            StringBuilder stringBuilder0 = new StringBuilder(charSequence0.length() * v);
                            IntIterator intIterator0 = a.t(1, v);
                            while(intIterator0.hasNext()) {
                                intIterator0.nextInt();
                                stringBuilder0.append(charSequence0);
                            }
                            String s = stringBuilder0.toString();
                            Intrinsics.checkNotNull(s);
                            return s;
                        }
                    }
                }
                default: {
                    goto label_5;
                }
            }
        }
        throw new IllegalArgumentException(("Count \'n\' must be non-negative, but was " + v + '.').toString());
    }

    @NotNull
    public static final String replace(@NotNull String s, char c, char c1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(!z) {
            String s1 = s.replace(c, c1);
            Intrinsics.checkNotNullExpressionValue(s1, "replace(...)");
            return s1;
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.length());
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(c.equals(((char)v1), c, true)) {
                v1 = c1;
            }
            stringBuilder0.append(((char)v1));
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "toString(...)");
        return s2;
    }

    @NotNull
    public static String replace(@NotNull String s, @NotNull String s1, @NotNull String s2, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "oldValue");
        Intrinsics.checkNotNullParameter(s2, "newValue");
        int v = 0;
        int v1 = StringsKt__StringsKt.indexOf(s, s1, 0, z);
        if(v1 < 0) {
            return s;
        }
        int v2 = s1.length();
        int v3 = kotlin.ranges.c.coerceAtLeast(v2, 1);
        int v4 = s2.length() + (s.length() - v2);
        if(v4 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder stringBuilder0 = new StringBuilder(v4);
        do {
            stringBuilder0.append(s, v, v1);
            stringBuilder0.append(s2);
            v = v1 + v2;
            if(v1 >= s.length()) {
                break;
            }
            v1 = StringsKt__StringsKt.indexOf(s, s1, v1 + v3, z);
        }
        while(v1 > 0);
        stringBuilder0.append(s, v, s.length());
        String s3 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s3, "toString(...)");
        return s3;
    }

    public static String replace$default(String s, char c, char c1, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return p.replace(s, c, c1, z);
    }

    public static String replace$default(String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return p.replace(s, s1, s2, z);
    }

    @NotNull
    public static final String replaceFirst(@NotNull String s, char c, char c1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        int v = StringsKt__StringsKt.indexOf$default(s, c, 0, z, 2, null);
        return v < 0 ? s : StringsKt__StringsKt.replaceRange(s, v, v + 1, String.valueOf(c1)).toString();
    }

    @NotNull
    public static final String replaceFirst(@NotNull String s, @NotNull String s1, @NotNull String s2, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "oldValue");
        Intrinsics.checkNotNullParameter(s2, "newValue");
        int v = StringsKt__StringsKt.indexOf$default(s, s1, 0, z, 2, null);
        return v < 0 ? s : StringsKt__StringsKt.replaceRange(s, v, s1.length() + v, s2).toString();
    }

    public static String replaceFirst$default(String s, char c, char c1, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return p.replaceFirst(s, c, c1, z);
    }

    public static String replaceFirst$default(String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return p.replaceFirst(s, s1, s2, z);
    }

    @NotNull
    public static final List split(@NotNull CharSequence charSequence0, @NotNull Pattern pattern0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(pattern0, "regex");
        StringsKt__StringsKt.requireNonNegativeLimit(v);
        if(v == 0) {
            v = -1;
        }
        String[] arr_s = pattern0.split(charSequence0, v);
        Intrinsics.checkNotNullExpressionValue(arr_s, "split(...)");
        return ArraysKt___ArraysJvmKt.asList(arr_s);
    }

    public static List split$default(CharSequence charSequence0, Pattern pattern0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return p.split(charSequence0, pattern0, v);
    }

    public static boolean startsWith(@NotNull String s, @NotNull String s1, int v, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "prefix");
        return z ? p.regionMatches(s, v, s1, 0, s1.length(), true) : s.startsWith(s1, v);
    }

    public static boolean startsWith(@NotNull String s, @NotNull String s1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "prefix");
        return z ? p.regionMatches(s, 0, s1, 0, s1.length(), true) : s.startsWith(s1);
    }

    public static boolean startsWith$default(String s, String s1, int v, boolean z, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        return p.startsWith(s, s1, v, z);
    }

    public static boolean startsWith$default(String s, String s1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return p.startsWith(s, s1, z);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final char[] toCharArray(@NotNull String s, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(v, v1, s.length());
        return new char[v1 - v];
    }

    public static char[] toCharArray$default(String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        return p.toCharArray(s, v, v1);
    }
}

