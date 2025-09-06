package kotlin.ranges;

import ce.g;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000E\b\u0017\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0011\u001A\u00020\f2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001D\u001A\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001A\u0010 \u001A\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001E\u0010\u001A\u001A\u0004\b\u001F\u0010\u001CR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001A\u001A\u0004\b\"\u0010\u001C\u0082\u0002\u0004\n\u0002\b!¨\u0006$"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "", "step", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getFirst-s-VKNKU", "()J", "first", "b", "getLast-s-VKNKU", "last", "c", "getStep", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class ULongProgression implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\n\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "Lkotlin/ULong;", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/ULongProgression;", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "fromClosedRange", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ULongProgression fromClosedRange-7ftBX0g(long v, long v1, long v2) {
            return new ULongProgression(v, v1, v2, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public final long b;
    public final long c;

    static {
        ULongProgression.Companion = new Companion(null);
    }

    public ULongProgression(long v, long v1, long v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if(v2 == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if(v2 == 0x8000000000000000L) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = v;
        this.b = UProgressionUtilKt.getProgressionLastElement-7ftBX0g(v, v1, v2);
        this.c = v2;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ULongProgression && (this.isEmpty() && ((ULongProgression)object0).isEmpty() || this.a == ((ULongProgression)object0).a && this.b == ((ULongProgression)object0).b && this.c == ((ULongProgression)object0).c);
    }

    public final long getFirst-s-VKNKU() {
        return this.a;
    }

    public final long getLast-s-VKNKU() {
        return this.b;
    }

    public final long getStep() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : (((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + ((int)(this.c >>> 0x20 ^ this.c));
    }

    public boolean isEmpty() {
        return Long.compare(this.c, 0L) <= 0 ? Long.compareUnsigned(this.a, this.b) < 0 : Long.compareUnsigned(this.a, this.b) > 0;
    }

    @Override
    @NotNull
    public final Iterator iterator() {
        return new g(this.a, this.b, this.c);
    }

    @Override
    @NotNull
    public String toString() {
        return Long.compare(this.c, 0L) <= 0 ? ULong.toString-impl(this.a) + " downTo " + ULong.toString-impl(this.b) + " step " + -this.c : ULong.toString-impl(this.a) + ".." + ULong.toString-impl(this.b) + " step " + this.c;
    }
}

