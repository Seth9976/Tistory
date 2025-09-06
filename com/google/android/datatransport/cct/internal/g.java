package com.google.android.datatransport.cct.internal;

import java.util.List;
import s6.h;

public final class g extends Builder {
    public Long a;
    public Long b;
    public ClientInfo c;
    public Integer d;
    public String e;
    public List f;
    public QosTier g;

    @Override  // com.google.android.datatransport.cct.internal.LogRequest$Builder
    public final g a(Integer integer0) {
        this.d = integer0;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest$Builder
    public final g b(String s) {
        this.e = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest$Builder
    public final LogRequest build() {
        String s = this.a == null ? " requestTimeMs" : "";
        if(this.b == null) {
            s = s + " requestUptimeMs";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new h(((long)this.a), ((long)this.b), this.c, this.d, this.e, this.f, this.g);
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest$Builder
    public final Builder setClientInfo(ClientInfo clientInfo0) {
        this.c = clientInfo0;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest$Builder
    public final Builder setLogEvents(List list0) {
        this.f = list0;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest$Builder
    public final Builder setQosTier(QosTier qosTier0) {
        this.g = qosTier0;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest$Builder
    public final Builder setRequestTimeMs(long v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest$Builder
    public final Builder setRequestUptimeMs(long v) {
        this.b = v;
        return this;
    }
}

