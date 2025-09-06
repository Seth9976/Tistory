package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;

public final class b implements ViewTransitionAnimationFactory {
    public final Animation a;

    public b(Animation animation0) {
        this.a = animation0;
    }

    @Override  // com.bumptech.glide.request.transition.ViewTransition$ViewTransitionAnimationFactory
    public final Animation build(Context context0) {
        return this.a;
    }
}

