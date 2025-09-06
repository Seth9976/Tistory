package androidx.room;

import io.reactivex.functions.Action;

public final class h1 implements Action {
    public final g1 a;
    public final i1 b;

    public h1(i1 i10, g1 g10) {
        this.b = i10;
        this.a = g10;
    }

    @Override  // io.reactivex.functions.Action
    public final void run() {
        this.b.b.getInvalidationTracker().removeObserver(this.a);
    }
}

