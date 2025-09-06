package com.bumptech.glide.load.engine;

import androidx.core.util.Pools.Pool;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

public final class c0 implements Resource, Poolable {
    public final StateVerifier a;
    public Resource b;
    public boolean c;
    public boolean d;
    public static final Pool e;

    static {
        c0.e = FactoryPools.threadSafe(20, new b0());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public c0() {
        this.a = StateVerifier.newInstance();
    }

    public final void a() {
        synchronized(this) {
            this.a.throwIfRecycled();
            if(this.c) {
                this.c = false;
                if(this.d) {
                    this.recycle();
                }
                return;
            }
        }
        throw new IllegalStateException("Already unlocked");
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.b.get();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        return this.b.getResourceClass();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.b.getSize();
    }

    @Override  // com.bumptech.glide.util.pool.FactoryPools$Poolable
    public final StateVerifier getVerifier() {
        return this.a;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        synchronized(this) {
            this.a.throwIfRecycled();
            this.d = true;
            if(!this.c) {
                this.b.recycle();
                this.b = null;
                c0.e.release(this);
            }
        }
    }
}

