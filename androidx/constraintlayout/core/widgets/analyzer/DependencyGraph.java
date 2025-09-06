package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class DependencyGraph {
    public final ConstraintWidgetContainer a;
    public boolean b;
    public boolean c;
    public final ConstraintWidgetContainer d;
    public final ArrayList e;
    public Measurer f;
    public final Measure g;
    public final ArrayList h;

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer0) {
        this.b = true;
        this.c = true;
        this.e = new ArrayList();
        new ArrayList();
        this.f = null;
        this.g = new Measure();
        this.h = new ArrayList();
        this.a = constraintWidgetContainer0;
        this.d = constraintWidgetContainer0;
    }

    public final void a(DependencyNode dependencyNode0, int v, ArrayList arrayList0, e e0) {
        WidgetRun widgetRun0 = dependencyNode0.a;
        if(widgetRun0.b == null && (widgetRun0 != this.a.horizontalRun && widgetRun0 != this.a.verticalRun)) {
            if(e0 == null) {
                e0 = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
                e0.a = null;
                e0.b = new ArrayList();
                e0.a = widgetRun0;
                arrayList0.add(e0);
            }
            widgetRun0.b = e0;
            e0.b.add(widgetRun0);
            for(Object object0: widgetRun0.start.f) {
                Dependency dependency0 = (Dependency)object0;
                if(dependency0 instanceof DependencyNode) {
                    this.a(((DependencyNode)dependency0), v, arrayList0, e0);
                }
            }
            for(Object object1: widgetRun0.end.f) {
                Dependency dependency1 = (Dependency)object1;
                if(dependency1 instanceof DependencyNode) {
                    this.a(((DependencyNode)dependency1), v, arrayList0, e0);
                }
            }
            if(v == 1 && widgetRun0 instanceof VerticalWidgetRun) {
                for(Object object2: ((VerticalWidgetRun)widgetRun0).baseline.f) {
                    Dependency dependency2 = (Dependency)object2;
                    if(dependency2 instanceof DependencyNode) {
                        this.a(((DependencyNode)dependency2), 1, arrayList0, e0);
                    }
                }
            }
            for(Object object3: widgetRun0.start.g) {
                this.a(((DependencyNode)object3), v, arrayList0, e0);
            }
            for(Object object4: widgetRun0.end.g) {
                this.a(((DependencyNode)object4), v, arrayList0, e0);
            }
            if(v == 1 && widgetRun0 instanceof VerticalWidgetRun) {
                for(Object object5: ((VerticalWidgetRun)widgetRun0).baseline.g) {
                    this.a(((DependencyNode)object5), 1, arrayList0, e0);
                }
            }
        }
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer0) {
        DimensionBehaviour constraintWidget$DimensionBehaviour12;
        int v6;
        for(Object object0: constraintWidgetContainer0.mChildren) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidget0.mListDimensionBehaviors;
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
            DimensionBehaviour constraintWidget$DimensionBehaviour1 = arr_constraintWidget$DimensionBehaviour[1];
            if(constraintWidget0.getVisibility() == 8) {
                constraintWidget0.measured = true;
            }
            else {
                if(Float.compare(constraintWidget0.mMatchConstraintPercentWidth, 1.0f) < 0 && constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget0.mMatchConstraintDefaultWidth = 2;
                }
                if(constraintWidget0.mMatchConstraintPercentHeight < 1.0f && constraintWidget$DimensionBehaviour1 == DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget0.mMatchConstraintDefaultHeight = 2;
                }
                if(Float.compare(constraintWidget0.getDimensionRatio(), 0.0f) > 0) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 && (constraintWidget$DimensionBehaviour1 == DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.FIXED)) {
                        constraintWidget0.mMatchConstraintDefaultWidth = 3;
                    }
                    else if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2 && (constraintWidget$DimensionBehaviour0 == DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.FIXED)) {
                        constraintWidget0.mMatchConstraintDefaultHeight = 3;
                    }
                    else if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 && constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) {
                        if(constraintWidget0.mMatchConstraintDefaultWidth == 0) {
                            constraintWidget0.mMatchConstraintDefaultWidth = 3;
                        }
                        if(constraintWidget0.mMatchConstraintDefaultHeight == 0) {
                            constraintWidget0.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                DimensionBehaviour constraintWidget$DimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour3 && constraintWidget0.mMatchConstraintDefaultWidth == 1 && (constraintWidget0.mLeft.mTarget == null || constraintWidget0.mRight.mTarget == null)) {
                    constraintWidget$DimensionBehaviour0 = DimensionBehaviour.WRAP_CONTENT;
                }
                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour3 && constraintWidget0.mMatchConstraintDefaultHeight == 1 && (constraintWidget0.mTop.mTarget == null || constraintWidget0.mBottom.mTarget == null)) {
                    constraintWidget$DimensionBehaviour1 = DimensionBehaviour.WRAP_CONTENT;
                }
                constraintWidget0.horizontalRun.dimensionBehavior = constraintWidget$DimensionBehaviour0;
                int v = constraintWidget0.mMatchConstraintDefaultWidth;
                constraintWidget0.horizontalRun.matchConstraintsType = v;
                constraintWidget0.verticalRun.dimensionBehavior = constraintWidget$DimensionBehaviour1;
                int v1 = constraintWidget0.mMatchConstraintDefaultHeight;
                constraintWidget0.verticalRun.matchConstraintsType = v1;
                DimensionBehaviour constraintWidget$DimensionBehaviour4 = DimensionBehaviour.MATCH_PARENT;
                if(constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour4 && constraintWidget$DimensionBehaviour0 != DimensionBehaviour.FIXED && constraintWidget$DimensionBehaviour0 != DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour4 && constraintWidget$DimensionBehaviour1 != DimensionBehaviour.FIXED && constraintWidget$DimensionBehaviour1 != DimensionBehaviour.WRAP_CONTENT) {
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour3) {
                        DimensionBehaviour constraintWidget$DimensionBehaviour5 = DimensionBehaviour.WRAP_CONTENT;
                        if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour5 || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.FIXED) {
                            if(v == 3) {
                                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour5) {
                                    this.e(constraintWidget0, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour5, 0);
                                }
                                int v2 = constraintWidget0.getHeight();
                                this.e(constraintWidget0, DimensionBehaviour.FIXED, ((int)(((float)v2) * constraintWidget0.mDimensionRatio + 0.5f)), DimensionBehaviour.FIXED, v2);
                                constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                                constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                                constraintWidget0.measured = true;
                                continue;
                            }
                            else if(v == 1) {
                                this.e(constraintWidget0, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour1, 0);
                                constraintWidget0.horizontalRun.c.h = constraintWidget0.getWidth();
                                continue;
                            }
                            else if(v == 2) {
                                DimensionBehaviour constraintWidget$DimensionBehaviour6 = constraintWidgetContainer0.mListDimensionBehaviors[0];
                                DimensionBehaviour constraintWidget$DimensionBehaviour7 = DimensionBehaviour.FIXED;
                                if(constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour4) {
                                    this.e(constraintWidget0, constraintWidget$DimensionBehaviour7, ((int)(constraintWidget0.mMatchConstraintPercentWidth * ((float)constraintWidgetContainer0.getWidth()) + 0.5f)), constraintWidget$DimensionBehaviour1, constraintWidget0.getHeight());
                                    constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                                    constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                                    constraintWidget0.measured = true;
                                    continue;
                                }
                            }
                            else if(constraintWidget0.mListAnchors[0].mTarget == null || constraintWidget0.mListAnchors[1].mTarget == null) {
                                this.e(constraintWidget0, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour1, 0);
                                constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                                constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                                constraintWidget0.measured = true;
                                continue;
                            }
                        }
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour3) {
                        DimensionBehaviour constraintWidget$DimensionBehaviour8 = DimensionBehaviour.WRAP_CONTENT;
                        if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour8 || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.FIXED) {
                            if(v1 == 3) {
                                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour8) {
                                    this.e(constraintWidget0, constraintWidget$DimensionBehaviour8, 0, constraintWidget$DimensionBehaviour8, 0);
                                }
                                int v3 = constraintWidget0.getWidth();
                                this.e(constraintWidget0, DimensionBehaviour.FIXED, v3, DimensionBehaviour.FIXED, ((int)(((float)v3) * (constraintWidget0.getDimensionRatioSide() == -1 ? 1.0f / constraintWidget0.mDimensionRatio : constraintWidget0.mDimensionRatio) + 0.5f)));
                                constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                                constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                                constraintWidget0.measured = true;
                                continue;
                            }
                            else if(v1 == 1) {
                                this.e(constraintWidget0, constraintWidget$DimensionBehaviour0, 0, constraintWidget$DimensionBehaviour8, 0);
                                constraintWidget0.verticalRun.c.h = constraintWidget0.getHeight();
                                continue;
                            }
                            else if(v1 == 2) {
                                DimensionBehaviour constraintWidget$DimensionBehaviour9 = constraintWidgetContainer0.mListDimensionBehaviors[1];
                                DimensionBehaviour constraintWidget$DimensionBehaviour10 = DimensionBehaviour.FIXED;
                                if(constraintWidget$DimensionBehaviour9 == constraintWidget$DimensionBehaviour10 || constraintWidget$DimensionBehaviour9 == constraintWidget$DimensionBehaviour4) {
                                    this.e(constraintWidget0, constraintWidget$DimensionBehaviour0, constraintWidget0.getWidth(), constraintWidget$DimensionBehaviour10, ((int)(constraintWidget0.mMatchConstraintPercentHeight * ((float)constraintWidgetContainer0.getHeight()) + 0.5f)));
                                    constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                                    constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                                    constraintWidget0.measured = true;
                                    continue;
                                }
                            }
                            else if(constraintWidget0.mListAnchors[2].mTarget == null || constraintWidget0.mListAnchors[3].mTarget == null) {
                                this.e(constraintWidget0, constraintWidget$DimensionBehaviour8, 0, constraintWidget$DimensionBehaviour1, 0);
                                constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                                constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                                constraintWidget0.measured = true;
                                continue;
                            }
                        }
                    }
                    if(constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour3 || constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour3) {
                        continue;
                    }
                    if(v == 1 || v1 == 1) {
                        this.e(constraintWidget0, DimensionBehaviour.WRAP_CONTENT, 0, DimensionBehaviour.WRAP_CONTENT, 0);
                        constraintWidget0.horizontalRun.c.h = constraintWidget0.getWidth();
                        constraintWidget0.verticalRun.c.h = constraintWidget0.getHeight();
                    }
                    else {
                        if(v1 != 2 || v != 2) {
                            continue;
                        }
                        DimensionBehaviour constraintWidget$DimensionBehaviour11 = DimensionBehaviour.FIXED;
                        if(constraintWidgetContainer0.mListDimensionBehaviors[0] != constraintWidget$DimensionBehaviour11 || constraintWidgetContainer0.mListDimensionBehaviors[1] != constraintWidget$DimensionBehaviour11) {
                            continue;
                        }
                        this.e(constraintWidget0, constraintWidget$DimensionBehaviour11, ((int)(constraintWidget0.mMatchConstraintPercentWidth * ((float)constraintWidgetContainer0.getWidth()) + 0.5f)), constraintWidget$DimensionBehaviour11, ((int)(constraintWidget0.mMatchConstraintPercentHeight * ((float)constraintWidgetContainer0.getHeight()) + 0.5f)));
                        constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                        constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                        constraintWidget0.measured = true;
                    }
                }
                else {
                    int v4 = constraintWidget0.getWidth();
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour4) {
                        v4 = constraintWidgetContainer0.getWidth() - constraintWidget0.mLeft.mMargin - constraintWidget0.mRight.mMargin;
                        constraintWidget$DimensionBehaviour0 = DimensionBehaviour.FIXED;
                    }
                    int v5 = constraintWidget0.getHeight();
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour4) {
                        v6 = constraintWidgetContainer0.getHeight() - constraintWidget0.mTop.mMargin - constraintWidget0.mBottom.mMargin;
                        constraintWidget$DimensionBehaviour12 = DimensionBehaviour.FIXED;
                    }
                    else {
                        v6 = v5;
                        constraintWidget$DimensionBehaviour12 = constraintWidget$DimensionBehaviour1;
                    }
                    this.e(constraintWidget0, constraintWidget$DimensionBehaviour0, v4, constraintWidget$DimensionBehaviour12, v6);
                    constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                    constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                    constraintWidget0.measured = true;
                }
            }
        }
    }

    public void buildGraph() {
        this.buildGraph(this.e);
        this.h.clear();
        this.d(this.a.horizontalRun, 0, this.h);
        this.d(this.a.verticalRun, 1, this.h);
        this.b = false;
    }

    public void buildGraph(ArrayList arrayList0) {
        arrayList0.clear();
        ConstraintWidgetContainer constraintWidgetContainer0 = this.d;
        constraintWidgetContainer0.horizontalRun.b();
        constraintWidgetContainer0.verticalRun.b();
        arrayList0.add(constraintWidgetContainer0.horizontalRun);
        arrayList0.add(constraintWidgetContainer0.verticalRun);
        Collection collection0 = null;
        for(Object object0: constraintWidgetContainer0.mChildren) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            if(constraintWidget0 instanceof Guideline) {
                c c0 = new c(((Guideline)constraintWidget0));  // 初始化器: Landroidx/constraintlayout/core/widgets/analyzer/WidgetRun;-><init>(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)V
                ((Guideline)constraintWidget0).horizontalRun.b();
                ((Guideline)constraintWidget0).verticalRun.b();
                c0.orientation = ((Guideline)constraintWidget0).getOrientation();
                arrayList0.add(c0);
            }
            else {
                if(constraintWidget0.isInHorizontalChain()) {
                    if(constraintWidget0.horizontalChainRun == null) {
                        constraintWidget0.horizontalChainRun = new ChainRun(constraintWidget0, 0);
                    }
                    if(collection0 == null) {
                        collection0 = new HashSet();
                    }
                    ((HashSet)collection0).add(constraintWidget0.horizontalChainRun);
                }
                else {
                    arrayList0.add(constraintWidget0.horizontalRun);
                }
                if(constraintWidget0.isInVerticalChain()) {
                    if(constraintWidget0.verticalChainRun == null) {
                        constraintWidget0.verticalChainRun = new ChainRun(constraintWidget0, 1);
                    }
                    if(collection0 == null) {
                        collection0 = new HashSet();
                    }
                    ((HashSet)collection0).add(constraintWidget0.verticalChainRun);
                }
                else {
                    arrayList0.add(constraintWidget0.verticalRun);
                }
                if(constraintWidget0 instanceof HelperWidget) {
                    arrayList0.add(new d(constraintWidget0));  // 初始化器: Landroidx/constraintlayout/core/widgets/analyzer/WidgetRun;-><init>(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)V
                }
            }
        }
        if(collection0 != null) {
            arrayList0.addAll(collection0);
        }
        for(Object object1: arrayList0) {
            ((WidgetRun)object1).b();
        }
        for(Object object2: arrayList0) {
            WidgetRun widgetRun0 = (WidgetRun)object2;
            if(widgetRun0.a != constraintWidgetContainer0) {
                widgetRun0.a();
            }
        }
    }

    public final int c(ConstraintWidgetContainer constraintWidgetContainer0, int v) {
        long v12;
        ArrayList arrayList0 = this.h;
        int v1 = arrayList0.size();
        int v2 = 0;
        long v3 = 0L;
        while(v2 < v1) {
            WidgetRun widgetRun0 = ((e)arrayList0.get(v2)).a;
            if(widgetRun0 instanceof ChainRun) {
                if(((ChainRun)widgetRun0).orientation == v) {
                    goto label_13;
                }
                else {
                    goto label_48;
                }
                goto label_9;
            }
            else {
            label_9:
                if(v == 0) {
                    if(widgetRun0 instanceof HorizontalWidgetRun) {
                        goto label_13;
                    }
                    else {
                        goto label_48;
                    }
                    goto label_12;
                }
                else {
                label_12:
                    if(widgetRun0 instanceof VerticalWidgetRun) {
                    label_13:
                        HorizontalWidgetRun horizontalWidgetRun0 = v == 0 ? constraintWidgetContainer0.horizontalRun : constraintWidgetContainer0.verticalRun;
                        DependencyNode dependencyNode0 = horizontalWidgetRun0.start;
                        HorizontalWidgetRun horizontalWidgetRun1 = v == 0 ? constraintWidgetContainer0.horizontalRun : constraintWidgetContainer0.verticalRun;
                        DependencyNode dependencyNode1 = horizontalWidgetRun1.end;
                        boolean z = widgetRun0.start.g.contains(dependencyNode0);
                        boolean z1 = widgetRun0.end.g.contains(dependencyNode1);
                        long v4 = widgetRun0.getWrapDimension();
                        if(z && z1) {
                            long v5 = e.c(widgetRun0.start, 0L);
                            long v6 = e.b(widgetRun0.end, 0L);
                            long v7 = v5 - v4;
                            int v8 = widgetRun0.end.c;
                            if(v7 >= ((long)(-v8))) {
                                v7 += (long)v8;
                            }
                            long v9 = (long)widgetRun0.start.c;
                            long v10 = -v6 - v4 - v9;
                            float f = widgetRun0.a.getBiasPercent(v);
                            long v11 = Float.compare(f, 0.0f) <= 0 ? 0L : ((long)(((float)v7) / (1.0f - f) + ((float)(v10 < v9 ? -v6 - v4 - v9 : v10 - v9)) / f));
                            v12 = ((long)widgetRun0.start.c) + (((long)(((float)v11) * f + 0.5f)) + v4 + ((long)((1.0f - f) * ((float)v11) + 0.5f))) - ((long)widgetRun0.end.c);
                        }
                        else if(z) {
                            v12 = Math.max(e.c(widgetRun0.start, ((long)widgetRun0.start.c)), ((long)widgetRun0.start.c) + v4);
                        }
                        else if(z1) {
                            v12 = Math.max(-e.b(widgetRun0.end, ((long)widgetRun0.end.c)), ((long)(-widgetRun0.end.c)) + v4);
                        }
                        else {
                            long v13 = (long)widgetRun0.start.c;
                            v12 = widgetRun0.getWrapDimension() + v13 - ((long)widgetRun0.end.c);
                        }
                        goto label_49;
                    }
                }
            }
        label_48:
            v12 = 0L;
        label_49:
            v3 = Math.max(v3, v12);
            ++v2;
        }
        return (int)v3;
    }

    public final void d(WidgetRun widgetRun0, int v, ArrayList arrayList0) {
        for(Object object0: widgetRun0.start.f) {
            Dependency dependency0 = (Dependency)object0;
            if(dependency0 instanceof DependencyNode) {
                this.a(((DependencyNode)dependency0), v, arrayList0, null);
            }
            else if(dependency0 instanceof WidgetRun) {
                this.a(((WidgetRun)dependency0).start, v, arrayList0, null);
            }
        }
        for(Object object1: widgetRun0.end.f) {
            Dependency dependency1 = (Dependency)object1;
            if(dependency1 instanceof DependencyNode) {
                this.a(((DependencyNode)dependency1), v, arrayList0, null);
            }
            else if(dependency1 instanceof WidgetRun) {
                this.a(((WidgetRun)dependency1).end, v, arrayList0, null);
            }
        }
        if(v == 1) {
            for(Object object2: ((VerticalWidgetRun)widgetRun0).baseline.f) {
                Dependency dependency2 = (Dependency)object2;
                if(dependency2 instanceof DependencyNode) {
                    this.a(((DependencyNode)dependency2), 1, arrayList0, null);
                }
            }
        }
    }

    public void defineTerminalWidgets(DimensionBehaviour constraintWidget$DimensionBehaviour0, DimensionBehaviour constraintWidget$DimensionBehaviour1) {
        if(this.b) {
            this.buildGraph();
            boolean z = false;
            for(Object object0: this.a.mChildren) {
                boolean[] arr_z = ((ConstraintWidget)object0).isTerminalWidget;
                arr_z[0] = true;
                arr_z[1] = true;
                if(((ConstraintWidget)object0) instanceof Barrier) {
                    z = true;
                }
            }
            if(!z) {
                for(Object object1: this.h) {
                    boolean z1 = constraintWidget$DimensionBehaviour1 == DimensionBehaviour.WRAP_CONTENT;
                    WidgetRun widgetRun0 = ((e)object1).a;
                    if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.WRAP_CONTENT && widgetRun0 instanceof HorizontalWidgetRun) {
                        e.a(widgetRun0, 0);
                    }
                    if(z1 && widgetRun0 instanceof VerticalWidgetRun) {
                        e.a(widgetRun0, 1);
                    }
                }
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        ConstraintWidgetContainer constraintWidgetContainer0 = this.a;
        boolean z1 = false;
        if(this.b || this.c) {
            for(Object object0: constraintWidgetContainer0.mChildren) {
                ((ConstraintWidget)object0).ensureWidgetRuns();
                ((ConstraintWidget)object0).measured = false;
                ((ConstraintWidget)object0).horizontalRun.e();
                ((ConstraintWidget)object0).verticalRun.d();
            }
            constraintWidgetContainer0.ensureWidgetRuns();
            constraintWidgetContainer0.measured = false;
            constraintWidgetContainer0.horizontalRun.e();
            constraintWidgetContainer0.verticalRun.d();
            this.c = false;
        }
        this.b(this.d);
        constraintWidgetContainer0.setX(0);
        constraintWidgetContainer0.setY(0);
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidgetContainer0.getDimensionBehaviour(0);
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidgetContainer0.getDimensionBehaviour(1);
        if(this.b) {
            this.buildGraph();
        }
        int v = constraintWidgetContainer0.getX();
        int v1 = constraintWidgetContainer0.getY();
        constraintWidgetContainer0.horizontalRun.start.resolve(v);
        constraintWidgetContainer0.verticalRun.start.resolve(v1);
        this.measureWidgets();
        ArrayList arrayList0 = this.e;
        if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.WRAP_CONTENT) {
            if(z) {
                for(Object object1: arrayList0) {
                    if(!((WidgetRun)object1).c()) {
                        z = false;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(z && constraintWidget$DimensionBehaviour0 == DimensionBehaviour.WRAP_CONTENT) {
                constraintWidgetContainer0.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                constraintWidgetContainer0.setWidth(this.c(constraintWidgetContainer0, 0));
                constraintWidgetContainer0.horizontalRun.c.resolve(constraintWidgetContainer0.getWidth());
            }
            if(z && constraintWidget$DimensionBehaviour1 == DimensionBehaviour.WRAP_CONTENT) {
                constraintWidgetContainer0.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                constraintWidgetContainer0.setHeight(this.c(constraintWidgetContainer0, 1));
                constraintWidgetContainer0.verticalRun.c.resolve(constraintWidgetContainer0.getHeight());
            }
        }
        DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidgetContainer0.mListDimensionBehaviors[0];
        DimensionBehaviour constraintWidget$DimensionBehaviour3 = DimensionBehaviour.FIXED;
        if(constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || constraintWidget$DimensionBehaviour2 == DimensionBehaviour.MATCH_PARENT) {
            int v2 = constraintWidgetContainer0.getWidth() + v;
            constraintWidgetContainer0.horizontalRun.end.resolve(v2);
            constraintWidgetContainer0.horizontalRun.c.resolve(v2 - v);
            this.measureWidgets();
            DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidgetContainer0.mListDimensionBehaviors[1];
            if(constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour3 || constraintWidget$DimensionBehaviour4 == DimensionBehaviour.MATCH_PARENT) {
                int v3 = constraintWidgetContainer0.getHeight() + v1;
                constraintWidgetContainer0.verticalRun.end.resolve(v3);
                constraintWidgetContainer0.verticalRun.c.resolve(v3 - v1);
            }
            this.measureWidgets();
            z2 = true;
        }
        else {
            z2 = false;
        }
        for(Object object2: arrayList0) {
            WidgetRun widgetRun0 = (WidgetRun)object2;
            if(widgetRun0.a != constraintWidgetContainer0 || widgetRun0.d) {
                widgetRun0.applyToWidget();
            }
        }
        for(Object object3: arrayList0) {
            WidgetRun widgetRun1 = (WidgetRun)object3;
            if(!z2 && widgetRun1.a == constraintWidgetContainer0 || widgetRun1.start.resolved && (widgetRun1.end.resolved || widgetRun1 instanceof c) && (widgetRun1.c.resolved || widgetRun1 instanceof ChainRun || widgetRun1 instanceof c)) {
                continue;
            }
            constraintWidgetContainer0.setHorizontalDimensionBehaviour(constraintWidget$DimensionBehaviour0);
            constraintWidgetContainer0.setVerticalDimensionBehaviour(constraintWidget$DimensionBehaviour1);
            return z1;
        }
        constraintWidgetContainer0.setHorizontalDimensionBehaviour(constraintWidget$DimensionBehaviour0);
        constraintWidgetContainer0.setVerticalDimensionBehaviour(constraintWidget$DimensionBehaviour1);
        return true;
    }

    public boolean directMeasureSetup(boolean z) {
        ConstraintWidgetContainer constraintWidgetContainer0 = this.a;
        if(this.b) {
            for(Object object0: constraintWidgetContainer0.mChildren) {
                ((ConstraintWidget)object0).ensureWidgetRuns();
                ((ConstraintWidget)object0).measured = false;
                ((ConstraintWidget)object0).horizontalRun.c.resolved = false;
                ((ConstraintWidget)object0).horizontalRun.d = false;
                ((ConstraintWidget)object0).horizontalRun.e();
                ((ConstraintWidget)object0).verticalRun.c.resolved = false;
                ((ConstraintWidget)object0).verticalRun.d = false;
                ((ConstraintWidget)object0).verticalRun.d();
            }
            constraintWidgetContainer0.ensureWidgetRuns();
            constraintWidgetContainer0.measured = false;
            constraintWidgetContainer0.horizontalRun.c.resolved = false;
            constraintWidgetContainer0.horizontalRun.d = false;
            constraintWidgetContainer0.horizontalRun.e();
            constraintWidgetContainer0.verticalRun.c.resolved = false;
            constraintWidgetContainer0.verticalRun.d = false;
            constraintWidgetContainer0.verticalRun.d();
            this.buildGraph();
        }
        this.b(this.d);
        constraintWidgetContainer0.setX(0);
        constraintWidgetContainer0.setY(0);
        constraintWidgetContainer0.horizontalRun.start.resolve(0);
        constraintWidgetContainer0.verticalRun.start.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z, int v) {
        boolean z2;
        ConstraintWidgetContainer constraintWidgetContainer0 = this.a;
        boolean z1 = false;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidgetContainer0.getDimensionBehaviour(0);
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidgetContainer0.getDimensionBehaviour(1);
        int v1 = constraintWidgetContainer0.getX();
        int v2 = constraintWidgetContainer0.getY();
        ArrayList arrayList0 = this.e;
        if(z && (constraintWidget$DimensionBehaviour0 == DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.WRAP_CONTENT)) {
            for(Object object0: arrayList0) {
                if(((WidgetRun)object0).orientation == v && !((WidgetRun)object0).c()) {
                    z = false;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(v != 0) {
                if(z && constraintWidget$DimensionBehaviour1 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidgetContainer0.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                    constraintWidgetContainer0.setHeight(this.c(constraintWidgetContainer0, 1));
                    constraintWidgetContainer0.verticalRun.c.resolve(constraintWidgetContainer0.getHeight());
                }
            }
            else if(z && constraintWidget$DimensionBehaviour0 == DimensionBehaviour.WRAP_CONTENT) {
                constraintWidgetContainer0.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                constraintWidgetContainer0.setWidth(this.c(constraintWidgetContainer0, 0));
                constraintWidgetContainer0.horizontalRun.c.resolve(constraintWidgetContainer0.getWidth());
            }
        }
        if(v == 0) {
            DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidgetContainer0.mListDimensionBehaviors[0];
            if(constraintWidget$DimensionBehaviour2 != DimensionBehaviour.FIXED && constraintWidget$DimensionBehaviour2 != DimensionBehaviour.MATCH_PARENT) {
                z2 = false;
            }
            else {
                int v3 = constraintWidgetContainer0.getWidth() + v1;
                constraintWidgetContainer0.horizontalRun.end.resolve(v3);
                constraintWidgetContainer0.horizontalRun.c.resolve(v3 - v1);
                z2 = true;
            }
        }
        else {
            DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidgetContainer0.mListDimensionBehaviors[1];
            if(constraintWidget$DimensionBehaviour3 == DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour3 == DimensionBehaviour.MATCH_PARENT) {
                int v4 = constraintWidgetContainer0.getHeight() + v2;
                constraintWidgetContainer0.verticalRun.end.resolve(v4);
                constraintWidgetContainer0.verticalRun.c.resolve(v4 - v2);
                z2 = true;
            }
            else {
                z2 = false;
            }
        }
        this.measureWidgets();
        for(Object object1: arrayList0) {
            WidgetRun widgetRun0 = (WidgetRun)object1;
            if(widgetRun0.orientation == v && (widgetRun0.a != constraintWidgetContainer0 || widgetRun0.d)) {
                widgetRun0.applyToWidget();
            }
        }
        for(Object object2: arrayList0) {
            WidgetRun widgetRun1 = (WidgetRun)object2;
            if(widgetRun1.orientation != v || !z2 && widgetRun1.a == constraintWidgetContainer0 || widgetRun1.start.resolved && widgetRun1.end.resolved && (widgetRun1 instanceof ChainRun || widgetRun1.c.resolved)) {
                continue;
            }
            constraintWidgetContainer0.setHorizontalDimensionBehaviour(constraintWidget$DimensionBehaviour0);
            constraintWidgetContainer0.setVerticalDimensionBehaviour(constraintWidget$DimensionBehaviour1);
            return z1;
        }
        constraintWidgetContainer0.setHorizontalDimensionBehaviour(constraintWidget$DimensionBehaviour0);
        constraintWidgetContainer0.setVerticalDimensionBehaviour(constraintWidget$DimensionBehaviour1);
        return true;
    }

    public final void e(ConstraintWidget constraintWidget0, DimensionBehaviour constraintWidget$DimensionBehaviour0, int v, DimensionBehaviour constraintWidget$DimensionBehaviour1, int v1) {
        this.g.horizontalBehavior = constraintWidget$DimensionBehaviour0;
        this.g.verticalBehavior = constraintWidget$DimensionBehaviour1;
        this.g.horizontalDimension = v;
        this.g.verticalDimension = v1;
        this.f.measure(constraintWidget0, this.g);
        constraintWidget0.setWidth(this.g.measuredWidth);
        constraintWidget0.setHeight(this.g.measuredHeight);
        constraintWidget0.setHasBaseline(this.g.measuredHasBaseline);
        constraintWidget0.setBaselineDistance(this.g.measuredBaseline);
    }

    public void invalidateGraph() {
        this.b = true;
    }

    public void invalidateMeasures() {
        this.c = true;
    }

    public void measureWidgets() {
        for(Object object0: this.a.mChildren) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            if(!constraintWidget0.measured) {
                DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidget0.mListDimensionBehaviors;
                boolean z = false;
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = arr_constraintWidget$DimensionBehaviour[1];
                DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                boolean z1 = constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mMatchConstraintDefaultWidth == 1;
                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mMatchConstraintDefaultHeight == 1) {
                    z = true;
                }
                b b0 = constraintWidget0.horizontalRun.c;
                boolean z2 = b0.resolved;
                b b1 = constraintWidget0.verticalRun.c;
                boolean z3 = b1.resolved;
                if(z2 && z3) {
                    this.e(constraintWidget0, DimensionBehaviour.FIXED, b0.value, DimensionBehaviour.FIXED, b1.value);
                    constraintWidget0.measured = true;
                }
                else if(z2 && z) {
                    this.e(constraintWidget0, DimensionBehaviour.FIXED, b0.value, constraintWidget$DimensionBehaviour2, b1.value);
                    if(constraintWidget$DimensionBehaviour1 == DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget0.verticalRun.c.h = constraintWidget0.getHeight();
                    }
                    else {
                        constraintWidget0.verticalRun.c.resolve(constraintWidget0.getHeight());
                        constraintWidget0.measured = true;
                    }
                }
                else if(z3 && z1) {
                    this.e(constraintWidget0, constraintWidget$DimensionBehaviour2, b0.value, DimensionBehaviour.FIXED, b1.value);
                    if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget0.horizontalRun.c.h = constraintWidget0.getWidth();
                    }
                    else {
                        constraintWidget0.horizontalRun.c.resolve(constraintWidget0.getWidth());
                        constraintWidget0.measured = true;
                    }
                }
                if(constraintWidget0.measured) {
                    a a0 = constraintWidget0.verticalRun.e;
                    if(a0 != null) {
                        a0.resolve(constraintWidget0.getBaselineDistance());
                    }
                }
            }
        }
    }

    public void setMeasurer(Measurer basicMeasure$Measurer0) {
        this.f = basicMeasure$Measurer0;
    }
}

