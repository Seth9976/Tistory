package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import i6.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LruCache {
    public final LinkedHashMap a;
    public final long b;
    public long c;
    public long d;

    public LruCache(long v) {
        this.a = new LinkedHashMap(100, 0.75f, true);
        this.b = v;
        this.c = v;
    }

    public void clearMemory() {
        this.trimToSize(0L);
    }

    public boolean contains(@NonNull Object object0) {
        synchronized(this) {
            return this.a.containsKey(object0);
        }
    }

    @Nullable
    public Object get(@NonNull Object object0) {
        synchronized(this) {
            c c0 = (c)this.a.get(object0);
            return c0 == null ? null : c0.a;
        }
    }

    public int getCount() {
        synchronized(this) {
        }
        return this.a.size();
    }

    public long getCurrentSize() {
        synchronized(this) {
        }
        return this.d;
    }

    public long getMaxSize() {
        synchronized(this) {
        }
        return this.c;
    }

    public int getSize(@Nullable Object object0) {
        return 1;
    }

    public void onItemEvicted(@NonNull Object object0, @Nullable Object object1) {
    }

    @Nullable
    public Object put(@NonNull Object object0, @Nullable Object object1) {
        synchronized(this) {
            int v1 = this.getSize(object1);
            Object object2 = null;
            if(Long.compare(v1, this.c) >= 0) {
                this.onItemEvicted(object0, object1);
                return null;
            }
            if(object1 != null) {
                this.d += (long)v1;
            }
            c c0 = object1 == null ? null : new c(object1, v1);
            c c1 = (c)this.a.put(object0, c0);
            if(c1 != null) {
                this.d -= (long)c1.b;
                if(!c1.a.equals(object1)) {
                    this.onItemEvicted(object0, c1.a);
                }
            }
            this.trimToSize(this.c);
            if(c1 != null) {
                object2 = c1.a;
            }
            return object2;
        }
    }

    @Nullable
    public Object remove(@NonNull Object object0) {
        synchronized(this) {
            c c0 = (c)this.a.remove(object0);
            if(c0 == null) {
                return null;
            }
            this.d -= (long)c0.b;
            return c0.a;
        }
    }

    public void setSizeMultiplier(float f) {
        synchronized(this) {
            if(f >= 0.0f) {
                long v1 = (long)Math.round(((float)this.b) * f);
                this.c = v1;
                this.trimToSize(v1);
                return;
            }
        }
        throw new IllegalArgumentException("Multiplier must be >= 0");
    }

    public void trimToSize(long v) {
        synchronized(this) {
            while(this.d > v) {
                Iterator iterator0 = this.a.entrySet().iterator();
                Object object0 = iterator0.next();
                c c0 = (c)((Map.Entry)object0).getValue();
                this.d -= (long)c0.b;
                Object object1 = ((Map.Entry)object0).getKey();
                iterator0.remove();
                this.onItemEvicted(object1, c0.a);
            }
        }
    }
}

