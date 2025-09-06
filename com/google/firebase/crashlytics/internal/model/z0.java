package com.google.firebase.crashlytics.internal.model;

public final class z0 extends Builder {
    public String a;
    public Integer b;
    public ImmutableList c;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder
    public final Thread build() {
        String s = this.a == null ? " name" : "";
        if(this.b == null) {
            s = s + " importance";
        }
        if(this.c == null) {
            s = s + " frames";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new a1(this.a, ((int)this.b), this.c);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder
    public final Builder setFrames(ImmutableList immutableList0) {
        if(immutableList0 == null) {
            throw new NullPointerException("Null frames");
        }
        this.c = immutableList0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder
    public final Builder setImportance(int v) {
        this.b = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder
    public final Builder setName(String s) {
        if(s == null) {
            throw new NullPointerException("Null name");
        }
        this.a = s;
        return this;
    }
}

