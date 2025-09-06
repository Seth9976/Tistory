package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class AlignHorizontallyReference extends HelperReference {
    public final float N;

    public AlignHorizontallyReference(State state0) {
        super(state0, Helper.ALIGN_VERTICALLY);
        this.N = 0.5f;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        for(Object object0: this.mReferences) {
            ConstraintReference constraintReference0 = this.mState.constraints(object0);
            constraintReference0.clearHorizontal();
            Object object1 = this.mStartToStart;
            if(object1 == null) {
                Object object2 = this.mStartToEnd;
                if(object2 == null) {
                    constraintReference0.startToStart(State.PARENT);
                }
                else {
                    constraintReference0.startToEnd(object2);
                }
            }
            else {
                constraintReference0.startToStart(object1);
            }
            Object object3 = this.mEndToStart;
            if(object3 == null) {
                Object object4 = this.mEndToEnd;
                if(object4 == null) {
                    constraintReference0.endToEnd(State.PARENT);
                }
                else {
                    constraintReference0.endToEnd(object4);
                }
            }
            else {
                constraintReference0.endToStart(object3);
            }
            float f = this.N;
            if(f != 0.5f) {
                constraintReference0.horizontalBias(f);
            }
        }
    }
}

