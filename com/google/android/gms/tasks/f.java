package com.google.android.gms.tasks;

public final class f implements Runnable {
    public final g a;

    public f(g g0) {
        this.a = g0;
    }

    @Override
    public final void run() {
        synchronized(this.a.c) {
            OnCanceledListener onCanceledListener0 = (OnCanceledListener)this.a.d;
            if(onCanceledListener0 != null) {
                onCanceledListener0.onCanceled();
            }
        }
    }
}

