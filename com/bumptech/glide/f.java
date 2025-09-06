package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;

public final class f implements Target {
    public int a;
    public int b;
    public Request c;

    @Override  // com.bumptech.glide.request.target.Target
    public final Request getRequest() {
        return this.c;
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void getSize(SizeReadyCallback sizeReadyCallback0) {
        sizeReadyCallback0.onSizeReady(this.b, this.a);
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void onLoadFailed(Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object object0, Transition transition0) {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void removeCallback(SizeReadyCallback sizeReadyCallback0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void setRequest(Request request0) {
        this.c = request0;
    }
}

