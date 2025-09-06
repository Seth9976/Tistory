package androidx.databinding.adapters;

import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;

public final class i implements Animation.AnimationListener {
    public final OnAnimationStart a;
    public final OnAnimationEnd b;
    public final OnAnimationRepeat c;

    public i(OnAnimationStart viewGroupBindingAdapter$OnAnimationStart0, OnAnimationEnd viewGroupBindingAdapter$OnAnimationEnd0, OnAnimationRepeat viewGroupBindingAdapter$OnAnimationRepeat0) {
        this.a = viewGroupBindingAdapter$OnAnimationStart0;
        this.b = viewGroupBindingAdapter$OnAnimationEnd0;
        this.c = viewGroupBindingAdapter$OnAnimationRepeat0;
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationEnd(Animation animation0) {
        OnAnimationEnd viewGroupBindingAdapter$OnAnimationEnd0 = this.b;
        if(viewGroupBindingAdapter$OnAnimationEnd0 != null) {
            viewGroupBindingAdapter$OnAnimationEnd0.onAnimationEnd(animation0);
        }
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationRepeat(Animation animation0) {
        OnAnimationRepeat viewGroupBindingAdapter$OnAnimationRepeat0 = this.c;
        if(viewGroupBindingAdapter$OnAnimationRepeat0 != null) {
            viewGroupBindingAdapter$OnAnimationRepeat0.onAnimationRepeat(animation0);
        }
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationStart(Animation animation0) {
        OnAnimationStart viewGroupBindingAdapter$OnAnimationStart0 = this.a;
        if(viewGroupBindingAdapter$OnAnimationStart0 != null) {
            viewGroupBindingAdapter$OnAnimationStart0.onAnimationStart(animation0);
        }
    }
}

