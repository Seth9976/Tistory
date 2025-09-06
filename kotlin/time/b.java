package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import zd.c;

public final class b implements ComparableTimeMark {
    public final long a;
    public final AbstractLongTimeSource b;
    public final long c;

    public b(long v, AbstractLongTimeSource abstractLongTimeSource0, long v1) {
        Intrinsics.checkNotNullParameter(abstractLongTimeSource0, "timeSource");
        super();
        this.a = v;
        this.b = abstractLongTimeSource0;
        this.c = v1;
    }

    @Override
    public final int compareTo(Object object0) {
        return DefaultImpls.compareTo(this, ((ComparableTimeMark)object0));
    }

    @Override  // kotlin.time.ComparableTimeMark
    public final int compareTo(ComparableTimeMark comparableTimeMark0) {
        return DefaultImpls.compareTo(this, comparableTimeMark0);
    }

    @Override  // kotlin.time.TimeMark
    public final long elapsedNow-UwyO8pc() {
        return Duration.minus-LRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(AbstractLongTimeSource.access$adjustedRead(this.b), this.a, this.b.getUnit()), this.c);
    }

    // 去混淆评级： 中等(50)
    @Override  // kotlin.time.ComparableTimeMark
    public final boolean equals(Object object0) {
        return object0 instanceof b && Intrinsics.areEqual(this.b, ((b)object0).b) && Duration.equals-impl0(this.minus-UwyO8pc(((ComparableTimeMark)object0)), 0L);
    }

    @Override  // kotlin.time.TimeMark
    public final boolean hasNotPassedNow() {
        return DefaultImpls.hasNotPassedNow(this);
    }

    @Override  // kotlin.time.TimeMark
    public final boolean hasPassedNow() {
        return DefaultImpls.hasPassedNow(this);
    }

    @Override  // kotlin.time.ComparableTimeMark
    public final int hashCode() {
        return Long.hashCode(this.a) + Duration.hashCode-impl(this.c) * 37;
    }

    @Override  // kotlin.time.ComparableTimeMark
    public final ComparableTimeMark minus-LRDsOJo(long v) {
        return DefaultImpls.minus-LRDsOJo(this, v);
    }

    @Override  // kotlin.time.TimeMark
    public final TimeMark minus-LRDsOJo(long v) {
        return DefaultImpls.minus-LRDsOJo(this, v);
    }

    @Override  // kotlin.time.ComparableTimeMark
    public final long minus-UwyO8pc(ComparableTimeMark comparableTimeMark0) {
        Intrinsics.checkNotNullParameter(comparableTimeMark0, "other");
        if(comparableTimeMark0 instanceof b) {
            AbstractLongTimeSource abstractLongTimeSource0 = this.b;
            if(Intrinsics.areEqual(abstractLongTimeSource0, ((b)comparableTimeMark0).b)) {
                return Duration.plus-LRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.a, ((b)comparableTimeMark0).a, abstractLongTimeSource0.getUnit()), Duration.minus-LRDsOJo(this.c, ((b)comparableTimeMark0).c));
            }
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + comparableTimeMark0);
    }

    @Override  // kotlin.time.ComparableTimeMark
    public final ComparableTimeMark plus-LRDsOJo(long v) {
        DurationUnit durationUnit0 = this.b.getUnit();
        long v1 = this.a;
        if(Duration.isInfinite-impl(v)) {
            return new b(LongSaturatedMathKt.saturatingAdd-NuflL3o(v1, durationUnit0, v), this.b, 0L);
        }
        long v2 = Duration.truncateTo-UwyO8pc$kotlin_stdlib(v, durationUnit0);
        long v3 = Duration.plus-LRDsOJo(Duration.minus-LRDsOJo(v, v2), this.c);
        long v4 = LongSaturatedMathKt.saturatingAdd-NuflL3o(v1, durationUnit0, v2);
        long v5 = Duration.truncateTo-UwyO8pc$kotlin_stdlib(v3, durationUnit0);
        long v6 = LongSaturatedMathKt.saturatingAdd-NuflL3o(v4, durationUnit0, v5);
        long v7 = Duration.minus-LRDsOJo(v3, v5);
        long v8 = Duration.getInWholeNanoseconds-impl(v7);
        if(v6 != 0L && v8 != 0L && (v6 ^ v8) < 0L) {
            long v9 = DurationKt.toDuration(c.getSign(v8), durationUnit0);
            v6 = LongSaturatedMathKt.saturatingAdd-NuflL3o(v6, durationUnit0, v9);
            v7 = Duration.minus-LRDsOJo(v7, v9);
        }
        if((1L | v6 - 1L) == 0x7FFFFFFFFFFFFFFFL) {
            v7 = 0L;
        }
        return new b(v6, this.b, v7);
    }

    @Override  // kotlin.time.TimeMark
    public final TimeMark plus-LRDsOJo(long v) {
        return this.plus-LRDsOJo(v);
    }

    @Override
    public final String toString() {
        return "LongTimeMark(" + this.a + mf.b.shortName(this.b.getUnit()) + " + " + Duration.toString-impl(this.c) + ", " + this.b + ')';
    }
}

