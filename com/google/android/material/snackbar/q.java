package com.google.android.material.snackbar;

import android.os.Handler.Callback;
import android.os.Message;

public final class q implements Handler.Callback {
    public final s a;

    public q(s s0) {
        this.a = s0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        if(message0.what != 0) {
            return false;
        }
        s s0 = this.a;
        r r0 = (r)message0.obj;
        synchronized(s0.a) {
            if(s0.c == r0 || s0.d == r0) {
                s0.a(r0, 2);
            }
            return true;
        }
    }
}

