package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public final class d extends WidgetRun {
    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        ConstraintWidget constraintWidget0 = this.a;
        if(constraintWidget0 instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            boolean z = ((Barrier)constraintWidget0).getAllowsGoneWidget();
            int v = 0;
            switch(((Barrier)constraintWidget0).getBarrierType()) {
                case 0: {
                    this.start.b = 4;
                    while(v < ((Barrier)constraintWidget0).mWidgetsCount) {
                        ConstraintWidget constraintWidget4 = ((Barrier)constraintWidget0).mWidgets[v];
                        if(z || constraintWidget4.getVisibility() != 8) {
                            DependencyNode dependencyNode3 = constraintWidget4.horizontalRun.start;
                            dependencyNode3.f.add(this.start);
                            this.start.g.add(dependencyNode3);
                        }
                        ++v;
                    }
                    this.d(this.a.horizontalRun.start);
                    this.d(this.a.horizontalRun.end);
                    break;
                }
                case 1: {
                    this.start.b = 5;
                    while(v < ((Barrier)constraintWidget0).mWidgetsCount) {
                        ConstraintWidget constraintWidget1 = ((Barrier)constraintWidget0).mWidgets[v];
                        if(z || constraintWidget1.getVisibility() != 8) {
                            DependencyNode dependencyNode0 = constraintWidget1.horizontalRun.end;
                            dependencyNode0.f.add(this.start);
                            this.start.g.add(dependencyNode0);
                        }
                        ++v;
                    }
                    this.d(this.a.horizontalRun.start);
                    this.d(this.a.horizontalRun.end);
                    return;
                }
                case 2: {
                    this.start.b = 6;
                    while(v < ((Barrier)constraintWidget0).mWidgetsCount) {
                        ConstraintWidget constraintWidget2 = ((Barrier)constraintWidget0).mWidgets[v];
                        if(z || constraintWidget2.getVisibility() != 8) {
                            DependencyNode dependencyNode1 = constraintWidget2.verticalRun.start;
                            dependencyNode1.f.add(this.start);
                            this.start.g.add(dependencyNode1);
                        }
                        ++v;
                    }
                    this.d(this.a.verticalRun.start);
                    this.d(this.a.verticalRun.end);
                    return;
                }
                case 3: {
                    this.start.b = 7;
                    while(v < ((Barrier)constraintWidget0).mWidgetsCount) {
                        ConstraintWidget constraintWidget3 = ((Barrier)constraintWidget0).mWidgets[v];
                        if(z || constraintWidget3.getVisibility() != 8) {
                            DependencyNode dependencyNode2 = constraintWidget3.verticalRun.end;
                            dependencyNode2.f.add(this.start);
                            this.start.g.add(dependencyNode2);
                        }
                        ++v;
                    }
                    this.d(this.a.verticalRun.start);
                    this.d(this.a.verticalRun.end);
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void applyToWidget() {
        ConstraintWidget constraintWidget0 = this.a;
        if(constraintWidget0 instanceof Barrier) {
            switch(((Barrier)constraintWidget0).getBarrierType()) {
                case 0: 
                case 1: {
                    this.a.setX(this.start.value);
                    break;
                }
                default: {
                    this.a.setY(this.start.value);
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
        this.b = null;
        this.start.clear();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean c() {
        return false;
    }

    public final void d(DependencyNode dependencyNode0) {
        this.start.f.add(dependencyNode0);
        dependencyNode0.g.add(this.start);
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void update(Dependency dependency0) {
        Barrier barrier0 = (Barrier)this.a;
        int v = barrier0.getBarrierType();
        int v1 = 0;
        int v2 = -1;
        for(Object object0: this.start.g) {
            int v3 = ((DependencyNode)object0).value;
            if(v2 == -1 || v3 < v2) {
                v2 = v3;
            }
            if(v1 < v3) {
                v1 = v3;
            }
        }
        if(v != 0 && v != 2) {
            this.start.resolve(barrier0.getMargin() + v1);
            return;
        }
        this.start.resolve(barrier0.getMargin() + v2);
    }
}

