package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class e0 implements Key {
    public final ArrayPool a;
    public final Key b;
    public final Key c;
    public final int d;
    public final int e;
    public final Class f;
    public final Options g;
    public final Transformation h;
    public static final LruCache i;

    static {
        e0.i = new LruCache(50L);
    }

    public e0(ArrayPool arrayPool0, Key key0, Key key1, int v, int v1, Transformation transformation0, Class class0, Options options0) {
        this.a = arrayPool0;
        this.b = key0;
        this.c = key1;
        this.d = v;
        this.e = v1;
        this.h = transformation0;
        this.f = class0;
        this.g = options0;
    }

    // 去混淆评级： 中等(60)
    @Override  // com.bumptech.glide.load.Key
    public final boolean equals(Object object0) {
        return object0 instanceof e0 && this.e == ((e0)object0).e && this.d == ((e0)object0).d && Util.bothNullOrEqual(this.h, ((e0)object0).h) && this.f.equals(((e0)object0).f) && this.b.equals(((e0)object0).b) && this.c.equals(((e0)object0).c) && this.g.equals(((e0)object0).g);
    }

    @Override  // com.bumptech.glide.load.Key
    public final int hashCode() {
        int v = ((this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F + this.d) * 0x1F + this.e;
        Transformation transformation0 = this.h;
        if(transformation0 != null) {
            v = v * 0x1F + transformation0.hashCode();
        }
        return this.g.hashCode() + (this.f.hashCode() + v * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.b + ", signature=" + this.c + ", width=" + this.d + ", height=" + this.e + ", decodedResourceClass=" + this.f + ", transformation=\'" + this.h + "\', options=" + this.g + '}';
    }

    @Override  // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest0) {
        ArrayPool arrayPool0 = this.a;
        byte[] arr_b = (byte[])arrayPool0.getExact(8, byte[].class);
        ByteBuffer.wrap(arr_b).putInt(this.d).putInt(this.e).array();
        this.c.updateDiskCacheKey(messageDigest0);
        this.b.updateDiskCacheKey(messageDigest0);
        messageDigest0.update(arr_b);
        Transformation transformation0 = this.h;
        if(transformation0 != null) {
            transformation0.updateDiskCacheKey(messageDigest0);
        }
        this.g.updateDiskCacheKey(messageDigest0);
        LruCache lruCache0 = e0.i;
        Class class0 = this.f;
        byte[] arr_b1 = (byte[])lruCache0.get(class0);
        if(arr_b1 == null) {
            arr_b1 = class0.getName().getBytes(Key.CHARSET);
            lruCache0.put(class0, arr_b1);
        }
        messageDigest0.update(arr_b1);
        arrayPool0.put(arr_b);
    }
}

