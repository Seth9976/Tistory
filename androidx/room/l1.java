package androidx.room;

import io.reactivex.functions.Action;

public final class l1 implements Action {
    public final k1 a;
    public final m1 b;

    public l1(m1 m10, k1 k10) {
        this.b = m10;
        this.a = k10;
    }

    @Override  // io.reactivex.functions.Action
    public final void run() {
        this.b.b.getInvalidationTracker().removeObserver(this.a);
    }
}

