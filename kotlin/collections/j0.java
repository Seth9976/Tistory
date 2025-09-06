package kotlin.collections;

import java.util.Collection;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class j0 {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v = UInt.constructor-impl(UInt.constructor-impl(((UByte)object0).unbox-impl() & 0xFF) + v);
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v = UInt.constructor-impl(((UInt)object0).unbox-impl() + v);
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        long v = 0L;
        for(Object object0: iterable0) {
            v = ULong.constructor-impl(((ULong)object0).unbox-impl() + v);
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v = UInt.constructor-impl(UInt.constructor-impl(((UShort)object0).unbox-impl() & 0xFFFF) + v);
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        byte[] arr_b = UByteArray.constructor-impl(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            UByteArray.set-VurrAj0(arr_b, v, ((UByte)object0).unbox-impl());
            ++v;
        }
        return arr_b;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        int[] arr_v = UIntArray.constructor-impl(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            UIntArray.set-VXSXFK8(arr_v, v, ((UInt)object0).unbox-impl());
            ++v;
        }
        return arr_v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final long[] toULongArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        long[] arr_v = ULongArray.constructor-impl(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            ULongArray.set-k8EXiF4(arr_v, v, ((ULong)object0).unbox-impl());
            ++v;
        }
        return arr_v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        short[] arr_v = UShortArray.constructor-impl(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            UShortArray.set-01HTLdE(arr_v, v, ((UShort)object0).unbox-impl());
            ++v;
        }
        return arr_v;
    }
}

