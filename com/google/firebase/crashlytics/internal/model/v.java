package com.google.firebase.crashlytics.internal.model;

public final class v extends Builder {
    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public Session g;
    public FilesPayload h;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final CrashlyticsReport build() {
        String s = this.a == null ? " sdkVersion" : "";
        if(this.b == null) {
            s = s + " gmpAppId";
        }
        if(this.c == null) {
            s = s + " platform";
        }
        if(this.d == null) {
            s = s + " installationUuid";
        }
        if(this.e == null) {
            s = s + " buildVersion";
        }
        if(this.f == null) {
            s = s + " displayVersion";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new w(this.a, this.b, ((int)this.c), this.d, this.e, this.f, this.g, this.h);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final Builder setBuildVersion(String s) {
        if(s == null) {
            throw new NullPointerException("Null buildVersion");
        }
        this.e = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final Builder setDisplayVersion(String s) {
        if(s == null) {
            throw new NullPointerException("Null displayVersion");
        }
        this.f = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final Builder setGmpAppId(String s) {
        if(s == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        this.b = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final Builder setInstallationUuid(String s) {
        if(s == null) {
            throw new NullPointerException("Null installationUuid");
        }
        this.d = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final Builder setNdkPayload(FilesPayload crashlyticsReport$FilesPayload0) {
        this.h = crashlyticsReport$FilesPayload0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final Builder setPlatform(int v) {
        this.c = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final Builder setSdkVersion(String s) {
        if(s == null) {
            throw new NullPointerException("Null sdkVersion");
        }
        this.a = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder
    public final Builder setSession(Session crashlyticsReport$Session0) {
        this.g = crashlyticsReport$Session0;
        return this;
    }
}

