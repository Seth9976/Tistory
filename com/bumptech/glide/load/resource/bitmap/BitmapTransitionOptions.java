package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.BitmapTransitionFactory;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.TransitionFactory;

public final class BitmapTransitionOptions extends TransitionOptions {
    @NonNull
    public BitmapTransitionOptions crossFade() {
        return this.crossFade(new Builder());
    }

    @NonNull
    public BitmapTransitionOptions crossFade(int v) {
        return this.crossFade(new Builder(v));
    }

    @NonNull
    public BitmapTransitionOptions crossFade(@NonNull Builder drawableCrossFadeFactory$Builder0) {
        return this.transitionUsing(drawableCrossFadeFactory$Builder0.build());
    }

    @NonNull
    public BitmapTransitionOptions crossFade(@NonNull DrawableCrossFadeFactory drawableCrossFadeFactory0) {
        return this.transitionUsing(drawableCrossFadeFactory0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.TransitionOptions
    public boolean equals(Object object0) {
        return object0 instanceof BitmapTransitionOptions && super.equals(object0);
    }

    @Override  // com.bumptech.glide.TransitionOptions
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public BitmapTransitionOptions transitionUsing(@NonNull TransitionFactory transitionFactory0) {
        return (BitmapTransitionOptions)this.transition(new BitmapTransitionFactory(transitionFactory0));
    }

    @NonNull
    public static BitmapTransitionOptions with(@NonNull TransitionFactory transitionFactory0) {
        return (BitmapTransitionOptions)new BitmapTransitionOptions().transition(transitionFactory0);
    }

    @NonNull
    public static BitmapTransitionOptions withCrossFade() {
        return new BitmapTransitionOptions().crossFade();
    }

    @NonNull
    public static BitmapTransitionOptions withCrossFade(int v) {
        return new BitmapTransitionOptions().crossFade(v);
    }

    @NonNull
    public static BitmapTransitionOptions withCrossFade(@NonNull Builder drawableCrossFadeFactory$Builder0) {
        return new BitmapTransitionOptions().crossFade(drawableCrossFadeFactory$Builder0);
    }

    @NonNull
    public static BitmapTransitionOptions withCrossFade(@NonNull DrawableCrossFadeFactory drawableCrossFadeFactory0) {
        return new BitmapTransitionOptions().crossFade(drawableCrossFadeFactory0);
    }

    @NonNull
    public static BitmapTransitionOptions withWrapped(@NonNull TransitionFactory transitionFactory0) {
        return new BitmapTransitionOptions().transitionUsing(transitionFactory0);
    }
}

