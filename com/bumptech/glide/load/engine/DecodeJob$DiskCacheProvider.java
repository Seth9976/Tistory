package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.cache.DiskCache;

interface DecodeJob.DiskCacheProvider {
    DiskCache getDiskCache();
}

