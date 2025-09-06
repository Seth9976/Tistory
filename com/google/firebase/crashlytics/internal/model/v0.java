package com.google.firebase.crashlytics.internal.model;

public final class v0 extends Builder {
    public String a;
    public String b;
    public ImmutableList c;
    public Exception d;
    public Integer e;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder
    public final Exception build() {
        String s = this.a == null ? " type" : "";
        if(this.c == null) {
            s = s + " frames";
        }
        if(this.e == null) {
            s = s + " overflowCount";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new w0(this.a, this.b, this.c, this.d, ((int)this.e));
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder
    public final Builder setCausedBy(Exception crashlyticsReport$Session$Event$Application$Execution$Exception0) {
        this.d = crashlyticsReport$Session$Event$Application$Execution$Exception0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder
    public final Builder setFrames(ImmutableList immutableList0) {
        if(immutableList0 == null) {
            throw new NullPointerException("Null frames");
        }
        this.c = immutableList0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder
    public final Builder setOverflowCount(int v) {
        this.e = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder
    public final Builder setReason(String s) {
        this.b = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder
    public final Builder setType(String s) {
        if(s == null) {
            throw new NullPointerException("Null type");
        }
        this.a = s;
        return this;
    }
}

