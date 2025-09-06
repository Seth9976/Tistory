package com.google.firebase.components;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;

public final class e implements Provider {
    public final int a;
    public final Object b;
    public final Object c;

    public e(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // com.google.firebase.inject.Provider
    public final Object get() {
        Object object0 = this.c;
        Object object1 = this.b;
        switch(this.a) {
            case 0: {
                ((ComponentRuntime)object1).getClass();
                return ((Component)object0).getFactory().create(new m(((Component)object0), ((ComponentRuntime)object1)));
            }
            case 1: {
                return new DataCollectionConfigStorage(((Context)object0), ((FirebaseApp)object1).getPersistenceKey(), ((Publisher)((FirebaseApp)object1).d.get(Publisher.class)));
            }
            default: {
                return new v8.e(((Context)object1), ((String)object0));
            }
        }
    }
}

