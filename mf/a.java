package mf;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlin.time.DurationUnitKt__DurationUnitJvmKt.WhenMappings;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;

public abstract class a {
    @SinceKotlin(version = "1.3")
    public static final double convertDurationUnit(double f, @NotNull DurationUnit durationUnit0, @NotNull DurationUnit durationUnit1) {
        Intrinsics.checkNotNullParameter(durationUnit0, "sourceUnit");
        Intrinsics.checkNotNullParameter(durationUnit1, "targetUnit");
        long v = durationUnit1.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit0.getTimeUnit$kotlin_stdlib());
        return v <= 0L ? f / ((double)durationUnit0.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit1.getTimeUnit$kotlin_stdlib())) : f * ((double)v);
    }

    @SinceKotlin(version = "1.5")
    public static final long convertDurationUnit(long v, @NotNull DurationUnit durationUnit0, @NotNull DurationUnit durationUnit1) {
        Intrinsics.checkNotNullParameter(durationUnit0, "sourceUnit");
        Intrinsics.checkNotNullParameter(durationUnit1, "targetUnit");
        return durationUnit1.getTimeUnit$kotlin_stdlib().convert(v, durationUnit0.getTimeUnit$kotlin_stdlib());
    }

    @SinceKotlin(version = "1.5")
    public static final long convertDurationUnitOverflow(long v, @NotNull DurationUnit durationUnit0, @NotNull DurationUnit durationUnit1) {
        Intrinsics.checkNotNullParameter(durationUnit0, "sourceUnit");
        Intrinsics.checkNotNullParameter(durationUnit1, "targetUnit");
        return durationUnit1.getTimeUnit$kotlin_stdlib().convert(v, durationUnit0.getTimeUnit$kotlin_stdlib());
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @NotNull
    public static final DurationUnit toDurationUnit(@NotNull TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "<this>");
        switch(DurationUnitKt__DurationUnitJvmKt.WhenMappings.$EnumSwitchMapping$0[timeUnit0.ordinal()]) {
            case 1: {
                return DurationUnit.NANOSECONDS;
            }
            case 2: {
                return DurationUnit.MICROSECONDS;
            }
            case 3: {
                return DurationUnit.MILLISECONDS;
            }
            case 4: {
                return DurationUnit.SECONDS;
            }
            case 5: {
                return DurationUnit.MINUTES;
            }
            case 6: {
                return DurationUnit.HOURS;
            }
            case 7: {
                return DurationUnit.DAYS;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @NotNull
    public static TimeUnit toTimeUnit(@NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "<this>");
        return durationUnit0.getTimeUnit$kotlin_stdlib();
    }
}

