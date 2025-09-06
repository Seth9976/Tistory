package androidx.fragment.app;

import androidx.core.os.CancellationSignal;
import kotlin.jvm.internal.Intrinsics;

public final class k extends j {
    public final Object c;
    public final boolean d;
    public final Object e;

    public k(Operation specialEffectsController$Operation0, CancellationSignal cancellationSignal0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(specialEffectsController$Operation0, "operation");
        Object object1;
        boolean z2;
        Object object0;
        Intrinsics.checkNotNullParameter(cancellationSignal0, "signal");
        super(specialEffectsController$Operation0, cancellationSignal0);
        State specialEffectsController$Operation$State0 = State.VISIBLE;
        if(specialEffectsController$Operation0.getFinalState() == specialEffectsController$Operation$State0) {
            Fragment fragment0 = specialEffectsController$Operation0.getFragment();
            object0 = z ? fragment0.getReenterTransition() : fragment0.getEnterTransition();
        }
        else {
            Fragment fragment1 = specialEffectsController$Operation0.getFragment();
            object0 = z ? fragment1.getReturnTransition() : fragment1.getExitTransition();
        }
        this.c = object0;
        if(specialEffectsController$Operation0.getFinalState() != specialEffectsController$Operation$State0) {
            z2 = true;
        }
        else if(z) {
            z2 = specialEffectsController$Operation0.getFragment().getAllowReturnTransitionOverlap();
        }
        else {
            z2 = specialEffectsController$Operation0.getFragment().getAllowEnterTransitionOverlap();
        }
        this.d = z2;
        if(!z1) {
            object1 = null;
        }
        else if(z) {
            object1 = specialEffectsController$Operation0.getFragment().getSharedElementReturnTransition();
        }
        else {
            object1 = specialEffectsController$Operation0.getFragment().getSharedElementEnterTransition();
        }
        this.e = object1;
    }

    public final FragmentTransitionImpl c() {
        Object object0 = this.c;
        FragmentTransitionImpl fragmentTransitionImpl0 = this.d(object0);
        Object object1 = this.e;
        FragmentTransitionImpl fragmentTransitionImpl1 = this.d(object1);
        if(fragmentTransitionImpl0 != null && fragmentTransitionImpl1 != null && fragmentTransitionImpl0 != fragmentTransitionImpl1) {
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.getFragment() + " returned Transition " + object0 + " which uses a different Transition  type than its shared element transition " + object1).toString());
        }
        return fragmentTransitionImpl0 == null ? fragmentTransitionImpl1 : fragmentTransitionImpl0;
    }

    public final FragmentTransitionImpl d(Object object0) {
        if(object0 == null) {
            return null;
        }
        FragmentTransitionImpl fragmentTransitionImpl0 = FragmentTransition.PLATFORM_IMPL;
        if(fragmentTransitionImpl0 != null && fragmentTransitionImpl0.canHandle(object0)) {
            return fragmentTransitionImpl0;
        }
        FragmentTransitionImpl fragmentTransitionImpl1 = FragmentTransition.SUPPORT_IMPL;
        if(fragmentTransitionImpl1 == null || !fragmentTransitionImpl1.canHandle(object0)) {
            throw new IllegalArgumentException("Transition " + object0 + " for fragment " + this.a.getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
        return fragmentTransitionImpl1;
    }
}

