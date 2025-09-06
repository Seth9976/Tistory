package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class n extends p {
    public final Method b;

    public n(Method method0) {
        this.b = method0;
    }

    @Override  // com.google.gson.internal.p
    public final boolean a(AccessibleObject accessibleObject0, Object object0) {
        try {
            return ((Boolean)this.b.invoke(accessibleObject0, object0)).booleanValue();
        }
        catch(Exception exception0) {
            throw new RuntimeException("Failed invoking canAccess", exception0);
        }
    }
}

