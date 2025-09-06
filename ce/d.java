package ce;

import kotlin.ranges.OpenEndRange;

public final class d implements OpenEndRange {
    public final float a;
    public final float b;

    public d(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // kotlin.ranges.OpenEndRange
    public final boolean contains(Comparable comparable0) {
        float f = ((Number)comparable0).floatValue();
        return f >= this.a && f < this.b;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof d && (this.isEmpty() && ((d)object0).isEmpty() || this.a == ((d)object0).a && this.b == ((d)object0).b);
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
        return this.isEmpty() ? -1 : Float.hashCode(this.a) * 0x1F + Float.hashCode(this.b);
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

