package ce;

import kotlin.ranges.ClosedFloatingPointRange;

public final class a implements ClosedFloatingPointRange {
    public final double a;
    public final double b;

    public a(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // kotlin.ranges.ClosedFloatingPointRange
    public final boolean contains(Comparable comparable0) {
        double f = ((Number)comparable0).doubleValue();
        return f >= this.a && f <= this.b;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && (this.isEmpty() && ((a)object0).isEmpty() || this.a == ((a)object0).a && this.b == ((a)object0).b);
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
        return this.isEmpty() ? -1 : Double.hashCode(this.a) * 0x1F + Double.hashCode(this.b);
    }

    @Override  // kotlin.ranges.ClosedFloatingPointRange
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override  // kotlin.ranges.ClosedFloatingPointRange
    public final boolean lessThanOrEquals(Comparable comparable0, Comparable comparable1) {
        return ((Number)comparable0).doubleValue() <= ((Number)comparable1).doubleValue();
    }

    @Override
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

