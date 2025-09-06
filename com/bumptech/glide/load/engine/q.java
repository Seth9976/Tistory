package com.bumptech.glide.load.engine;

import androidx.core.util.Pools.Pool;
import com.bumptech.glide.util.pool.FactoryPools;

public final class q {
    public final t a;
    public final Pool b;
    public int c;

    public q(t t0) {
        this.b = FactoryPools.threadSafe(150, new p(this));
        this.a = t0;
    }
}

