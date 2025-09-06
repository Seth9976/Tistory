package com.bumptech.glide.util.pool;

import java.util.List;

public final class c implements Resetter {
    @Override  // com.bumptech.glide.util.pool.FactoryPools$Resetter
    public final void reset(Object object0) {
        ((List)object0).clear();
    }
}

