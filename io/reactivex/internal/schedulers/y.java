package io.reactivex.internal.schedulers;

import io.reactivex.internal.functions.ObjectHelper;

public final class y implements Comparable {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean d;

    public y(Runnable runnable0, Long long0, int v) {
        this.a = runnable0;
        this.b = (long)long0;
        this.c = v;
    }

    @Override
    public final int compareTo(Object object0) {
        int v = ObjectHelper.compare(this.b, ((y)object0).b);
        return v == 0 ? ObjectHelper.compare(this.c, ((y)object0).c) : v;
    }
}

