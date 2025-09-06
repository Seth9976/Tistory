package com.bumptech.glide.util.pool;

import java.util.ArrayList;

public final class b implements Factory {
    @Override  // com.bumptech.glide.util.pool.FactoryPools$Factory
    public final Object create() {
        return new ArrayList();
    }
}

