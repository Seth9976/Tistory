package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

public final class LruArrayPool implements ArrayPool {
    public final b a;
    public final d b;
    public final HashMap c;
    public final HashMap d;
    public final int e;
    public int f;

    @VisibleForTesting
    public LruArrayPool() {
        this.a = new b();
        this.b = new d(0);
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 0x400000;
    }

    public LruArrayPool(int v) {
        this.a = new b();
        this.b = new d(0);
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = v;
    }

    public final void a(int v, Class class0) {
        NavigableMap navigableMap0 = this.e(class0);
        Integer integer0 = (Integer)navigableMap0.get(v);
        if(integer0 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + v + ", this: " + this);
        }
        if(((int)integer0) == 1) {
            navigableMap0.remove(v);
            return;
        }
        navigableMap0.put(v, ((int)(((int)integer0) - 1)));
    }

    public final void b(int v) {
        while(this.f > v) {
            Object object0 = this.a.c();
            Preconditions.checkNotNull(object0);
            ArrayAdapterInterface arrayAdapterInterface0 = this.c(object0.getClass());
            this.f -= arrayAdapterInterface0.getArrayLength(object0) * arrayAdapterInterface0.getElementSizeInBytes();
            this.a(arrayAdapterInterface0.getArrayLength(object0), object0.getClass());
            if(Log.isLoggable(arrayAdapterInterface0.getTag(), 2)) {
                Log.v(arrayAdapterInterface0.getTag(), "evicted: " + arrayAdapterInterface0.getArrayLength(object0));
            }
        }
    }

    public final ArrayAdapterInterface c(Class class0) {
        HashMap hashMap0 = this.d;
        ArrayAdapterInterface arrayAdapterInterface0 = (ArrayAdapterInterface)hashMap0.get(class0);
        if(arrayAdapterInterface0 == null) {
            if(class0.equals(int[].class)) {
                arrayAdapterInterface0 = new IntegerArrayAdapter();
            }
            else if(class0.equals(byte[].class)) {
                arrayAdapterInterface0 = new ByteArrayAdapter();
            }
            else {
                throw new IllegalArgumentException("No array pool found for: " + class0.getSimpleName());
            }
            hashMap0.put(class0, arrayAdapterInterface0);
            return arrayAdapterInterface0;
        }
        return arrayAdapterInterface0;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public void clearMemory() {
        synchronized(this) {
            this.b(0);
        }
    }

    public final Object d(c c0, Class class0) {
        ArrayAdapterInterface arrayAdapterInterface0 = this.c(class0);
        Object object0 = this.a.a(c0);
        if(object0 != null) {
            this.f -= arrayAdapterInterface0.getArrayLength(object0) * arrayAdapterInterface0.getElementSizeInBytes();
            this.a(arrayAdapterInterface0.getArrayLength(object0), class0);
        }
        if(object0 == null) {
            if(Log.isLoggable(arrayAdapterInterface0.getTag(), 2)) {
                Log.v(arrayAdapterInterface0.getTag(), "Allocated " + c0.b + " bytes");
            }
            return arrayAdapterInterface0.newArray(c0.b);
        }
        return object0;
    }

    public final NavigableMap e(Class class0) {
        HashMap hashMap0 = this.c;
        NavigableMap navigableMap0 = (NavigableMap)hashMap0.get(class0);
        if(navigableMap0 == null) {
            navigableMap0 = new TreeMap();
            hashMap0.put(class0, navigableMap0);
        }
        return navigableMap0;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public Object get(int v, Class class0) {
        c c0;
        synchronized(this) {
            Integer integer0 = (Integer)this.e(class0).ceilingKey(v);
            if(integer0 == null || this.f != 0 && this.e / this.f < 2 && ((int)integer0) > v * 8) {
                d d1 = this.b;
                Poolable poolable1 = (Poolable)((Queue)d1.a).poll();
                if(poolable1 == null) {
                    poolable1 = d1.b();
                }
                c0 = (c)poolable1;
                c0.b = v;
            }
            else {
                d d0 = this.b;
                int v2 = (int)integer0;
                Poolable poolable0 = (Poolable)((Queue)d0.a).poll();
                if(poolable0 == null) {
                    poolable0 = d0.b();
                }
                c0 = (c)poolable0;
                c0.b = v2;
            }
            c0.c = class0;
            return this.d(c0, class0);
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public Object getExact(int v, Class class0) {
        synchronized(this) {
            d d0 = this.b;
            Poolable poolable0 = (Poolable)((Queue)d0.a).poll();
            if(poolable0 == null) {
                poolable0 = d0.b();
            }
            ((c)poolable0).b = v;
            ((c)poolable0).c = class0;
            return this.d(((c)poolable0), class0);
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public void put(Object object0) {
        synchronized(this) {
            Class class0 = object0.getClass();
            ArrayAdapterInterface arrayAdapterInterface0 = this.c(class0);
            int v1 = arrayAdapterInterface0.getArrayLength(object0);
            int v2 = arrayAdapterInterface0.getElementSizeInBytes() * v1;
            if(v2 <= this.e / 2) {
                d d0 = this.b;
                Poolable poolable0 = (Poolable)((Queue)d0.a).poll();
                if(poolable0 == null) {
                    poolable0 = d0.b();
                }
                ((c)poolable0).b = v1;
                ((c)poolable0).c = class0;
                this.a.b(((c)poolable0), object0);
                NavigableMap navigableMap0 = this.e(class0);
                Integer integer0 = (Integer)navigableMap0.get(((c)poolable0).b);
                navigableMap0.put(((c)poolable0).b, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
                this.f += v2;
                this.b(this.e);
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    @Deprecated
    public void put(Object object0, Class class0) {
        this.put(object0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public void trimMemory(int v) {
        synchronized(this) {
            if(v >= 40) {
                this.clearMemory();
            }
            else if(v >= 20 || v == 15) {
                this.b(this.e / 2);
            }
        }
    }
}

