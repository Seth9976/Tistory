package com.google.android.datatransport.cct.internal;

import s6.g;

public final class f extends Builder {
    public Long a;
    public Integer b;
    public Long c;
    public byte[] d;
    public String e;
    public Long f;
    public NetworkConnectionInfo g;

    @Override  // com.google.android.datatransport.cct.internal.LogEvent$Builder
    public final LogEvent build() {
        String s = this.a == null ? " eventTimeMs" : "";
        if(this.c == null) {
            s = s + " eventUptimeMs";
        }
        if(this.f == null) {
            s = s + " timezoneOffsetSeconds";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new g(((long)this.a), this.b, ((long)this.c), this.d, this.e, ((long)this.f), this.g);
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent$Builder
    public final Builder setEventCode(Integer integer0) {
        this.b = integer0;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent$Builder
    public final Builder setEventTimeMs(long v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent$Builder
    public final Builder setEventUptimeMs(long v) {
        this.c = v;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent$Builder
    public final Builder setNetworkConnectionInfo(NetworkConnectionInfo networkConnectionInfo0) {
        this.g = networkConnectionInfo0;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent$Builder
    public final Builder setTimezoneOffsetSeconds(long v) {
        this.f = v;
        return this;
    }
}

