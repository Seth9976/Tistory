package com.bumptech.glide.load.resource.drawable;

import androidx.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.TransitionFactory;

public final class DrawableTransitionOptions extends TransitionOptions {
    @NonNull
    public DrawableTransitionOptions crossFade() {
        return this.crossFade(new Builder());
    }

    @NonNull
    public DrawableTransitionOptions crossFade(int v) {
        return this.crossFade(new Builder(v));
    }

    @NonNull
    public DrawableTransitionOptions crossFade(@NonNull Builder drawableCrossFadeFactory$Builder0) {
        return this.crossFade(drawableCrossFadeFactory$Builder0.build());
    }

    @NonNull
    public DrawableTransitionOptions crossFade(@NonNull DrawableCrossFadeFactory drawableCrossFadeFactory0) {
        return (DrawableTransitionOptions)this.transition(drawableCrossFadeFactory0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.TransitionOptions
    public boolean equals(Object object0) {
        return object0 instanceof DrawableTransitionOptions && super.equals(object0);
    }

    @Override  // com.bumptech.glide.TransitionOptions
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public static DrawableTransitionOptions with(@NonNull TransitionFactory transitionFactory0) {
        return (DrawableTransitionOptions)new DrawableTransitionOptions().transition(transitionFactory0);
    }

    @NonNull
    public static DrawableTransitionOptions withCrossFade() {
        return new DrawableTransitionOptions().crossFade();
    }

    @NonNull
    public static DrawableTransitionOptions withCrossFade(int v) {
        return new DrawableTransitionOptions().crossFade(v);
    }

    @NonNull
    public static DrawableTransitionOptions withCrossFade(@NonNull Builder drawableCrossFadeFactory$Builder0) {
        return new DrawableTransitionOptions().crossFade(drawableCrossFadeFactory$Builder0);
    }

    @NonNull
    public static DrawableTransitionOptions withCrossFade(@NonNull DrawableCrossFadeFactory drawableCrossFadeFactory0) {
        return new DrawableTransitionOptions().crossFade(drawableCrossFadeFactory0);
    }
}

