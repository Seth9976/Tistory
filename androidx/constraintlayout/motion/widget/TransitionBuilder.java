package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintSet;

public class TransitionBuilder {
    public static Transition buildTransition(MotionScene motionScene0, int v, int v1, ConstraintSet constraintSet0, int v2, ConstraintSet constraintSet1) {
        Transition motionScene$Transition0 = new Transition(v, motionScene0, v1, v2);
        motionScene0.setConstraintSet(motionScene$Transition0.getStartConstraintSetId(), constraintSet0);
        motionScene0.setConstraintSet(motionScene$Transition0.getEndConstraintSetId(), constraintSet1);
        return motionScene$Transition0;
    }

    public static void validate(MotionLayout motionLayout0) {
        MotionScene motionScene0 = motionLayout0.a;
        if(motionScene0 == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if(!motionScene0.validateLayout(motionLayout0)) {
            throw new RuntimeException("MotionLayout doesn\'t have the right motion scene.");
        }
        if(motionScene0.c == null || motionScene0.getDefinedTransitions().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn\'t have any transition.");
        }
    }
}

