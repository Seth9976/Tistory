package androidx.fragment.app;

import android.transition.Transition.TransitionListener;
import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public final class r1 implements Transition.TransitionListener {
    public final View a;
    public final ArrayList b;

    public r1(View view0, ArrayList arrayList0) {
        this.a = view0;
        this.b = arrayList0;
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionCancel(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionEnd(Transition transition0) {
        transition0.removeListener(this);
        this.a.setVisibility(8);
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((View)arrayList0.get(v1)).setVisibility(0);
        }
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionPause(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionResume(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionStart(Transition transition0) {
        transition0.removeListener(this);
        transition0.addListener(this);
    }
}

