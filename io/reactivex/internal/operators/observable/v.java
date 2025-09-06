package io.reactivex.internal.operators.observable;

import java.util.Collection;

public final class v implements Runnable {
    public final Collection a;
    public final w b;

    public v(w w0, Collection collection0) {
        this.b = w0;
        this.a = collection0;
    }

    @Override
    public final void run() {
        synchronized(this.b) {
            this.b.h.remove(this.a);
        }
        this.b.fastPathOrderedEmit(this.a, false, this.b.g);
    }
}

