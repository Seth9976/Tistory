package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

public final class GifBitmapProvider implements BitmapProvider {
    public final BitmapPool a;
    public final ArrayPool b;

    public GifBitmapProvider(BitmapPool bitmapPool0) {
        this(bitmapPool0, null);
    }

    public GifBitmapProvider(BitmapPool bitmapPool0, @Nullable ArrayPool arrayPool0) {
        this.a = bitmapPool0;
        this.b = arrayPool0;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider
    @NonNull
    public Bitmap obtain(int v, int v1, @NonNull Bitmap.Config bitmap$Config0) {
        return this.a.getDirty(v, v1, bitmap$Config0);
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider
    @NonNull
    public byte[] obtainByteArray(int v) {
        return this.b == null ? new byte[v] : ((byte[])this.b.get(v, byte[].class));
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider
    @NonNull
    public int[] obtainIntArray(int v) {
        return this.b == null ? new int[v] : ((int[])this.b.get(v, int[].class));
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider
    public void release(@NonNull Bitmap bitmap0) {
        this.a.put(bitmap0);
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider
    public void release(@NonNull byte[] arr_b) {
        ArrayPool arrayPool0 = this.b;
        if(arrayPool0 == null) {
            return;
        }
        arrayPool0.put(arr_b);
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider
    public void release(@NonNull int[] arr_v) {
        ArrayPool arrayPool0 = this.b;
        if(arrayPool0 == null) {
            return;
        }
        arrayPool0.put(arr_v);
    }
}

