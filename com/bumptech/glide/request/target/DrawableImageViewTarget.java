package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

public class DrawableImageViewTarget extends ImageViewTarget {
    public DrawableImageViewTarget(ImageView imageView0) {
        super(imageView0);
    }

    @Deprecated
    public DrawableImageViewTarget(ImageView imageView0, boolean z) {
        super(imageView0, z);
    }

    public void setResource(@Nullable Drawable drawable0) {
        ((ImageView)this.view).setImageDrawable(drawable0);
    }

    @Override  // com.bumptech.glide.request.target.ImageViewTarget
    public void setResource(@Nullable Object object0) {
        this.setResource(((Drawable)object0));
    }
}

