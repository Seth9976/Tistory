package com.bumptech.glide.request.transition;

import android.view.animation.Animation;
import com.bumptech.glide.load.DataSource;

public class ViewAnimationFactory implements TransitionFactory {
    public final ViewTransitionAnimationFactory a;
    public ViewTransition b;

    public ViewAnimationFactory(int v) {
        this(new c(v));
    }

    public ViewAnimationFactory(Animation animation0) {
        this(new b(animation0));
    }

    public ViewAnimationFactory(ViewTransitionAnimationFactory viewTransition$ViewTransitionAnimationFactory0) {
        this.a = viewTransition$ViewTransitionAnimationFactory0;
    }

    @Override  // com.bumptech.glide.request.transition.TransitionFactory
    public Transition build(DataSource dataSource0, boolean z) {
        if(dataSource0 != DataSource.MEMORY_CACHE && z) {
            if(this.b == null) {
                this.b = new ViewTransition(this.a);
            }
            return this.b;
        }
        return NoTransition.get();
    }
}

