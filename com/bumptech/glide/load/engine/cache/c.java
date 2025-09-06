package com.bumptech.glide.load.engine.cache;

import java.io.File;

public final class c implements CacheDirectoryGetter {
    public final String a;
    public final String b;

    public c(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$CacheDirectoryGetter
    public final File getCacheDirectory() {
        return new File(this.a, this.b);
    }
}

