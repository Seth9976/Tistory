package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.material3.td;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.state.Transition;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class u implements RememberObserver, ConstraintSet {
    public final ConstraintLayoutScope a;
    public Handler b;
    public final SnapshotStateObserver c;
    public boolean d;
    public final t e;
    public final ArrayList f;

    public u(ConstraintLayoutScope constraintLayoutScope0) {
        Intrinsics.checkNotNullParameter(constraintLayoutScope0, "scope");
        super();
        this.a = constraintLayoutScope0;
        this.c = new SnapshotStateObserver(new t(this, 0));
        this.d = true;
        this.e = new t(this, 1);
        this.f = new ArrayList();
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    public final void applyTo(State state0, List list0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        this.a.applyTo(state0);
        this.f.clear();
        td td0 = new td(list0, state0, 2, this);
        this.c.observeReads(Unit.INSTANCE, this.e, td0);
        this.d = false;
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    public final void applyTo(Transition transition0, int v) {
        DefaultImpls.applyTo(this, transition0, v);
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    public final boolean isDirty(List list0) {
        Intrinsics.checkNotNullParameter(list0, "measurables");
        if(!this.d) {
            ArrayList arrayList0 = this.f;
            if(list0.size() == arrayList0.size()) {
                int v = list0.size();
                if(v - 1 >= 0) {
                    for(int v1 = 0; true; ++v1) {
                        Object object0 = ((Measurable)list0.get(v1)).getParentData();
                        if(!Intrinsics.areEqual((object0 instanceof p ? ((p)object0) : null), arrayList0.get(v1))) {
                            return true;
                        }
                        if(v1 + 1 > v - 1) {
                            break;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.c.stop();
        this.c.clear();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.c.start();
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    public final ConstraintSet override(String s, float f) {
        return DefaultImpls.override(this, s, f);
    }
}

