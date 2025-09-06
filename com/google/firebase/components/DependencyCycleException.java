package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    public final List a;

    public DependencyCycleException(List list0) {
        super("Dependency cycle detected: " + Arrays.toString(list0.toArray()));
        this.a = list0;
    }

    public List getComponentsInCycle() {
        return this.a;
    }
}

