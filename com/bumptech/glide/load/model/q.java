package com.bumptech.glide.load.model;

import com.bumptech.glide.util.LruCache;

public final class q extends LruCache {
    @Override  // com.bumptech.glide.util.LruCache
    public final void onItemEvicted(Object object0, Object object1) {
        ((r)object0).getClass();
        synchronized(r.d) {
            r.d.offer(((r)object0));
        }
    }
}

