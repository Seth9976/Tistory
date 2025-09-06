package com.google.firebase.crashlytics.internal.model;

public final class n0 extends Builder {
    public Long a;
    public String b;
    public Application c;
    public Device d;
    public Log e;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder
    public final Event build() {
        String s = this.a == null ? " timestamp" : "";
        if(this.b == null) {
            s = s + " type";
        }
        if(this.c == null) {
            s = s + " app";
        }
        if(this.d == null) {
            s = s + " device";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new o0(((long)this.a), this.b, this.c, this.d, this.e);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder
    public final Builder setApp(Application crashlyticsReport$Session$Event$Application0) {
        if(crashlyticsReport$Session$Event$Application0 == null) {
            throw new NullPointerException("Null app");
        }
        this.c = crashlyticsReport$Session$Event$Application0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder
    public final Builder setDevice(Device crashlyticsReport$Session$Event$Device0) {
        if(crashlyticsReport$Session$Event$Device0 == null) {
            throw new NullPointerException("Null device");
        }
        this.d = crashlyticsReport$Session$Event$Device0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder
    public final Builder setLog(Log crashlyticsReport$Session$Event$Log0) {
        this.e = crashlyticsReport$Session$Event$Log0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder
    public final Builder setTimestamp(long v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder
    public final Builder setType(String s) {
        if(s == null) {
            throw new NullPointerException("Null type");
        }
        this.b = s;
        return this;
    }
}

