package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

public class DependencyNode implements Dependency {
    public final WidgetRun a;
    public int b;
    public int c;
    public int d;
    public boolean delegateToWidgetRun;
    public b e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean readyToSolve;
    public boolean resolved;
    public Dependency updateDelegate;
    public int value;

    public DependencyNode(WidgetRun widgetRun0) {
        this.updateDelegate = null;
        this.delegateToWidgetRun = false;
        this.readyToSolve = false;
        this.b = 1;
        this.d = 1;
        this.e = null;
        this.resolved = false;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.a = widgetRun0;
    }

    public void addDependency(Dependency dependency0) {
        this.f.add(dependency0);
        if(this.resolved) {
            dependency0.update(dependency0);
        }
    }

    public void clear() {
        this.g.clear();
        this.f.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }

    public String name() {
        String s1;
        String s = this.a.a.getDebugName();
        StringBuilder stringBuilder0 = a5.b.u((this.b == 4 || this.b == 5 ? s + "_HORIZONTAL" : s + "_VERTICAL"), ":");
        switch(this.b) {
            case 1: {
                s1 = "UNKNOWN";
                break;
            }
            case 2: {
                s1 = "HORIZONTAL_DIMENSION";
                break;
            }
            case 3: {
                s1 = "VERTICAL_DIMENSION";
                break;
            }
            case 4: {
                s1 = "LEFT";
                break;
            }
            case 5: {
                s1 = "RIGHT";
                break;
            }
            case 6: {
                s1 = "TOP";
                break;
            }
            case 7: {
                s1 = "BOTTOM";
                break;
            }
            case 8: {
                s1 = "BASELINE";
                break;
            }
            default: {
                throw null;
            }
        }
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    public void resolve(int v) {
        if(this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = v;
        for(Object object0: this.f) {
            ((Dependency)object0).update(((Dependency)object0));
        }
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a.a.getDebugName());
        stringBuilder0.append(":");
        switch(this.b) {
            case 1: {
                s = "UNKNOWN";
                break;
            }
            case 2: {
                s = "HORIZONTAL_DIMENSION";
                break;
            }
            case 3: {
                s = "VERTICAL_DIMENSION";
                break;
            }
            case 4: {
                s = "LEFT";
                break;
            }
            case 5: {
                s = "RIGHT";
                break;
            }
            case 6: {
                s = "TOP";
                break;
            }
            case 7: {
                s = "BOTTOM";
                break;
            }
            case 8: {
                s = "BASELINE";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append("(");
        Integer integer0 = this.resolved ? this.value : "unresolved";
        stringBuilder0.append(integer0);
        stringBuilder0.append(") <t=");
        stringBuilder0.append(this.g.size());
        stringBuilder0.append(":d=");
        stringBuilder0.append(this.f.size());
        stringBuilder0.append(">");
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency0) {
        ArrayList arrayList0 = this.g;
        for(Object object0: arrayList0) {
            if(!((DependencyNode)object0).resolved) {
                return;
            }
            if(false) {
                break;
            }
        }
        this.readyToSolve = true;
        Dependency dependency1 = this.updateDelegate;
        if(dependency1 != null) {
            dependency1.update(this);
        }
        if(this.delegateToWidgetRun) {
            this.a.update(this);
            return;
        }
        DependencyNode dependencyNode0 = null;
        int v = 0;
        for(Object object1: arrayList0) {
            DependencyNode dependencyNode1 = (DependencyNode)object1;
            if(!(dependencyNode1 instanceof b)) {
                ++v;
                dependencyNode0 = dependencyNode1;
            }
        }
        if(dependencyNode0 != null && v == 1 && dependencyNode0.resolved) {
            b b0 = this.e;
            if(b0 != null) {
                if(b0.resolved) {
                    this.c = this.d * b0.value;
                    goto label_31;
                }
                return;
            }
        label_31:
            this.resolve(dependencyNode0.value + this.c);
        }
        Dependency dependency2 = this.updateDelegate;
        if(dependency2 != null) {
            dependency2.update(this);
        }
    }
}

