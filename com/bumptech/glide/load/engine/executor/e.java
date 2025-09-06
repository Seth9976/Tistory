package com.bumptech.glide.load.engine.executor;

public final class e implements UncaughtThrowableStrategy {
    @Override  // com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy
    public final void handle(Throwable throwable0) {
        if(throwable0 != null) {
            throw new RuntimeException("Request threw uncaught throwable", throwable0);
        }
    }
}

