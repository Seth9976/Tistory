package com.google.firebase.crashlytics.internal.model;

public final class p0 extends Builder {
    public Execution a;
    public ImmutableList b;
    public ImmutableList c;
    public Boolean d;
    public Integer e;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder
    public final Application build() {
        String s = this.a == null ? " execution" : "";
        if(this.e == null) {
            s = s + " uiOrientation";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new q0(this.a, this.b, this.c, this.d, ((int)this.e));
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder
    public final Builder setBackground(Boolean boolean0) {
        this.d = boolean0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder
    public final Builder setCustomAttributes(ImmutableList immutableList0) {
        this.b = immutableList0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder
    public final Builder setExecution(Execution crashlyticsReport$Session$Event$Application$Execution0) {
        if(crashlyticsReport$Session$Event$Application$Execution0 == null) {
            throw new NullPointerException("Null execution");
        }
        this.a = crashlyticsReport$Session$Event$Application$Execution0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder
    public final Builder setInternalKeys(ImmutableList immutableList0) {
        this.c = immutableList0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder
    public final Builder setUiOrientation(int v) {
        this.e = v;
        return this;
    }
}

