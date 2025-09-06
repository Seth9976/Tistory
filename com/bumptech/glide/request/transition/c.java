package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class c implements ViewTransitionAnimationFactory {
    public final int a;

    public c(int v) {
        this.a = v;
    }

    @Override  // com.bumptech.glide.request.transition.ViewTransition$ViewTransitionAnimationFactory
    public final Animation build(Context context0) {
        return AnimationUtils.loadAnimation(context0, this.a);
    }
}

