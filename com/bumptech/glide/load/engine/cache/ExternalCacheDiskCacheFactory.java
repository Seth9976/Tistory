package com.bumptech.glide.load.engine.cache;

import android.content.Context;

@Deprecated
public final class ExternalCacheDiskCacheFactory extends DiskLruCacheFactory {
    public ExternalCacheDiskCacheFactory(Context context0) {
        this(context0, "image_manager_disk_cache", 0xFA00000);
    }

    public ExternalCacheDiskCacheFactory(Context context0, int v) {
        this(context0, "image_manager_disk_cache", v);
    }

    public ExternalCacheDiskCacheFactory(Context context0, String s, int v) {
        super(new d(context0, s), ((long)v));
    }
}

