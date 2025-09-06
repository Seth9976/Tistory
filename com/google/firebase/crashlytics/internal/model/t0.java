package com.google.firebase.crashlytics.internal.model;

public final class t0 extends Builder {
    public Long a;
    public Long b;
    public String c;
    public String d;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder
    public final BinaryImage build() {
        String s = this.a == null ? " baseAddress" : "";
        if(this.b == null) {
            s = s + " size";
        }
        if(this.c == null) {
            s = s + " name";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new u0(((long)this.a), this.c, this.d, ((long)this.b));
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder
    public final Builder setBaseAddress(long v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder
    public final Builder setName(String s) {
        if(s == null) {
            throw new NullPointerException("Null name");
        }
        this.c = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder
    public final Builder setSize(long v) {
        this.b = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder
    public final Builder setUuid(String s) {
        this.d = s;
        return this;
    }
}

