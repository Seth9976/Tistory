package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collections;

public class HelperReference extends ConstraintReference implements Facade {
    public final Helper L;
    public HelperWidget M;
    protected ArrayList mReferences;
    protected final State mState;

    public HelperReference(State state0, Helper state$Helper0) {
        super(state0);
        this.mReferences = new ArrayList();
        this.mState = state0;
        this.L = state$Helper0;
    }

    public HelperReference add(Object[] arr_object) {
        Collections.addAll(this.mReferences, arr_object);
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.helpers.Facade
    public void apply() {
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.helpers.Facade
    public ConstraintWidget getConstraintWidget() {
        return this.getHelperWidget();
    }

    public HelperWidget getHelperWidget() {
        return this.M;
    }

    public Helper getType() {
        return this.L;
    }

    public void setHelperWidget(HelperWidget helperWidget0) {
        this.M = helperWidget0;
    }
}

