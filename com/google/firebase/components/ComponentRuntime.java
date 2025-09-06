package com.google.firebase.components;

import android.util.Log;
import androidx.activity.m;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import g.a;
import g.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class ComponentRuntime extends b implements ComponentLoader {
    public static final class Builder {
        public final Executor a;
        public final ArrayList b;
        public final ArrayList c;
        public ComponentRegistrarProcessor d;

        public Builder(Executor executor0) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = ComponentRegistrarProcessor.NOOP;
            this.a = executor0;
        }

        @CanIgnoreReturnValue
        public Builder addComponent(Component component0) {
            this.c.add(component0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addComponentRegistrar(ComponentRegistrar componentRegistrar0) {
            com.google.firebase.components.b b0 = new com.google.firebase.components.b(componentRegistrar0, 1);
            this.b.add(b0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addLazyComponentRegistrars(Collection collection0) {
            this.b.addAll(collection0);
            return this;
        }

        public ComponentRuntime build() {
            return new ComponentRuntime(this.a, this.b, this.c, this.d);
        }

        @CanIgnoreReturnValue
        public Builder setProcessor(ComponentRegistrarProcessor componentRegistrarProcessor0) {
            this.d = componentRegistrarProcessor0;
            return this;
        }
    }

    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final ArrayList e;
    public final h f;
    public final AtomicReference g;
    public final ComponentRegistrarProcessor h;
    public static final d i;

    static {
        ComponentRuntime.i = new d(0);
    }

    @Deprecated
    public ComponentRuntime(Executor executor0, Iterable iterable0, Component[] arr_component) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            arrayList0.add(new com.google.firebase.components.b(((ComponentRegistrar)object0), 1));
        }
        this(executor0, arrayList0, Arrays.asList(arr_component), ComponentRegistrarProcessor.NOOP);
    }

    public ComponentRuntime(Executor executor0, ArrayList arrayList0, List list0, ComponentRegistrarProcessor componentRegistrarProcessor0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.g = new AtomicReference();
        h h0 = new h(executor0);
        this.f = h0;
        this.h = componentRegistrarProcessor0;
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(Component.of(h0, h.class, new Class[]{Subscriber.class, Publisher.class}));
        arrayList1.add(Component.of(this, ComponentLoader.class, new Class[0]));
        for(Object object0: list0) {
            Component component0 = (Component)object0;
            if(component0 != null) {
                arrayList1.add(component0);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object1: arrayList0) {
            arrayList2.add(object1);
        }
        this.e = arrayList2;
        this.M(arrayList1);
    }

    public final void M(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        synchronized(this) {
            Iterator iterator0 = this.e.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Provider provider0 = (Provider)object0;
                try {
                    ComponentRegistrar componentRegistrar0 = (ComponentRegistrar)provider0.get();
                    if(componentRegistrar0 == null) {
                        continue;
                    }
                    arrayList0.addAll(this.h.processRegistrar(componentRegistrar0));
                    iterator0.remove();
                }
                catch(InvalidRegistrarException invalidRegistrarException0) {
                    iterator0.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", invalidRegistrarException0);
                }
            }
            if(this.b.isEmpty()) {
                a.r(arrayList0);
            }
            else {
                ArrayList arrayList2 = new ArrayList(this.b.keySet());
                arrayList2.addAll(arrayList0);
                a.r(arrayList2);
            }
            for(Object object1: arrayList0) {
                Lazy lazy0 = new Lazy(new e(0, this, ((Component)object1)));
                this.b.put(((Component)object1), lazy0);
            }
            arrayList1.addAll(this.P(arrayList0));
            arrayList1.addAll(this.Q());
            this.O();
        }
        for(Object object2: arrayList1) {
            ((Runnable)object2).run();
        }
        Boolean boolean0 = (Boolean)this.g.get();
        if(boolean0 != null) {
            this.N(this.b, boolean0.booleanValue());
        }
    }

    public final void N(HashMap hashMap0, boolean z) {
        for(Object object0: hashMap0.entrySet()) {
            Component component0 = (Component)((Map.Entry)object0).getKey();
            Provider provider0 = (Provider)((Map.Entry)object0).getValue();
            if(component0.isAlwaysEager() || component0.isEagerInDefaultApp() && z) {
                provider0.get();
            }
        }
        h h0 = this.f;
        synchronized(h0) {
            ArrayDeque arrayDeque0 = h0.b;
            if(arrayDeque0 == null) {
                arrayDeque0 = null;
            }
            else {
                h0.b = null;
            }
        }
        if(arrayDeque0 != null) {
            for(Object object1: arrayDeque0) {
                h0.publish(((Event)object1));
            }
        }
    }

    public final void O() {
        for(Object object0: this.b.keySet()) {
            Component component0 = (Component)object0;
            for(Object object1: component0.getDependencies()) {
                Dependency dependency0 = (Dependency)object1;
                if(dependency0.isSet()) {
                    HashMap hashMap0 = this.d;
                    if(!hashMap0.containsKey(dependency0.getInterface())) {
                        Set set0 = Collections.emptySet();
                        i i0 = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
                        i0.b = null;
                        i0.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        i0.a.addAll(set0);
                        hashMap0.put(dependency0.getInterface(), i0);
                        continue;
                    }
                }
                HashMap hashMap1 = this.c;
                if(!hashMap1.containsKey(dependency0.getInterface())) {
                    if(dependency0.isRequired()) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + component0 + ": " + dependency0.getInterface());
                    }
                    if(!dependency0.isSet()) {
                        hashMap1.put(dependency0.getInterface(), new k(k.c, k.d));
                    }
                }
            }
        }
    }

    public final ArrayList P(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            Component component0 = (Component)object0;
            if(component0.isValue()) {
                Provider provider0 = (Provider)this.b.get(component0);
                for(Object object1: component0.getProvidedInterfaces()) {
                    Class class0 = (Class)object1;
                    HashMap hashMap0 = this.c;
                    if(hashMap0.containsKey(class0)) {
                        arrayList1.add(new m(13, ((k)(((Provider)hashMap0.get(class0)))), provider0));
                    }
                    else {
                        hashMap0.put(class0, provider0);
                    }
                }
            }
        }
        return arrayList1;
    }

    public final ArrayList Q() {
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Component component0 = (Component)map$Entry0.getKey();
            if(!component0.isValue()) {
                Provider provider0 = (Provider)map$Entry0.getValue();
                for(Object object1: component0.getProvidedInterfaces()) {
                    Class class0 = (Class)object1;
                    if(!hashMap0.containsKey(class0)) {
                        hashMap0.put(class0, new HashSet());
                    }
                    ((Set)hashMap0.get(class0)).add(provider0);
                }
            }
        }
        for(Object object2: hashMap0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object2;
            Object object3 = map$Entry1.getKey();
            HashMap hashMap1 = this.d;
            if(hashMap1.containsKey(object3)) {
                i i1 = (i)hashMap1.get(map$Entry1.getKey());
                for(Object object4: ((Set)map$Entry1.getValue())) {
                    arrayList0.add(new m(14, i1, ((Provider)object4)));
                }
            }
            else {
                Class class1 = (Class)map$Entry1.getKey();
                Set set0 = (Set)(((Collection)map$Entry1.getValue()));
                i i0 = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
                i0.b = null;
                i0.a = Collections.newSetFromMap(new ConcurrentHashMap());
                i0.a.addAll(set0);
                hashMap1.put(class1, i0);
            }
        }
        return arrayList0;
    }

    public static Builder builder(Executor executor0) {
        return new Builder(executor0);
    }

    @Override  // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized(this) {
            if(this.e.isEmpty()) {
                return;
            }
        }
        this.M(new ArrayList());
    }

    @Override  // g.b
    public Object get(Class class0) {
        return super.get(class0);
    }

    @Override  // com.google.firebase.components.ComponentContainer
    public Deferred getDeferred(Class class0) {
        Provider provider0 = this.getProvider(class0);
        if(provider0 == null) {
            return new k(k.c, k.d);
        }
        return provider0 instanceof k ? ((k)provider0) : new k(null, provider0);
    }

    @Override  // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Class class0) {
        synchronized(this) {
            Preconditions.checkNotNull(class0, "Null interface requested.");
            return (Provider)this.c.get(class0);
        }
    }

    @RestrictTo({Scope.TESTS})
    @VisibleForTesting
    public void initializeAllComponentsForTests() {
        for(Object object0: this.b.values()) {
            ((Provider)object0).get();
        }
    }

    public void initializeEagerComponents(boolean z) {
        HashMap hashMap0;
        AtomicReference atomicReference0 = this.g;
        Boolean boolean0 = Boolean.valueOf(z);
        do {
            if(atomicReference0.compareAndSet(null, boolean0)) {
                synchronized(this) {
                    hashMap0 = new HashMap(this.b);
                }
                this.N(hashMap0, z);
                return;
            }
        }
        while(atomicReference0.get() == null);
    }

    @Override  // g.b
    public Set setOf(Class class0) {
        return super.setOf(class0);
    }

    @Override  // com.google.firebase.components.ComponentContainer
    public Provider setOfProvider(Class class0) {
        synchronized(this) {
            Provider provider0 = (i)this.d.get(class0);
            return provider0 != null ? provider0 : ComponentRuntime.i;
        }
    }
}

