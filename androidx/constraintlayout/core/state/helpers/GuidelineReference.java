package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

public class GuidelineReference implements Reference, Facade {
    public final State a;
    public int b;
    public Guideline c;
    public int d;
    public int e;
    public float f;
    public Object g;

    public GuidelineReference(State state0) {
        this.d = -1;
        this.e = -1;
        this.f = 0.0f;
        this.a = state0;
    }

    @Override  // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.c.setOrientation(this.b);
        int v = this.d;
        if(v != -1) {
            this.c.setGuideBegin(v);
            return;
        }
        int v1 = this.e;
        if(v1 != -1) {
            this.c.setGuideEnd(v1);
            return;
        }
        this.c.setGuidePercent(this.f);
    }

    public GuidelineReference end(Object object0) {
        this.d = -1;
        this.e = this.a.convertDimension(object0);
        this.f = 0.0f;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if(this.c == null) {
            this.c = new Guideline();
        }
        return this.c;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return null;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.g;
    }

    public int getOrientation() {
        return this.b;
    }

    public GuidelineReference percent(float f) {
        this.d = -1;
        this.e = -1;
        this.f = f;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget0) {
        if(constraintWidget0 instanceof Guideline) {
            this.c = (Guideline)constraintWidget0;
            return;
        }
        this.c = null;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void setKey(Object object0) {
        this.g = object0;
    }

    public void setOrientation(int v) {
        this.b = v;
    }

    public GuidelineReference start(Object object0) {
        this.d = this.a.convertDimension(object0);
        this.e = -1;
        this.f = 0.0f;
        return this;
    }
}

