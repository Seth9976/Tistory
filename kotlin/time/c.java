package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

public final class c implements TimeMark {
    public final TimeMark a;
    public final long b;

    public c(TimeMark timeMark0, long v) {
        Intrinsics.checkNotNullParameter(timeMark0, "mark");
        super();
        this.a = timeMark0;
        this.b = v;
    }

    @Override  // kotlin.time.TimeMark
    public final long elapsedNow-UwyO8pc() {
        return Duration.minus-LRDsOJo(this.a.elapsedNow-UwyO8pc(), this.b);
    }

    @Override  // kotlin.time.TimeMark
    public final boolean hasNotPassedNow() {
        return DefaultImpls.hasNotPassedNow(this);
    }

    @Override  // kotlin.time.TimeMark
    public final boolean hasPassedNow() {
        return DefaultImpls.hasPassedNow(this);
    }

    @Override  // kotlin.time.TimeMark
    public final TimeMark minus-LRDsOJo(long v) {
        return DefaultImpls.minus-LRDsOJo(this, v);
    }

    @Override  // kotlin.time.TimeMark
    public final TimeMark plus-LRDsOJo(long v) {
        long v1 = Duration.plus-LRDsOJo(this.b, v);
        return new c(this.a, v1);
    }
}

