package com.google.android.datatransport.runtime;

import java.util.Map;

public final class h extends Builder {
    public String a;
    public Integer b;
    public EncodedPayload c;
    public Long d;
    public Long e;
    public Map f;

    @Override  // com.google.android.datatransport.runtime.EventInternal$Builder
    public final EventInternal build() {
        String s = this.a == null ? " transportName" : "";
        if(this.c == null) {
            s = s + " encodedPayload";
        }
        if(this.d == null) {
            s = s + " eventMillis";
        }
        if(this.e == null) {
            s = s + " uptimeMillis";
        }
        if(this.f == null) {
            s = s + " autoMetadata";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new i(this.a, this.b, this.c, ((long)this.d), ((long)this.e), this.f);
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal$Builder
    public final Map getAutoMetadata() {
        Map map0 = this.f;
        if(map0 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        return map0;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal$Builder
    public final Builder setAutoMetadata(Map map0) {
        if(map0 == null) {
            throw new NullPointerException("Null autoMetadata");
        }
        this.f = map0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal$Builder
    public final Builder setCode(Integer integer0) {
        this.b = integer0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal$Builder
    public final Builder setEncodedPayload(EncodedPayload encodedPayload0) {
        if(encodedPayload0 == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.c = encodedPayload0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal$Builder
    public final Builder setEventMillis(long v) {
        this.d = v;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal$Builder
    public final Builder setTransportName(String s) {
        if(s == null) {
            throw new NullPointerException("Null transportName");
        }
        this.a = s;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal$Builder
    public final Builder setUptimeMillis(long v) {
        this.e = v;
        return this;
    }
}

