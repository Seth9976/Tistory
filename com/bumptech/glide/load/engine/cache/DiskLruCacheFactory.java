package com.bumptech.glide.load.engine.cache;

import java.io.File;

public class DiskLruCacheFactory implements Factory {
    public interface CacheDirectoryGetter {
        File getCacheDirectory();
    }

    public final long a;
    public final CacheDirectoryGetter b;

    public DiskLruCacheFactory(CacheDirectoryGetter diskLruCacheFactory$CacheDirectoryGetter0, long v) {
        this.a = v;
        this.b = diskLruCacheFactory$CacheDirectoryGetter0;
    }

    public DiskLruCacheFactory(String s, long v) {
        this(new b(s), v);
    }

    public DiskLruCacheFactory(String s, String s1, long v) {
        this(new c(s, s1), v);
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskCache$Factory
    public DiskCache build() {
        File file0 = this.b.getCacheDirectory();
        if(file0 == null) {
            return null;
        }
        return file0.isDirectory() || file0.mkdirs() ? DiskLruCacheWrapper.create(file0, this.a) : null;
    }
}

