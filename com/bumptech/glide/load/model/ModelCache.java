package com.bumptech.glide.load.model;

import androidx.annotation.Nullable;

public class ModelCache {
    public final q a;

    public ModelCache() {
        this(0xFAL);
    }

    public ModelCache(long v) {
        this.a = new q(v);  // 初始化器: Lcom/bumptech/glide/util/LruCache;-><init>(J)V
    }

    public void clear() {
        this.a.clearMemory();
    }

    @Nullable
    public Object get(Object object0, int v, int v1) {
        r r0 = r.a(v, v1, object0);
        Object object1 = this.a.get(r0);
        synchronized(r.d) {
            r.d.offer(r0);
            return object1;
        }
    }

    public void put(Object object0, int v, int v1, Object object1) {
        r r0 = r.a(v, v1, object0);
        this.a.put(r0, object1);
    }
}

