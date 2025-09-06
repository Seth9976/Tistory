package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues.SharedValuesListener;

public final class u implements SharedValuesListener {
    public final ViewTransition a;
    public final int b;
    public final boolean c;
    public final int d;
    public final ViewTransitionController e;

    public u(ViewTransitionController viewTransitionController0, ViewTransition viewTransition0, int v, boolean z, int v1) {
        this.e = viewTransitionController0;
        this.a = viewTransition0;
        this.b = v;
        this.c = z;
        this.d = v1;
    }

    @Override  // androidx.constraintlayout.widget.SharedValues$SharedValuesListener
    public final void onNewValue(int v, int v1, int v2) {
        ViewTransition viewTransition0 = this.a;
        viewTransition0.setSharedValueCurrent(v1);
        if(this.b == v && viewTransition0.getSharedValueCurrent() != v1) {
            ViewTransitionController viewTransitionController0 = this.e;
            int v3 = 0;
            int v4 = this.d;
            if(this.c) {
                if(v4 == v1) {
                    int v5 = viewTransitionController0.a.getChildCount();
                    while(v3 < v5) {
                        MotionLayout motionLayout0 = viewTransitionController0.a;
                        View view0 = motionLayout0.getChildAt(v3);
                        if(viewTransition0.c(view0)) {
                            int v6 = motionLayout0.getCurrentState();
                            ConstraintSet constraintSet0 = motionLayout0.getConstraintSet(v6);
                            this.a.a(viewTransitionController0, viewTransitionController0.a, v6, constraintSet0, new View[]{view0});
                        }
                        ++v3;
                    }
                }
            }
            else if(v4 != v1) {
                int v7 = viewTransitionController0.a.getChildCount();
                while(v3 < v7) {
                    MotionLayout motionLayout1 = viewTransitionController0.a;
                    View view1 = motionLayout1.getChildAt(v3);
                    if(viewTransition0.c(view1)) {
                        int v8 = motionLayout1.getCurrentState();
                        ConstraintSet constraintSet1 = motionLayout1.getConstraintSet(v8);
                        this.a.a(viewTransitionController0, viewTransitionController0.a, v8, constraintSet1, new View[]{view1});
                    }
                    ++v3;
                }
            }
        }
    }
}

