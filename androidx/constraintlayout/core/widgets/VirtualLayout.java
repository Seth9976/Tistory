package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import java.util.HashSet;

public class VirtualLayout extends HelperWidget {
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public Measurer T;
    protected Measure mMeasure;

    public VirtualLayout() {
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.mMeasure = new Measure();
        this.T = null;
    }

    public void applyRtl(boolean z) {
        int v = this.M;
        if(v > 0 || this.N > 0) {
            if(z) {
                this.O = this.N;
                this.P = v;
                return;
            }
            this.O = v;
            this.P = this.N;
        }
    }

    public void captureWidgets() {
        for(int v = 0; v < this.mWidgetsCount; ++v) {
            ConstraintWidget constraintWidget0 = this.mWidgets[v];
            if(constraintWidget0 != null) {
                constraintWidget0.setInVirtualLayout(true);
            }
        }
    }

    public boolean contains(HashSet hashSet0) {
        for(int v = 0; v < this.mWidgetsCount; ++v) {
            if(hashSet0.contains(this.mWidgets[v])) {
                return true;
            }
        }
        return false;
    }

    public int getMeasuredHeight() {
        return this.S;
    }

    public int getMeasuredWidth() {
        return this.R;
    }

    public int getPaddingBottom() {
        return this.L;
    }

    public int getPaddingLeft() {
        return this.O;
    }

    public int getPaddingRight() {
        return this.P;
    }

    public int getPaddingTop() {
        return this.K;
    }

    public void measure(int v, int v1, int v2, int v3) {
    }

    public void measure(ConstraintWidget constraintWidget0, DimensionBehaviour constraintWidget$DimensionBehaviour0, int v, DimensionBehaviour constraintWidget$DimensionBehaviour1, int v1) {
        while(this.T == null && this.getParent() != null) {
            this.T = ((ConstraintWidgetContainer)this.getParent()).getMeasurer();
        }
        this.mMeasure.horizontalBehavior = constraintWidget$DimensionBehaviour0;
        this.mMeasure.verticalBehavior = constraintWidget$DimensionBehaviour1;
        this.mMeasure.horizontalDimension = v;
        this.mMeasure.verticalDimension = v1;
        this.T.measure(constraintWidget0, this.mMeasure);
        constraintWidget0.setWidth(this.mMeasure.measuredWidth);
        constraintWidget0.setHeight(this.mMeasure.measuredHeight);
        constraintWidget0.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget0.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    public boolean measureChildren() {
        Measurer basicMeasure$Measurer0 = this.mParent == null ? null : ((ConstraintWidgetContainer)this.mParent).getMeasurer();
        if(basicMeasure$Measurer0 == null) {
            return false;
        }
        for(int v = 0; v < this.mWidgetsCount; ++v) {
            ConstraintWidget constraintWidget0 = this.mWidgets[v];
            if(constraintWidget0 != null && !(constraintWidget0 instanceof Guideline)) {
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.getDimensionBehaviour(0);
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidget0.getDimensionBehaviour(1);
                DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
                if(constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour2 || constraintWidget0.mMatchConstraintDefaultWidth == 1 || constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour2 || constraintWidget0.mMatchConstraintDefaultHeight == 1) {
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget$DimensionBehaviour0 = DimensionBehaviour.WRAP_CONTENT;
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget$DimensionBehaviour1 = DimensionBehaviour.WRAP_CONTENT;
                    }
                    this.mMeasure.horizontalBehavior = constraintWidget$DimensionBehaviour0;
                    this.mMeasure.verticalBehavior = constraintWidget$DimensionBehaviour1;
                    this.mMeasure.horizontalDimension = constraintWidget0.getWidth();
                    this.mMeasure.verticalDimension = constraintWidget0.getHeight();
                    basicMeasure$Measurer0.measure(constraintWidget0, this.mMeasure);
                    constraintWidget0.setWidth(this.mMeasure.measuredWidth);
                    constraintWidget0.setHeight(this.mMeasure.measuredHeight);
                    constraintWidget0.setBaselineDistance(this.mMeasure.measuredBaseline);
                }
            }
        }
        return true;
    }

    public boolean needSolverPass() {
        return this.Q;
    }

    public void needsCallbackFromSolver(boolean z) {
        this.Q = z;
    }

    public void setMeasure(int v, int v1) {
        this.R = v;
        this.S = v1;
    }

    public void setPadding(int v) {
        this.K = v;
        this.L = v;
        this.M = v;
        this.N = v;
    }

    public void setPaddingBottom(int v) {
        this.L = v;
    }

    public void setPaddingEnd(int v) {
        this.N = v;
    }

    public void setPaddingLeft(int v) {
        this.O = v;
    }

    public void setPaddingRight(int v) {
        this.P = v;
    }

    public void setPaddingStart(int v) {
        this.M = v;
        this.O = v;
        this.P = v;
    }

    public void setPaddingTop(int v) {
        this.K = v;
    }

    @Override  // androidx.constraintlayout.core.widgets.HelperWidget
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer0) {
        this.captureWidgets();
    }
}

