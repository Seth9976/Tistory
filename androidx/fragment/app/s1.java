package androidx.fragment.app;

import android.transition.Transition.TransitionListener;
import android.transition.Transition;
import java.util.ArrayList;

public final class s1 implements Transition.TransitionListener {
    public final Object a;
    public final ArrayList b;
    public final Object c;
    public final ArrayList d;
    public final Object e;
    public final ArrayList f;
    public final u1 g;

    public s1(u1 u10, Object object0, ArrayList arrayList0, Object object1, ArrayList arrayList1, Object object2, ArrayList arrayList2) {
        this.g = u10;
        this.a = object0;
        this.b = arrayList0;
        this.c = object1;
        this.d = arrayList1;
        this.e = object2;
        this.f = arrayList2;
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionCancel(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionEnd(Transition transition0) {
        transition0.removeListener(this);
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionPause(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionResume(Transition transition0) {
    }

    @Override  // android.transition.Transition$TransitionListener
    public final void onTransitionStart(Transition transition0) {
        u1 u10 = this.g;
        Object object0 = this.a;
        if(object0 != null) {
            u10.replaceTargets(object0, this.b, null);
        }
        Object object1 = this.c;
        if(object1 != null) {
            u10.replaceTargets(object1, this.d, null);
        }
        Object object2 = this.e;
        if(object2 != null) {
            u10.replaceTargets(object2, this.f, null);
        }
    }
}

