package com.bumptech.glide.load.engine.cache;

import java.io.File;

public final class b implements CacheDirectoryGetter {
    public final String a;

    public b(String s) {
        this.a = s;
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$CacheDirectoryGetter
    public final File getCacheDirectory() {
        return new File(this.a);
    }
}

