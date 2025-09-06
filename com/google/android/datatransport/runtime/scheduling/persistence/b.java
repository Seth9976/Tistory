package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

public final class b extends PersistedEvent {
    public final long a;
    public final TransportContext b;
    public final EventInternal c;

    public b(long v, TransportContext transportContext0, EventInternal eventInternal0) {
        this.a = v;
        if(transportContext0 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = transportContext0;
        if(eventInternal0 == null) {
            throw new NullPointerException("Null event");
        }
        this.c = eventInternal0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof PersistedEvent) {
            long v = ((PersistedEvent)object0).getId();
            if(this.a == v) {
                TransportContext transportContext0 = ((PersistedEvent)object0).getTransportContext();
                if(this.b.equals(transportContext0)) {
                    EventInternal eventInternal0 = ((PersistedEvent)object0).getEvent();
                    return this.c.equals(eventInternal0);
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final EventInternal getEvent() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final long getId() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final TransportContext getTransportContext() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return ((((int)(this.a >>> 0x20 ^ this.a)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}

