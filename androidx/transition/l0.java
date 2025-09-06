package androidx.transition;

public final class l0 extends TransitionListenerAdapter {
    public TransitionSet a;

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionEnd(Transition transition0) {
        TransitionSet transitionSet0 = this.a;
        int v = transitionSet0.K - 1;
        transitionSet0.K = v;
        if(v == 0) {
            transitionSet0.L = false;
            transitionSet0.end();
        }
        transition0.removeListener(this);
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionStart(Transition transition0) {
        TransitionSet transitionSet0 = this.a;
        if(!transitionSet0.L) {
            transitionSet0.start();
            transitionSet0.L = true;
        }
    }
}

