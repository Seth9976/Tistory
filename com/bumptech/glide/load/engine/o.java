package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

public final class o extends DiskCacheStrategy {
    public final int a;

    public o(int v) {
        this.a = v;
        super();
    }

    @Override  // com.bumptech.glide.load.engine.DiskCacheStrategy
    public final boolean decodeCachedData() {
        switch(this.a) {
            case 0: {
                return true;
            }
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
            case 3: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.DiskCacheStrategy
    public final boolean decodeCachedResource() {
        switch(this.a) {
            case 0: {
                return true;
            }
            case 1: {
                return false;
            }
            case 2: {
                return false;
            }
            case 3: {
                return true;
            }
            default: {
                return true;
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.DiskCacheStrategy
    public final boolean isDataCacheable(DataSource dataSource0) {
        switch(this.a) {
            case 0: {
                return dataSource0 == DataSource.REMOTE;
            }
            case 1: {
                return false;
            }
            case 2: {
                return dataSource0 != DataSource.DATA_DISK_CACHE && dataSource0 != DataSource.MEMORY_CACHE;
            }
            case 3: {
                return false;
            }
            default: {
                return dataSource0 == DataSource.REMOTE;
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.DiskCacheStrategy
    public final boolean isResourceCacheable(boolean z, DataSource dataSource0, EncodeStrategy encodeStrategy0) {
        switch(this.a) {
            case 0: {
                return dataSource0 != DataSource.RESOURCE_DISK_CACHE && dataSource0 != DataSource.MEMORY_CACHE;
            }
            case 1: {
                return false;
            }
            case 2: {
                return false;
            }
            case 3: {
                return dataSource0 != DataSource.RESOURCE_DISK_CACHE && dataSource0 != DataSource.MEMORY_CACHE;
            }
            default: {
                return (z && dataSource0 == DataSource.DATA_DISK_CACHE || dataSource0 == DataSource.LOCAL) && encodeStrategy0 == EncodeStrategy.TRANSFORMED;
            }
        }
    }
}

