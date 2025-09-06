package androidx.transition;

import java.util.ArrayList;

public final class q extends TransitionListenerAdapter {
    public final Object a;
    public final ArrayList b;
    public final Object c;
    public final ArrayList d;
    public final Object e;
    public final ArrayList f;
    public final FragmentTransitionSupport g;

    public q(FragmentTransitionSupport fragmentTransitionSupport0, Object object0, ArrayList arrayList0, Object object1, ArrayList arrayList1, Object object2, ArrayList arrayList2) {
        this.g = fragmentTransitionSupport0;
        this.a = object0;
        this.b = arrayList0;
        this.c = object1;
        this.d = arrayList1;
        this.e = object2;
        this.f = arrayList2;
        super();
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionEnd(Transition transition0) {
        transition0.removeListener(this);
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionStart(Transition transition0) {
        FragmentTransitionSupport fragmentTransitionSupport0 = this.g;
        Object object0 = this.a;
        if(object0 != null) {
            fragmentTransitionSupport0.replaceTargets(object0, this.b, null);
        }
        Object object1 = this.c;
        if(object1 != null) {
            fragmentTransitionSupport0.replaceTargets(object1, this.d, null);
        }
        Object object2 = this.e;
        if(object2 != null) {
            fragmentTransitionSupport0.replaceTargets(object2, this.f, null);
        }
    }
}

