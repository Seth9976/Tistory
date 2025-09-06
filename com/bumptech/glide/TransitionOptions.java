package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition.Animator;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

public abstract class TransitionOptions implements Cloneable {
    public TransitionFactory a;

    public TransitionOptions() {
        this.a = NoTransition.getFactory();
    }

    public final TransitionOptions clone() {
        try {
            return (TransitionOptions)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @NonNull
    public final TransitionOptions dontTransition() {
        return this.transition(NoTransition.getFactory());
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof TransitionOptions ? Util.bothNullOrEqual(this.a, ((TransitionOptions)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @NonNull
    public final TransitionOptions transition(int v) {
        return this.transition(new ViewAnimationFactory(v));
    }

    @NonNull
    public final TransitionOptions transition(@NonNull TransitionFactory transitionFactory0) {
        this.a = (TransitionFactory)Preconditions.checkNotNull(transitionFactory0);
        return this;
    }

    @NonNull
    public final TransitionOptions transition(@NonNull Animator viewPropertyTransition$Animator0) {
        return this.transition(new ViewPropertyAnimationFactory(viewPropertyTransition$Animator0));
    }
}

