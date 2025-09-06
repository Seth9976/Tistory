package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

@RequiresApi(19)
public class SizeConfigStrategy implements LruPoolStrategy {
    public final d a;
    public final b b;
    public final HashMap c;
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;

    static {
        Bitmap.Config[] arr_bitmap$Config = (Bitmap.Config[])Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        arr_bitmap$Config[arr_bitmap$Config.length - 1] = Bitmap.Config.RGBA_F16;
        SizeConfigStrategy.d = arr_bitmap$Config;
        SizeConfigStrategy.e = arr_bitmap$Config;
        SizeConfigStrategy.f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        SizeConfigStrategy.g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        SizeConfigStrategy.h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public SizeConfigStrategy() {
        this.a = new d(1);
        this.b = new b();
        this.c = new HashMap();
    }

    public final void a(Integer integer0, Bitmap bitmap0) {
        NavigableMap navigableMap0 = this.c(bitmap0.getConfig());
        Integer integer1 = (Integer)navigableMap0.get(integer0);
        if(integer1 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + integer0 + ", removed: " + this.logBitmap(bitmap0) + ", this: " + this);
        }
        if(((int)integer1) == 1) {
            navigableMap0.remove(integer0);
            return;
        }
        navigableMap0.put(integer0, ((int)(((int)integer1) - 1)));
    }

    public static String b(int v, Bitmap.Config bitmap$Config0) [...] // Inlined contents

    public final NavigableMap c(Bitmap.Config bitmap$Config0) {
        HashMap hashMap0 = this.c;
        NavigableMap navigableMap0 = (NavigableMap)hashMap0.get(bitmap$Config0);
        if(navigableMap0 == null) {
            navigableMap0 = new TreeMap();
            hashMap0.put(bitmap$Config0, navigableMap0);
        }
        return navigableMap0;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @Nullable
    public Bitmap get(int v, int v1, Bitmap.Config bitmap$Config0) {
        Bitmap.Config[] arr_bitmap$Config;
        int v2 = Util.getBitmapByteSize(v, v1, bitmap$Config0);
        d d0 = this.a;
        Poolable poolable0 = (Poolable)((Queue)d0.a).poll();
        if(poolable0 == null) {
            poolable0 = d0.b();
        }
        g g0 = (g)poolable0;
        g0.b = v2;
        g0.c = bitmap$Config0;
        if(Bitmap.Config.RGBA_F16.equals(bitmap$Config0)) {
            arr_bitmap$Config = SizeConfigStrategy.e;
        }
        else {
            switch(f.a[bitmap$Config0.ordinal()]) {
                case 1: {
                    arr_bitmap$Config = SizeConfigStrategy.d;
                    break;
                }
                case 2: {
                    arr_bitmap$Config = SizeConfigStrategy.f;
                    break;
                }
                case 3: {
                    arr_bitmap$Config = SizeConfigStrategy.g;
                    break;
                }
                case 4: {
                    arr_bitmap$Config = SizeConfigStrategy.h;
                    break;
                }
                default: {
                    arr_bitmap$Config = new Bitmap.Config[]{bitmap$Config0};
                }
            }
        }
        int v3 = 0;
        while(v3 < arr_bitmap$Config.length) {
            Bitmap.Config bitmap$Config1 = arr_bitmap$Config[v3];
            Integer integer0 = (Integer)this.c(bitmap$Config1).ceilingKey(v2);
            if(integer0 != null && ((int)integer0) <= v2 * 8) {
                if(((int)integer0) == v2) {
                    if(bitmap$Config1 != null) {
                        if(!bitmap$Config1.equals(bitmap$Config0)) {
                            goto label_31;
                        }
                        break;
                    }
                    else if(bitmap$Config0 == null) {
                        break;
                    }
                }
            label_31:
                d0.a(g0);
                int v4 = (int)integer0;
                Poolable poolable1 = (Poolable)((Queue)d0.a).poll();
                if(poolable1 == null) {
                    poolable1 = d0.b();
                }
                g0 = (g)poolable1;
                g0.b = v4;
                g0.c = bitmap$Config1;
                break;
            }
            ++v3;
        }
        Bitmap bitmap0 = (Bitmap)this.b.a(g0);
        if(bitmap0 != null) {
            this.a(g0.b, bitmap0);
            bitmap0.reconfigure(v, v1, bitmap$Config0);
        }
        return bitmap0;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public int getSize(Bitmap bitmap0) {
        return Util.getBitmapByteSize(bitmap0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public String logBitmap(int v, int v1, Bitmap.Config bitmap$Config0) {
        return SizeConfigStrategy.b(Util.getBitmapByteSize(v, v1, bitmap$Config0), bitmap$Config0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public String logBitmap(Bitmap bitmap0) {
        return SizeConfigStrategy.b(Util.getBitmapByteSize(bitmap0), bitmap0.getConfig());
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public void put(Bitmap bitmap0) {
        int v = Util.getBitmapByteSize(bitmap0);
        Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
        d d0 = this.a;
        Poolable poolable0 = (Poolable)((Queue)d0.a).poll();
        if(poolable0 == null) {
            poolable0 = d0.b();
        }
        ((g)poolable0).b = v;
        ((g)poolable0).c = bitmap$Config0;
        this.b.b(((g)poolable0), bitmap0);
        NavigableMap navigableMap0 = this.c(bitmap0.getConfig());
        Integer integer0 = (Integer)navigableMap0.get(((g)poolable0).b);
        navigableMap0.put(((g)poolable0).b, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmap0 = (Bitmap)this.b.c();
        if(bitmap0 != null) {
            this.a(Util.getBitmapByteSize(bitmap0), bitmap0);
        }
        return bitmap0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = a5.b.t("SizeConfigStrategy{groupedMap=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", sortedSizes=(");
        HashMap hashMap0 = this.c;
        for(Object object0: hashMap0.entrySet()) {
            stringBuilder0.append(((Map.Entry)object0).getKey());
            stringBuilder0.append('[');
            stringBuilder0.append(((Map.Entry)object0).getValue());
            stringBuilder0.append("], ");
        }
        if(!hashMap0.isEmpty()) {
            stringBuilder0.replace(stringBuilder0.length() - 2, stringBuilder0.length(), "");
        }
        stringBuilder0.append(")}");
        return stringBuilder0.toString();
    }
}

