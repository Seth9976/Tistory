package com.google.android.material.snackbar;

public final class k implements Runnable {
    public final BaseTransientBottomBar a;

    public k(BaseTransientBottomBar baseTransientBottomBar0) {
        this.a = baseTransientBottomBar0;
    }

    @Override
    public final void run() {
        this.a.a(3);
    }
}

