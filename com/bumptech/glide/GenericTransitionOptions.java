package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition.Animator;

public final class GenericTransitionOptions extends TransitionOptions {
    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.TransitionOptions
    public boolean equals(Object object0) {
        return object0 instanceof GenericTransitionOptions && super.equals(object0);
    }

    @Override  // com.bumptech.glide.TransitionOptions
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public static GenericTransitionOptions with(int v) {
        return (GenericTransitionOptions)new GenericTransitionOptions().transition(v);
    }

    @NonNull
    public static GenericTransitionOptions with(@NonNull TransitionFactory transitionFactory0) {
        return (GenericTransitionOptions)new GenericTransitionOptions().transition(transitionFactory0);
    }

    @NonNull
    public static GenericTransitionOptions with(@NonNull Animator viewPropertyTransition$Animator0) {
        return (GenericTransitionOptions)new GenericTransitionOptions().transition(viewPropertyTransition$Animator0);
    }

    @NonNull
    public static GenericTransitionOptions withNoTransition() {
        return (GenericTransitionOptions)new GenericTransitionOptions().dontTransition();
    }
}

