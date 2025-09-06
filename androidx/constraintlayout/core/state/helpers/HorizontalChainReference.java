package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class HorizontalChainReference extends ChainReference {
    public HorizontalChainReference(State state0) {
        super(state0, Helper.HORIZONTAL_CHAIN);
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        for(Object object0: this.mReferences) {
            this.mState.constraints(object0).clearHorizontal();
        }
        ConstraintReference constraintReference0 = null;
        ConstraintReference constraintReference1 = null;
        for(Object object1: this.mReferences) {
            ConstraintReference constraintReference2 = this.mState.constraints(object1);
            if(constraintReference1 == null) {
                Object object2 = this.mStartToStart;
                if(object2 == null) {
                    Object object3 = this.mStartToEnd;
                    if(object3 == null) {
                        Object object4 = this.mLeftToLeft;
                        if(object4 == null) {
                            Object object5 = this.mLeftToRight;
                            if(object5 == null) {
                                constraintReference2.startToStart(State.PARENT);
                            }
                            else {
                                constraintReference2.startToEnd(object5).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                            }
                        }
                        else {
                            constraintReference2.startToStart(object4).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                        }
                    }
                    else {
                        constraintReference2.startToEnd(object3).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                    }
                }
                else {
                    constraintReference2.startToStart(object2).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                }
                constraintReference1 = constraintReference2;
            }
            if(constraintReference0 != null) {
                constraintReference0.endToStart(constraintReference2.getKey());
                constraintReference2.startToEnd(constraintReference0.getKey());
            }
            constraintReference0 = constraintReference2;
        }
        if(constraintReference0 != null) {
            Object object6 = this.mEndToStart;
            if(object6 == null) {
                Object object7 = this.mEndToEnd;
                if(object7 == null) {
                    Object object8 = this.mRightToLeft;
                    if(object8 == null) {
                        Object object9 = this.mRightToRight;
                        if(object9 == null) {
                            constraintReference0.endToEnd(State.PARENT);
                        }
                        else {
                            constraintReference0.endToEnd(object9).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                        }
                    }
                    else {
                        constraintReference0.endToStart(object8).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                    }
                }
                else {
                    constraintReference0.endToEnd(object7).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
                }
            }
            else {
                constraintReference0.endToStart(object6).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            }
        }
        if(constraintReference1 == null) {
            return;
        }
        float f = this.mBias;
        if(f != 0.5f) {
            constraintReference1.horizontalBias(f);
        }
        switch(this.mStyle) {
            case 1: {
                constraintReference1.setHorizontalChainStyle(0);
                return;
            }
            case 2: {
                constraintReference1.setHorizontalChainStyle(1);
                return;
            }
            case 3: {
                constraintReference1.setHorizontalChainStyle(2);
            }
        }
    }
}

