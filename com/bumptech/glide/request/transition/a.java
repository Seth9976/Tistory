package com.bumptech.glide.request.transition;

import android.graphics.drawable.BitmapDrawable;

public final class a implements Transition {
    public final Transition a;
    public final BitmapContainerTransitionFactory b;

    public a(BitmapContainerTransitionFactory bitmapContainerTransitionFactory0, Transition transition0) {
        this.b = bitmapContainerTransitionFactory0;
        this.a = transition0;
    }

    @Override  // com.bumptech.glide.request.transition.Transition
    public final boolean transition(Object object0, ViewAdapter transition$ViewAdapter0) {
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(transition$ViewAdapter0.getView().getResources(), this.b.getBitmap(object0));
        return this.a.transition(bitmapDrawable0, transition$ViewAdapter0);
    }
}

