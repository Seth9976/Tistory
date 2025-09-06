package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract class WidgetRun implements Dependency {
    public ConstraintWidget a;
    public e b;
    public final b c;
    public boolean d;
    protected DimensionBehaviour dimensionBehavior;
    public DependencyNode end;
    protected h mRunType;
    public int matchConstraintsType;
    public int orientation;
    public DependencyNode start;

    public WidgetRun(ConstraintWidget constraintWidget0) {
        this.c = new b(this);
        this.orientation = 0;
        this.d = false;
        this.start = new DependencyNode(this);
        this.end = new DependencyNode(this);
        this.mRunType = h.a;
        this.a = constraintWidget0;
    }

    public abstract void a();

    public final void addTarget(DependencyNode dependencyNode0, DependencyNode dependencyNode1, int v) {
        dependencyNode0.g.add(dependencyNode1);
        dependencyNode0.c = v;
        dependencyNode1.f.add(dependencyNode0);
    }

    public final void addTarget(DependencyNode dependencyNode0, DependencyNode dependencyNode1, int v, b b0) {
        dependencyNode0.g.add(dependencyNode1);
        dependencyNode0.g.add(this.c);
        dependencyNode0.d = v;
        dependencyNode0.e = b0;
        dependencyNode1.f.add(dependencyNode0);
        b0.f.add(dependencyNode0);
    }

    public abstract void applyToWidget();

    public abstract void b();

    public abstract boolean c();

    public final int getLimitedDimension(int v, int v1) {
        int v3;
        if(v1 == 0) {
            int v2 = this.a.mMatchConstraintMaxWidth;
            v3 = v2 <= 0 ? Math.max(this.a.mMatchConstraintMinWidth, v) : Math.min(v2, v);
            return v3 == v ? v : v3;
        }
        int v4 = this.a.mMatchConstraintMaxHeight;
        v3 = v4 <= 0 ? Math.max(this.a.mMatchConstraintMinHeight, v) : Math.min(v4, v);
        return v3 == v ? v : v3;
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor0) {
        ConstraintAnchor constraintAnchor1 = constraintAnchor0.mTarget;
        if(constraintAnchor1 == null) {
            return null;
        }
        ConstraintWidget constraintWidget0 = constraintAnchor1.mOwner;
        switch(g.a[constraintAnchor1.mType.ordinal()]) {
            case 1: {
                return constraintWidget0.horizontalRun.start;
            }
            case 2: {
                return constraintWidget0.horizontalRun.end;
            }
            case 3: {
                return constraintWidget0.verticalRun.start;
            }
            case 4: {
                return constraintWidget0.verticalRun.baseline;
            }
            case 5: {
                return constraintWidget0.verticalRun.end;
            }
            default: {
                return null;
            }
        }
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor0, int v) {
        ConstraintAnchor constraintAnchor1 = constraintAnchor0.mTarget;
        if(constraintAnchor1 == null) {
            return null;
        }
        ConstraintWidget constraintWidget0 = constraintAnchor1.mOwner;
        HorizontalWidgetRun horizontalWidgetRun0 = v == 0 ? constraintWidget0.horizontalRun : constraintWidget0.verticalRun;
        switch(g.a[constraintAnchor1.mType.ordinal()]) {
            case 1: 
            case 3: {
                return horizontalWidgetRun0.start;
            }
            case 2: 
            case 5: {
                return horizontalWidgetRun0.end;
            }
            default: {
                return null;
            }
        }
    }

    // 去混淆评级： 低(20)
    public long getWrapDimension() {
        return this.c.resolved ? ((long)this.c.value) : 0L;
    }

    public boolean isCenterConnection() {
        int v = this.start.g.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((DependencyNode)this.start.g.get(v1)).a != this) {
                ++v2;
            }
        }
        int v3 = this.end.g.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            if(((DependencyNode)this.end.g.get(v4)).a != this) {
                ++v2;
            }
        }
        return v2 >= 2;
    }

    public boolean isDimensionResolved() {
        return this.c.resolved;
    }

    public boolean isResolved() {
        return this.d;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency0) {
    }

    public void updateRunCenter(Dependency dependency0, ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, int v) {
        DependencyNode dependencyNode0 = this.getTarget(constraintAnchor0);
        DependencyNode dependencyNode1 = this.getTarget(constraintAnchor1);
        if(dependencyNode0.resolved && dependencyNode1.resolved) {
            int v1 = constraintAnchor0.getMargin() + dependencyNode0.value;
            int v2 = dependencyNode1.value - constraintAnchor1.getMargin();
            int v3 = v2 - v1;
            b b0 = this.c;
            if(!b0.resolved) {
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.MATCH_CONSTRAINT;
                if(this.dimensionBehavior == constraintWidget$DimensionBehaviour0) {
                    switch(this.matchConstraintsType) {
                        case 0: {
                            b0.resolve(this.getLimitedDimension(v3, v));
                            break;
                        }
                        case 1: {
                            b0.resolve(Math.min(this.getLimitedDimension(b0.h, v), v3));
                            break;
                        }
                        case 2: {
                            ConstraintWidget constraintWidget0 = this.a.getParent();
                            if(constraintWidget0 != null) {
                                HorizontalWidgetRun horizontalWidgetRun0 = v == 0 ? constraintWidget0.horizontalRun : constraintWidget0.verticalRun;
                                b b1 = horizontalWidgetRun0.c;
                                if(b1.resolved) {
                                    b0.resolve(this.getLimitedDimension(((int)(((float)b1.value) * (v == 0 ? this.a.mMatchConstraintPercentWidth : this.a.mMatchConstraintPercentHeight) + 0.5f)), v));
                                }
                            }
                            break;
                        }
                        case 3: {
                            ConstraintWidget constraintWidget1 = this.a;
                            HorizontalWidgetRun horizontalWidgetRun1 = constraintWidget1.horizontalRun;
                            if(horizontalWidgetRun1.dimensionBehavior != constraintWidget$DimensionBehaviour0 || horizontalWidgetRun1.matchConstraintsType != 3 || (constraintWidget1.verticalRun.dimensionBehavior != constraintWidget$DimensionBehaviour0 || constraintWidget1.verticalRun.matchConstraintsType != 3)) {
                                if(v == 0) {
                                    horizontalWidgetRun1 = constraintWidget1.verticalRun;
                                }
                                if(horizontalWidgetRun1.c.resolved) {
                                    float f = constraintWidget1.getDimensionRatio();
                                    b0.resolve((v == 1 ? ((int)(((float)horizontalWidgetRun1.c.value) / f + 0.5f)) : ((int)(f * ((float)horizontalWidgetRun1.c.value) + 0.5f))));
                                }
                            }
                        }
                    }
                }
            }
            if(!b0.resolved) {
                return;
            }
            if(b0.value == v3) {
                this.start.resolve(v1);
                this.end.resolve(v2);
                return;
            }
            float f1 = v == 0 ? this.a.getHorizontalBiasPercent() : this.a.getVerticalBiasPercent();
            if(dependencyNode0 == dependencyNode1) {
                v1 = dependencyNode0.value;
                v2 = dependencyNode1.value;
                f1 = 0.5f;
            }
            this.start.resolve(((int)(((float)(v2 - v1 - b0.value)) * f1 + (((float)v1) + 0.5f))));
            this.end.resolve(this.start.value + b0.value);
        }
    }

    public void updateRunEnd(Dependency dependency0) {
    }

    public void updateRunStart(Dependency dependency0) {
    }

    public long wrapSize(int v) {
        b b0 = this.c;
        if(b0.resolved) {
            long v1 = (long)b0.value;
            if(this.isCenterConnection()) {
                return v1 + ((long)(this.start.c - this.end.c));
            }
            return v == 0 ? v1 + ((long)this.start.c) : v1 - ((long)this.end.c);
        }
        return 0L;
    }
}

