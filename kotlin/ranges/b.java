package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

public final class b implements ClosedRange {
    public final Comparable a;
    public final Comparable b;

    public b(Comparable comparable0, Comparable comparable1) {
        Intrinsics.checkNotNullParameter(comparable0, "start");
        Intrinsics.checkNotNullParameter(comparable1, "endInclusive");
        super();
        this.a = comparable0;
        this.b = comparable1;
    }

    @Override  // kotlin.ranges.ClosedRange
    public final boolean contains(Comparable comparable0) {
        return DefaultImpls.contains(this, comparable0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof b) {
            if(DefaultImpls.isEmpty(this)) {
                ((b)object0).getClass();
                return DefaultImpls.isEmpty(((b)object0)) ? true : Intrinsics.areEqual(this.a, ((b)object0).a) && Intrinsics.areEqual(this.b, ((b)object0).b);
            }
            return Intrinsics.areEqual(this.a, ((b)object0).a) && Intrinsics.areEqual(this.b, ((b)object0).b);
        }
        return false;
    }

    @Override  // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return this.b;
    }

    @Override  // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public final int hashCode() {
        return DefaultImpls.isEmpty(this) ? -1 : this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override  // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return DefaultImpls.isEmpty(this);
    }

    @Override
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

