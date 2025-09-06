package com.google.firebase.crashlytics.internal.model;

public final class d1 extends Builder {
    public Double a;
    public Integer b;
    public Boolean c;
    public Integer d;
    public Long e;
    public Long f;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder
    public final Device build() {
        String s = this.b == null ? " batteryVelocity" : "";
        if(this.c == null) {
            s = s + " proximityOn";
        }
        if(this.d == null) {
            s = s + " orientation";
        }
        if(this.e == null) {
            s = s + " ramUsed";
        }
        if(this.f == null) {
            s = s + " diskUsed";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new e1(this.a, ((int)this.b), this.c.booleanValue(), ((int)this.d), ((long)this.e), ((long)this.f));
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder
    public final Builder setBatteryLevel(Double double0) {
        this.a = double0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder
    public final Builder setBatteryVelocity(int v) {
        this.b = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder
    public final Builder setDiskUsed(long v) {
        this.f = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder
    public final Builder setOrientation(int v) {
        this.d = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder
    public final Builder setProximityOn(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder
    public final Builder setRamUsed(long v) {
        this.e = v;
        return this;
    }
}

