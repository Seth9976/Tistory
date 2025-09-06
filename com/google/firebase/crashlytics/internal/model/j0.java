package com.google.firebase.crashlytics.internal.model;

public final class j0 extends Builder {
    public String a;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization$Builder
    public final Organization build() {
        String s = this.a == null ? " clsId" : "";
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new k0(this.a);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization$Builder
    public final Builder setClsId(String s) {
        if(s == null) {
            throw new NullPointerException("Null clsId");
        }
        this.a = s;
        return this;
    }
}

