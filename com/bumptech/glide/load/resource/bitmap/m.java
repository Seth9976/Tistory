package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.ExceptionPassthroughInputStream;
import java.io.IOException;

public final class m implements DecodeCallbacks {
    public final RecyclableBufferedInputStream a;
    public final ExceptionPassthroughInputStream b;

    public m(RecyclableBufferedInputStream recyclableBufferedInputStream0, ExceptionPassthroughInputStream exceptionPassthroughInputStream0) {
        this.a = recyclableBufferedInputStream0;
        this.b = exceptionPassthroughInputStream0;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks
    public final void onDecodeComplete(BitmapPool bitmapPool0, Bitmap bitmap0) {
        IOException iOException0 = this.b.getException();
        if(iOException0 != null) {
            if(bitmap0 != null) {
                bitmapPool0.put(bitmap0);
            }
            throw iOException0;
        }
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks
    public final void onObtainBounds() {
        this.a.fixMarkLimit();
    }
}

