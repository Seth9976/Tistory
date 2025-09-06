package com.bumptech.glide.load.engine.cache;

import android.content.Context;

public final class ExternalPreferredCacheDiskCacheFactory extends DiskLruCacheFactory {
    public ExternalPreferredCacheDiskCacheFactory(Context context0) {
        this(context0, "image_manager_disk_cache", 0xFA00000L);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context0, long v) {
        this(context0, "image_manager_disk_cache", v);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context0, String s, long v) {
        super(new e(context0, s), v);
    }
}

