package androidx.constraintlayout.core.widgets.analyzer;

public class b extends DependencyNode {
    public int h;

    public b(WidgetRun widgetRun0) {
        super(widgetRun0);
        if(widgetRun0 instanceof HorizontalWidgetRun) {
            this.b = 2;
            return;
        }
        this.b = 3;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public final void resolve(int v) {
        if(this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = v;
        for(Object object0: this.f) {
            ((Dependency)object0).update(((Dependency)object0));
        }
    }
}

