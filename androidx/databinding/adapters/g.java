package androidx.databinding.adapters;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;

public final class g implements View.OnAttachStateChangeListener {
    public final OnViewAttachedToWindow a;
    public final OnViewDetachedFromWindow b;

    public g(OnViewAttachedToWindow viewBindingAdapter$OnViewAttachedToWindow0, OnViewDetachedFromWindow viewBindingAdapter$OnViewDetachedFromWindow0) {
        this.a = viewBindingAdapter$OnViewAttachedToWindow0;
        this.b = viewBindingAdapter$OnViewDetachedFromWindow0;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        OnViewAttachedToWindow viewBindingAdapter$OnViewAttachedToWindow0 = this.a;
        if(viewBindingAdapter$OnViewAttachedToWindow0 != null) {
            viewBindingAdapter$OnViewAttachedToWindow0.onViewAttachedToWindow(view0);
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        OnViewDetachedFromWindow viewBindingAdapter$OnViewDetachedFromWindow0 = this.b;
        if(viewBindingAdapter$OnViewDetachedFromWindow0 != null) {
            viewBindingAdapter$OnViewDetachedFromWindow0.onViewDetachedFromWindow(view0);
        }
    }
}

