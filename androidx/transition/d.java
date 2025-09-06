package androidx.transition;

import android.view.ViewGroup;

public final class d extends TransitionListenerAdapter {
    public boolean a;
    public final ViewGroup b;

    public d(ViewGroup viewGroup0) {
        this.b = viewGroup0;
        super();
        this.a = false;
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionCancel(Transition transition0) {
        f0.d(this.b, false);
        this.a = true;
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionEnd(Transition transition0) {
        if(!this.a) {
            f0.d(this.b, false);
        }
        transition0.removeListener(this);
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionPause(Transition transition0) {
        f0.d(this.b, false);
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionResume(Transition transition0) {
        f0.d(this.b, true);
    }
}

