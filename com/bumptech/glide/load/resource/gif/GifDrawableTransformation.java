package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public class GifDrawableTransformation implements Transformation {
    public final Transformation a;

    public GifDrawableTransformation(Transformation transformation0) {
        this.a = (Transformation)Preconditions.checkNotNull(transformation0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof GifDrawableTransformation ? this.a.equals(((GifDrawableTransformation)object0).a) : false;
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource transform(@NonNull Context context0, @NonNull Resource resource0, int v, int v1) {
        GifDrawable gifDrawable0 = (GifDrawable)resource0.get();
        BitmapResource bitmapResource0 = new BitmapResource(gifDrawable0.getFirstFrame(), Glide.get(context0).getBitmapPool());
        Transformation transformation0 = this.a;
        Resource resource1 = transformation0.transform(context0, bitmapResource0, v, v1);
        if(!bitmapResource0.equals(resource1)) {
            bitmapResource0.recycle();
        }
        gifDrawable0.setFrameTransformation(transformation0, ((Bitmap)resource1.get()));
        return resource0;
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        this.a.updateDiskCacheKey(messageDigest0);
    }
}

