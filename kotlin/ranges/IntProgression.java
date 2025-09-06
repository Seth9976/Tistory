package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\r\b\u0016\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0010\u001A\u00020\u000B2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001A\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001D\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0018\u001A\u0004\b\u001C\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u0018\u001A\u0004\b\u001F\u0010\u0013¨\u0006!"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "Lkotlin/collections/IntIterator;", "iterator", "()Lkotlin/collections/IntIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getFirst", "first", "b", "getLast", "last", "c", "getStep", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class IntProgression implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/IntProgression;", "fromClosedRange", "(III)Lkotlin/ranges/IntProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final IntProgression fromClosedRange(int v, int v1, int v2) {
            return new IntProgression(v, v1, v2);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public final int c;

    static {
        IntProgression.Companion = new Companion(null);
    }

    public IntProgression(int v, int v1, int v2) {
        switch(v2) {
            case 0x80000000: {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            }
            case 0: {
                throw new IllegalArgumentException("Step must be non-zero.");
            }
            default: {
                this.a = v;
                this.b = ProgressionUtilKt.getProgressionLastElement(v, v1, v2);
                this.c = v2;
            }
        }
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof IntProgression && (this.isEmpty() && ((IntProgression)object0).isEmpty() || this.a == ((IntProgression)object0).a && this.b == ((IntProgression)object0).b && this.c == ((IntProgression)object0).c);
    }

    public final int getFirst() {
        return this.a;
    }

    public final int getLast() {
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
        return this.c <= 0 ? this.a < this.b : this.a > this.b;
    }

    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    @NotNull
    public IntIterator iterator() {
        return new IntProgressionIterator(this.a, this.b, this.c);
    }

    @Override
    @NotNull
    public String toString() {
        return this.c <= 0 ? this.a + " downTo " + this.b + " step " + -this.c : this.a + ".." + this.b + " step " + this.c;
    }
}

