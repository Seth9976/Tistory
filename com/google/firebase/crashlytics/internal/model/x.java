package com.google.firebase.crashlytics.internal.model;

public final class x extends Builder {
    public Integer a;
    public String b;
    public Integer c;
    public Integer d;
    public Long e;
    public Long f;
    public Long g;
    public String h;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final ApplicationExitInfo build() {
        String s = this.a == null ? " pid" : "";
        if(this.b == null) {
            s = s + " processName";
        }
        if(this.c == null) {
            s = s + " reasonCode";
        }
        if(this.d == null) {
            s = s + " importance";
        }
        if(this.e == null) {
            s = s + " pss";
        }
        if(this.f == null) {
            s = s + " rss";
        }
        if(this.g == null) {
            s = s + " timestamp";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new y(((int)this.a), this.b, ((int)this.c), ((int)this.d), ((long)this.e), ((long)this.f), ((long)this.g), this.h);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final Builder setImportance(int v) {
        this.d = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final Builder setPid(int v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final Builder setProcessName(String s) {
        if(s == null) {
            throw new NullPointerException("Null processName");
        }
        this.b = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final Builder setPss(long v) {
        this.e = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final Builder setReasonCode(int v) {
        this.c = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final Builder setRss(long v) {
        this.f = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final Builder setTimestamp(long v) {
        this.g = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder
    public final Builder setTraceFile(String s) {
        this.h = s;
        return this;
    }
}

