package com.google.firebase.crashlytics.internal.model;

public final class f0 extends Builder {
    public String a;
    public String b;
    public Long c;
    public Long d;
    public Boolean e;
    public Application f;
    public User g;
    public OperatingSystem h;
    public Device i;
    public ImmutableList j;
    public Integer k;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Session build() {
        String s = this.a == null ? " generator" : "";
        if(this.b == null) {
            s = s + " identifier";
        }
        if(this.c == null) {
            s = s + " startedAt";
        }
        if(this.e == null) {
            s = s + " crashed";
        }
        if(this.f == null) {
            s = s + " app";
        }
        if(this.k == null) {
            s = s + " generatorType";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new g0(this.a, this.b, ((long)this.c), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, ((int)this.k));
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setApp(Application crashlyticsReport$Session$Application0) {
        if(crashlyticsReport$Session$Application0 == null) {
            throw new NullPointerException("Null app");
        }
        this.f = crashlyticsReport$Session$Application0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setCrashed(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setDevice(Device crashlyticsReport$Session$Device0) {
        this.i = crashlyticsReport$Session$Device0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setEndedAt(Long long0) {
        this.d = long0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setEvents(ImmutableList immutableList0) {
        this.j = immutableList0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setGenerator(String s) {
        if(s == null) {
            throw new NullPointerException("Null generator");
        }
        this.a = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setGeneratorType(int v) {
        this.k = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setIdentifier(String s) {
        if(s == null) {
            throw new NullPointerException("Null identifier");
        }
        this.b = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setOs(OperatingSystem crashlyticsReport$Session$OperatingSystem0) {
        this.h = crashlyticsReport$Session$OperatingSystem0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setStartedAt(long v) {
        this.c = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder
    public final Builder setUser(User crashlyticsReport$Session$User0) {
        this.g = crashlyticsReport$Session$User0;
        return this;
    }
}

