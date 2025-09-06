package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;

public final class t implements DecodeJob.DiskCacheProvider {
    public final Factory a;
    public volatile DiskCache b;

    public t(Factory diskCache$Factory0) {
        this.a = diskCache$Factory0;
    }

    @Override  // com.bumptech.glide.load.engine.DecodeJob$DiskCacheProvider
    public final DiskCache getDiskCache() {
        if(this.b == null) {
            synchronized(this) {
                if(this.b == null) {
                    this.b = this.a.build();
                }
                if(this.b == null) {
                    this.b = new DiskCacheAdapter();
                }
            }
        }
        return this.b;
    }
}

