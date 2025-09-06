package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class i implements Provider {
    public volatile Set a;
    public volatile Set b;

    @Override  // com.google.firebase.inject.Provider
    public final Object get() {
        if(this.b == null) {
            synchronized(this) {
                if(this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized(this) {
                        for(Object object0: this.a) {
                            this.b.add(((Provider)object0).get());
                        }
                        this.a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}

