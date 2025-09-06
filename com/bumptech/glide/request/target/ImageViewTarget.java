package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition.ViewAdapter;
import com.bumptech.glide.request.transition.Transition;

public abstract class ImageViewTarget extends ViewTarget implements ViewAdapter {
    public Animatable h;

    public ImageViewTarget(ImageView imageView0) {
        super(imageView0);
    }

    @Deprecated
    public ImageViewTarget(ImageView imageView0, boolean z) {
        super(imageView0, z);
    }

    @Override  // com.bumptech.glide.request.transition.Transition$ViewAdapter
    @Nullable
    public Drawable getCurrentDrawable() {
        return ((ImageView)this.view).getDrawable();
    }

    @Override  // com.bumptech.glide.request.target.ViewTarget
    public void onLoadCleared(@Nullable Drawable drawable0) {
        super.onLoadCleared(drawable0);
        Animatable animatable0 = this.h;
        if(animatable0 != null) {
            animatable0.stop();
        }
        this.setResource(null);
        this.h = null;
        this.setDrawable(drawable0);
    }

    @Override  // com.bumptech.glide.request.target.BaseTarget
    public void onLoadFailed(@Nullable Drawable drawable0) {
        super.onLoadFailed(drawable0);
        this.setResource(null);
        this.h = null;
        this.setDrawable(drawable0);
    }

    @Override  // com.bumptech.glide.request.target.ViewTarget
    public void onLoadStarted(@Nullable Drawable drawable0) {
        super.onLoadStarted(drawable0);
        this.setResource(null);
        this.h = null;
        this.setDrawable(drawable0);
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Object object0, @Nullable Transition transition0) {
        if(transition0 != null && transition0.transition(object0, this)) {
            if(object0 instanceof Animatable) {
                this.h = (Animatable)object0;
                ((Animatable)object0).start();
                return;
            }
            this.h = null;
            return;
        }
        this.setResource(object0);
        if(object0 instanceof Animatable) {
            this.h = (Animatable)object0;
            ((Animatable)object0).start();
            return;
        }
        this.h = null;
    }

    @Override  // com.bumptech.glide.request.target.BaseTarget
    public void onStart() {
        Animatable animatable0 = this.h;
        if(animatable0 != null) {
            animatable0.start();
        }
    }

    @Override  // com.bumptech.glide.request.target.BaseTarget
    public void onStop() {
        Animatable animatable0 = this.h;
        if(animatable0 != null) {
            animatable0.stop();
        }
    }

    @Override  // com.bumptech.glide.request.transition.Transition$ViewAdapter
    public void setDrawable(Drawable drawable0) {
        ((ImageView)this.view).setImageDrawable(drawable0);
    }

    public abstract void setResource(@Nullable Object arg1);
}

