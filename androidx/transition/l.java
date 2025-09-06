package androidx.transition;

import android.view.View;

public final class l extends TransitionListenerAdapter {
    public final View a;

    public l(View view0) {
        this.a = view0;
        super();
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionEnd(Transition transition0) {
        r0.b(this.a, 1.0f);
        r0.a.getClass();
        transition0.removeListener(this);
    }
}

