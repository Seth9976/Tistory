package com.google.firebase.crashlytics.internal.model;

public final class h0 extends Builder {
    public String a;
    public String b;
    public String c;
    public Organization d;
    public String e;
    public String f;
    public String g;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder
    public final Application build() {
        String s = this.a == null ? " identifier" : "";
        if(this.b == null) {
            s = s + " version";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new i0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder
    public final Builder setDevelopmentPlatform(String s) {
        this.f = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder
    public final Builder setDevelopmentPlatformVersion(String s) {
        this.g = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder
    public final Builder setDisplayVersion(String s) {
        this.c = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder
    public final Builder setIdentifier(String s) {
        if(s == null) {
            throw new NullPointerException("Null identifier");
        }
        this.a = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder
    public final Builder setInstallationUuid(String s) {
        this.e = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder
    public final Builder setOrganization(Organization crashlyticsReport$Session$Application$Organization0) {
        this.d = crashlyticsReport$Session$Application$Organization0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder
    public final Builder setVersion(String s) {
        if(s == null) {
            throw new NullPointerException("Null version");
        }
        this.b = s;
        return this;
    }
}

