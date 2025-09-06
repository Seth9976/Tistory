package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LruCache;

public class LruResourceCache extends LruCache implements MemoryCache {
    public ResourceRemovedListener e;

    public LruResourceCache(long v) {
        super(v);
    }

    public int getSize(@Nullable Resource resource0) {
        return resource0 == null ? super.getSize(null) : resource0.getSize();
    }

    @Override  // com.bumptech.glide.util.LruCache
    public int getSize(@Nullable Object object0) {
        return this.getSize(((Resource)object0));
    }

    public void onItemEvicted(@NonNull Key key0, @Nullable Resource resource0) {
        ResourceRemovedListener memoryCache$ResourceRemovedListener0 = this.e;
        if(memoryCache$ResourceRemovedListener0 != null && resource0 != null) {
            memoryCache$ResourceRemovedListener0.onResourceRemoved(resource0);
        }
    }

    @Override  // com.bumptech.glide.util.LruCache
    public void onItemEvicted(@NonNull Object object0, @Nullable Object object1) {
        this.onItemEvicted(((Key)object0), ((Resource)object1));
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    @Nullable
    public Resource put(@NonNull Key key0, @Nullable Resource resource0) {
        return (Resource)super.put(key0, resource0);
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    @Nullable
    public Resource remove(@NonNull Key key0) {
        return (Resource)super.remove(key0);
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    public void setResourceRemovedListener(@NonNull ResourceRemovedListener memoryCache$ResourceRemovedListener0) {
        this.e = memoryCache$ResourceRemovedListener0;
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int v) {
        if(v >= 40) {
            this.clearMemory();
            return;
        }
        if(v >= 20 || v == 15) {
            this.trimToSize(this.getMaxSize() / 2L);
        }
    }
}

