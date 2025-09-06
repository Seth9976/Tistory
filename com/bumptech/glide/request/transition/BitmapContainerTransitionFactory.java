package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DataSource;

public abstract class BitmapContainerTransitionFactory implements TransitionFactory {
    public final TransitionFactory a;

    public BitmapContainerTransitionFactory(TransitionFactory transitionFactory0) {
        this.a = transitionFactory0;
    }

    @Override  // com.bumptech.glide.request.transition.TransitionFactory
    public Transition build(DataSource dataSource0, boolean z) {
        return new a(this, this.a.build(dataSource0, z));
    }

    public abstract Bitmap getBitmap(Object arg1);
}

