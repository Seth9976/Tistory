package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

public class NoTransition implements Transition {
    public static class NoAnimationFactory implements TransitionFactory {
        @Override  // com.bumptech.glide.request.transition.TransitionFactory
        public Transition build(DataSource dataSource0, boolean z) {
            return NoTransition.a;
        }
    }

    public static final NoTransition a;
    public static final NoAnimationFactory b;

    static {
        NoTransition.a = new NoTransition();
        NoTransition.b = new NoAnimationFactory();
    }

    public static Transition get() {
        return NoTransition.a;
    }

    public static TransitionFactory getFactory() {
        return NoTransition.b;
    }

    @Override  // com.bumptech.glide.request.transition.Transition
    public boolean transition(Object object0, ViewAdapter transition$ViewAdapter0) {
        return false;
    }
}

