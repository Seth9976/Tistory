package mf;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings;
import org.jetbrains.annotations.NotNull;

public abstract class b extends a {
    @SinceKotlin(version = "1.5")
    @NotNull
    public static final DurationUnit durationUnitByIsoChar(char c, boolean z) {
        if(!z) {
            if(c != 68) {
                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
            }
            return DurationUnit.DAYS;
        }
        switch(c) {
            case 72: {
                return DurationUnit.HOURS;
            }
            case 77: {
                return DurationUnit.MINUTES;
            }
            case 83: {
                return DurationUnit.SECONDS;
            }
            default: {
                throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
            }
        }
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final DurationUnit durationUnitByShortName(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "shortName");
        switch(s) {
            case "d": {
                return DurationUnit.DAYS;
            }
            case "h": {
                return DurationUnit.HOURS;
            }
            case "m": {
                return DurationUnit.MINUTES;
            }
            case "ms": {
                return DurationUnit.MILLISECONDS;
            }
            case "ns": {
                return DurationUnit.NANOSECONDS;
            }
            case "s": {
                return DurationUnit.SECONDS;
            }
            case "us": {
                return DurationUnit.MICROSECONDS;
            }
            default: {
                throw new IllegalArgumentException("Unknown duration unit short name: " + s);
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final String shortName(@NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "<this>");
        switch(DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0[durationUnit0.ordinal()]) {
            case 1: {
                return "ns";
            }
            case 2: {
                return "us";
            }
            case 3: {
                return "ms";
            }
            case 4: {
                return "s";
            }
            case 5: {
                return "m";
            }
            case 6: {
                return "h";
            }
            case 7: {
                return "d";
            }
            default: {
                throw new IllegalStateException(("Unknown unit: " + durationUnit0).toString());
            }
        }
    }
}

