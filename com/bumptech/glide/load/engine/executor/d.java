package com.bumptech.glide.load.engine.executor;

import android.util.Log;

public final class d implements UncaughtThrowableStrategy {
    @Override  // com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy
    public final void handle(Throwable throwable0) {
        if(throwable0 != null && Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", throwable0);
        }
    }
}

