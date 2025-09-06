package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

public class Guideline extends ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public ConstraintAnchor K;
    public int L;
    public boolean M;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNOWN = -1;
    public static final int VERTICAL = 1;
    protected boolean guidelineUseRtl;
    protected int mRelativeBegin;
    protected int mRelativeEnd;
    protected float mRelativePercent;

    public Guideline() {
        this.mRelativePercent = -1.0f;
        this.mRelativeBegin = -1;
        this.mRelativeEnd = -1;
        this.guidelineUseRtl = true;
        this.K = this.mTop;
        this.L = 0;
        this.mAnchors.clear();
        this.mAnchors.add(this.K);
        for(int v = 0; v < this.mListAnchors.length; ++v) {
            this.mListAnchors[v] = this.K;
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem0, boolean z) {
        ConstraintWidgetContainer constraintWidgetContainer0 = (ConstraintWidgetContainer)this.getParent();
        if(constraintWidgetContainer0 == null) {
            return;
        }
        ConstraintAnchor constraintAnchor0 = constraintWidgetContainer0.getAnchor(Type.LEFT);
        ConstraintAnchor constraintAnchor1 = constraintWidgetContainer0.getAnchor(Type.RIGHT);
        int v = 1;
        int v1 = this.mParent == null || this.mParent.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT ? 0 : 1;
        if(this.L == 0) {
            constraintAnchor0 = constraintWidgetContainer0.getAnchor(Type.TOP);
            constraintAnchor1 = constraintWidgetContainer0.getAnchor(Type.BOTTOM);
            if(this.mParent == null || this.mParent.mListDimensionBehaviors[1] != DimensionBehaviour.WRAP_CONTENT) {
                v = 0;
            }
            v1 = v;
        }
        if(this.M && this.K.hasFinalValue()) {
            SolverVariable solverVariable0 = linearSystem0.createObjectVariable(this.K);
            linearSystem0.addEquality(solverVariable0, this.K.getFinalValue());
            if(this.mRelativeBegin == -1) {
                if(this.mRelativeEnd != -1 && v1 != 0) {
                    SolverVariable solverVariable1 = linearSystem0.createObjectVariable(constraintAnchor1);
                    linearSystem0.addGreaterThan(solverVariable0, linearSystem0.createObjectVariable(constraintAnchor0), 0, 5);
                    linearSystem0.addGreaterThan(solverVariable1, solverVariable0, 0, 5);
                }
            }
            else if(v1 != 0) {
                linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(constraintAnchor1), solverVariable0, 0, 5);
            }
            this.M = false;
            return;
        }
        if(this.mRelativeBegin != -1) {
            SolverVariable solverVariable2 = linearSystem0.createObjectVariable(this.K);
            linearSystem0.addEquality(solverVariable2, linearSystem0.createObjectVariable(constraintAnchor0), this.mRelativeBegin, 8);
            if(v1 != 0) {
                linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(constraintAnchor1), solverVariable2, 0, 5);
            }
        }
        else if(this.mRelativeEnd != -1) {
            SolverVariable solverVariable3 = linearSystem0.createObjectVariable(this.K);
            SolverVariable solverVariable4 = linearSystem0.createObjectVariable(constraintAnchor1);
            linearSystem0.addEquality(solverVariable3, solverVariable4, -this.mRelativeEnd, 8);
            if(v1 != 0) {
                linearSystem0.addGreaterThan(solverVariable3, linearSystem0.createObjectVariable(constraintAnchor0), 0, 5);
                linearSystem0.addGreaterThan(solverVariable4, solverVariable3, 0, 5);
            }
        }
        else if(this.mRelativePercent != -1.0f) {
            linearSystem0.addConstraint(LinearSystem.createRowDimensionPercent(linearSystem0, linearSystem0.createObjectVariable(this.K), linearSystem0.createObjectVariable(constraintAnchor1), this.mRelativePercent));
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        super.copy(constraintWidget0, hashMap0);
        this.mRelativePercent = ((Guideline)constraintWidget0).mRelativePercent;
        this.mRelativeBegin = ((Guideline)constraintWidget0).mRelativeBegin;
        this.mRelativeEnd = ((Guideline)constraintWidget0).mRelativeEnd;
        this.guidelineUseRtl = ((Guideline)constraintWidget0).guidelineUseRtl;
        this.setOrientation(((Guideline)constraintWidget0).L);
    }

    public void cyclePosition() {
        if(this.mRelativeBegin != -1) {
            float f = ((float)this.getX()) / ((float)this.getParent().getWidth());
            if(this.L == 0) {
                f = ((float)this.getY()) / ((float)this.getParent().getHeight());
            }
            this.setGuidePercent(f);
            return;
        }
        if(this.mRelativePercent != -1.0f) {
            int v = this.getParent().getWidth() - this.getX();
            if(this.L == 0) {
                v = this.getParent().getHeight() - this.getY();
            }
            this.setGuideEnd(v);
            return;
        }
        if(this.mRelativeEnd != -1) {
            int v1 = this.getX();
            if(this.L == 0) {
                v1 = this.getY();
            }
            this.setGuideBegin(v1);
        }
    }

    public ConstraintAnchor getAnchor() {
        return this.K;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor getAnchor(Type constraintAnchor$Type0) {
        switch(d.a[constraintAnchor$Type0.ordinal()]) {
            case 1: 
            case 2: {
                return this.L == 1 ? this.K : null;
            }
            case 3: 
            case 4: {
                return this.L == 0 ? this.K : null;
            }
            default: {
                return null;
            }
        }
    }

    public int getOrientation() {
        return this.L;
    }

    public int getRelativeBegin() {
        return this.mRelativeBegin;
    }

    public int getRelativeBehaviour() {
        if(this.mRelativePercent != -1.0f) {
            return 0;
        }
        if(this.mRelativeBegin != -1) {
            return 1;
        }
        return this.mRelativeEnd == -1 ? -1 : 2;
    }

    public int getRelativeEnd() {
        return this.mRelativeEnd;
    }

    public float getRelativePercent() {
        return this.mRelativePercent;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String getType() {
        return "Guideline";
    }

    public boolean isPercent() {
        return this.mRelativePercent != -1.0f && this.mRelativeBegin == -1 && this.mRelativeEnd == -1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.M;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.M;
    }

    public void setFinalValue(int v) {
        this.K.setFinalValue(v);
        this.M = true;
    }

    public void setGuideBegin(int v) {
        if(v > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = v;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuideEnd(int v) {
        if(v > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = v;
        }
    }

    public void setGuidePercent(float f) {
        if(f > -1.0f) {
            this.mRelativePercent = f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuidePercent(int v) {
        this.setGuidePercent(((float)v) / 100.0f);
    }

    public void setMinimumPosition(int v) {
    }

    public void setOrientation(int v) {
        if(this.L == v) {
            return;
        }
        this.L = v;
        this.mAnchors.clear();
        this.K = this.L == 1 ? this.mLeft : this.mTop;
        this.mAnchors.add(this.K);
        for(int v1 = 0; v1 < this.mListAnchors.length; ++v1) {
            this.mListAnchors[v1] = this.K;
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromSolver(LinearSystem linearSystem0, boolean z) {
        if(this.getParent() == null) {
            return;
        }
        int v = linearSystem0.getObjectVariableValue(this.K);
        if(this.L == 1) {
            this.setX(v);
            this.setY(0);
            this.setHeight(this.getParent().getHeight());
            this.setWidth(0);
            return;
        }
        this.setX(0);
        this.setY(v);
        this.setWidth(this.getParent().getWidth());
        this.setHeight(0);
    }
}

