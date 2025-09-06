package androidx.transition;

import android.animation.Animator;

interface AnimatorUtils.AnimatorPauseListenerCompat {
    void onAnimationPause(Animator arg1);

    void onAnimationResume(Animator arg1);
}

