package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

public abstract class DiskCacheStrategy {
    public static final DiskCacheStrategy ALL;
    public static final DiskCacheStrategy AUTOMATIC;
    public static final DiskCacheStrategy DATA;
    public static final DiskCacheStrategy NONE;
    public static final DiskCacheStrategy RESOURCE;

    static {
        DiskCacheStrategy.ALL = new o(0);
        DiskCacheStrategy.NONE = new o(1);
        DiskCacheStrategy.DATA = new o(2);
        DiskCacheStrategy.RESOURCE = new o(3);
        DiskCacheStrategy.AUTOMATIC = new o(4);
    }

    public abstract boolean decodeCachedData();

    public abstract boolean decodeCachedResource();

    public abstract boolean isDataCacheable(DataSource arg1);

    public abstract boolean isResourceCacheable(boolean arg1, DataSource arg2, EncodeStrategy arg3);
}

