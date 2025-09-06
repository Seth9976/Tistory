package com.google.android.material.snackbar;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.material.internal.ViewUtils;
import java.lang.ref.WeakReference;

public final class n implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    public final WeakReference b;

    public n(BaseTransientBottomBar baseTransientBottomBar0, View view0) {
        this.a = new WeakReference(baseTransientBottomBar0);
        this.b = new WeakReference(view0);
    }

    public final void a() {
        WeakReference weakReference0 = this.b;
        if(weakReference0.get() != null) {
            ((View)weakReference0.get()).removeOnAttachStateChangeListener(this);
            ViewUtils.removeOnGlobalLayoutListener(((View)weakReference0.get()), this);
        }
        weakReference0.clear();
        this.a.clear();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference0 = this.a;
        if(weakReference0.get() == null) {
            this.a();
            return;
        }
        if(!((BaseTransientBottomBar)weakReference0.get()).m) {
            return;
        }
        ((BaseTransientBottomBar)weakReference0.get()).c();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        if(this.a.get() == null) {
            this.a();
            return;
        }
        ViewUtils.addOnGlobalLayoutListener(view0, this);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        if(this.a.get() == null) {
            this.a();
            return;
        }
        ViewUtils.removeOnGlobalLayoutListener(view0, this);
    }
}

