package com.google.firebase.crashlytics.internal.model;

public final class o0 extends Event {
    public final long a;
    public final String b;
    public final Application c;
    public final Device d;
    public final Log e;

    public o0(long v, String s, Application crashlyticsReport$Session$Event$Application0, Device crashlyticsReport$Session$Event$Device0, Log crashlyticsReport$Session$Event$Log0) {
        this.a = v;
        this.b = s;
        this.c = crashlyticsReport$Session$Event$Application0;
        this.d = crashlyticsReport$Session$Event$Device0;
        this.e = crashlyticsReport$Session$Event$Log0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Event) {
            long v = ((Event)object0).getTimestamp();
            if(this.a == v) {
                String s = ((Event)object0).getType();
                if(this.b.equals(s)) {
                    Application crashlyticsReport$Session$Event$Application0 = ((Event)object0).getApp();
                    if(this.c.equals(crashlyticsReport$Session$Event$Application0)) {
                        Device crashlyticsReport$Session$Event$Device0 = ((Event)object0).getDevice();
                        if(this.d.equals(crashlyticsReport$Session$Event$Device0)) {
                            return this.e == null ? ((Event)object0).getLog() == null : this.e.equals(((Event)object0).getLog());
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event
    public final Application getApp() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event
    public final Device getDevice() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event
    public final Log getLog() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event
    public final long getTimestamp() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event
    public final String getType() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = ((((((int)(this.a >>> 0x20 ^ this.a)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
        return this.e == null ? v : v ^ this.e.hashCode();
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event
    public final Builder toBuilder() {
        Builder crashlyticsReport$Session$Event$Builder0 = new n0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Builder;-><init>()V
        crashlyticsReport$Session$Event$Builder0.a = this.getTimestamp();
        crashlyticsReport$Session$Event$Builder0.b = this.getType();
        crashlyticsReport$Session$Event$Builder0.c = this.getApp();
        crashlyticsReport$Session$Event$Builder0.d = this.getDevice();
        crashlyticsReport$Session$Event$Builder0.e = this.getLog();
        return crashlyticsReport$Session$Event$Builder0;
    }

    @Override
    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }
}

