package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LruBitmapPool implements BitmapPool {
    interface BitmapTracker {
        void add(Bitmap arg1);

        void remove(Bitmap arg1);
    }

    public final SizeConfigStrategy a;
    public final Set b;
    public final long c;
    public final e d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public static final Bitmap.Config k;

    static {
        LruBitmapPool.k = Bitmap.Config.ARGB_8888;
    }

    public LruBitmapPool(long v) {
        SizeConfigStrategy sizeConfigStrategy0 = new SizeConfigStrategy();
        HashSet hashSet0 = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet0.add(null);
        hashSet0.remove(Bitmap.Config.HARDWARE);
        this(v, sizeConfigStrategy0, Collections.unmodifiableSet(hashSet0));
    }

    public LruBitmapPool(long v, SizeConfigStrategy sizeConfigStrategy0, Set set0) {
        this.c = v;
        this.e = v;
        this.a = sizeConfigStrategy0;
        this.b = set0;
        this.d = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public LruBitmapPool(long v, Set set0) {
        this(v, new SizeConfigStrategy(), set0);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + this.a);
    }

    public final Bitmap b(int v, int v1, Bitmap.Config bitmap$Config0) {
        synchronized(this) {
            if(bitmap$Config0 != Bitmap.Config.HARDWARE) {
                Bitmap bitmap0 = this.a.get(v, v1, (bitmap$Config0 == null ? LruBitmapPool.k : bitmap$Config0));
                if(bitmap0 == null) {
                    if(Log.isLoggable("LruBitmapPool", 3)) {
                        Log.d("LruBitmapPool", "Missing bitmap=" + this.a.logBitmap(v, v1, bitmap$Config0));
                    }
                    ++this.h;
                }
                else {
                    ++this.g;
                    this.f -= (long)this.a.getSize(bitmap0);
                    this.d.getClass();
                    bitmap0.setHasAlpha(true);
                    bitmap0.setPremultiplied(true);
                }
                if(Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Get bitmap=" + this.a.logBitmap(v, v1, bitmap$Config0));
                }
                if(Log.isLoggable("LruBitmapPool", 2)) {
                    this.a();
                }
                return bitmap0;
            }
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + bitmap$Config0 + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    public final void c(long v) {
        synchronized(this) {
            while(this.f > v) {
                Bitmap bitmap0 = this.a.removeLast();
                if(bitmap0 == null) {
                    if(Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        this.a();
                    }
                    this.f = 0L;
                    return;
                }
                this.d.getClass();
                this.f -= (long)this.a.getSize(bitmap0);
                ++this.j;
                if(Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.a.logBitmap(bitmap0));
                }
                if(Log.isLoggable("LruBitmapPool", 2)) {
                    this.a();
                }
                bitmap0.recycle();
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
        if(Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        this.c(0L);
    }

    public long evictionCount() {
        return (long)this.j;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap get(int v, int v1, Bitmap.Config bitmap$Config0) {
        Bitmap bitmap0 = this.b(v, v1, bitmap$Config0);
        if(bitmap0 != null) {
            bitmap0.eraseColor(0);
            return bitmap0;
        }
        if(bitmap$Config0 == null) {
            bitmap$Config0 = LruBitmapPool.k;
        }
        return Bitmap.createBitmap(v, v1, bitmap$Config0);
    }

    public long getCurrentSize() {
        return this.f;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap getDirty(int v, int v1, Bitmap.Config bitmap$Config0) {
        Bitmap bitmap0 = this.b(v, v1, bitmap$Config0);
        if(bitmap0 == null) {
            if(bitmap$Config0 == null) {
                bitmap$Config0 = LruBitmapPool.k;
            }
            return Bitmap.createBitmap(v, v1, bitmap$Config0);
        }
        return bitmap0;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return this.e;
    }

    public long hitCount() {
        return (long)this.g;
    }

    public long missCount() {
        return (long)this.h;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void put(Bitmap bitmap0) {
        synchronized(this) {
            if(bitmap0 != null) {
                if(bitmap0.isRecycled()) {
                    throw new IllegalStateException("Cannot pool recycled bitmap");
                }
                if(bitmap0.isMutable() && ((long)this.a.getSize(bitmap0)) <= this.e) {
                    Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
                    if(this.b.contains(bitmap$Config0)) {
                        int v1 = this.a.getSize(bitmap0);
                        this.a.put(bitmap0);
                        this.d.getClass();
                        ++this.i;
                        this.f += (long)v1;
                        if(Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.a.logBitmap(bitmap0));
                        }
                        if(Log.isLoggable("LruBitmapPool", 2)) {
                            this.a();
                        }
                        this.c(this.e);
                        return;
                    }
                }
                if(Log.isLoggable("LruBitmapPool", 2)) {
                    Bitmap.Config bitmap$Config1 = bitmap0.getConfig();
                    Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.a.logBitmap(bitmap0) + ", is mutable: " + bitmap0.isMutable() + ", is allowed config: " + this.b.contains(bitmap$Config1));
                }
                bitmap0.recycle();
                return;
            }
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void setSizeMultiplier(float f) {
        synchronized(this) {
            long v1 = (long)Math.round(((float)this.c) * f);
            this.e = v1;
            this.c(v1);
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int v) {
        if(Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + v);
        }
        if(v >= 40 || v >= 20) {
            this.clearMemory();
        }
        else if(v == 15) {
            this.c(this.getMaxSize() / 2L);
        }
    }
}

