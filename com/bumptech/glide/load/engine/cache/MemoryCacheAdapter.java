package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

public class MemoryCacheAdapter implements MemoryCache {
    public ResourceRemovedListener a;

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    public void clearMemory() {
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    public long getCurrentSize() {
        return 0L;
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    public long getMaxSize() {
        return 0L;
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    @Nullable
    public Resource put(@NonNull Key key0, @Nullable Resource resource0) {
        if(resource0 != null) {
            this.a.onResourceRemoved(resource0);
        }
        return null;
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    @Nullable
    public Resource remove(@NonNull Key key0) {
        return null;
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    public void setResourceRemovedListener(@NonNull ResourceRemovedListener memoryCache$ResourceRemovedListener0) {
        this.a = memoryCache$ResourceRemovedListener0;
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    public void setSizeMultiplier(float f) {
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    public void trimMemory(int v) {
    }
}

