package com.bumptech.glide.load.resource.transcode;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

public final class DrawableBytesTranscoder implements ResourceTranscoder {
    public final BitmapPool a;
    public final ResourceTranscoder b;
    public final ResourceTranscoder c;

    public DrawableBytesTranscoder(@NonNull BitmapPool bitmapPool0, @NonNull ResourceTranscoder resourceTranscoder0, @NonNull ResourceTranscoder resourceTranscoder1) {
        this.a = bitmapPool0;
        this.b = resourceTranscoder0;
        this.c = resourceTranscoder1;
    }

    @Override  // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource transcode(@NonNull Resource resource0, @NonNull Options options0) {
        Drawable drawable0 = (Drawable)resource0.get();
        if(drawable0 instanceof BitmapDrawable) {
            BitmapResource bitmapResource0 = BitmapResource.obtain(((BitmapDrawable)drawable0).getBitmap(), this.a);
            return this.b.transcode(bitmapResource0, options0);
        }
        return drawable0 instanceof GifDrawable ? this.c.transcode(resource0, options0) : null;
    }
}

