package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0016\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0011\u001A\u00020\f2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001C\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u001F\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0019\u001A\u0004\b\u001E\u0010\u001BR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0014¨\u0006$"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "", "step", "<init>", "(CCI)V", "Lkotlin/collections/CharIterator;", "iterator", "()Lkotlin/collections/CharIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "C", "getFirst", "()C", "first", "b", "getLast", "last", "c", "I", "getStep", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class CharProgression implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\b\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/CharProgression;", "fromClosedRange", "(CCI)Lkotlin/ranges/CharProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final CharProgression fromClosedRange(char c, char c1, int v) {
            return new CharProgression(c, c1, v);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final char a;
    public final char b;
    public final int c;

    static {
        CharProgression.Companion = new Companion(null);
    }

    public CharProgression(char c, char c1, int v) {
        switch(v) {
            case 0x80000000: {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            }
            case 0: {
                throw new IllegalArgumentException("Step must be non-zero.");
            }
            default: {
                this.a = c;
                this.b = (char)ProgressionUtilKt.getProgressionLastElement(c, c1, v);
                this.c = v;
            }
        }
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof CharProgression && (this.isEmpty() && ((CharProgression)object0).isEmpty() || this.a == ((CharProgression)object0).a && this.b == ((CharProgression)object0).b && this.c == ((CharProgression)object0).c);
    }

    public final char getFirst() {
        return this.a;
    }

    public final char getLast() {
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
        return this.c <= 0 ? Intrinsics.compare(this.a, this.b) < 0 : Intrinsics.compare(this.a, this.b) > 0;
    }

    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    @NotNull
    public CharIterator iterator() {
        return new CharProgressionIterator(this.a, this.b, this.c);
    }

    @Override
    @NotNull
    public String toString() {
        return this.c <= 0 ? this.a + " downTo " + this.b + " step " + -this.c : this.a + ".." + this.b + " step " + this.c;
    }
}

