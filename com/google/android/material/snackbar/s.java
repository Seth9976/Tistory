package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class s {
    public final Object a;
    public final Handler b;
    public r c;
    public r d;
    public static s e;

    public s() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), new q(this));
    }

    public final boolean a(r r0, int v) {
        SnackbarManager.Callback snackbarManager$Callback0 = (SnackbarManager.Callback)r0.a.get();
        if(snackbarManager$Callback0 != null) {
            this.b.removeCallbacksAndMessages(r0);
            snackbarManager$Callback0.dismiss(v);
            return true;
        }
        return false;
    }

    public static s b() {
        if(s.e == null) {
            s.e = new s();
        }
        return s.e;
    }

    public final boolean c(SnackbarManager.Callback snackbarManager$Callback0) {
        return this.c != null && snackbarManager$Callback0 != null && this.c.a.get() == snackbarManager$Callback0;
    }

    public final void d(j j0) {
        synchronized(this.a) {
            if(this.c(j0)) {
                r r0 = this.c;
                if(!r0.c) {
                    r0.c = true;
                    this.b.removeCallbacksAndMessages(r0);
                }
            }
        }
    }

    public final void e(j j0) {
        synchronized(this.a) {
            if(this.c(j0)) {
                r r0 = this.c;
                if(r0.c) {
                    r0.c = false;
                    this.f(r0);
                }
            }
        }
    }

    public final void f(r r0) {
        int v = r0.b;
        if(v == -2) {
            return;
        }
        if(v <= 0) {
            v = v == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(r0);
        Message message0 = Message.obtain(this.b, 0, r0);
        this.b.sendMessageDelayed(message0, ((long)v));
    }
}

