package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Chain;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class ChainReference extends HelperReference {
    protected float mBias;
    protected Chain mStyle;

    public ChainReference(State state0, Helper state$Helper0) {
        super(state0, state$Helper0);
        this.mBias = 0.5f;
        this.mStyle = Chain.SPREAD;
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference bias(float f) {
        return this.bias(f);
    }

    public ChainReference bias(float f) {
        this.mBias = f;
        return this;
    }

    public float getBias() {
        return this.mBias;
    }

    public Chain getStyle() {
        return Chain.SPREAD;
    }

    public ChainReference style(Chain state$Chain0) {
        this.mStyle = state$Chain0;
        return this;
    }
}

