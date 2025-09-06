package com.google.firebase.crashlytics.internal.model;

public final class j1 extends Builder {
    public String a;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User$Builder
    public final User build() {
        String s = this.a == null ? " identifier" : "";
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new k1(this.a);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User$Builder
    public final Builder setIdentifier(String s) {
        if(s == null) {
            throw new NullPointerException("Null identifier");
        }
        this.a = s;
        return this;
    }
}

