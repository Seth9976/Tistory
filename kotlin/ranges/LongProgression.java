package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.LongIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000E\b\u0016\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0010\u001A\u00020\u000B2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001C\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u001F\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0019\u001A\u0004\b\u001E\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001A\u0004\b!\u0010\u001B¨\u0006#"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "Lkotlin/collections/LongIterator;", "iterator", "()Lkotlin/collections/LongIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getFirst", "()J", "first", "b", "getLast", "last", "c", "getStep", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class LongProgression implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/LongProgression;", "fromClosedRange", "(JJJ)Lkotlin/ranges/LongProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final LongProgression fromClosedRange(long v, long v1, long v2) {
            return new LongProgression(v, v1, v2);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public final long b;
    public final long c;

    static {
        LongProgression.Companion = new Companion(null);
    }

    public LongProgression(long v, long v1, long v2) {
        if(v2 == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if(v2 == 0x8000000000000000L) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = v;
        this.b = ProgressionUtilKt.getProgressionLastElement(v, v1, v2);
        this.c = v2;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof LongProgression && (this.isEmpty() && ((LongProgression)object0).isEmpty() || this.a == ((LongProgression)object0).a && this.b == ((LongProgression)object0).b && this.c == ((LongProgression)object0).c);
    }

    public final long getFirst() {
        return this.a;
    }

    public final long getLast() {
        return this.b;
    }

    public final long getStep() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : ((int)(((this.a ^ this.a >>> 0x20) * 0x1FL + (this.b ^ this.b >>> 0x20)) * 0x1FL + (this.c ^ this.c >>> 0x20)));
    }

    public boolean isEmpty() {
        return Long.compare(this.c, 0L) <= 0 ? this.a < this.b : this.a > this.b;
    }

    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    @NotNull
    public LongIterator iterator() {
        return new LongProgressionIterator(this.a, this.b, this.c);
    }

    @Override
    @NotNull
    public String toString() {
        return Long.compare(this.c, 0L) <= 0 ? this.a + " downTo " + this.b + " step " + -this.c : this.a + ".." + this.b + " step " + this.c;
    }
}

