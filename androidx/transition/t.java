package androidx.transition;

public final class t implements TransitionListener {
    public final Runnable a;

    public t(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionCancel(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionEnd(Transition transition0) {
        this.a.run();
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionPause(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionResume(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionStart(Transition transition0) {
    }
}

