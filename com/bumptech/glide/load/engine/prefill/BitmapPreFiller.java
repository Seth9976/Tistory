package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.util.Util;
import d6.b;
import d6.c;
import java.util.HashMap;

public final class BitmapPreFiller {
    public final MemoryCache a;
    public final BitmapPool b;
    public final DecodeFormat c;
    public b d;

    public BitmapPreFiller(MemoryCache memoryCache0, BitmapPool bitmapPool0, DecodeFormat decodeFormat0) {
        this.a = memoryCache0;
        this.b = bitmapPool0;
        this.c = decodeFormat0;
    }

    public void preFill(Builder[] arr_preFillType$Builder) {
        b b0 = this.d;
        if(b0 != null) {
            b0.h = true;
        }
        PreFillType[] arr_preFillType = new PreFillType[arr_preFillType$Builder.length];
        for(int v1 = 0; v1 < arr_preFillType$Builder.length; ++v1) {
            Builder preFillType$Builder0 = arr_preFillType$Builder[v1];
            if(preFillType$Builder0.c == null) {
                preFillType$Builder0.setConfig((this.c == DecodeFormat.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565));
            }
            arr_preFillType[v1] = new PreFillType(preFillType$Builder0.a, preFillType$Builder0.b, preFillType$Builder0.c, preFillType$Builder0.d);
        }
        MemoryCache memoryCache0 = this.a;
        long v2 = memoryCache0.getMaxSize();
        long v3 = memoryCache0.getCurrentSize();
        BitmapPool bitmapPool0 = this.b;
        long v4 = bitmapPool0.getMaxSize();
        int v6 = 0;
        for(int v5 = 0; v5 < arr_preFillType$Builder.length; ++v5) {
            v6 += arr_preFillType[v5].d;
        }
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < arr_preFillType$Builder.length; ++v) {
            PreFillType preFillType0 = arr_preFillType[v];
            int v7 = Util.getBitmapByteSize(preFillType0.a, preFillType0.b, preFillType0.c);
            hashMap0.put(preFillType0, ((int)(Math.round(((float)preFillType0.d) * (((float)(v4 + (v2 - v3))) / ((float)v6))) / v7)));
        }
        b b1 = new b(bitmapPool0, memoryCache0, new c(hashMap0));
        this.d = b1;
        Util.postOnUiThread(b1);
    }
}

