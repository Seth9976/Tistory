package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

@Deprecated
public class BitmapDrawableTransformation implements Transformation {
    public final Transformation a;

    public BitmapDrawableTransformation(Transformation transformation0) {
        this.a = (Transformation)Preconditions.checkNotNull(new DrawableTransformation(transformation0, false));
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof BitmapDrawableTransformation ? this.a.equals(((BitmapDrawableTransformation)object0).a) : false;
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource transform(@NonNull Context context0, @NonNull Resource resource0, int v, int v1) {
        Resource resource1 = this.a.transform(context0, resource0, v, v1);
        if(!(resource1.get() instanceof BitmapDrawable)) {
            throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + resource1.get());
        }
        return resource1;
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        this.a.updateDiskCacheKey(messageDigest0);
    }
}

