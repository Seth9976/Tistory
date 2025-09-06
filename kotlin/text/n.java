package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class n extends m {
    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        try {
            return h.a.matches(s) ? new BigDecimal(s) : null;
        }
        catch(NumberFormatException unused_ex) {
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String s, @NotNull MathContext mathContext0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(mathContext0, "mathContext");
        try {
            return h.a.matches(s) ? new BigDecimal(s, mathContext0) : null;
        }
        catch(NumberFormatException unused_ex) {
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return n.toBigIntegerOrNull(s, 10);
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String s, int v) {
        int v1 = 0;
        Intrinsics.checkNotNullParameter(s, "<this>");
        b.checkRadix(v);
        int v2 = s.length();
        switch(v2) {
            case 0: {
                return null;
            }
            case 1: {
                return b.digitOf(s.charAt(0), v) >= 0 ? new BigInteger(s, b.checkRadix(v)) : null;
            }
            default: {
                if(s.charAt(0) == 45) {
                    v1 = 1;
                }
                while(v1 < v2) {
                    if(b.digitOf(s.charAt(v1), v) < 0) {
                        return null;
                    }
                    ++v1;
                }
                return new BigInteger(s, b.checkRadix(v));
            }
        }
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Double toDoubleOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        try {
            return h.a.matches(s) ? Double.parseDouble(s) : null;
        }
        catch(NumberFormatException unused_ex) {
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Float toFloatOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        try {
            return h.a.matches(s) ? Float.parseFloat(s) : null;
        }
        catch(NumberFormatException unused_ex) {
        }
        return null;
    }
}

