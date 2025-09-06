package kotlin.text;

import java.util.Locale;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

public abstract class b {
    @PublishedApi
    public static int checkRadix(int v) {
        if(new IntRange(2, 36).contains(v)) {
            return v;
        }
        StringBuilder stringBuilder0 = a5.b.s(v, "radix ", " was not in valid range ");
        stringBuilder0.append(new IntRange(2, 36));
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    public static final int digitOf(char c, int v) {
        return Character.digit(c, v);
    }

    @NotNull
    public static final CharCategory getCategory(char c) {
        return CharCategory.Companion.valueOf(Character.getType(c));
    }

    @NotNull
    public static final CharDirectionality getDirectionality(char c) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality(c));
    }

    // 去混淆评级： 低(20)
    public static boolean isWhitespace(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static String lowercase(char c, @NotNull Locale locale0) {
        Intrinsics.checkNotNullParameter(locale0, "locale");
        String s = String.valueOf(c);
        Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.toLowerCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
        return s1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static String titlecase(char c, @NotNull Locale locale0) {
        Intrinsics.checkNotNullParameter(locale0, "locale");
        String s = b.uppercase(c, locale0);
        if(s.length() > 1) {
            if(c != 329) {
                Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
                String s1 = s.substring(1);
                Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
                Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type java.lang.String");
                String s2 = s1.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(s2, "toLowerCase(...)");
                return s.charAt(0) + s2;
            }
            return s;
        }
        String s3 = String.valueOf(c);
        Intrinsics.checkNotNull(s3, "null cannot be cast to non-null type java.lang.String");
        String s4 = s3.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s4, "toUpperCase(...)");
        return Intrinsics.areEqual(s, s4) ? String.valueOf(Character.toTitleCase(c)) : s;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String uppercase(char c, @NotNull Locale locale0) {
        Intrinsics.checkNotNullParameter(locale0, "locale");
        String s = String.valueOf(c);
        Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.toUpperCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s1, "toUpperCase(...)");
        return s1;
    }
}

