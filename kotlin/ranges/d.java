package kotlin.ranges;

import ce.e;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class d {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short coerceAtLeast-5PvTz6A(short v, short v1) {
        return Intrinsics.compare(v & 0xFFFF, 0xFFFF & v1) >= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int coerceAtLeast-J1ME1BU(int v, int v1) {
        return Integer.compareUnsigned(v, v1) >= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte coerceAtLeast-Kr8caGY(byte b, byte b1) {
        return Intrinsics.compare(b & 0xFF, b1 & 0xFF) >= 0 ? b : b1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long coerceAtLeast-eb3DHEI(long v, long v1) {
        return Long.compareUnsigned(v, v1) >= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short coerceAtMost-5PvTz6A(short v, short v1) {
        return Intrinsics.compare(v & 0xFFFF, 0xFFFF & v1) <= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int coerceAtMost-J1ME1BU(int v, int v1) {
        return Integer.compareUnsigned(v, v1) <= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte coerceAtMost-Kr8caGY(byte b, byte b1) {
        return Intrinsics.compare(b & 0xFF, b1 & 0xFF) <= 0 ? b : b1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long coerceAtMost-eb3DHEI(long v, long v1) {
        return Long.compareUnsigned(v, v1) <= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long coerceIn-JPwROB0(long v, @NotNull ClosedRange closedRange0) {
        Intrinsics.checkNotNullParameter(closedRange0, "range");
        if(closedRange0 instanceof ClosedFloatingPointRange) {
            return ((ULong)c.coerceIn(ULong.box-impl(v), ((ClosedFloatingPointRange)closedRange0))).unbox-impl();
        }
        if(closedRange0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + closedRange0 + '.');
        }
        if(Long.compareUnsigned(v, ((ULong)closedRange0.getStart()).unbox-impl()) < 0) {
            return ((ULong)closedRange0.getStart()).unbox-impl();
        }
        return Long.compareUnsigned(v, ((ULong)closedRange0.getEndInclusive()).unbox-impl()) <= 0 ? v : ((ULong)closedRange0.getEndInclusive()).unbox-impl();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short coerceIn-VKSA0NQ(short v, short v1, short v2) {
        if(Intrinsics.compare(v1 & 0xFFFF, v2 & 0xFFFF) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UShort.toString-impl(v2) + " is less than minimum " + UShort.toString-impl(v1) + '.');
        }
        if(Intrinsics.compare(0xFFFF & v, v1 & 0xFFFF) < 0) {
            return v1;
        }
        return Intrinsics.compare(0xFFFF & v, v2 & 0xFFFF) <= 0 ? v : v2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int coerceIn-WZ9TVnA(int v, int v1, int v2) {
        if(Integer.compareUnsigned(v1, v2) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UInt.toString-impl(v2) + " is less than minimum " + UInt.toString-impl(v1) + '.');
        }
        if(Integer.compareUnsigned(v, v1) < 0) {
            return v1;
        }
        return Integer.compareUnsigned(v, v2) <= 0 ? v : v2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte coerceIn-b33U2AM(byte b, byte b1, byte b2) {
        if(Intrinsics.compare(b1 & 0xFF, b2 & 0xFF) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UByte.toString-impl(b2) + " is less than minimum " + UByte.toString-impl(b1) + '.');
        }
        if(Intrinsics.compare(b & 0xFF, b1 & 0xFF) < 0) {
            return b1;
        }
        return Intrinsics.compare(b & 0xFF, b2 & 0xFF) <= 0 ? b : b2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long coerceIn-sambcqE(long v, long v1, long v2) {
        if(Long.compareUnsigned(v1, v2) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ULong.toString-impl(v2) + " is less than minimum " + ULong.toString-impl(v1) + '.');
        }
        if(Long.compareUnsigned(v, v1) < 0) {
            return v1;
        }
        return Long.compareUnsigned(v, v2) <= 0 ? v : v2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int coerceIn-wuiCnnA(int v, @NotNull ClosedRange closedRange0) {
        Intrinsics.checkNotNullParameter(closedRange0, "range");
        if(closedRange0 instanceof ClosedFloatingPointRange) {
            return ((UInt)c.coerceIn(UInt.box-impl(v), ((ClosedFloatingPointRange)closedRange0))).unbox-impl();
        }
        if(closedRange0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + closedRange0 + '.');
        }
        if(Integer.compareUnsigned(v, ((UInt)closedRange0.getStart()).unbox-impl()) < 0) {
            return ((UInt)closedRange0.getStart()).unbox-impl();
        }
        return Integer.compareUnsigned(v, ((UInt)closedRange0.getEndInclusive()).unbox-impl()) <= 0 ? v : ((UInt)closedRange0.getEndInclusive()).unbox-impl();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean contains-68kG9v0(@NotNull UIntRange uIntRange0, byte b) {
        Intrinsics.checkNotNullParameter(uIntRange0, "$this$contains");
        return uIntRange0.contains-WZ4Q5Ns(b & 0xFF);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean contains-Gab390E(@NotNull ULongRange uLongRange0, int v) {
        Intrinsics.checkNotNullParameter(uLongRange0, "$this$contains");
        return uLongRange0.contains-VKZWuLQ(((long)v) & 0xFFFFFFFFL);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean contains-ULb-yJY(@NotNull ULongRange uLongRange0, byte b) {
        Intrinsics.checkNotNullParameter(uLongRange0, "$this$contains");
        return uLongRange0.contains-VKZWuLQ(((long)b) & 0xFFL);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean contains-ZsK3CEQ(@NotNull UIntRange uIntRange0, short v) {
        Intrinsics.checkNotNullParameter(uIntRange0, "$this$contains");
        return uIntRange0.contains-WZ4Q5Ns(v & 0xFFFF);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean contains-fz5IDCE(@NotNull UIntRange uIntRange0, long v) {
        Intrinsics.checkNotNullParameter(uIntRange0, "$this$contains");
        return v >>> 0x20 == 0L && uIntRange0.contains-WZ4Q5Ns(((int)v));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean contains-uhHAxoY(@NotNull ULongRange uLongRange0, short v) {
        Intrinsics.checkNotNullParameter(uLongRange0, "$this$contains");
        return uLongRange0.contains-VKZWuLQ(ULong.constructor-impl(((long)v) & 0xFFFFL));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression downTo-5PvTz6A(short v, short v1) {
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs(v & 0xFFFF, v1 & 0xFFFF, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression downTo-J1ME1BU(int v, int v1) {
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs(v, v1, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression downTo-Kr8caGY(byte b, byte b1) {
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs(UInt.constructor-impl(b & 0xFF), UInt.constructor-impl(b1 & 0xFF), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression downTo-eb3DHEI(long v, long v1) {
        return ULongProgression.Companion.fromClosedRange-7ftBX0g(v, v1, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull UIntProgression uIntProgression0) {
        Intrinsics.checkNotNullParameter(uIntProgression0, "<this>");
        if(uIntProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + uIntProgression0 + " is empty.");
        }
        return uIntProgression0.getFirst-pVg5ArA();
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull ULongProgression uLongProgression0) {
        Intrinsics.checkNotNullParameter(uLongProgression0, "<this>");
        if(uLongProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + uLongProgression0 + " is empty.");
        }
        return uLongProgression0.getFirst-s-VKNKU();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt firstOrNull(@NotNull UIntProgression uIntProgression0) {
        Intrinsics.checkNotNullParameter(uIntProgression0, "<this>");
        return uIntProgression0.isEmpty() ? null : UInt.box-impl(uIntProgression0.getFirst-pVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong firstOrNull(@NotNull ULongProgression uLongProgression0) {
        Intrinsics.checkNotNullParameter(uLongProgression0, "<this>");
        return uLongProgression0.isEmpty() ? null : ULong.box-impl(uLongProgression0.getFirst-s-VKNKU());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull UIntProgression uIntProgression0) {
        Intrinsics.checkNotNullParameter(uIntProgression0, "<this>");
        if(uIntProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + uIntProgression0 + " is empty.");
        }
        return uIntProgression0.getLast-pVg5ArA();
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull ULongProgression uLongProgression0) {
        Intrinsics.checkNotNullParameter(uLongProgression0, "<this>");
        if(uLongProgression0.isEmpty()) {
            throw new NoSuchElementException("Progression " + uLongProgression0 + " is empty.");
        }
        return uLongProgression0.getLast-s-VKNKU();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt lastOrNull(@NotNull UIntProgression uIntProgression0) {
        Intrinsics.checkNotNullParameter(uIntProgression0, "<this>");
        return uIntProgression0.isEmpty() ? null : UInt.box-impl(uIntProgression0.getLast-pVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong lastOrNull(@NotNull ULongProgression uLongProgression0) {
        Intrinsics.checkNotNullParameter(uLongProgression0, "<this>");
        return uLongProgression0.isEmpty() ? null : ULong.box-impl(uLongProgression0.getLast-s-VKNKU());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int random(@NotNull UIntRange uIntRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(uIntRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        try {
            return URandomKt.nextUInt(random0, uIntRange0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new NoSuchElementException(illegalArgumentException0.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long random(@NotNull ULongRange uLongRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(uLongRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        try {
            return URandomKt.nextULong(random0, uLongRange0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new NoSuchElementException(illegalArgumentException0.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt randomOrNull(@NotNull UIntRange uIntRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(uIntRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return uIntRange0.isEmpty() ? null : UInt.box-impl(URandomKt.nextUInt(random0, uIntRange0));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong randomOrNull(@NotNull ULongRange uLongRange0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(uLongRange0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return uLongRange0.isEmpty() ? null : ULong.box-impl(URandomKt.nextULong(random0, uLongRange0));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression reversed(@NotNull UIntProgression uIntProgression0) {
        Intrinsics.checkNotNullParameter(uIntProgression0, "<this>");
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs(uIntProgression0.getLast-pVg5ArA(), uIntProgression0.getFirst-pVg5ArA(), -uIntProgression0.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression reversed(@NotNull ULongProgression uLongProgression0) {
        Intrinsics.checkNotNullParameter(uLongProgression0, "<this>");
        return ULongProgression.Companion.fromClosedRange-7ftBX0g(uLongProgression0.getLast-s-VKNKU(), uLongProgression0.getFirst-s-VKNKU(), -uLongProgression0.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression step(@NotNull UIntProgression uIntProgression0, int v) {
        Intrinsics.checkNotNullParameter(uIntProgression0, "<this>");
        e.checkStepIsPositive(v > 0, v);
        Companion uIntProgression$Companion0 = UIntProgression.Companion;
        int v1 = uIntProgression0.getFirst-pVg5ArA();
        int v2 = uIntProgression0.getLast-pVg5ArA();
        if(uIntProgression0.getStep() <= 0) {
            v = -v;
        }
        return uIntProgression$Companion0.fromClosedRange-Nkh28Cs(v1, v2, v);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression step(@NotNull ULongProgression uLongProgression0, long v) {
        Intrinsics.checkNotNullParameter(uLongProgression0, "<this>");
        e.checkStepIsPositive(v > 0L, v);
        long v1 = uLongProgression0.getFirst-s-VKNKU();
        long v2 = uLongProgression0.getLast-s-VKNKU();
        return uLongProgression0.getStep() <= 0L ? ULongProgression.Companion.fromClosedRange-7ftBX0g(v1, v2, -v) : ULongProgression.Companion.fromClosedRange-7ftBX0g(v1, v2, v);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntRange until-5PvTz6A(short v, short v1) {
        return Intrinsics.compare(v1 & 0xFFFF, 0) > 0 ? new UIntRange(v & 0xFFFF, (v1 & 0xFFFF) - 1, null) : UIntRange.Companion.getEMPTY();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntRange until-J1ME1BU(int v, int v1) {
        return Integer.compareUnsigned(v1, 0) > 0 ? new UIntRange(v, v1 - 1, null) : UIntRange.Companion.getEMPTY();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntRange until-Kr8caGY(byte b, byte b1) {
        return Intrinsics.compare(b1 & 0xFF, 0) > 0 ? new UIntRange(b & 0xFF, (b1 & 0xFF) - 1, null) : UIntRange.Companion.getEMPTY();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongRange until-eb3DHEI(long v, long v1) {
        return Long.compareUnsigned(v1, 0L) > 0 ? new ULongRange(v, v1 - 1L, null) : ULongRange.Companion.getEMPTY();
    }
}

