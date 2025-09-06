package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class c extends b {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int v) {
        if(!new IntRange(0, 9).contains(v)) {
            throw new IllegalArgumentException("Int " + v + " is not a decimal digit");
        }
        return (char)(v + 0x30);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int v, int v1) {
        if(!new IntRange(2, 36).contains(v1)) {
            throw new IllegalArgumentException("Invalid radix: " + v1 + ". Valid radix values are in range 2..36");
        }
        if(v < 0 || v >= v1) {
            throw new IllegalArgumentException("Digit " + v + " does not represent a valid digit in radix " + v1);
        }
        return v >= 10 ? ((char)(((char)(v + 65)) - 10)) : ((char)(v + 0x30));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static int digitToInt(char c) {
        int v = b.digitOf(c, 10);
        if(v < 0) {
            throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int digitToInt(char c, int v) {
        Integer integer0 = c.digitToIntOrNull(c, v);
        if(integer0 == null) {
            throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + v);
        }
        return (int)integer0;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer digitToIntOrNull(char c) {
        Integer integer0 = b.digitOf(c, 10);
        return integer0.intValue() >= 0 ? integer0 : null;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer digitToIntOrNull(char c, int v) {
        b.checkRadix(v);
        Integer integer0 = b.digitOf(c, v);
        return integer0.intValue() >= 0 ? integer0 : null;
    }

    public static final boolean equals(char c, char c1, boolean z) {
        if(c == c1) {
            return true;
        }
        if(!z) {
            return false;
        }
        int v = Character.toUpperCase(c);
        int v1 = Character.toUpperCase(c1);
        return v == v1 || Character.toLowerCase(((char)v)) == Character.toLowerCase(((char)v1));
    }

    public static boolean equals$default(char c, char c1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return c.equals(c, c1, z);
    }

    public static final boolean isSurrogate(char c) {
        return new CharRange('\uD800', '\uDFFF').contains(c);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static String titlecase(char c) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c);
    }
}

