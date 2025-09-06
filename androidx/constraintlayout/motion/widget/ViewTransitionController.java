package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;

public class ViewTransitionController {
    public final MotionLayout a;
    public final ArrayList b;
    public HashSet c;
    public final String d;
    public ArrayList e;
    public final ArrayList f;

    public ViewTransitionController(MotionLayout motionLayout0) {
        this.b = new ArrayList();
        this.d = "ViewTransitionController";
        this.f = new ArrayList();
        this.a = motionLayout0;
    }

    public void add(ViewTransition viewTransition0) {
        this.b.add(viewTransition0);
        this.c = null;
        if(viewTransition0.getStateTransition() == 4) {
            ConstraintLayout.getSharedValues().addListener(viewTransition0.getSharedValueID(), new u(this, viewTransition0, viewTransition0.getSharedValueID(), true, viewTransition0.getSharedValue()));
            return;
        }
        if(viewTransition0.getStateTransition() == 5) {
            ConstraintLayout.getSharedValues().addListener(viewTransition0.getSharedValueID(), new u(this, viewTransition0, viewTransition0.getSharedValueID(), false, viewTransition0.getSharedValue()));
        }
    }
}

