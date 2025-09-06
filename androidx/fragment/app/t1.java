package androidx.fragment.app;

import android.transition.Transition.TransitionListener;
import android.transition.Transition;

public final class t1 implements Transition.TransitionListener {
    public final Runnable a;

    public t1(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionCancel(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionEnd(Transition transition0) {
        this.a.run();
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionPause(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionResume(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionStart(Transition transition0) {
    }
}

