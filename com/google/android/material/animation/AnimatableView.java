package com.google.android.material.animation;

import androidx.annotation.NonNull;

public interface AnimatableView {
    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(@NonNull Listener arg1);

    void stopAnimation();
}

