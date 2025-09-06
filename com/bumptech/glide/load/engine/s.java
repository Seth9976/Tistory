package com.bumptech.glide.load.engine;

import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.util.pool.FactoryPools;

public final class s {
    public final GlideExecutor a;
    public final GlideExecutor b;
    public final GlideExecutor c;
    public final GlideExecutor d;
    public final Engine e;
    public final Engine f;
    public final Pool g;

    public s(GlideExecutor glideExecutor0, GlideExecutor glideExecutor1, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, Engine engine0, Engine engine1) {
        this.g = FactoryPools.threadSafe(150, new r(this));
        this.a = glideExecutor0;
        this.b = glideExecutor1;
        this.c = glideExecutor2;
        this.d = glideExecutor3;
        this.e = engine0;
        this.f = engine1;
    }
}

