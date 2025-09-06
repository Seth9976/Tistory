package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;

public final class d implements Pool {
    public final Factory a;
    public final Resetter b;
    public final SimplePool c;

    public d(SimplePool pools$SimplePool0, Factory factoryPools$Factory0, Resetter factoryPools$Resetter0) {
        this.c = pools$SimplePool0;
        this.a = factoryPools$Factory0;
        this.b = factoryPools$Resetter0;
    }

    @Override  // androidx.core.util.Pools$Pool
    public final Object acquire() {
        Object object0 = this.c.acquire();
        if(object0 == null) {
            object0 = this.a.create();
            if(Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + object0.getClass());
            }
        }
        if(object0 instanceof Poolable) {
            ((Poolable)object0).getVerifier().a(false);
        }
        return object0;
    }

    @Override  // androidx.core.util.Pools$Pool
    public final boolean release(Object object0) {
        if(object0 instanceof Poolable) {
            ((Poolable)object0).getVerifier().a(true);
        }
        this.b.reset(object0);
        return this.c.release(object0);
    }
}

