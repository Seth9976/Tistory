package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;

public final class j extends SendRequest.Builder {
    public TransportContext a;
    public String b;
    public Event c;
    public Transformer d;
    public Encoding e;

    @Override  // com.google.android.datatransport.runtime.SendRequest$Builder
    public final j a(Encoding encoding0) {
        if(encoding0 == null) {
            throw new NullPointerException("Null encoding");
        }
        this.e = encoding0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.SendRequest$Builder
    public final j b(Event event0) {
        if(event0 == null) {
            throw new NullPointerException("Null event");
        }
        this.c = event0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.SendRequest$Builder
    public final t build() {
        String s = this.a == null ? " transportContext" : "";
        if(this.b == null) {
            s = s + " transportName";
        }
        if(this.c == null) {
            s = s + " event";
        }
        if(this.d == null) {
            s = s + " transformer";
        }
        if(this.e == null) {
            s = s + " encoding";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new k(this.a, this.b, this.c, this.d, this.e);
    }

    @Override  // com.google.android.datatransport.runtime.SendRequest$Builder
    public final j c(Transformer transformer0) {
        if(transformer0 == null) {
            throw new NullPointerException("Null transformer");
        }
        this.d = transformer0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.SendRequest$Builder
    public final SendRequest.Builder setTransportContext(TransportContext transportContext0) {
        if(transportContext0 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.a = transportContext0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.SendRequest$Builder
    public final SendRequest.Builder setTransportName(String s) {
        if(s == null) {
            throw new NullPointerException("Null transportName");
        }
        this.b = s;
        return this;
    }
}

