package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001F\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u001F\u0010\u0007\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\b2\u0006\u0010\u0004\u001A\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001A\u0019\u0010\u000B\u001A\u00020\f*\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0007¢\u0006\u0002\u0010\u0010\u001A\u001B\u0010\u000B\u001A\u00020\f*\u00020\r2\u0006\u0010\u0011\u001A\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001A/\u0010\u000B\u001A\u00020\f*\u00020\r2\u0006\u0010\u0011\u001A\u00020\f2\b\b\u0002\u0010\u0014\u001A\u00020\u000F2\b\b\u0002\u0010\u0015\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001A\u0011\u0010\u0018\u001A\u00020\u0003*\u00020\rH\u0007¢\u0006\u0002\u0010\u0019\u001A\u001B\u0010\u0018\u001A\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u001A\u0010\u001B\u001A#\u0010\u0018\u001A\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u001C\u0010\u001D\u001A\u0019\u0010\u0018\u001A\u00020\u0003*\u00020\r2\u0006\u0010\u001E\u001A\u00020\u001FH\u0007¢\u0006\u0002\u0010 \u001A\u0011\u0010!\u001A\u00020\b*\u00020\rH\u0007¢\u0006\u0002\u0010\"\u001A\u001B\u0010!\u001A\u00020\b*\u00020\r2\u0006\u0010\u0004\u001A\u00020\bH\u0007¢\u0006\u0004\b#\u0010$\u001A#\u0010!\u001A\u00020\b*\u00020\r2\u0006\u0010\u0002\u001A\u00020\b2\u0006\u0010\u0004\u001A\u00020\bH\u0007¢\u0006\u0004\b%\u0010&\u001A\u0019\u0010!\u001A\u00020\b*\u00020\r2\u0006\u0010\u001E\u001A\u00020\'H\u0007¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class URandomKt {
    public static final void checkUIntRangeBounds-J1ME1BU(int v, int v1) {
        if(Integer.compareUnsigned(v1, v) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.box-impl(v), UInt.box-impl(v1)).toString());
        }
    }

    public static final void checkULongRangeBounds-eb3DHEI(long v, long v1) {
        if(Long.compareUnsigned(v1, v) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.box-impl(v), ULong.box-impl(v1)).toString());
        }
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] nextUBytes(@NotNull Random random0, int v) {
        Intrinsics.checkNotNullParameter(random0, "<this>");
        return UByteArray.constructor-impl(random0.nextBytes(v));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] nextUBytes-EVgfTAA(@NotNull Random random0, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(random0, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(arr_b, "array");
        random0.nextBytes(arr_b);
        return arr_b;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] nextUBytes-Wvrt4B4(@NotNull Random random0, @NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(random0, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(arr_b, "array");
        random0.nextBytes(arr_b, v, v1);
        return arr_b;
    }

    public static byte[] nextUBytes-Wvrt4B4$default(Random random0, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = UByteArray.getSize-impl(arr_b);
        }
        return URandomKt.nextUBytes-Wvrt4B4(random0, arr_b, v, v1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random0) {
        Intrinsics.checkNotNullParameter(random0, "<this>");
        return UInt.constructor-impl(random0.nextInt());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random0, @NotNull UIntRange uIntRange0) {
        Intrinsics.checkNotNullParameter(random0, "<this>");
        Intrinsics.checkNotNullParameter(uIntRange0, "range");
        if(uIntRange0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + uIntRange0);
        }
        if(Integer.compareUnsigned(uIntRange0.getLast-pVg5ArA(), -1) < 0) {
            return URandomKt.nextUInt-a8DCA5k(random0, uIntRange0.getFirst-pVg5ArA(), uIntRange0.getLast-pVg5ArA() + 1);
        }
        return Integer.compareUnsigned(uIntRange0.getFirst-pVg5ArA(), 0) <= 0 ? URandomKt.nextUInt(random0) : UInt.constructor-impl(URandomKt.nextUInt-a8DCA5k(random0, uIntRange0.getFirst-pVg5ArA() - 1, uIntRange0.getLast-pVg5ArA()) + 1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt-a8DCA5k(@NotNull Random random0, int v, int v1) {
        Intrinsics.checkNotNullParameter(random0, "$this$nextUInt");
        URandomKt.checkUIntRangeBounds-J1ME1BU(v, v1);
        return UInt.constructor-impl(random0.nextInt(v ^ 0x80000000, v1 ^ 0x80000000) ^ 0x80000000);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt-qCasIEU(@NotNull Random random0, int v) {
        Intrinsics.checkNotNullParameter(random0, "$this$nextUInt");
        return URandomKt.nextUInt-a8DCA5k(random0, 0, v);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random0) {
        Intrinsics.checkNotNullParameter(random0, "<this>");
        return ULong.constructor-impl(random0.nextLong());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random0, @NotNull ULongRange uLongRange0) {
        Intrinsics.checkNotNullParameter(random0, "<this>");
        Intrinsics.checkNotNullParameter(uLongRange0, "range");
        if(uLongRange0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + uLongRange0);
        }
        if(Long.compareUnsigned(uLongRange0.getLast-s-VKNKU(), -1L) < 0) {
            return URandomKt.nextULong-jmpaW-c(random0, uLongRange0.getFirst-s-VKNKU(), uLongRange0.getLast-s-VKNKU() + 1L);
        }
        return Long.compareUnsigned(uLongRange0.getFirst-s-VKNKU(), 0L) <= 0 ? URandomKt.nextULong(random0) : ULong.constructor-impl(URandomKt.nextULong-jmpaW-c(random0, uLongRange0.getFirst-s-VKNKU() - 1L, uLongRange0.getLast-s-VKNKU()) + 1L);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong-V1Xi4fY(@NotNull Random random0, long v) {
        Intrinsics.checkNotNullParameter(random0, "$this$nextULong");
        return URandomKt.nextULong-jmpaW-c(random0, 0L, v);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong-jmpaW-c(@NotNull Random random0, long v, long v1) {
        Intrinsics.checkNotNullParameter(random0, "$this$nextULong");
        URandomKt.checkULongRangeBounds-eb3DHEI(v, v1);
        return ULong.constructor-impl(random0.nextLong(v ^ 0x8000000000000000L, v1 ^ 0x8000000000000000L) ^ 0x8000000000000000L);
    }
}

