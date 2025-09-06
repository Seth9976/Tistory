package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.R.id;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;

@Deprecated
public abstract class ViewTarget extends BaseTarget {
    public final d b;
    public androidx.appcompat.view.menu.d c;
    public boolean d;
    public boolean e;
    public static boolean f;
    public static int g;
    protected final View view;

    static {
        ViewTarget.g = id.glide_custom_view_target_tag;
    }

    public ViewTarget(@NonNull View view0) {
        this.view = (View)Preconditions.checkNotNull(view0);
        this.b = new d(view0);
    }

    @Deprecated
    public ViewTarget(@NonNull View view0, boolean z) {
        this(view0);
        if(z) {
            this.waitForLayout();
        }
    }

    @NonNull
    public final ViewTarget clearOnDetach() {
        if(this.c != null) {
            return this;
        }
        androidx.appcompat.view.menu.d d0 = new androidx.appcompat.view.menu.d(this, 3);
        this.c = d0;
        if(!this.e) {
            this.view.addOnAttachStateChangeListener(d0);
            this.e = true;
        }
        return this;
    }

    @Override  // com.bumptech.glide.request.target.BaseTarget
    @Nullable
    public Request getRequest() {
        Object object0 = this.view.getTag(ViewTarget.g);
        if(object0 != null) {
            if(!(object0 instanceof Request)) {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
            return (Request)object0;
        }
        return null;
    }

    @Override  // com.bumptech.glide.request.target.Target
    @CallSuper
    public void getSize(@NonNull SizeReadyCallback sizeReadyCallback0) {
        d d0 = this.b;
        int v = d0.a.getPaddingLeft();
        int v1 = d0.a.getPaddingRight();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = d0.a.getLayoutParams();
        int v2 = 0;
        int v3 = viewGroup$LayoutParams0 == null ? 0 : viewGroup$LayoutParams0.width;
        int v4 = d0.a(d0.a.getWidth(), v3, v1 + v);
        View view0 = d0.a;
        int v5 = view0.getPaddingTop();
        int v6 = view0.getPaddingBottom();
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = view0.getLayoutParams();
        if(viewGroup$LayoutParams1 != null) {
            v2 = viewGroup$LayoutParams1.height;
        }
        int v7 = d0.a(view0.getHeight(), v2, v6 + v5);
        if((v4 > 0 || v4 == 0x80000000) && (v7 > 0 || v7 == 0x80000000)) {
            sizeReadyCallback0.onSizeReady(v4, v7);
        }
        else {
            ArrayList arrayList0 = d0.b;
            if(!arrayList0.contains(sizeReadyCallback0)) {
                arrayList0.add(sizeReadyCallback0);
            }
            if(d0.d == null) {
                ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                a a0 = new a(d0);
                d0.d = a0;
                viewTreeObserver0.addOnPreDrawListener(a0);
            }
        }
    }

    @NonNull
    public View getView() {
        return this.view;
    }

    @Override  // com.bumptech.glide.request.target.BaseTarget
    @CallSuper
    public void onLoadCleared(@Nullable Drawable drawable0) {
        super.onLoadCleared(drawable0);
        d d0 = this.b;
        ViewTreeObserver viewTreeObserver0 = d0.a.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnPreDrawListener(d0.d);
        }
        d0.d = null;
        d0.b.clear();
        if(!this.d) {
            androidx.appcompat.view.menu.d d1 = this.c;
            if(d1 != null && this.e) {
                this.view.removeOnAttachStateChangeListener(d1);
                this.e = false;
            }
        }
    }

    @Override  // com.bumptech.glide.request.target.BaseTarget
    @CallSuper
    public void onLoadStarted(@Nullable Drawable drawable0) {
        super.onLoadStarted(drawable0);
        androidx.appcompat.view.menu.d d0 = this.c;
        if(d0 != null && !this.e) {
            this.view.addOnAttachStateChangeListener(d0);
            this.e = true;
        }
    }

    @Override  // com.bumptech.glide.request.target.Target
    @CallSuper
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback0) {
        this.b.b.remove(sizeReadyCallback0);
    }

    @Override  // com.bumptech.glide.request.target.BaseTarget
    public void setRequest(@Nullable Request request0) {
        ViewTarget.f = true;
        this.view.setTag(ViewTarget.g, request0);
    }

    @Deprecated
    public static void setTagId(int v) {
        if(ViewTarget.f) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        ViewTarget.g = v;
    }

    @Override
    public String toString() {
        return "Target for: " + this.view;
    }

    @NonNull
    public final ViewTarget waitForLayout() {
        this.b.c = true;
        return this;
    }
}

