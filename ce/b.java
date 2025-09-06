package ce;

import kotlin.ranges.ClosedFloatingPointRange;

public final class b implements ClosedFloatingPointRange {
    public final float a;
    public final float b;

    public b(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // kotlin.ranges.ClosedFloatingPointRange
    public final boolean contains(Comparable comparable0) {
        float f = ((Number)comparable0).floatValue();
        return f >= this.a && f <= this.b;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b && (this.isEmpty() && ((b)object0).isEmpty() || this.a == ((b)object0).a && this.b == ((b)object0).b);
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
        return this.isEmpty() ? -1 : Float.hashCode(this.a) * 0x1F + Float.hashCode(this.b);
    }

    @Override  // kotlin.ranges.ClosedFloatingPointRange
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override  // kotlin.ranges.ClosedFloatingPointRange
    public final boolean lessThanOrEquals(Comparable comparable0, Comparable comparable1) {
        return ((Number)comparable0).floatValue() <= ((Number)comparable1).floatValue();
    }

    @Override
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

