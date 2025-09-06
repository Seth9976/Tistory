package kf;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

public abstract class v {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = 0;
        for(Object object0: sequence0) {
            v = UInt.constructor-impl(UInt.constructor-impl(((UByte)object0).unbox-impl() & 0xFF) + v);
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = 0;
        for(Object object0: sequence0) {
            v = UInt.constructor-impl(((UInt)object0).unbox-impl() + v);
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        long v = 0L;
        for(Object object0: sequence0) {
            v = ULong.constructor-impl(((ULong)object0).unbox-impl() + v);
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        int v = 0;
        for(Object object0: sequence0) {
            v = UInt.constructor-impl(UInt.constructor-impl(((UShort)object0).unbox-impl() & 0xFFFF) + v);
        }
        return v;
    }
}

