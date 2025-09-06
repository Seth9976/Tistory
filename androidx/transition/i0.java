package androidx.transition;

import androidx.collection.ArrayMap;
import java.util.ArrayList;

public final class i0 extends TransitionListenerAdapter {
    public final ArrayMap a;
    public final j0 b;

    public i0(j0 j00, ArrayMap arrayMap0) {
        this.b = j00;
        this.a = arrayMap0;
        super();
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionEnd(Transition transition0) {
        ((ArrayList)this.a.get(this.b.b)).remove(transition0);
        transition0.removeListener(this);
    }
}

