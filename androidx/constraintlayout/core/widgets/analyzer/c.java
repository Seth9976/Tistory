package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Guideline;

public final class c extends WidgetRun {
    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        Guideline guideline0 = (Guideline)this.a;
        int v = guideline0.getRelativeBegin();
        int v1 = guideline0.getRelativeEnd();
        if(guideline0.getOrientation() == 1) {
            if(v != -1) {
                this.start.g.add(this.a.mParent.horizontalRun.start);
                this.a.mParent.horizontalRun.start.f.add(this.start);
                this.start.c = v;
            }
            else if(v1 == -1) {
                this.start.delegateToWidgetRun = true;
                this.start.g.add(this.a.mParent.horizontalRun.end);
                this.a.mParent.horizontalRun.end.f.add(this.start);
            }
            else {
                this.start.g.add(this.a.mParent.horizontalRun.end);
                this.a.mParent.horizontalRun.end.f.add(this.start);
                this.start.c = -v1;
            }
            this.d(this.a.horizontalRun.start);
            this.d(this.a.horizontalRun.end);
            return;
        }
        if(v != -1) {
            this.start.g.add(this.a.mParent.verticalRun.start);
            this.a.mParent.verticalRun.start.f.add(this.start);
            this.start.c = v;
        }
        else if(v1 == -1) {
            this.start.delegateToWidgetRun = true;
            this.start.g.add(this.a.mParent.verticalRun.end);
            this.a.mParent.verticalRun.end.f.add(this.start);
        }
        else {
            this.start.g.add(this.a.mParent.verticalRun.end);
            this.a.mParent.verticalRun.end.f.add(this.start);
            this.start.c = -v1;
        }
        this.d(this.a.verticalRun.start);
        this.d(this.a.verticalRun.end);
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void applyToWidget() {
        if(((Guideline)this.a).getOrientation() == 1) {
            this.a.setX(this.start.value);
            return;
        }
        this.a.setY(this.start.value);
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
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
        DependencyNode dependencyNode0 = this.start;
        if(!dependencyNode0.readyToSolve) {
            return;
        }
        if(dependencyNode0.resolved) {
            return;
        }
        float f = (float)((DependencyNode)dependencyNode0.g.get(0)).value;
        this.start.resolve(((int)(((Guideline)this.a).getRelativePercent() * f + 0.5f)));
    }
}

