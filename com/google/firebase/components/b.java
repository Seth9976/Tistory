package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.local.IidStore;

public final class b implements Provider {
    public final int a;
    public final Object b;

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.firebase.inject.Provider
    public final Object get() {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                return ComponentDiscovery.a(((String)object0));
            }
            case 1: {
                return (ComponentRegistrar)object0;
            }
            default: {
                return new IidStore(((FirebaseApp)object0));
            }
        }
    }
}

