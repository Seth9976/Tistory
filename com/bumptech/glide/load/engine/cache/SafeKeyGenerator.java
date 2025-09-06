package com.bumptech.glide.load.engine.cache;

import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;

public class SafeKeyGenerator {
    public final LruCache a;
    public final Pool b;

    public SafeKeyGenerator() {
        this.a = new LruCache(1000L);
        this.b = FactoryPools.threadSafe(10, new h());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public String getSafeKey(Key key0) {
        String s1;
        String s;
        synchronized(this.a) {
            s = (String)this.a.get(key0);
        }
        if(s == null) {
            i i0 = (i)Preconditions.checkNotNull(this.b.acquire());
            try {
                key0.updateDiskCacheKey(i0.a);
                s1 = Util.sha256BytesToHex(i0.a.digest());
            }
            finally {
                this.b.release(i0);
            }
            s = s1;
        }
        synchronized(this.a) {
            this.a.put(key0, s);
            return s;
        }
    }
}

