package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;
import y8.b;

public class ComponentMonitor implements ComponentRegistrarProcessor {
    @Override  // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar0) {
        List list0 = new ArrayList();
        for(Object object0: componentRegistrar0.getComponents()) {
            Component component0 = (Component)object0;
            String s = component0.getName();
            if(s != null) {
                component0 = component0.withFactory(new b(component0, 1, s));
            }
            ((ArrayList)list0).add(component0);
        }
        return list0;
    }
}

