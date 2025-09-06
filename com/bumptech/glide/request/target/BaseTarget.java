package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;

@Deprecated
public abstract class BaseTarget implements Target {
    public Request a;

    @Override  // com.bumptech.glide.request.target.Target
    @Nullable
    public Request getRequest() {
        return this.a;
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadFailed(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void setRequest(@Nullable Request request0) {
        this.a = request0;
    }
}

