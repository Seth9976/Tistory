package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.d;
import com.bumptech.glide.R.id;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;

public abstract class CustomViewTarget implements Target {
    public final b a;
    public d b;
    public boolean c;
    public boolean d;
    public static final int e;
    protected final View view;

    static {
        CustomViewTarget.e = id.glide_custom_view_target_tag;
    }

    public CustomViewTarget(@NonNull View view0) {
        this.view = (View)Preconditions.checkNotNull(view0);
        this.a = new b(view0);
    }

    @NonNull
    public final CustomViewTarget clearOnDetach() {
        if(this.b != null) {
            return this;
        }
        d d0 = new d(this, 2);
        this.b = d0;
        if(!this.d) {
            this.view.addOnAttachStateChangeListener(d0);
            this.d = true;
        }
        return this;
    }

    @Override  // com.bumptech.glide.request.target.Target
    @Nullable
    public final Request getRequest() {
        Object object0 = this.view.getTag(CustomViewTarget.e);
        if(object0 != null) {
            if(!(object0 instanceof Request)) {
                throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
            }
            return (Request)object0;
        }
        return null;
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback0) {
        b b0 = this.a;
        int v = b0.a.getPaddingLeft();
        int v1 = b0.a.getPaddingRight();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = b0.a.getLayoutParams();
        int v2 = 0;
        int v3 = viewGroup$LayoutParams0 == null ? 0 : viewGroup$LayoutParams0.width;
        int v4 = b0.a(b0.a.getWidth(), v3, v1 + v);
        View view0 = b0.a;
        int v5 = view0.getPaddingTop();
        int v6 = view0.getPaddingBottom();
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = view0.getLayoutParams();
        if(viewGroup$LayoutParams1 != null) {
            v2 = viewGroup$LayoutParams1.height;
        }
        int v7 = b0.a(view0.getHeight(), v2, v6 + v5);
        if((v4 > 0 || v4 == 0x80000000) && (v7 > 0 || v7 == 0x80000000)) {
            sizeReadyCallback0.onSizeReady(v4, v7);
        }
        else {
            ArrayList arrayList0 = b0.b;
            if(!arrayList0.contains(sizeReadyCallback0)) {
                arrayList0.add(sizeReadyCallback0);
            }
            if(b0.d == null) {
                ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                a a0 = new a(b0);
                b0.d = a0;
                viewTreeObserver0.addOnPreDrawListener(a0);
            }
        }
    }

    @NonNull
    public final View getView() {
        return this.view;
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(@Nullable Drawable drawable0) {
        b b0 = this.a;
        ViewTreeObserver viewTreeObserver0 = b0.a.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnPreDrawListener(b0.d);
        }
        b0.d = null;
        b0.b.clear();
        this.onResourceCleared(drawable0);
        if(!this.c) {
            d d0 = this.b;
            if(d0 != null && this.d) {
                this.view.removeOnAttachStateChangeListener(d0);
                this.d = false;
            }
        }
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(@Nullable Drawable drawable0) {
        d d0 = this.b;
        if(d0 != null && !this.d) {
            this.view.addOnAttachStateChangeListener(d0);
            this.d = true;
        }
    }

    public abstract void onResourceCleared(@Nullable Drawable arg1);

    public void onResourceLoading(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback0) {
        this.a.b.remove(sizeReadyCallback0);
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void setRequest(@Nullable Request request0) {
        this.view.setTag(CustomViewTarget.e, request0);
    }

    @Override
    public String toString() {
        return "Target for: " + this.view;
    }

    @Deprecated
    public final CustomViewTarget useTagId(@IdRes int v) {
        return this;
    }

    @NonNull
    public final CustomViewTarget waitForLayout() {
        this.a.c = true;
        return this;
    }
}

