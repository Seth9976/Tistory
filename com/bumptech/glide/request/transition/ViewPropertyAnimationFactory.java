package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

public class ViewPropertyAnimationFactory implements TransitionFactory {
    public final Animator a;
    public ViewPropertyTransition b;

    public ViewPropertyAnimationFactory(Animator viewPropertyTransition$Animator0) {
        this.a = viewPropertyTransition$Animator0;
    }

    @Override  // com.bumptech.glide.request.transition.TransitionFactory
    public Transition build(DataSource dataSource0, boolean z) {
        if(dataSource0 != DataSource.MEMORY_CACHE && z) {
            if(this.b == null) {
                this.b = new ViewPropertyTransition(this.a);
            }
            return this.b;
        }
        return NoTransition.get();
    }
}

