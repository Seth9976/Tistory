package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001C2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001CB\u0015\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001A\u00020\u00102\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001A\u00020\u0018H\u0016J\b\u0010\u0019\u001A\u00020\u0010H\u0016J\b\u0010\u001A\u001A\u00020\u001BH\u0016R\u001D\u0010\b\u001A\u00020\u00038VX\u0097\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001A\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001A\u0004\b\u000E\u0010\f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001D"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "endExclusive", "getEndExclusive-s-VKNKU$annotations", "()V", "getEndExclusive-s-VKNKU", "()J", "getEndInclusive-s-VKNKU", "getStart-s-VKNKU", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class ULongRange extends ULongProgression implements ClosedRange, OpenEndRange {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "Lkotlin/ranges/ULongRange;", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ULongRange getEMPTY() {
            return ULongRange.d;
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final ULongRange d;

    static {
        ULongRange.Companion = new Companion(null);
        ULongRange.d = new ULongRange(-1L, 0L, null);
    }

    public ULongRange(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        super(v, v1, 1L, null);
    }

    @Override  // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public boolean contains(Comparable comparable0) {
        return this.contains-VKZWuLQ(((ULong)comparable0).unbox-impl());
    }

    public boolean contains-VKZWuLQ(long v) {
        return Long.compareUnsigned(this.getFirst-s-VKNKU(), v) <= 0 && Long.compareUnsigned(v, this.getLast-s-VKNKU()) <= 0;
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.ranges.ULongProgression
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ULongRange && (this.isEmpty() && ((ULongRange)object0).isEmpty() || this.getFirst-s-VKNKU() == ((ULongRange)object0).getFirst-s-VKNKU() && this.getLast-s-VKNKU() == ((ULongRange)object0).getLast-s-VKNKU());
    }

    @Override  // kotlin.ranges.OpenEndRange
    public Comparable getEndExclusive() {
        return ULong.box-impl(this.getEndExclusive-s-VKNKU());
    }

    public long getEndExclusive-s-VKNKU() {
        if(this.getLast-s-VKNKU() == -1L) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        }
        return this.getLast-s-VKNKU() + 1L;
    }

    @Deprecated(message = "Can throw an exception when it\'s impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It\'s recommended to use \'endInclusive\' property that doesn\'t throw.")
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static void getEndExclusive-s-VKNKU$annotations() {
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getEndInclusive() {
        return ULong.box-impl(this.getEndInclusive-s-VKNKU());
    }

    public long getEndInclusive-s-VKNKU() {
        return this.getLast-s-VKNKU();
    }

    @Override  // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public Comparable getStart() {
        return ULong.box-impl(this.getStart-s-VKNKU());
    }

    public long getStart-s-VKNKU() {
        return this.getFirst-s-VKNKU();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.ranges.ULongProgression
    public int hashCode() {
        return this.isEmpty() ? -1 : ((int)(this.getFirst-s-VKNKU() ^ this.getFirst-s-VKNKU() >>> 0x20)) * 0x1F + ((int)(this.getLast-s-VKNKU() ^ this.getLast-s-VKNKU() >>> 0x20));
    }

    @Override  // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return Long.compareUnsigned(this.getFirst-s-VKNKU(), this.getLast-s-VKNKU()) > 0;
    }

    @Override  // kotlin.ranges.ULongProgression
    @NotNull
    public String toString() {
        return ULong.toString-impl(this.getFirst-s-VKNKU()) + ".." + ULong.toString-impl(this.getLast-s-VKNKU());
    }
}

