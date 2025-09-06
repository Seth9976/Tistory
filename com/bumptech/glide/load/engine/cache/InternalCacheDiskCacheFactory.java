package com.bumptech.glide.load.engine.cache;

import android.content.Context;

public final class InternalCacheDiskCacheFactory extends DiskLruCacheFactory {
    public InternalCacheDiskCacheFactory(Context context0) {
        this(context0, "image_manager_disk_cache", 0xFA00000L);
    }

    public InternalCacheDiskCacheFactory(Context context0, long v) {
        this(context0, "image_manager_disk_cache", v);
    }

    public InternalCacheDiskCacheFactory(Context context0, String s, long v) {
        super(new f(context0, s), v);
    }
}

