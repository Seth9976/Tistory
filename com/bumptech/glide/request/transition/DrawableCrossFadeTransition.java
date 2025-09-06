package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public class DrawableCrossFadeTransition implements Transition {
    public final int a;
    public final boolean b;

    public DrawableCrossFadeTransition(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    public boolean transition(Drawable drawable0, ViewAdapter transition$ViewAdapter0) {
        Drawable drawable1 = transition$ViewAdapter0.getCurrentDrawable();
        if(drawable1 == null) {
            drawable1 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable0 = new TransitionDrawable(new Drawable[]{drawable1, drawable0});
        transitionDrawable0.setCrossFadeEnabled(this.b);
        transitionDrawable0.startTransition(this.a);
        transition$ViewAdapter0.setDrawable(transitionDrawable0);
        return true;
    }

    @Override  // com.bumptech.glide.request.transition.Transition
    public boolean transition(Object object0, ViewAdapter transition$ViewAdapter0) {
        return this.transition(((Drawable)object0), transition$ViewAdapter0);
    }
}

