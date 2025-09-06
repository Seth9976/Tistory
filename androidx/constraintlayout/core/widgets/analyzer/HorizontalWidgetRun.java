package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import java.util.ArrayList;

public class HorizontalWidgetRun extends WidgetRun {
    public static final int[] e;

    static {
        HorizontalWidgetRun.e = new int[2];
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget0) {
        super(constraintWidget0);
        this.start.b = 4;
        this.end.b = 5;
        this.orientation = 0;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        ConstraintWidget constraintWidget0 = this.a;
        b b0 = this.c;
        if(constraintWidget0.measured) {
            b0.resolve(constraintWidget0.getWidth());
        }
        if(b0.resolved) {
            DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.MATCH_PARENT;
            if(this.dimensionBehavior == constraintWidget$DimensionBehaviour2) {
                ConstraintWidget constraintWidget2 = this.a.getParent();
                if(constraintWidget2 != null && (constraintWidget2.getHorizontalDimensionBehaviour() == DimensionBehaviour.FIXED || constraintWidget2.getHorizontalDimensionBehaviour() == constraintWidget$DimensionBehaviour2)) {
                    this.addTarget(this.start, constraintWidget2.horizontalRun.start, this.a.mLeft.getMargin());
                    this.addTarget(this.end, constraintWidget2.horizontalRun.end, -this.a.mRight.getMargin());
                    return;
                }
            }
        }
        else {
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = this.a.getHorizontalDimensionBehaviour();
            this.dimensionBehavior = constraintWidget$DimensionBehaviour0;
            if(constraintWidget$DimensionBehaviour0 != DimensionBehaviour.MATCH_CONSTRAINT) {
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.MATCH_PARENT;
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1) {
                    ConstraintWidget constraintWidget1 = this.a.getParent();
                    if(constraintWidget1 != null && (constraintWidget1.getHorizontalDimensionBehaviour() == DimensionBehaviour.FIXED || constraintWidget1.getHorizontalDimensionBehaviour() == constraintWidget$DimensionBehaviour1)) {
                        int v = constraintWidget1.getWidth();
                        int v1 = this.a.mLeft.getMargin();
                        int v2 = this.a.mRight.getMargin();
                        this.addTarget(this.start, constraintWidget1.horizontalRun.start, this.a.mLeft.getMargin());
                        this.addTarget(this.end, constraintWidget1.horizontalRun.end, -this.a.mRight.getMargin());
                        b0.resolve(v - v1 - v2);
                        return;
                    }
                }
                if(this.dimensionBehavior == DimensionBehaviour.FIXED) {
                    b0.resolve(this.a.getWidth());
                }
            }
        }
        if(b0.resolved) {
            ConstraintWidget constraintWidget3 = this.a;
            if(constraintWidget3.measured) {
                ConstraintAnchor[] arr_constraintAnchor = constraintWidget3.mListAnchors;
                ConstraintAnchor constraintAnchor0 = arr_constraintAnchor[0];
                ConstraintAnchor constraintAnchor1 = constraintAnchor0.mTarget;
                if(constraintAnchor1 != null && arr_constraintAnchor[1].mTarget != null) {
                    if(constraintWidget3.isInHorizontalChain()) {
                        this.start.c = this.a.mListAnchors[0].getMargin();
                        this.end.c = -this.a.mListAnchors[1].getMargin();
                        return;
                    }
                    DependencyNode dependencyNode0 = this.getTarget(this.a.mListAnchors[0]);
                    if(dependencyNode0 != null) {
                        this.addTarget(this.start, dependencyNode0, this.a.mListAnchors[0].getMargin());
                    }
                    DependencyNode dependencyNode1 = this.getTarget(this.a.mListAnchors[1]);
                    if(dependencyNode1 != null) {
                        this.addTarget(this.end, dependencyNode1, -this.a.mListAnchors[1].getMargin());
                    }
                    this.start.delegateToWidgetRun = true;
                    this.end.delegateToWidgetRun = true;
                    return;
                }
                if(constraintAnchor1 == null) {
                    ConstraintAnchor constraintAnchor2 = arr_constraintAnchor[1];
                    if(constraintAnchor2.mTarget != null) {
                        DependencyNode dependencyNode3 = this.getTarget(constraintAnchor2);
                        if(dependencyNode3 != null) {
                            this.addTarget(this.end, dependencyNode3, -this.a.mListAnchors[1].getMargin());
                            this.addTarget(this.start, this.end, -b0.value);
                        }
                    }
                    else if(!(constraintWidget3 instanceof Helper) && constraintWidget3.getParent() != null && this.a.getAnchor(Type.CENTER).mTarget == null) {
                        this.addTarget(this.start, this.a.getParent().horizontalRun.start, this.a.getX());
                        this.addTarget(this.end, this.start, b0.value);
                    }
                }
                else {
                    DependencyNode dependencyNode2 = this.getTarget(constraintAnchor0);
                    if(dependencyNode2 != null) {
                        this.addTarget(this.start, dependencyNode2, this.a.mListAnchors[0].getMargin());
                        this.addTarget(this.end, this.start, b0.value);
                    }
                }
            }
            else {
                goto label_66;
            }
        }
        else {
        label_66:
            if(this.dimensionBehavior == DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget constraintWidget4 = this.a;
                switch(constraintWidget4.mMatchConstraintDefaultWidth) {
                    case 2: {
                        ConstraintWidget constraintWidget5 = constraintWidget4.getParent();
                        if(constraintWidget5 != null) {
                            b b1 = constraintWidget5.verticalRun.c;
                            b0.g.add(b1);
                            b1.f.add(b0);
                            b0.delegateToWidgetRun = true;
                            b0.f.add(this.start);
                            b0.f.add(this.end);
                        }
                        break;
                    }
                    case 3: {
                        if(constraintWidget4.mMatchConstraintDefaultHeight == 3) {
                            this.start.updateDelegate = this;
                            this.end.updateDelegate = this;
                            constraintWidget4.verticalRun.start.updateDelegate = this;
                            constraintWidget4.verticalRun.end.updateDelegate = this;
                            b0.updateDelegate = this;
                            if(constraintWidget4.isInVerticalChain()) {
                                b0.g.add(this.a.verticalRun.c);
                                this.a.verticalRun.c.f.add(b0);
                                this.a.verticalRun.c.updateDelegate = this;
                                b0.g.add(this.a.verticalRun.start);
                                b0.g.add(this.a.verticalRun.end);
                                this.a.verticalRun.start.f.add(b0);
                                this.a.verticalRun.end.f.add(b0);
                            }
                            else if(this.a.isInHorizontalChain()) {
                                this.a.verticalRun.c.g.add(b0);
                                b0.f.add(this.a.verticalRun.c);
                            }
                            else {
                                this.a.verticalRun.c.g.add(b0);
                            }
                        }
                        else {
                            b b2 = constraintWidget4.verticalRun.c;
                            b0.g.add(b2);
                            b2.f.add(b0);
                            this.a.verticalRun.start.f.add(b0);
                            this.a.verticalRun.end.f.add(b0);
                            b0.delegateToWidgetRun = true;
                            b0.f.add(this.start);
                            b0.f.add(this.end);
                            this.start.g.add(b0);
                            this.end.g.add(b0);
                        }
                    }
                }
            }
            ConstraintWidget constraintWidget6 = this.a;
            ConstraintAnchor[] arr_constraintAnchor1 = constraintWidget6.mListAnchors;
            ConstraintAnchor constraintAnchor3 = arr_constraintAnchor1[0];
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
            if(constraintAnchor4 != null && arr_constraintAnchor1[1].mTarget != null) {
                if(constraintWidget6.isInHorizontalChain()) {
                    this.start.c = this.a.mListAnchors[0].getMargin();
                    this.end.c = -this.a.mListAnchors[1].getMargin();
                    return;
                }
                DependencyNode dependencyNode4 = this.getTarget(this.a.mListAnchors[0]);
                DependencyNode dependencyNode5 = this.getTarget(this.a.mListAnchors[1]);
                if(dependencyNode4 != null) {
                    dependencyNode4.addDependency(this);
                }
                if(dependencyNode5 != null) {
                    dependencyNode5.addDependency(this);
                }
                this.mRunType = h.b;
                return;
            }
            if(constraintAnchor4 == null) {
                ConstraintAnchor constraintAnchor5 = arr_constraintAnchor1[1];
                if(constraintAnchor5.mTarget != null) {
                    DependencyNode dependencyNode7 = this.getTarget(constraintAnchor5);
                    if(dependencyNode7 != null) {
                        this.addTarget(this.end, dependencyNode7, -this.a.mListAnchors[1].getMargin());
                        this.addTarget(this.start, this.end, -1, b0);
                    }
                }
                else if(!(constraintWidget6 instanceof Helper) && constraintWidget6.getParent() != null) {
                    this.addTarget(this.start, this.a.getParent().horizontalRun.start, this.a.getX());
                    this.addTarget(this.end, this.start, 1, b0);
                }
            }
            else {
                DependencyNode dependencyNode6 = this.getTarget(constraintAnchor3);
                if(dependencyNode6 != null) {
                    this.addTarget(this.start, dependencyNode6, this.a.mListAnchors[0].getMargin());
                    this.addTarget(this.end, this.start, 1, b0);
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode0 = this.start;
        if(dependencyNode0.resolved) {
            this.a.setX(dependencyNode0.value);
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
        this.b = null;
        this.start.clear();
        this.end.clear();
        this.c.clear();
        this.d = false;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean c() {
        return this.dimensionBehavior != DimensionBehaviour.MATCH_CONSTRAINT || this.a.mMatchConstraintDefaultWidth == 0;
    }

    public static void d(int[] arr_v, int v, int v1, int v2, int v3, float f, int v4) {
        int v5 = v1 - v;
        int v6 = v3 - v2;
        switch(v4) {
            case -1: {
                int v7 = (int)(((float)v6) * f + 0.5f);
                int v8 = (int)(((float)v5) / f + 0.5f);
                if(v7 <= v5) {
                    arr_v[0] = v7;
                    arr_v[1] = v6;
                    return;
                }
                if(v8 <= v6) {
                    arr_v[0] = v5;
                    arr_v[1] = v8;
                }
                return;
            }
            case 0: {
                arr_v[0] = (int)(((float)v6) * f + 0.5f);
                arr_v[1] = v6;
                return;
            }
            case 1: {
                arr_v[0] = v5;
                arr_v[1] = (int)(((float)v5) * f + 0.5f);
            }
        }
    }

    public final void e() {
        this.d = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.c.resolved = false;
    }

    @Override
    public String toString() {
        return "HorizontalRun " + this.a.getDebugName();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void update(Dependency dependency0) {
        int v;
        if(this.mRunType.ordinal() == 3) {
            this.updateRunCenter(dependency0, this.a.mLeft, this.a.mRight, 0);
            return;
        }
        b b0 = this.c;
        if(!b0.resolved && this.dimensionBehavior == DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget0 = this.a;
            switch(constraintWidget0.mMatchConstraintDefaultWidth) {
                case 2: {
                    ConstraintWidget constraintWidget1 = constraintWidget0.getParent();
                    if(constraintWidget1 != null) {
                        b b1 = constraintWidget1.horizontalRun.c;
                        if(b1.resolved) {
                            b0.resolve(((int)(((float)b1.value) * this.a.mMatchConstraintPercentWidth + 0.5f)));
                        }
                    }
                    break;
                }
                case 3: {
                    if(constraintWidget0.mMatchConstraintDefaultHeight == 0 || constraintWidget0.mMatchConstraintDefaultHeight == 3) {
                        DependencyNode dependencyNode0 = constraintWidget0.verticalRun.start;
                        DependencyNode dependencyNode1 = constraintWidget0.verticalRun.end;
                        boolean z = constraintWidget0.mLeft.mTarget != null;
                        boolean z1 = constraintWidget0.mTop.mTarget != null;
                        boolean z2 = constraintWidget0.mRight.mTarget != null;
                        boolean z3 = constraintWidget0.mBottom.mTarget != null;
                        int v1 = constraintWidget0.getDimensionRatioSide();
                        if(z && z1 && z2 && z3) {
                            float f = this.a.getDimensionRatio();
                            int[] arr_v = HorizontalWidgetRun.e;
                            if(dependencyNode0.resolved && dependencyNode1.resolved) {
                                DependencyNode dependencyNode2 = this.start;
                                if(dependencyNode2.readyToSolve && this.end.readyToSolve) {
                                    HorizontalWidgetRun.d(arr_v, ((DependencyNode)dependencyNode2.g.get(0)).value + this.start.c, ((DependencyNode)this.end.g.get(0)).value - this.end.c, dependencyNode0.value + dependencyNode0.c, dependencyNode1.value - dependencyNode1.c, f, v1);
                                    b0.resolve(arr_v[0]);
                                    this.a.verticalRun.c.resolve(arr_v[1]);
                                }
                                return;
                            }
                            DependencyNode dependencyNode3 = this.start;
                            ArrayList arrayList0 = dependencyNode0.g;
                            if(dependencyNode3.resolved) {
                                DependencyNode dependencyNode4 = this.end;
                                if(dependencyNode4.resolved) {
                                    if(dependencyNode0.readyToSolve && dependencyNode1.readyToSolve) {
                                        HorizontalWidgetRun.d(arr_v, dependencyNode3.value + dependencyNode3.c, dependencyNode4.value - dependencyNode4.c, ((DependencyNode)arrayList0.get(0)).value + dependencyNode0.c, ((DependencyNode)dependencyNode1.g.get(0)).value - dependencyNode1.c, f, v1);
                                        b0.resolve(arr_v[0]);
                                        this.a.verticalRun.c.resolve(arr_v[1]);
                                        goto label_53;
                                    }
                                    return;
                                }
                            }
                        label_53:
                            DependencyNode dependencyNode5 = this.start;
                            if(dependencyNode5.readyToSolve && this.end.readyToSolve && dependencyNode0.readyToSolve && dependencyNode1.readyToSolve) {
                                HorizontalWidgetRun.d(arr_v, ((DependencyNode)dependencyNode5.g.get(0)).value + this.start.c, ((DependencyNode)this.end.g.get(0)).value - this.end.c, ((DependencyNode)arrayList0.get(0)).value + dependencyNode0.c, ((DependencyNode)dependencyNode1.g.get(0)).value - dependencyNode1.c, f, v1);
                                b0.resolve(arr_v[0]);
                                this.a.verticalRun.c.resolve(arr_v[1]);
                                break;
                            }
                            return;
                        }
                        else if(z && z2) {
                            if(!this.start.readyToSolve || !this.end.readyToSolve) {
                                return;
                            }
                            float f1 = this.a.getDimensionRatio();
                            int v2 = ((DependencyNode)this.start.g.get(0)).value + this.start.c;
                            int v3 = ((DependencyNode)this.end.g.get(0)).value - this.end.c;
                            switch(v1) {
                                case -1: 
                                case 0: {
                                    int v4 = this.getLimitedDimension(v3 - v2, 0);
                                    int v5 = (int)(((float)v4) * f1 + 0.5f);
                                    int v6 = this.getLimitedDimension(v5, 1);
                                    if(v5 != v6) {
                                        v4 = (int)(((float)v6) / f1 + 0.5f);
                                    }
                                    b0.resolve(v4);
                                    this.a.verticalRun.c.resolve(v6);
                                    break;
                                }
                                case 1: {
                                    int v7 = this.getLimitedDimension(v3 - v2, 0);
                                    int v8 = (int)(((float)v7) / f1 + 0.5f);
                                    int v9 = this.getLimitedDimension(v8, 1);
                                    if(v8 != v9) {
                                        v7 = (int)(((float)v9) * f1 + 0.5f);
                                    }
                                    b0.resolve(v7);
                                    this.a.verticalRun.c.resolve(v9);
                                    break;
                                }
                            }
                        }
                        else if(z1 && z3) {
                            if(!dependencyNode0.readyToSolve || !dependencyNode1.readyToSolve) {
                                return;
                            }
                            float f2 = this.a.getDimensionRatio();
                            int v10 = ((DependencyNode)dependencyNode0.g.get(0)).value + dependencyNode0.c;
                            int v11 = ((DependencyNode)dependencyNode1.g.get(0)).value - dependencyNode1.c;
                            switch(v1) {
                                case 0: {
                                    int v15 = this.getLimitedDimension(v11 - v10, 1);
                                    int v16 = (int)(((float)v15) * f2 + 0.5f);
                                    int v17 = this.getLimitedDimension(v16, 0);
                                    if(v16 != v17) {
                                        v15 = (int)(((float)v17) / f2 + 0.5f);
                                    }
                                    b0.resolve(v17);
                                    this.a.verticalRun.c.resolve(v15);
                                    break;
                                }
                                case -1: 
                                case 1: {
                                    int v12 = this.getLimitedDimension(v11 - v10, 1);
                                    int v13 = (int)(((float)v12) / f2 + 0.5f);
                                    int v14 = this.getLimitedDimension(v13, 0);
                                    if(v13 != v14) {
                                        v12 = (int)(((float)v14) * f2 + 0.5f);
                                    }
                                    b0.resolve(v14);
                                    this.a.verticalRun.c.resolve(v12);
                                }
                            }
                        }
                    }
                    else {
                        switch(constraintWidget0.getDimensionRatioSide()) {
                            case -1: {
                                v = (int)(this.a.getDimensionRatio() * ((float)this.a.verticalRun.c.value) + 0.5f);
                                break;
                            }
                            case 0: {
                                v = (int)(((float)this.a.verticalRun.c.value) / this.a.getDimensionRatio() + 0.5f);
                                break;
                            }
                            case 1: {
                                v = (int)(this.a.getDimensionRatio() * ((float)this.a.verticalRun.c.value) + 0.5f);
                                break;
                            }
                            default: {
                                v = 0;
                            }
                        }
                        b0.resolve(v);
                    }
                }
            }
        }
        if(!this.start.readyToSolve || (!this.end.readyToSolve || this.start.resolved && this.end.resolved && b0.resolved)) {
            return;
        }
        if(!b0.resolved && this.dimensionBehavior == DimensionBehaviour.MATCH_CONSTRAINT && (this.a.mMatchConstraintDefaultWidth == 0 && !this.a.isInHorizontalChain())) {
            DependencyNode dependencyNode6 = (DependencyNode)this.start.g.get(0);
            DependencyNode dependencyNode7 = (DependencyNode)this.end.g.get(0);
            int v18 = dependencyNode6.value + this.start.c;
            int v19 = dependencyNode7.value + this.end.c;
            this.start.resolve(v18);
            this.end.resolve(v19);
            b0.resolve(v19 - v18);
            return;
        }
        if(!b0.resolved && this.dimensionBehavior == DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.g.size() > 0 && this.end.g.size() > 0) {
            DependencyNode dependencyNode8 = (DependencyNode)this.start.g.get(0);
            int v20 = Math.min(((DependencyNode)this.end.g.get(0)).value + this.end.c - (dependencyNode8.value + this.start.c), b0.h);
            int v21 = this.a.mMatchConstraintMaxWidth;
            b0.resolve((v21 <= 0 ? Math.max(this.a.mMatchConstraintMinWidth, v20) : Math.min(v21, Math.max(this.a.mMatchConstraintMinWidth, v20))));
        }
        if(!b0.resolved) {
            return;
        }
        DependencyNode dependencyNode9 = (DependencyNode)this.start.g.get(0);
        DependencyNode dependencyNode10 = (DependencyNode)this.end.g.get(0);
        int v22 = dependencyNode9.value + this.start.c;
        int v23 = dependencyNode10.value + this.end.c;
        float f3 = this.a.getHorizontalBiasPercent();
        if(dependencyNode9 == dependencyNode10) {
            v22 = dependencyNode9.value;
            v23 = dependencyNode10.value;
            f3 = 0.5f;
        }
        this.start.resolve(((int)(((float)(v23 - v22 - b0.value)) * f3 + (((float)v22) + 0.5f))));
        this.end.resolve(this.start.value + b0.value);
    }
}

