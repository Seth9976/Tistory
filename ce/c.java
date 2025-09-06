package ce;

import kotlin.ranges.OpenEndRange;

public final class c implements OpenEndRange {
    public final double a;
    public final double b;

    public c(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // kotlin.ranges.OpenEndRange
    public final boolean contains(Comparable comparable0) {
        double f = ((Number)comparable0).doubleValue();
        return f >= this.a && f < this.b;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof c && (this.isEmpty() && ((c)object0).isEmpty() || this.a == ((c)object0).a && this.b == ((c)object0).b);
    }

    @Override  // kotlin.ranges.OpenEndRange
    public final Comparable getEndExclusive() {
        return this.b;
    }

    @Override  // kotlin.ranges.OpenEndRange
    public final Comparable getStart() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public final int hashCode() {
        return this.isEmpty() ? -1 : Double.hashCode(this.a) * 0x1F + Double.hashCode(this.b);
    }

    @Override  // kotlin.ranges.OpenEndRange
    public final boolean isEmpty() {
        return this.a >= this.b;
    }

    @Override
    public final String toString() {
        return this.a + "..<" + this.b;
    }
}

