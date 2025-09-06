package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public class Lazy implements Provider {
    public volatile Object a;
    public volatile Provider b;
    public static final Object c;

    static {
        Lazy.c = new Object();
    }

    public Lazy(Provider provider0) {
        this.a = Lazy.c;
        this.b = provider0;
    }

    @Override  // com.google.firebase.inject.Provider
    public Object get() {
        Object object0 = this.a;
        Object object1 = Lazy.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.a;
                if(object0 == object1) {
                    object0 = this.b.get();
                    this.a = object0;
                    this.b = null;
                }
            }
        }
        return object0;
    }
}

