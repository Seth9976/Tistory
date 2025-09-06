package kotlin.ranges;

import ce.e;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class c extends e {
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange closedRange0, double f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Byte byte0 = c.toByteExactOrNull(f);
        return byte0 == null ? false : closedRange0.contains(byte0);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange closedRange0, float f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Byte byte0 = c.toByteExactOrNull(f);
        return byte0 == null ? false : closedRange0.contains(byte0);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange closedRange0, int v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Byte byte0 = c.toByteExactOrNull(v);
        return byte0 == null ? false : closedRange0.contains(byte0);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange closedRange0, long v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Byte byte0 = c.toByteExactOrNull(v);
        return byte0 == null ? false : closedRange0.contains(byte0);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange closedRange0, short v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Byte byte0 = c.toByteExactOrNull(v);
        return byte0 == null ? false : closedRange0.contains(byte0);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange openEndRange0, int v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        Byte byte0 = c.toByteExactOrNull(v);
        return byte0 == null ? false : openEndRange0.contains(byte0);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange openEndRange0, long v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        Byte byte0 = c.toByteExactOrNull(v);
        return byte0 == null ? false : openEndRange0.contains(byte0);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange openEndRange0, short v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        Byte byte0 = c.toByteExactOrNull(v);
        return byte0 == null ? false : openEndRange0.contains(byte0);
    }

    public static final byte coerceAtLeast(byte b, byte b1) {
        return b >= b1 ? b : b1;
    }

    public static final double coerceAtLeast(double f, double f1) {
        return f < f1 ? f1 : f;
    }

    public static float coerceAtLeast(float f, float f1) {
        return f < f1 ? f1 : f;
    }

    public static int coerceAtLeast(int v, int v1) [...] // Inlined contents

    public static long coerceAtLeast(long v, long v1) {
        return v >= v1 ? v : v1;
    }

    @NotNull
    public static Comparable coerceAtLeast(@NotNull Comparable comparable0, @NotNull Comparable comparable1) {
        Intrinsics.checkNotNullParameter(comparable0, "<this>");
        Intrinsics.checkNotNullParameter(comparable1, "minimumValue");
        return comparable0.compareTo(comparable1) >= 0 ? comparable0 : comparable1;
    }

    public static final short coerceAtLeast(short v, short v1) {
        return v >= v1 ? v : v1;
    }

    public static final byte coerceAtMost(byte b, byte b1) {
        return b <= b1 ? b : b1;
    }

    public static double coerceAtMost(double f, double f1) {
        return f > f1 ? f1 : f;
    }

    public static float coerceAtMost(float f, float f1) {
        return f > f1 ? f1 : f;
    }

    public static int coerceAtMost(int v, int v1) {
        return v <= v1 ? v : v1;
    }

    public static long coerceAtMost(long v, long v1) {
        return v <= v1 ? v : v1;
    }

    @NotNull
    public static Comparable coerceAtMost(@NotNull Comparable comparable0, @NotNull Comparable comparable1) {
        Intrinsics.checkNotNullParameter(comparable0, "<this>");
        Intrinsics.checkNotNullParameter(comparable1, "maximumValue");
        return comparable0.compareTo(comparable1) <= 0 ? comparable0 : comparable1;
    }

    public static final short coerceAtMost(short v, short v1) {
        return v <= v1 ? v : v1;
    }

    public static final byte coerceIn(byte b, byte b1, byte b2) {
        if(b1 > b2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int)b2) + " is less than minimum " + ((int)b1) + '.');
        }
        if(b < b1) {
            return b1;
        }
        return b <= b2 ? b : b2;
    }

    public static double coerceIn(double f, double f1, double f2) {
        if(f1 > f2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f2 + " is less than minimum " + f1 + '.');
        }
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    public static float coerceIn(float f, float f1, float f2) {
        if(f1 > f2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f2 + " is less than minimum " + f1 + '.');
        }
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    public static int coerceIn(int v, int v1, int v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + v2 + " is less than minimum " + v1 + '.');
        }
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    public static int coerceIn(int v, @NotNull ClosedRange closedRange0) {
        Intrinsics.checkNotNullParameter(closedRange0, "range");
        if(closedRange0 instanceof ClosedFloatingPointRange) {
            return ((Number)c.coerceIn(v, ((ClosedFloatingPointRange)closedRange0))).intValue();
        }
        if(closedRange0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + closedRange0 + '.');
        }
        if(v < ((Number)closedRange0.getStart()).intValue()) {
            return ((Number)closedRange0.getStart()).intValue();
        }
        return v <= ((Number)closedRange0.getEndInclusive()).intValue() ? v : ((Number)closedRange0.getEndInclusive()).intValue();
    }

    public static long coerceIn(long v, long v1, long v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + v2 + " is less than minimum " + v1 + '.');
        }
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    public static long coerceIn(long v, @NotNull ClosedRange closedRange0) {
        Intrinsics.checkNotNullParameter(closedRange0, "range");
        if(closedRange0 instanceof ClosedFloatingPointRange) {
            return ((Number)c.coerceIn(v, ((ClosedFloatingPointRange)closedRange0))).longValue();
        }
        if(closedRange0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + closedRange0 + '.');
        }
        if(v < ((Number)closedRange0.getStart()).longValue()) {
            return ((Number)closedRange0.getStart()).longValue();
        }
        return v <= ((Number)closedRange0.getEndInclusive()).longValue() ? v : ((Number)closedRange0.getEndInclusive()).longValue();
    }

    @NotNull
    public static Comparable coerceIn(@NotNull Comparable comparable0, @Nullable Comparable comparable1, @Nullable Comparable comparable2) {
        Intrinsics.checkNotNullParameter(comparable0, "<this>");
        if(comparable1 != null && comparable2 != null) {
            if(comparable1.compareTo(comparable2) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable2 + " is less than minimum " + comparable1 + '.');
            }
            if(comparable0.compareTo(comparable1) < 0) {
                return comparable1;
            }
            return comparable0.compareTo(comparable2) <= 0 ? comparable0 : comparable2;
        }
        if(comparable1 != null && comparable0.compareTo(comparable1) < 0) {
            return comparable1;
        }
        return comparable2 == null || comparable0.compareTo(comparable2) <= 0 ? comparable0 : comparable2;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static Comparable coerceIn(@NotNull Comparable comparable0, @NotNull ClosedFloatingPointRange closedFloatingPointRange0) {
        Intrinsics.checkNotNullParameter(comparable0, "<this>");
        Intrinsics.checkNotNullParameter(closedFloatingPointRange0, "range");
        if(closedFloatingPointRange0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + closedFloatingPointRange0 + '.');
        }
        if(closedFloatingPointRange0.lessThanOrEquals(comparable0, closedFloatingPointRange0.getStart()) && !closedFloatingPointRange0.lessThanOrEquals(closedFloatingPointRange0.getStart(), comparable0)) {
            return closedFloatingPointRange0.getStart();
        }
        return !closedFloatingPointRange0.lessThanOrEquals(closedFloatingPointRange0.getEndInclusive(), comparable0) || closedFloatingPointRange0.lessThanOrEquals(comparable0, closedFloatingPointRange0.getEndInclusive()) ? comparable0 : closedFloatingPointRange0.getEndInclusive();
    }

    @NotNull
    public static final Comparable coerceIn(@NotNull Comparable comparable0, @NotNull ClosedRange closedRange0) {
        Intrinsics.checkNotNullParameter(comparable0, "<this>");
        Intrinsics.checkNotNullParameter(closedRange0, "range");
        if(closedRange0 instanceof ClosedFloatingPointRange) {
            return c.coerceIn(comparable0, ((ClosedFloatingPointRange)closedRange0));
        }
        if(closedRange0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + closedRange0 + '.');
        }
        if(comparable0.compareTo(closedRange0.getStart()) < 0) {
            return closedRange0.getStart();
        }
        return comparable0.compareTo(closedRange0.getEndInclusive()) <= 0 ? comparable0 : closedRange0.getEndInclusive();
    }

    public static final short coerceIn(short v, short v1, short v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int)v2) + " is less than minimum " + ((int)v1) + '.');
        }
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(ClosedRange closedRange0, byte b) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((double)b));
    }

    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull ClosedRange closedRange0, float f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((double)f));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(ClosedRange closedRange0, int v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((double)v));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(ClosedRange closedRange0, long v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((double)v));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(ClosedRange closedRange0, short v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((double)v));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull OpenEndRange openEndRange0, float f) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        return openEndRange0.contains(((double)f));
    }

    @NotNull
    public static final CharProgression downTo(char c, char c1) {
        return CharProgression.Companion.fromClosedRange(c, c1, -1);
    }

    @NotNull
    public static final IntProgression downTo(byte b, byte b1) {
        return IntProgression.Companion.fromClosedRange(((int)b), ((int)b1), -1);
    }

    @NotNull
    public static final IntProgression downTo(byte b, int v) {
        return IntProgression.Companion.fromClosedRange(((int)b), v, -1);
    }

    @NotNull
    public static final IntProgression downTo(byte b, short v) {
        return IntProgression.Companion.fromClosedRange(((int)b), ((int)v), -1);
    }

    @NotNull
    public static final IntProgression downTo(int v, byte b) {
        return IntProgression.Companion.fromClosedRange(v, ((int)b), -1);
    }

    @NotNull
    public static IntProgression downTo(int v, int v1) {
        return IntProgression.Companion.fromClosedRange(v, v1, -1);
    }

    @NotNull
    public static final IntProgression downTo(int v, short v1) {
        return IntProgression.Companion.fromClosedRange(v, ((int)v1), -1);
    }

    @NotNull
    public static final IntProgression downTo(short v, byte b) {
        return IntProgression.Companion.fromClosedRange(((int)v), ((int)b), -1);
    }

    @NotNull
    public static final IntProgression downTo(short v, int v1) {
        return IntProgression.Companion.fromClosedRange(((int)v), v1, -1);
    }

    @NotNull
    public static final IntProgression downTo(short v, short v1) {
        return IntProgression.Companion.fromClosedRange(((int)v), ((int)v1), -1);
    }

    @NotNull
    public static final LongProgression downTo(byte b, long v) {
        return LongProgression.Companion.fromClosedRange(((long)b), v, -1L);
    }

    @NotNull
    public static final LongProgression downTo(int v, long v1) {
        return LongProgression.Companion.fromClosedRange(((long)v), v1, -1L);
    }

    @NotNull
    public static final LongProgression downTo(long v, byte b) {
        return LongProgression.Companion.fromClosedRange(v, ((long)b), -1L);
    }

    @NotNull
    public static final LongProgression downTo(long v, int v1) {
        return LongProgression.Companion.fromClosedRange(v, ((long)v1), -1L);
    }

    @NotNull
    public static final LongProgression downTo(long v, long v1) {
        return LongProgression.Companion.fromClosedRange(v, v1, -1L);
    }

    @NotNull
    public static final LongProgression downTo(long v, short v1) {
        return LongProgression.Companion.fromClosedRange(v, ((long)v1), -1L);
    }

    @NotNull
    public static final LongProgression downTo(short v, long v1) {
        return LongProgression.Companion.fromClosedRange(((long)v), v1, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final char first(@NotNull CharProgression charProgression0) {
        Intrinsics.checkNotNullParameter(charProgression0, "<this>");
        if(charProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + charProgression0 + " is empty.");
        }
        return charProgression0.getFirst();
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull IntProgression intProgression0) {
        Intrinsics.checkNotNullParameter(intProgression0, "<this>");
        if(intProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + intProgression0 + " is empty.");
        }
        return intProgression0.getFirst();
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull LongProgression longProgression0) {
        Intrinsics.checkNotNullParameter(longProgression0, "<this>");
        if(longProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + longProgression0 + " is empty.");
        }
        return longProgression0.getFirst();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character firstOrNull(@NotNull CharProgression charProgression0) {
        Intrinsics.checkNotNullParameter(charProgression0, "<this>");
        return charProgression0.isEmpty() ? null : Character.valueOf(charProgression0.getFirst());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer firstOrNull(@NotNull IntProgression intProgression0) {
        Intrinsics.checkNotNullParameter(intProgression0, "<this>");
        return intProgression0.isEmpty() ? null : intProgression0.getFirst();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long firstOrNull(@NotNull LongProgression longProgression0) {
        Intrinsics.checkNotNullParameter(longProgression0, "<this>");
        return longProgression0.isEmpty() ? null : longProgression0.getFirst();
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(ClosedRange closedRange0, byte b) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((float)b));
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(@NotNull ClosedRange closedRange0, double f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((float)f));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(ClosedRange closedRange0, int v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((float)v));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(ClosedRange closedRange0, long v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((float)v));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(ClosedRange closedRange0, short v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((float)v));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange closedRange0, byte b) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((int)b));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange closedRange0, double f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Integer integer0 = c.toIntExactOrNull(f);
        return integer0 == null ? false : closedRange0.contains(integer0);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange closedRange0, float f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Integer integer0 = c.toIntExactOrNull(f);
        return integer0 == null ? false : closedRange0.contains(integer0);
    }

    @JvmName(name = "intRangeContains")
    public static boolean intRangeContains(@NotNull ClosedRange closedRange0, long v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Integer integer0 = c.toIntExactOrNull(v);
        return integer0 == null ? false : closedRange0.contains(integer0);
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange closedRange0, short v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((int)v));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange openEndRange0, byte b) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        return openEndRange0.contains(((int)b));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange openEndRange0, long v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        Integer integer0 = c.toIntExactOrNull(v);
        return integer0 == null ? false : openEndRange0.contains(integer0);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange openEndRange0, short v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        return openEndRange0.contains(((int)v));
    }

    @SinceKotlin(version = "1.7")
    public static final char last(@NotNull CharProgression charProgression0) {
        Intrinsics.checkNotNullParameter(charProgression0, "<this>");
        if(charProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + charProgression0 + " is empty.");
        }
        return charProgression0.getLast();
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull IntProgression intProgression0) {
        Intrinsics.checkNotNullParameter(intProgression0, "<this>");
        if(intProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + intProgression0 + " is empty.");
        }
        return intProgression0.getLast();
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull LongProgression longProgression0) {
        Intrinsics.checkNotNullParameter(longProgression0, "<this>");
        if(longProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + longProgression0 + " is empty.");
        }
        return longProgression0.getLast();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character lastOrNull(@NotNull CharProgression charProgression0) {
        Intrinsics.checkNotNullParameter(charProgression0, "<this>");
        return charProgression0.isEmpty() ? null : Character.valueOf(charProgression0.getLast());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer lastOrNull(@NotNull IntProgression intProgression0) {
        Intrinsics.checkNotNullParameter(intProgression0, "<this>");
        return intProgression0.isEmpty() ? null : intProgression0.getLast();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long lastOrNull(@NotNull LongProgression longProgression0) {
        Intrinsics.checkNotNullParameter(longProgression0, "<this>");
        return longProgression0.isEmpty() ? null : longProgression0.getLast();
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange closedRange0, byte b) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((long)b));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange closedRange0, double f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Long long0 = c.toLongExactOrNull(f);
        return long0 == null ? false : closedRange0.contains(long0);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange closedRange0, float f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Long long0 = c.toLongExactOrNull(f);
        return long0 == null ? false : closedRange0.contains(long0);
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange closedRange0, int v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((long)v));
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange closedRange0, short v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((long)v));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange openEndRange0, byte b) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        return openEndRange0.contains(((long)b));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange openEndRange0, int v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        return openEndRange0.contains(((long)v));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange openEndRange0, short v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        return openEndRange0.contains(((long)v));
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharRange charRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(charRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        try {
            return (char)random0.nextInt(charRange0.getFirst(), charRange0.getLast() + 1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new NoSuchElementException(illegalArgumentException0.getMessage());
        }
    }

    @SinceKotlin(version = "1.3")
    public static final int random(@NotNull IntRange intRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(intRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        try {
            return RandomKt.nextInt(random0, intRange0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new NoSuchElementException(illegalArgumentException0.getMessage());
        }
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull LongRange longRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(longRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        try {
            return RandomKt.nextLong(random0, longRange0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new NoSuchElementException(illegalArgumentException0.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull CharRange charRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(charRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return charRange0.isEmpty() ? null : Character.valueOf(((char)random0.nextInt(charRange0.getFirst(), charRange0.getLast() + 1)));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer randomOrNull(@NotNull IntRange intRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(intRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return intRange0.isEmpty() ? null : RandomKt.nextInt(random0, intRange0);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long randomOrNull(@NotNull LongRange longRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(longRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return longRange0.isEmpty() ? null : RandomKt.nextLong(random0, longRange0);
    }

    @NotNull
    public static final CharProgression reversed(@NotNull CharProgression charProgression0) {
        Intrinsics.checkNotNullParameter(charProgression0, "<this>");
        return CharProgression.Companion.fromClosedRange(charProgression0.getLast(), charProgression0.getFirst(), -charProgression0.getStep());
    }

    @NotNull
    public static IntProgression reversed(@NotNull IntProgression intProgression0) {
        Intrinsics.checkNotNullParameter(intProgression0, "<this>");
        return IntProgression.Companion.fromClosedRange(intProgression0.getLast(), intProgression0.getFirst(), -intProgression0.getStep());
    }

    @NotNull
    public static final LongProgression reversed(@NotNull LongProgression longProgression0) {
        Intrinsics.checkNotNullParameter(longProgression0, "<this>");
        return LongProgression.Companion.fromClosedRange(longProgression0.getLast(), longProgression0.getFirst(), -longProgression0.getStep());
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange closedRange0, byte b) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        return closedRange0.contains(((short)b));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange closedRange0, double f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Short short0 = c.toShortExactOrNull(f);
        return short0 == null ? false : closedRange0.contains(short0);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange closedRange0, float f) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Short short0 = c.toShortExactOrNull(f);
        return short0 == null ? false : closedRange0.contains(short0);
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange closedRange0, int v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Short short0 = c.toShortExactOrNull(v);
        return short0 == null ? false : closedRange0.contains(short0);
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange closedRange0, long v) {
        Intrinsics.checkNotNullParameter(closedRange0, "<this>");
        Short short0 = c.toShortExactOrNull(v);
        return short0 == null ? false : closedRange0.contains(short0);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange openEndRange0, byte b) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        return openEndRange0.contains(((short)b));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange openEndRange0, int v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        Short short0 = c.toShortExactOrNull(v);
        return short0 == null ? false : openEndRange0.contains(short0);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange openEndRange0, long v) {
        Intrinsics.checkNotNullParameter(openEndRange0, "<this>");
        Short short0 = c.toShortExactOrNull(v);
        return short0 == null ? false : openEndRange0.contains(short0);
    }

    @NotNull
    public static final CharProgression step(@NotNull CharProgression charProgression0, int v) {
        Intrinsics.checkNotNullParameter(charProgression0, "<this>");
        e.checkStepIsPositive(v > 0, v);
        Companion charProgression$Companion0 = CharProgression.Companion;
        int v1 = charProgression0.getFirst();
        int v2 = charProgression0.getLast();
        if(charProgression0.getStep() <= 0) {
            v = -v;
        }
        return charProgression$Companion0.fromClosedRange(((char)v1), ((char)v2), v);
    }

    @NotNull
    public static IntProgression step(@NotNull IntProgression intProgression0, int v) {
        Intrinsics.checkNotNullParameter(intProgression0, "<this>");
        e.checkStepIsPositive(v > 0, v);
        kotlin.ranges.IntProgression.Companion intProgression$Companion0 = IntProgression.Companion;
        int v1 = intProgression0.getFirst();
        int v2 = intProgression0.getLast();
        if(intProgression0.getStep() <= 0) {
            v = -v;
        }
        return intProgression$Companion0.fromClosedRange(v1, v2, v);
    }

    @NotNull
    public static final LongProgression step(@NotNull LongProgression longProgression0, long v) {
        Intrinsics.checkNotNullParameter(longProgression0, "<this>");
        e.checkStepIsPositive(v > 0L, v);
        long v1 = longProgression0.getFirst();
        long v2 = longProgression0.getLast();
        return longProgression0.getStep() <= 0L ? LongProgression.Companion.fromClosedRange(v1, v2, -v) : LongProgression.Companion.fromClosedRange(v1, v2, v);
    }

    @Nullable
    public static final Byte toByteExactOrNull(double f) {
        return -128.0 > f || f > 127.0 ? null : ((byte)(((int)f)));
    }

    @Nullable
    public static final Byte toByteExactOrNull(float f) {
        return -128.0f > f || f > 127.0f ? null : ((byte)(((int)f)));
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final Byte toByteExactOrNull(int v) {
        return new IntRange(0xFFFFFF80, 0x7F).contains(v) ? ((byte)v) : null;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final Byte toByteExactOrNull(long v) {
        return new LongRange(0xFFFFFFFFFFFFFF80L, 0x7FL).contains(v) ? ((byte)(((int)v))) : null;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final Byte toByteExactOrNull(short v) {
        return c.intRangeContains(new IntRange(0xFFFFFF80, 0x7F), v) ? ((byte)v) : null;
    }

    @Nullable
    public static final Integer toIntExactOrNull(double f) {
        return -2147483648.0 > f || f > 2147483647.0 ? null : ((int)f);
    }

    @Nullable
    public static final Integer toIntExactOrNull(float f) {
        return -2147483648.0f > f || f > 2147483648.0f ? null : ((int)f);
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final Integer toIntExactOrNull(long v) {
        return new LongRange(0xFFFFFFFF80000000L, 0x7FFFFFFFL).contains(v) ? ((int)v) : null;
    }

    @Nullable
    public static final Long toLongExactOrNull(double f) {
        return -9223372036854776000.0 > f || f > 9223372036854776000.0 ? null : ((long)f);
    }

    @Nullable
    public static final Long toLongExactOrNull(float f) {
        return -9223372036854776000.0f > f || f > 9223372036854776000.0f ? null : ((long)f);
    }

    @Nullable
    public static final Short toShortExactOrNull(double f) {
        return -32768.0 > f || f > 32767.0 ? null : ((short)(((int)f)));
    }

    @Nullable
    public static final Short toShortExactOrNull(float f) {
        return -32768.0f > f || f > 32767.0f ? null : ((short)(((int)f)));
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final Short toShortExactOrNull(int v) {
        return new IntRange(0xFFFF8000, 0x7FFF).contains(v) ? ((short)v) : null;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final Short toShortExactOrNull(long v) {
        return new LongRange(0xFFFFFFFFFFFF8000L, 0x7FFFL).contains(v) ? ((short)(((int)v))) : null;
    }

    @NotNull
    public static final CharRange until(char c, char c1) {
        return Intrinsics.compare(c1, 0) > 0 ? new CharRange(c, ((char)(c1 - 1))) : CharRange.Companion.getEMPTY();
    }

    @NotNull
    public static final IntRange until(byte b, byte b1) {
        return new IntRange(((int)b), b1 - 1);
    }

    @NotNull
    public static final IntRange until(byte b, int v) {
        return v > 0x80000000 ? new IntRange(((int)b), v - 1) : IntRange.Companion.getEMPTY();
    }

    @NotNull
    public static final IntRange until(byte b, short v) {
        return new IntRange(((int)b), v - 1);
    }

    @NotNull
    public static final IntRange until(int v, byte b) {
        return new IntRange(v, b - 1);
    }

    @NotNull
    public static IntRange until(int v, int v1) {
        return v1 > 0x80000000 ? new IntRange(v, v1 - 1) : IntRange.Companion.getEMPTY();
    }

    @NotNull
    public static final IntRange until(int v, short v1) {
        return new IntRange(v, v1 - 1);
    }

    @NotNull
    public static final IntRange until(short v, byte b) {
        return new IntRange(((int)v), b - 1);
    }

    @NotNull
    public static final IntRange until(short v, int v1) {
        return v1 > 0x80000000 ? new IntRange(((int)v), v1 - 1) : IntRange.Companion.getEMPTY();
    }

    @NotNull
    public static final IntRange until(short v, short v1) {
        return new IntRange(((int)v), v1 - 1);
    }

    @NotNull
    public static final LongRange until(byte b, long v) {
        return v > 0x8000000000000000L ? new LongRange(((long)b), v - 1L) : LongRange.Companion.getEMPTY();
    }

    @NotNull
    public static final LongRange until(int v, long v1) {
        return v1 > 0x8000000000000000L ? new LongRange(((long)v), v1 - 1L) : LongRange.Companion.getEMPTY();
    }

    @NotNull
    public static final LongRange until(long v, byte b) {
        return new LongRange(v, ((long)b) - 1L);
    }

    @NotNull
    public static final LongRange until(long v, int v1) {
        return new LongRange(v, ((long)v1) - 1L);
    }

    @NotNull
    public static final LongRange until(long v, long v1) {
        return v1 > 0x8000000000000000L ? new LongRange(v, v1 - 1L) : LongRange.Companion.getEMPTY();
    }

    @NotNull
    public static final LongRange until(long v, short v1) {
        return new LongRange(v, ((long)v1) - 1L);
    }

    @NotNull
    public static final LongRange until(short v, long v1) {
        return v1 > 0x8000000000000000L ? new LongRange(((long)v), v1 - 1L) : LongRange.Companion.getEMPTY();
    }
}

