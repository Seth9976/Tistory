package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import g.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class m extends b {
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final ComponentContainer h;

    public m(Component component0, ComponentContainer componentContainer0) {
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for(Object object0: component0.getDependencies()) {
            Dependency dependency0 = (Dependency)object0;
            if(dependency0.isDirectInjection()) {
                if(dependency0.isSet()) {
                    hashSet3.add(dependency0.getInterface());
                }
                else {
                    hashSet0.add(dependency0.getInterface());
                }
            }
            else if(dependency0.isDeferred()) {
                hashSet2.add(dependency0.getInterface());
            }
            else if(dependency0.isSet()) {
                hashSet4.add(dependency0.getInterface());
            }
            else {
                hashSet1.add(dependency0.getInterface());
            }
        }
        if(!component0.getPublishedEvents().isEmpty()) {
            hashSet0.add(Publisher.class);
        }
        this.b = Collections.unmodifiableSet(hashSet0);
        this.c = Collections.unmodifiableSet(hashSet1);
        this.d = Collections.unmodifiableSet(hashSet2);
        this.e = Collections.unmodifiableSet(hashSet3);
        this.f = Collections.unmodifiableSet(hashSet4);
        this.g = component0.getPublishedEvents();
        this.h = componentContainer0;
    }

    @Override  // g.b
    public final Object get(Class class0) {
        if(!this.b.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency " + class0 + ".");
        }
        Object object0 = this.h.get(class0);
        return !class0.equals(Publisher.class) ? object0 : new l(this.g, ((Publisher)object0));
    }

    @Override  // com.google.firebase.components.ComponentContainer
    public final Deferred getDeferred(Class class0) {
        if(!this.d.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + class0 + ">.");
        }
        return this.h.getDeferred(class0);
    }

    @Override  // com.google.firebase.components.ComponentContainer
    public final Provider getProvider(Class class0) {
        if(!this.c.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency Provider<" + class0 + ">.");
        }
        return this.h.getProvider(class0);
    }

    @Override  // g.b
    public final Set setOf(Class class0) {
        if(!this.e.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency Set<" + class0 + ">.");
        }
        return this.h.setOf(class0);
    }

    @Override  // com.google.firebase.components.ComponentContainer
    public final Provider setOfProvider(Class class0) {
        if(!this.f.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + class0 + ">>.");
        }
        return this.h.setOfProvider(class0);
    }
}

