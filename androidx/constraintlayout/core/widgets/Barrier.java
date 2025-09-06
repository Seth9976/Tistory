package androidx.constraintlayout.core.widgets;

import a5.b;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public int K;
    public boolean L;
    public static final int LEFT = 0;
    public int M;
    public boolean N;
    public static final int RIGHT = 1;
    public static final int TOP = 2;

    public Barrier() {
        this.K = 0;
        this.L = true;
        this.M = 0;
        this.N = false;
    }

    public Barrier(String s) {
        this.K = 0;
        this.L = true;
        this.M = 0;
        this.N = false;
        this.setDebugName(s);
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem0, boolean z) {
        boolean z1;
        ConstraintAnchor[] arr_constraintAnchor1;
        ConstraintAnchor[] arr_constraintAnchor = this.mListAnchors;
        arr_constraintAnchor[0] = this.mLeft;
        arr_constraintAnchor[2] = this.mTop;
        arr_constraintAnchor[1] = this.mRight;
        arr_constraintAnchor[3] = this.mBottom;
        for(int v = 0; true; ++v) {
            arr_constraintAnchor1 = this.mListAnchors;
            if(v >= arr_constraintAnchor1.length) {
                break;
            }
            ConstraintAnchor constraintAnchor0 = arr_constraintAnchor1[v];
            constraintAnchor0.e = linearSystem0.createObjectVariable(constraintAnchor0);
        }
        int v1 = this.K;
        if(v1 >= 0 && v1 < 4) {
            ConstraintAnchor constraintAnchor1 = arr_constraintAnchor1[v1];
            if(!this.N) {
                this.allSolved();
            }
            if(this.N) {
                this.N = false;
                int v2 = this.K;
                if(v2 == 0 || v2 == 1) {
                    linearSystem0.addEquality(this.mLeft.e, this.mX);
                    linearSystem0.addEquality(this.mRight.e, this.mX);
                }
                else if(v2 == 2 || v2 == 3) {
                    linearSystem0.addEquality(this.mTop.e, this.mY);
                    linearSystem0.addEquality(this.mBottom.e, this.mY);
                    return;
                }
                return;
            }
            for(int v3 = 0; true; ++v3) {
                z1 = false;
                if(v3 >= this.mWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget0 = this.mWidgets[v3];
                if((this.L || constraintWidget0.allowedInBarrier()) && ((this.K == 0 || this.K == 1) && constraintWidget0.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mLeft.mTarget != null && constraintWidget0.mRight.mTarget != null || (this.K == 2 || this.K == 3) && constraintWidget0.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mTop.mTarget != null && constraintWidget0.mBottom.mTarget != null)) {
                    z1 = true;
                    break;
                }
            }
            boolean z2 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
            boolean z3 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
            int v4 = z1 || (this.K != 0 || !z2) && (this.K != 2 || !z3) && (this.K != 1 || !z2) && (this.K != 3 || !z3) ? 4 : 5;
            for(int v5 = 0; v5 < this.mWidgetsCount; ++v5) {
                ConstraintWidget constraintWidget1 = this.mWidgets[v5];
                if(this.L || constraintWidget1.allowedInBarrier()) {
                    SolverVariable solverVariable0 = linearSystem0.createObjectVariable(constraintWidget1.mListAnchors[this.K]);
                    int v6 = this.K;
                    ConstraintAnchor constraintAnchor2 = constraintWidget1.mListAnchors[v6];
                    constraintAnchor2.e = solverVariable0;
                    int v7 = constraintAnchor2.mTarget == null || constraintAnchor2.mTarget.mOwner != this ? 0 : constraintAnchor2.mMargin;
                    if(v6 == 0 || v6 == 2) {
                        linearSystem0.addLowerBarrier(constraintAnchor1.e, solverVariable0, this.M - v7, z1);
                    }
                    else {
                        linearSystem0.addGreaterBarrier(constraintAnchor1.e, solverVariable0, this.M + v7, z1);
                    }
                    linearSystem0.addEquality(constraintAnchor1.e, solverVariable0, this.M + v7, v4);
                }
            }
            int v8 = this.K;
            if(v8 == 0) {
                linearSystem0.addEquality(this.mRight.e, this.mLeft.e, 0, 8);
                linearSystem0.addEquality(this.mLeft.e, this.mParent.mRight.e, 0, 4);
                linearSystem0.addEquality(this.mLeft.e, this.mParent.mLeft.e, 0, 0);
                return;
            }
            if(v8 == 1) {
                linearSystem0.addEquality(this.mLeft.e, this.mRight.e, 0, 8);
                linearSystem0.addEquality(this.mLeft.e, this.mParent.mLeft.e, 0, 4);
                linearSystem0.addEquality(this.mLeft.e, this.mParent.mRight.e, 0, 0);
                return;
            }
            if(v8 == 2) {
                linearSystem0.addEquality(this.mBottom.e, this.mTop.e, 0, 8);
                linearSystem0.addEquality(this.mTop.e, this.mParent.mBottom.e, 0, 4);
                linearSystem0.addEquality(this.mTop.e, this.mParent.mTop.e, 0, 0);
                return;
            }
            if(v8 == 3) {
                linearSystem0.addEquality(this.mTop.e, this.mBottom.e, 0, 8);
                linearSystem0.addEquality(this.mTop.e, this.mParent.mTop.e, 0, 4);
                linearSystem0.addEquality(this.mTop.e, this.mParent.mBottom.e, 0, 0);
            }
        }
    }

    public boolean allSolved() {
        boolean z = true;
        for(int v1 = 0; true; ++v1) {
            int v2 = this.mWidgetsCount;
            if(v1 >= v2) {
                break;
            }
            ConstraintWidget constraintWidget0 = this.mWidgets[v1];
            if(this.L || constraintWidget0.allowedInBarrier()) {
                if((this.K == 0 || this.K == 1) && !constraintWidget0.isResolvedHorizontally()) {
                    z = false;
                }
                else if((this.K == 2 || this.K == 3) && !constraintWidget0.isResolvedVertically()) {
                    z = false;
                }
            }
        }
        if(z && v2 > 0) {
            int v3 = 0;
            boolean z1 = false;
            for(int v = 0; v < this.mWidgetsCount; ++v) {
                ConstraintWidget constraintWidget1 = this.mWidgets[v];
                if(this.L || constraintWidget1.allowedInBarrier()) {
                    if(!z1) {
                        int v4 = this.K;
                        if(v4 == 0) {
                            v3 = constraintWidget1.getAnchor(Type.LEFT).getFinalValue();
                        }
                        else if(v4 == 1) {
                            v3 = constraintWidget1.getAnchor(Type.RIGHT).getFinalValue();
                        }
                        else if(v4 == 2) {
                            v3 = constraintWidget1.getAnchor(Type.TOP).getFinalValue();
                        }
                        else if(v4 == 3) {
                            v3 = constraintWidget1.getAnchor(Type.BOTTOM).getFinalValue();
                        }
                        z1 = true;
                    }
                    int v5 = this.K;
                    if(v5 == 0) {
                        v3 = Math.min(v3, constraintWidget1.getAnchor(Type.LEFT).getFinalValue());
                    }
                    else if(v5 == 1) {
                        v3 = Math.max(v3, constraintWidget1.getAnchor(Type.RIGHT).getFinalValue());
                    }
                    else if(v5 == 2) {
                        v3 = Math.min(v3, constraintWidget1.getAnchor(Type.TOP).getFinalValue());
                    }
                    else if(v5 == 3) {
                        v3 = Math.max(v3, constraintWidget1.getAnchor(Type.BOTTOM).getFinalValue());
                    }
                }
            }
            int v6 = v3 + this.M;
            if(this.K == 0 || this.K == 1) {
                this.setFinalHorizontal(v6, v6);
            }
            else {
                this.setFinalVertical(v6, v6);
            }
            this.N = true;
            return true;
        }
        return false;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.L;
    }

    @Override  // androidx.constraintlayout.core.widgets.HelperWidget
    public void copy(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        super.copy(constraintWidget0, hashMap0);
        this.K = ((Barrier)constraintWidget0).K;
        this.L = ((Barrier)constraintWidget0).L;
        this.M = ((Barrier)constraintWidget0).M;
    }

    public boolean getAllowsGoneWidget() {
        return this.L;
    }

    public int getBarrierType() {
        return this.K;
    }

    public int getMargin() {
        return this.M;
    }

    public int getOrientation() {
        switch(this.K) {
            case 0: 
            case 1: {
                return 0;
            }
            case 2: 
            case 3: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.N;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.N;
    }

    public void markWidgets() {
        for(int v = 0; v < this.mWidgetsCount; ++v) {
            ConstraintWidget constraintWidget0 = this.mWidgets[v];
            if(this.L || constraintWidget0.allowedInBarrier()) {
                int v1 = this.K;
                if(v1 == 0 || v1 == 1) {
                    constraintWidget0.setInBarrier(0, true);
                }
                else if(v1 == 2 || v1 == 3) {
                    constraintWidget0.setInBarrier(1, true);
                }
            }
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.L = z;
    }

    public void setBarrierType(int v) {
        this.K = v;
    }

    public void setMargin(int v) {
        this.M = v;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String s = "[Barrier] " + this.getDebugName() + " {";
        for(int v = 0; v < this.mWidgetsCount; ++v) {
            ConstraintWidget constraintWidget0 = this.mWidgets[v];
            if(v > 0) {
                s = s + ", ";
            }
            StringBuilder stringBuilder0 = b.t(s);
            stringBuilder0.append(constraintWidget0.getDebugName());
            s = stringBuilder0.toString();
        }
        return s + "}";
    }
}

