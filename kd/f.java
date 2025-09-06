package kd;

import io.reactivex.internal.functions.ObjectHelper;

public final class f implements Comparable {
    public final long a;
    public final Runnable b;
    public final e c;
    public final long d;

    public f(e e0, long v, Runnable runnable0, long v1) {
        this.a = v;
        this.b = runnable0;
        this.c = e0;
        this.d = v1;
    }

    @Override
    public final int compareTo(Object object0) {
        long v = ((f)object0).a;
        return this.a == v ? ObjectHelper.compare(this.d, ((f)object0).d) : ObjectHelper.compare(this.a, v);
    }

    @Override
    public final String toString() {
        return String.format("TimedRunnable(time = %d, run = %s)", this.a, this.b.toString());
    }
}

