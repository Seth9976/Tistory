package com.google.firebase.crashlytics.internal.model;

public final class z extends Builder {
    public String a;
    public String b;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder
    public final CustomAttribute build() {
        String s = this.a == null ? " key" : "";
        if(this.b == null) {
            s = s + " value";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new a0(this.a, this.b);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder
    public final Builder setKey(String s) {
        if(s == null) {
            throw new NullPointerException("Null key");
        }
        this.a = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder
    public final Builder setValue(String s) {
        if(s == null) {
            throw new NullPointerException("Null value");
        }
        this.b = s;
        return this;
    }
}

