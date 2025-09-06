package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;

public class VerticalWidgetRun extends WidgetRun {
    public DependencyNode baseline;
    public a e;

    public VerticalWidgetRun(ConstraintWidget constraintWidget0) {
        super(constraintWidget0);
        DependencyNode dependencyNode0 = new DependencyNode(this);
        this.baseline = dependencyNode0;
        this.e = null;
        this.start.b = 6;
        this.end.b = 7;
        dependencyNode0.b = 8;
        this.orientation = 1;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        ConstraintWidget constraintWidget0 = this.a;
        b b0 = this.c;
        if(constraintWidget0.measured) {
            b0.resolve(constraintWidget0.getHeight());
        }
        if(!b0.resolved) {
            this.dimensionBehavior = this.a.getVerticalDimensionBehaviour();
            if(this.a.hasBaseline()) {
                this.e = new a(this);  // 初始化器: Landroidx/constraintlayout/core/widgets/analyzer/b;-><init>(Landroidx/constraintlayout/core/widgets/analyzer/WidgetRun;)V
            }
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = this.dimensionBehavior;
            if(constraintWidget$DimensionBehaviour0 != DimensionBehaviour.MATCH_CONSTRAINT) {
                if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_PARENT) {
                    ConstraintWidget constraintWidget1 = this.a.getParent();
                    if(constraintWidget1 != null && constraintWidget1.getVerticalDimensionBehaviour() == DimensionBehaviour.FIXED) {
                        int v = constraintWidget1.getHeight();
                        int v1 = this.a.mTop.getMargin();
                        int v2 = this.a.mBottom.getMargin();
                        this.addTarget(this.start, constraintWidget1.verticalRun.start, this.a.mTop.getMargin());
                        this.addTarget(this.end, constraintWidget1.verticalRun.end, -this.a.mBottom.getMargin());
                        b0.resolve(v - v1 - v2);
                        return;
                    }
                }
                if(this.dimensionBehavior == DimensionBehaviour.FIXED) {
                    b0.resolve(this.a.getHeight());
                }
            }
        }
        else if(this.dimensionBehavior == DimensionBehaviour.MATCH_PARENT) {
            ConstraintWidget constraintWidget2 = this.a.getParent();
            if(constraintWidget2 != null && constraintWidget2.getVerticalDimensionBehaviour() == DimensionBehaviour.FIXED) {
                this.addTarget(this.start, constraintWidget2.verticalRun.start, this.a.mTop.getMargin());
                this.addTarget(this.end, constraintWidget2.verticalRun.end, -this.a.mBottom.getMargin());
                return;
            }
        }
        boolean z = b0.resolved;
        if(z) {
            ConstraintWidget constraintWidget3 = this.a;
            if(constraintWidget3.measured) {
                ConstraintAnchor[] arr_constraintAnchor = constraintWidget3.mListAnchors;
                ConstraintAnchor constraintAnchor0 = arr_constraintAnchor[2];
                ConstraintAnchor constraintAnchor1 = constraintAnchor0.mTarget;
                if(constraintAnchor1 != null && arr_constraintAnchor[3].mTarget != null) {
                    if(constraintWidget3.isInVerticalChain()) {
                        this.start.c = this.a.mListAnchors[2].getMargin();
                        this.end.c = -this.a.mListAnchors[3].getMargin();
                    }
                    else {
                        DependencyNode dependencyNode0 = this.getTarget(this.a.mListAnchors[2]);
                        if(dependencyNode0 != null) {
                            this.addTarget(this.start, dependencyNode0, this.a.mListAnchors[2].getMargin());
                        }
                        DependencyNode dependencyNode1 = this.getTarget(this.a.mListAnchors[3]);
                        if(dependencyNode1 != null) {
                            this.addTarget(this.end, dependencyNode1, -this.a.mListAnchors[3].getMargin());
                        }
                        this.start.delegateToWidgetRun = true;
                        this.end.delegateToWidgetRun = true;
                    }
                    if(this.a.hasBaseline()) {
                        this.addTarget(this.baseline, this.start, this.a.getBaselineDistance());
                    }
                }
                else if(constraintAnchor1 != null) {
                    DependencyNode dependencyNode2 = this.getTarget(constraintAnchor0);
                    if(dependencyNode2 != null) {
                        this.addTarget(this.start, dependencyNode2, this.a.mListAnchors[2].getMargin());
                        this.addTarget(this.end, this.start, b0.value);
                        if(this.a.hasBaseline()) {
                            this.addTarget(this.baseline, this.start, this.a.getBaselineDistance());
                        }
                    }
                }
                else {
                    ConstraintAnchor constraintAnchor2 = arr_constraintAnchor[3];
                    if(constraintAnchor2.mTarget == null) {
                        ConstraintAnchor constraintAnchor3 = arr_constraintAnchor[4];
                        if(constraintAnchor3.mTarget != null) {
                            DependencyNode dependencyNode4 = this.getTarget(constraintAnchor3);
                            if(dependencyNode4 != null) {
                                this.addTarget(this.baseline, dependencyNode4, 0);
                                this.addTarget(this.start, this.baseline, -this.a.getBaselineDistance());
                                this.addTarget(this.end, this.start, b0.value);
                            }
                        }
                        else if(!(constraintWidget3 instanceof Helper) && constraintWidget3.getParent() != null && this.a.getAnchor(Type.CENTER).mTarget == null) {
                            this.addTarget(this.start, this.a.getParent().verticalRun.start, this.a.getY());
                            this.addTarget(this.end, this.start, b0.value);
                            if(this.a.hasBaseline()) {
                                this.addTarget(this.baseline, this.start, this.a.getBaselineDistance());
                            }
                        }
                    }
                    else {
                        DependencyNode dependencyNode3 = this.getTarget(constraintAnchor2);
                        if(dependencyNode3 != null) {
                            this.addTarget(this.end, dependencyNode3, -this.a.mListAnchors[3].getMargin());
                            this.addTarget(this.start, this.end, -b0.value);
                        }
                        if(this.a.hasBaseline()) {
                            this.addTarget(this.baseline, this.start, this.a.getBaselineDistance());
                        }
                    }
                }
            }
            else {
                goto label_83;
            }
        }
        else {
        label_83:
            if(z || this.dimensionBehavior != DimensionBehaviour.MATCH_CONSTRAINT) {
                b0.addDependency(this);
            }
            else {
                ConstraintWidget constraintWidget4 = this.a;
                switch(constraintWidget4.mMatchConstraintDefaultHeight) {
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
                        if(!constraintWidget4.isInVerticalChain()) {
                            ConstraintWidget constraintWidget6 = this.a;
                            if(constraintWidget6.mMatchConstraintDefaultWidth != 3) {
                                b b2 = constraintWidget6.horizontalRun.c;
                                b0.g.add(b2);
                                b2.f.add(b0);
                                b0.delegateToWidgetRun = true;
                                b0.f.add(this.start);
                                b0.f.add(this.end);
                            }
                        }
                    }
                }
            }
            ConstraintWidget constraintWidget7 = this.a;
            ConstraintAnchor[] arr_constraintAnchor1 = constraintWidget7.mListAnchors;
            ConstraintAnchor constraintAnchor4 = arr_constraintAnchor1[2];
            ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
            if(constraintAnchor5 != null && arr_constraintAnchor1[3].mTarget != null) {
                if(constraintWidget7.isInVerticalChain()) {
                    this.start.c = this.a.mListAnchors[2].getMargin();
                    this.end.c = -this.a.mListAnchors[3].getMargin();
                }
                else {
                    DependencyNode dependencyNode5 = this.getTarget(this.a.mListAnchors[2]);
                    DependencyNode dependencyNode6 = this.getTarget(this.a.mListAnchors[3]);
                    if(dependencyNode5 != null) {
                        dependencyNode5.addDependency(this);
                    }
                    if(dependencyNode6 != null) {
                        dependencyNode6.addDependency(this);
                    }
                    this.mRunType = h.b;
                }
                if(this.a.hasBaseline()) {
                    this.addTarget(this.baseline, this.start, 1, this.e);
                }
            }
            else if(constraintAnchor5 == null) {
                ConstraintAnchor constraintAnchor6 = arr_constraintAnchor1[3];
                if(constraintAnchor6.mTarget == null) {
                    ConstraintAnchor constraintAnchor7 = arr_constraintAnchor1[4];
                    if(constraintAnchor7.mTarget != null) {
                        DependencyNode dependencyNode9 = this.getTarget(constraintAnchor7);
                        if(dependencyNode9 != null) {
                            this.addTarget(this.baseline, dependencyNode9, 0);
                            this.addTarget(this.start, this.baseline, -1, this.e);
                            this.addTarget(this.end, this.start, 1, b0);
                        }
                    }
                    else if(!(constraintWidget7 instanceof Helper) && constraintWidget7.getParent() != null) {
                        this.addTarget(this.start, this.a.getParent().verticalRun.start, this.a.getY());
                        this.addTarget(this.end, this.start, 1, b0);
                        if(this.a.hasBaseline()) {
                            this.addTarget(this.baseline, this.start, 1, this.e);
                        }
                        DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
                        if(this.dimensionBehavior == constraintWidget$DimensionBehaviour2 && this.a.getDimensionRatio() > 0.0f) {
                            HorizontalWidgetRun horizontalWidgetRun1 = this.a.horizontalRun;
                            if(horizontalWidgetRun1.dimensionBehavior == constraintWidget$DimensionBehaviour2) {
                                horizontalWidgetRun1.c.f.add(b0);
                                b0.g.add(this.a.horizontalRun.c);
                                b0.updateDelegate = this;
                            }
                        }
                    }
                }
                else {
                    DependencyNode dependencyNode8 = this.getTarget(constraintAnchor6);
                    if(dependencyNode8 != null) {
                        this.addTarget(this.end, dependencyNode8, -this.a.mListAnchors[3].getMargin());
                        this.addTarget(this.start, this.end, -1, b0);
                        if(this.a.hasBaseline()) {
                            this.addTarget(this.baseline, this.start, 1, this.e);
                        }
                    }
                }
            }
            else {
                DependencyNode dependencyNode7 = this.getTarget(constraintAnchor4);
                if(dependencyNode7 != null) {
                    this.addTarget(this.start, dependencyNode7, this.a.mListAnchors[2].getMargin());
                    this.addTarget(this.end, this.start, 1, b0);
                    if(this.a.hasBaseline()) {
                        this.addTarget(this.baseline, this.start, 1, this.e);
                    }
                    DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.MATCH_CONSTRAINT;
                    if(this.dimensionBehavior == constraintWidget$DimensionBehaviour1 && this.a.getDimensionRatio() > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun0 = this.a.horizontalRun;
                        if(horizontalWidgetRun0.dimensionBehavior == constraintWidget$DimensionBehaviour1) {
                            horizontalWidgetRun0.c.f.add(b0);
                            b0.g.add(this.a.horizontalRun.c);
                            b0.updateDelegate = this;
                        }
                    }
                }
            }
            if(b0.g.size() == 0) {
                b0.readyToSolve = true;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode0 = this.start;
        if(dependencyNode0.resolved) {
            this.a.setY(dependencyNode0.value);
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
        this.b = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
        this.c.clear();
        this.d = false;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean c() {
        return this.dimensionBehavior != DimensionBehaviour.MATCH_CONSTRAINT || this.a.mMatchConstraintDefaultHeight == 0;
    }

    public final void d() {
        this.d = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.baseline.clear();
        this.baseline.resolved = false;
        this.c.resolved = false;
    }

    @Override
    public String toString() {
        return "VerticalRun " + this.a.getDebugName();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void update(Dependency dependency0) {
        int v;
        if(this.mRunType.ordinal() == 3) {
            this.updateRunCenter(dependency0, this.a.mTop, this.a.mBottom, 1);
            return;
        }
        b b0 = this.c;
        if(b0.readyToSolve && !b0.resolved && this.dimensionBehavior == DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget0 = this.a;
            switch(constraintWidget0.mMatchConstraintDefaultHeight) {
                case 2: {
                    ConstraintWidget constraintWidget1 = constraintWidget0.getParent();
                    if(constraintWidget1 != null) {
                        b b1 = constraintWidget1.verticalRun.c;
                        if(b1.resolved) {
                            b0.resolve(((int)(((float)b1.value) * this.a.mMatchConstraintPercentHeight + 0.5f)));
                        }
                    }
                    break;
                }
                case 3: {
                    if(constraintWidget0.horizontalRun.c.resolved) {
                        switch(constraintWidget0.getDimensionRatioSide()) {
                            case -1: {
                                v = (int)(((float)this.a.horizontalRun.c.value) / this.a.getDimensionRatio() + 0.5f);
                                break;
                            }
                            case 0: {
                                v = (int)(this.a.getDimensionRatio() * ((float)this.a.horizontalRun.c.value) + 0.5f);
                                break;
                            }
                            case 1: {
                                v = (int)(((float)this.a.horizontalRun.c.value) / this.a.getDimensionRatio() + 0.5f);
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
        if(!b0.resolved && this.dimensionBehavior == DimensionBehaviour.MATCH_CONSTRAINT && (this.a.mMatchConstraintDefaultWidth == 0 && !this.a.isInVerticalChain())) {
            DependencyNode dependencyNode0 = (DependencyNode)this.start.g.get(0);
            DependencyNode dependencyNode1 = (DependencyNode)this.end.g.get(0);
            int v1 = dependencyNode0.value + this.start.c;
            int v2 = dependencyNode1.value + this.end.c;
            this.start.resolve(v1);
            this.end.resolve(v2);
            b0.resolve(v2 - v1);
            return;
        }
        if(!b0.resolved && this.dimensionBehavior == DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.g.size() > 0 && this.end.g.size() > 0) {
            DependencyNode dependencyNode2 = (DependencyNode)this.start.g.get(0);
            int v3 = ((DependencyNode)this.end.g.get(0)).value + this.end.c - (dependencyNode2.value + this.start.c);
            int v4 = b0.h;
            if(v3 < v4) {
                b0.resolve(v3);
            }
            else {
                b0.resolve(v4);
            }
        }
        if(!b0.resolved) {
            return;
        }
        if(this.start.g.size() > 0 && this.end.g.size() > 0) {
            DependencyNode dependencyNode3 = (DependencyNode)this.start.g.get(0);
            DependencyNode dependencyNode4 = (DependencyNode)this.end.g.get(0);
            int v5 = dependencyNode3.value + this.start.c;
            int v6 = dependencyNode4.value + this.end.c;
            float f = this.a.getVerticalBiasPercent();
            if(dependencyNode3 == dependencyNode4) {
                v5 = dependencyNode3.value;
                v6 = dependencyNode4.value;
                f = 0.5f;
            }
            this.start.resolve(((int)(((float)(v6 - v5 - b0.value)) * f + (((float)v5) + 0.5f))));
            this.end.resolve(this.start.value + b0.value);
        }
    }
}

