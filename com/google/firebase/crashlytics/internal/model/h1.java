package com.google.firebase.crashlytics.internal.model;

public final class h1 extends Builder {
    public Integer a;
    public String b;
    public String c;
    public Boolean d;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder
    public final OperatingSystem build() {
        String s = this.a == null ? " platform" : "";
        if(this.b == null) {
            s = s + " version";
        }
        if(this.c == null) {
            s = s + " buildVersion";
        }
        if(this.d == null) {
            s = s + " jailbroken";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new i1(((int)this.a), this.b, this.d.booleanValue(), this.c);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder
    public final Builder setBuildVersion(String s) {
        if(s == null) {
            throw new NullPointerException("Null buildVersion");
        }
        this.c = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder
    public final Builder setJailbroken(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder
    public final Builder setPlatform(int v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder
    public final Builder setVersion(String s) {
        if(s == null) {
            throw new NullPointerException("Null version");
        }
        this.b = s;
        return this;
    }
}

