package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;

public abstract class CustomTarget implements Target {
    public final int a;
    public final int b;
    public Request c;

    public CustomTarget() {
        this(0x80000000, 0x80000000);
    }

    public CustomTarget(int v, int v1) {
        if(!Util.isValidDimensions(v, v1)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + v + " and height: " + v1);
        }
        this.a = v;
        this.b = v1;
    }

    @Override  // com.bumptech.glide.request.target.Target
    @Nullable
    public final Request getRequest() {
        return this.c;
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback0) {
        sizeReadyCallback0.onSizeReady(this.a, this.b);
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
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
    public final void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void setRequest(@Nullable Request request0) {
        this.c = request0;
    }
}

