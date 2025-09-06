package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode;

public final class a implements Runnable {
    public final Runnable a;
    public final b b;

    public a(b b0, Runnable runnable0) {
        this.b = b0;
        this.a = runnable0;
    }

    @Override
    public final void run() {
        b b0 = this.b;
        if(b0.d) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.a.run();
        }
        catch(Throwable throwable0) {
            b0.c.handle(throwable0);
        }
    }
}

