package ce;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.OpenEndRange;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;

public abstract class e {
    public static final void checkStepIsPositive(boolean z, @NotNull Number number0) {
        Intrinsics.checkNotNullParameter(number0, "step");
        if(!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number0 + '.');
        }
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final ClosedFloatingPointRange rangeTo(double f, double f1) {
        return new a(f, f1);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static ClosedFloatingPointRange rangeTo(float f, float f1) [...] // Inlined contents

    @NotNull
    public static final ClosedRange rangeTo(@NotNull Comparable comparable0, @NotNull Comparable comparable1) {
        Intrinsics.checkNotNullParameter(comparable0, "<this>");
        Intrinsics.checkNotNullParameter(comparable1, "that");
        return new b(comparable0, comparable1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final OpenEndRange rangeUntil(double f, double f1) {
        return new c(f, f1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final OpenEndRange rangeUntil(float f, float f1) {
        return new d(f, f1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final OpenEndRange rangeUntil(@NotNull Comparable comparable0, @NotNull Comparable comparable1) {
        Intrinsics.checkNotNullParameter(comparable0, "<this>");
        Intrinsics.checkNotNullParameter(comparable1, "that");
        return new kotlin.ranges.a(comparable0, comparable1);
    }
}

