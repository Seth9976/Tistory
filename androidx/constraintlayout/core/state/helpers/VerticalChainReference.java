package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class VerticalChainReference extends ChainReference {
    public VerticalChainReference(State state0) {
        super(state0, Helper.VERTICAL_CHAIN);
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        for(Object object0: this.mReferences) {
            this.mState.constraints(object0).clearVertical();
        }
        ConstraintReference constraintReference0 = null;
        ConstraintReference constraintReference1 = null;
        for(Object object1: this.mReferences) {
            ConstraintReference constraintReference2 = this.mState.constraints(object1);
            if(constraintReference1 == null) {
                Object object2 = this.mTopToTop;
                if(object2 == null) {
                    Object object3 = this.mTopToBottom;
                    if(object3 == null) {
                        constraintReference2.topToTop(State.PARENT);
                    }
                    else {
                        constraintReference2.topToBottom(object3).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                    }
                }
                else {
                    constraintReference2.topToTop(object2).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                }
                constraintReference1 = constraintReference2;
            }
            if(constraintReference0 != null) {
                constraintReference0.bottomToTop(constraintReference2.getKey());
                constraintReference2.topToBottom(constraintReference0.getKey());
            }
            constraintReference0 = constraintReference2;
        }
        if(constraintReference0 != null) {
            Object object4 = this.mBottomToTop;
            if(object4 == null) {
                Object object5 = this.mBottomToBottom;
                if(object5 == null) {
                    constraintReference0.bottomToBottom(State.PARENT);
                }
                else {
                    constraintReference0.bottomToBottom(object5).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
                }
            }
            else {
                constraintReference0.bottomToTop(object4).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            }
        }
        if(constraintReference1 == null) {
            return;
        }
        float f = this.mBias;
        if(f != 0.5f) {
            constraintReference1.verticalBias(f);
        }
        switch(c.a[this.mStyle.ordinal()]) {
            case 1: {
                constraintReference1.setVerticalChainStyle(0);
                return;
            }
            case 2: {
                constraintReference1.setVerticalChainStyle(1);
                return;
            }
            case 3: {
                constraintReference1.setVerticalChainStyle(2);
            }
        }
    }
}

