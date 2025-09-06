package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

public class Event {
    public final Class a;
    public final Object b;

    public Event(Class class0, Object object0) {
        this.a = (Class)Preconditions.checkNotNull(class0);
        this.b = Preconditions.checkNotNull(object0);
    }

    public Object getPayload() {
        return this.b;
    }

    public Class getType() {
        return this.a;
    }

    @Override
    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}

