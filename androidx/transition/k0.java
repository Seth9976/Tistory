package androidx.transition;

public final class k0 extends TransitionListenerAdapter {
    public final Transition a;

    public k0(Transition transition0) {
        this.a = transition0;
        super();
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionEnd(Transition transition0) {
        this.a.runAnimators();
        transition0.removeListener(this);
    }
}

