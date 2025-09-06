package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

public class DrawableTransformation implements Transformation {
    public final Transformation a;
    public final boolean b;

    public DrawableTransformation(Transformation transformation0, boolean z) {
        this.a = transformation0;
        this.b = z;
    }

    public Transformation asBitmapDrawable() [...] // Inlined contents

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof DrawableTransformation ? this.a.equals(((DrawableTransformation)object0).a) : false;
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource transform(@NonNull Context context0, @NonNull Resource resource0, int v, int v1) {
        BitmapPool bitmapPool0 = Glide.get(context0).getBitmapPool();
        Drawable drawable0 = (Drawable)resource0.get();
        BitmapResource bitmapResource0 = k.a(bitmapPool0, drawable0, v, v1);
        if(bitmapResource0 == null) {
            if(this.b) {
                throw new IllegalArgumentException("Unable to convert " + drawable0 + " to a Bitmap");
            }
            return resource0;
        }
        Resource resource1 = this.a.transform(context0, bitmapResource0, v, v1);
        if(resource1.equals(bitmapResource0)) {
            resource1.recycle();
            return resource0;
        }
        return LazyBitmapDrawableResource.obtain(context0.getResources(), resource1);
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        this.a.updateDiskCacheKey(messageDigest0);
    }
}

