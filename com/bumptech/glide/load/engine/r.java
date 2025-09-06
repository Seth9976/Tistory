package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.pool.FactoryPools.Factory;

public final class r implements Factory {
    public final s a;

    public r(s s0) {
        this.a = s0;
    }

    @Override  // com.bumptech.glide.util.pool.FactoryPools$Factory
    public final Object create() {
        return new x(this.a.a, this.a.b, this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
    }
}

