package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

public final class e {
    public WidgetRun a;
    public ArrayList b;

    public static void a(WidgetRun widgetRun0, int v) {
        if(!widgetRun0.a.isTerminalWidget[v]) {
            return;
        }
        for(Object object0: widgetRun0.start.f) {
            Dependency dependency0 = (Dependency)object0;
            if(dependency0 instanceof DependencyNode) {
                WidgetRun widgetRun1 = ((DependencyNode)dependency0).a;
                if(widgetRun1 != widgetRun0 && ((DependencyNode)dependency0) == widgetRun1.start) {
                    if(widgetRun0 instanceof ChainRun) {
                        for(Object object1: ((ChainRun)widgetRun0).e) {
                            e.a(((WidgetRun)object1), v);
                        }
                    }
                    else if(!(widgetRun0 instanceof d)) {
                        widgetRun0.a.isTerminalWidget[v] = false;
                    }
                    e.a(((DependencyNode)dependency0).a, v);
                }
            }
        }
        for(Object object2: widgetRun0.end.f) {
            Dependency dependency1 = (Dependency)object2;
            if(dependency1 instanceof DependencyNode) {
                WidgetRun widgetRun2 = ((DependencyNode)dependency1).a;
                if(widgetRun2 != widgetRun0 && ((DependencyNode)dependency1) == widgetRun2.start) {
                    if(widgetRun0 instanceof ChainRun) {
                        for(Object object3: ((ChainRun)widgetRun0).e) {
                            e.a(((WidgetRun)object3), v);
                        }
                    }
                    else if(!(widgetRun0 instanceof d)) {
                        widgetRun0.a.isTerminalWidget[v] = false;
                    }
                    e.a(((DependencyNode)dependency1).a, v);
                }
            }
        }
    }

    public static long b(DependencyNode dependencyNode0, long v) {
        WidgetRun widgetRun0 = dependencyNode0.a;
        if(widgetRun0 instanceof d) {
            return v;
        }
        ArrayList arrayList0 = dependencyNode0.f;
        int v1 = arrayList0.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            Dependency dependency0 = (Dependency)arrayList0.get(v2);
            if(dependency0 instanceof DependencyNode && ((DependencyNode)dependency0).a != widgetRun0) {
                v3 = Math.min(v3, e.b(((DependencyNode)dependency0), ((long)((DependencyNode)dependency0).c) + v));
            }
        }
        if(dependencyNode0 == widgetRun0.end) {
            long v4 = v - widgetRun0.getWrapDimension();
            return Math.min(Math.min(v3, e.b(widgetRun0.start, v4)), v4 - ((long)widgetRun0.start.c));
        }
        return v3;
    }

    public static long c(DependencyNode dependencyNode0, long v) {
        WidgetRun widgetRun0 = dependencyNode0.a;
        if(widgetRun0 instanceof d) {
            return v;
        }
        ArrayList arrayList0 = dependencyNode0.f;
        int v1 = arrayList0.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            Dependency dependency0 = (Dependency)arrayList0.get(v2);
            if(dependency0 instanceof DependencyNode && ((DependencyNode)dependency0).a != widgetRun0) {
                v3 = Math.max(v3, e.c(((DependencyNode)dependency0), ((long)((DependencyNode)dependency0).c) + v));
            }
        }
        if(dependencyNode0 == widgetRun0.start) {
            long v4 = v + widgetRun0.getWrapDimension();
            return Math.max(Math.max(v3, e.c(widgetRun0.end, v4)), v4 - ((long)widgetRun0.end.c));
        }
        return v3;
    }
}

