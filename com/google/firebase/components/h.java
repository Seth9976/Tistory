package com.google.firebase.components;

import androidx.activity.m;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;

public final class h implements Publisher, Subscriber {
    public final HashMap a;
    public ArrayDeque b;
    public final Executor c;

    public h(Executor executor0) {
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = executor0;
    }

    @Override  // com.google.firebase.events.Publisher
    public final void publish(Event event0) {
        int v1;
        Preconditions.checkNotNull(event0);
        synchronized(this) {
            ArrayDeque arrayDeque0 = this.b;
            if(arrayDeque0 != null) {
                arrayDeque0.add(event0);
                return;
            }
            __monitor_enter(this);
            v1 = FIN.finallyOpen$NT();
            Map map0 = (Map)this.a.get(event0.getType());
            Set set0 = map0 == null ? Collections.emptySet() : map0.entrySet();
            FIN.finallyCodeBegin$NT(v1);
        }
        FIN.finallyCodeEnd$NT(v1);
        for(Object object0: set0) {
            ((Executor)((Map.Entry)object0).getValue()).execute(new m(15, ((Map.Entry)object0), event0));
        }
    }

    @Override  // com.google.firebase.events.Subscriber
    public final void subscribe(Class class0, EventHandler eventHandler0) {
        this.subscribe(class0, this.c, eventHandler0);
    }

    @Override  // com.google.firebase.events.Subscriber
    public final void subscribe(Class class0, Executor executor0, EventHandler eventHandler0) {
        synchronized(this) {
            Preconditions.checkNotNull(class0);
            Preconditions.checkNotNull(eventHandler0);
            Preconditions.checkNotNull(executor0);
            if(!this.a.containsKey(class0)) {
                ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                this.a.put(class0, concurrentHashMap0);
            }
            ((ConcurrentHashMap)this.a.get(class0)).put(eventHandler0, executor0);
        }
    }

    @Override  // com.google.firebase.events.Subscriber
    public final void unsubscribe(Class class0, EventHandler eventHandler0) {
        synchronized(this) {
            Preconditions.checkNotNull(class0);
            Preconditions.checkNotNull(eventHandler0);
            if(!this.a.containsKey(class0)) {
                return;
            }
            ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)this.a.get(class0);
            concurrentHashMap0.remove(eventHandler0);
            if(concurrentHashMap0.isEmpty()) {
                this.a.remove(class0);
            }
        }
    }
}

