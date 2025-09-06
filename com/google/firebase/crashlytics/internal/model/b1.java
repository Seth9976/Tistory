package com.google.firebase.crashlytics.internal.model;

public final class b1 extends Builder {
    public Long a;
    public String b;
    public String c;
    public Long d;
    public Integer e;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder
    public final Frame build() {
        String s = this.a == null ? " pc" : "";
        if(this.b == null) {
            s = s + " symbol";
        }
        if(this.d == null) {
            s = s + " offset";
        }
        if(this.e == null) {
            s = s + " importance";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new c1(((long)this.a), this.b, ((int)this.e), ((long)this.d), this.c);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder
    public final Builder setFile(String s) {
        this.c = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder
    public final Builder setImportance(int v) {
        this.e = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder
    public final Builder setOffset(long v) {
        this.d = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder
    public final Builder setPc(long v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder
    public final Builder setSymbol(String s) {
        if(s == null) {
            throw new NullPointerException("Null symbol");
        }
        this.b = s;
        return this;
    }
}

