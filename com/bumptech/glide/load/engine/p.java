package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.pool.FactoryPools.Factory;

public final class p implements Factory {
    public final q a;

    public p(q q0) {
        this.a = q0;
    }

    @Override  // com.bumptech.glide.util.pool.FactoryPools$Factory
    public final Object create() {
        return new n(this.a.a, this.a.b);
    }
}

