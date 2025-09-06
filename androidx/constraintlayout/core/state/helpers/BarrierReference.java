package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Direction;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

public class BarrierReference extends HelperReference {
    public Direction N;
    public int O;
    public Barrier P;

    public BarrierReference(State state0) {
        super(state0, Helper.BARRIER);
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        this.getHelperWidget();
        int v = 3;
        switch(a.a[this.N.ordinal()]) {
            case 3: 
            case 4: {
                v = 1;
                break;
            }
            case 5: {
                v = 2;
                break;
            }
            case 6: {
                break;
            }
            default: {
                v = 0;
            }
        }
        this.P.setBarrierType(v);
        this.P.setMargin(this.O);
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        if(this.P == null) {
            this.P = new Barrier();
        }
        return this.P;
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(int v) {
        this.O = v;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(Object object0) {
        this.margin(this.mState.convertDimension(object0));
        return this;
    }

    public void setBarrierDirection(Direction state$Direction0) {
        this.N = state$Direction0;
    }
}

