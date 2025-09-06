package kotlin.ranges;

import ce.f;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\r\b\u0017\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0011\u001A\u00020\f2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u001B\u001A\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u0014R\u001A\u0010\u001E\u001A\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001C\u0010\u0019\u001A\u0004\b\u001D\u0010\u0014R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u0019\u001A\u0004\b \u0010\u0014\u0082\u0002\u0004\n\u0002\b!¨\u0006\""}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "", "step", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getFirst-pVg5ArA", "first", "b", "getLast-pVg5ArA", "last", "c", "getStep", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class UIntProgression implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\n\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "Lkotlin/UInt;", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/UIntProgression;", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "fromClosedRange", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final UIntProgression fromClosedRange-Nkh28Cs(int v, int v1, int v2) {
            return new UIntProgression(v, v1, v2, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public final int c;

    static {
        UIntProgression.Companion = new Companion(null);
    }

    public UIntProgression(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        switch(v2) {
            case 0x80000000: {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            }
            case 0: {
                throw new IllegalArgumentException("Step must be non-zero.");
            }
            default: {
                this.a = v;
                this.b = UProgressionUtilKt.getProgressionLastElement-Nkh28Cs(v, v1, v2);
                this.c = v2;
            }
        }
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof UIntProgression && (this.isEmpty() && ((UIntProgression)object0).isEmpty() || this.a == ((UIntProgression)object0).a && this.b == ((UIntProgression)object0).b && this.c == ((UIntProgression)object0).c);
    }

    public final int getFirst-pVg5ArA() {
        return this.a;
    }

    public final int getLast-pVg5ArA() {
        return this.b;
    }

    public final int getStep() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : (this.a * 0x1F + this.b) * 0x1F + this.c;
    }

    public boolean isEmpty() {
        return this.c <= 0 ? Integer.compareUnsigned(this.a, this.b) < 0 : Integer.compareUnsigned(this.a, this.b) > 0;
    }

    @Override
    @NotNull
    public final Iterator iterator() {
        return new f(this.a, this.b, this.c);
    }

    @Override
    @NotNull
    public String toString() {
        return this.c <= 0 ? UInt.toString-impl(this.a) + " downTo " + UInt.toString-impl(this.b) + " step " + -this.c : UInt.toString-impl(this.a) + ".." + UInt.toString-impl(this.b) + " step " + this.c;
    }
}

