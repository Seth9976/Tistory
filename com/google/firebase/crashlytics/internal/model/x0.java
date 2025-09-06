package com.google.firebase.crashlytics.internal.model;

public final class x0 extends Builder {
    public String a;
    public String b;
    public Long c;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder
    public final Signal build() {
        String s = this.a == null ? " name" : "";
        if(this.b == null) {
            s = s + " code";
        }
        if(this.c == null) {
            s = s + " address";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new y0(this.a, this.b, ((long)this.c));
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder
    public final Builder setAddress(long v) {
        this.c = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder
    public final Builder setCode(String s) {
        if(s == null) {
            throw new NullPointerException("Null code");
        }
        this.b = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder
    public final Builder setName(String s) {
        if(s == null) {
            throw new NullPointerException("Null name");
        }
        this.a = s;
        return this;
    }
}

