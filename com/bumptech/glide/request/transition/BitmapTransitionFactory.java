package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

public class BitmapTransitionFactory extends BitmapContainerTransitionFactory {
    public BitmapTransitionFactory(@NonNull TransitionFactory transitionFactory0) {
        super(transitionFactory0);
    }

    @NonNull
    public Bitmap getBitmap(@NonNull Bitmap bitmap0) {
        return bitmap0;
    }

    @Override  // com.bumptech.glide.request.transition.BitmapContainerTransitionFactory
    @NonNull
    public Bitmap getBitmap(@NonNull Object object0) {
        return this.getBitmap(((Bitmap)object0));
    }
}

