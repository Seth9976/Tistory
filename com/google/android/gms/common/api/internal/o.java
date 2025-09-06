package com.google.android.gms.common.api.internal;

import android.os.Message;

public abstract class o implements Runnable {
    public final zaaw a;

    public o(zaaw zaaw0) {
        this.a = zaaw0;
    }

    public abstract void a();

    @Override
    public final void run() {
        zaaw zaaw0 = this.a;
        zaaw0.b.lock();
        try {
            if(!Thread.interrupted()) {
                this.a();
            }
        }
        catch(RuntimeException runtimeException0) {
            Message message0 = zaaw0.a.e.obtainMessage(2, runtimeException0);
            zaaw0.a.e.sendMessage(message0);
        }
        finally {
            zaaw0.b.unlock();
        }
    }
}

