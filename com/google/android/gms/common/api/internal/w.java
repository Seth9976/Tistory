package com.google.android.gms.common.api.internal;

public final class w implements Runnable {
    public final x a;

    public w(x x0) {
        this.a = x0;
    }

    @Override
    public final void run() {
        String s = this.a.a.b.getClass().getName() + " disconnecting because it was signed out.";
        this.a.a.b.disconnect(s);
    }
}

