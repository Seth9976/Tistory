package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import mf.b;

public final class a implements ComparableTimeMark {
    public final double a;
    public final AbstractDoubleTimeSource b;
    public final long c;

    public a(double f, AbstractDoubleTimeSource abstractDoubleTimeSource0, long v) {
        Intrinsics.checkNotNullParameter(abstractDoubleTimeSource0, "timeSource");
        super();
        this.a = f;
        this.b = abstractDoubleTimeSource0;
        this.c = v;
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
        double f = this.b.read();
        DurationUnit durationUnit0 = this.b.getUnit();
        return Duration.minus-LRDsOJo(DurationKt.toDuration(f - this.a, durationUnit0), this.c);
    }

    // 去混淆评级： 中等(50)
    @Override  // kotlin.time.ComparableTimeMark
    public final boolean equals(Object object0) {
        return object0 instanceof a && Intrinsics.areEqual(this.b, ((a)object0).b) && Duration.equals-impl0(this.minus-UwyO8pc(((ComparableTimeMark)object0)), 0L);
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
        return Duration.hashCode-impl(Duration.plus-LRDsOJo(DurationKt.toDuration(this.a, this.b.getUnit()), this.c));
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
        if(comparableTimeMark0 instanceof a) {
            AbstractDoubleTimeSource abstractDoubleTimeSource0 = this.b;
            if(Intrinsics.areEqual(abstractDoubleTimeSource0, ((a)comparableTimeMark0).b)) {
                long v = this.c;
                if(Duration.equals-impl0(v, ((a)comparableTimeMark0).c) && Duration.isInfinite-impl(v)) {
                    return 0L;
                }
                long v1 = Duration.minus-LRDsOJo(v, ((a)comparableTimeMark0).c);
                long v2 = DurationKt.toDuration(this.a - ((a)comparableTimeMark0).a, abstractDoubleTimeSource0.getUnit());
                return Duration.equals-impl0(v2, Duration.unaryMinus-UwyO8pc(v1)) ? 0L : Duration.plus-LRDsOJo(v2, v1);
            }
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + comparableTimeMark0);
    }

    @Override  // kotlin.time.ComparableTimeMark
    public final ComparableTimeMark plus-LRDsOJo(long v) {
        long v1 = Duration.plus-LRDsOJo(this.c, v);
        return new a(this.a, this.b, v1);
    }

    @Override  // kotlin.time.TimeMark
    public final TimeMark plus-LRDsOJo(long v) {
        return this.plus-LRDsOJo(v);
    }

    @Override
    public final String toString() {
        return "DoubleTimeMark(" + this.a + b.shortName(this.b.getUnit()) + " + " + Duration.toString-impl(this.c) + ", " + this.b + ')';
    }
}

