package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class AlignVerticallyReference extends HelperReference {
    public final float N;

    public AlignVerticallyReference(State state0) {
        super(state0, Helper.ALIGN_VERTICALLY);
        this.N = 0.5f;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        for(Object object0: this.mReferences) {
            ConstraintReference constraintReference0 = this.mState.constraints(object0);
            constraintReference0.clearVertical();
            Object object1 = this.mTopToTop;
            if(object1 == null) {
                Object object2 = this.mTopToBottom;
                if(object2 == null) {
                    constraintReference0.topToTop(State.PARENT);
                }
                else {
                    constraintReference0.topToBottom(object2);
                }
            }
            else {
                constraintReference0.topToTop(object1);
            }
            Object object3 = this.mBottomToTop;
            if(object3 == null) {
                Object object4 = this.mBottomToBottom;
                if(object4 == null) {
                    constraintReference0.bottomToBottom(State.PARENT);
                }
                else {
                    constraintReference0.bottomToBottom(object4);
                }
            }
            else {
                constraintReference0.bottomToTop(object3);
            }
            float f = this.N;
            if(f != 0.5f) {
                constraintReference0.verticalBias(f);
            }
        }
    }
}

