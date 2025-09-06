package com.google.firebase.crashlytics.internal.model;

import wb.a;

public final class g0 extends Session {
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final Application f;
    public final User g;
    public final OperatingSystem h;
    public final Device i;
    public final ImmutableList j;
    public final int k;

    public g0(String s, String s1, long v, Long long0, boolean z, Application crashlyticsReport$Session$Application0, User crashlyticsReport$Session$User0, OperatingSystem crashlyticsReport$Session$OperatingSystem0, Device crashlyticsReport$Session$Device0, ImmutableList immutableList0, int v1) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = long0;
        this.e = z;
        this.f = crashlyticsReport$Session$Application0;
        this.g = crashlyticsReport$Session$User0;
        this.h = crashlyticsReport$Session$OperatingSystem0;
        this.i = crashlyticsReport$Session$Device0;
        this.j = immutableList0;
        this.k = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Session) {
            String s = ((Session)object0).getGenerator();
            if(this.a.equals(s)) {
                String s1 = ((Session)object0).getIdentifier();
                if(this.b.equals(s1)) {
                    long v = ((Session)object0).getStartedAt();
                    if(this.c == v) {
                        Long long0 = this.d;
                        if(long0 != null) {
                            if(long0.equals(((Session)object0).getEndedAt())) {
                            label_14:
                                boolean z = ((Session)object0).isCrashed();
                                if(this.e == z) {
                                    Application crashlyticsReport$Session$Application0 = ((Session)object0).getApp();
                                    if(this.f.equals(crashlyticsReport$Session$Application0)) {
                                        User crashlyticsReport$Session$User0 = this.g;
                                        if(crashlyticsReport$Session$User0 != null) {
                                            if(crashlyticsReport$Session$User0.equals(((Session)object0).getUser())) {
                                            label_23:
                                                OperatingSystem crashlyticsReport$Session$OperatingSystem0 = this.h;
                                                if(crashlyticsReport$Session$OperatingSystem0 != null) {
                                                    if(crashlyticsReport$Session$OperatingSystem0.equals(((Session)object0).getOs())) {
                                                    label_28:
                                                        Device crashlyticsReport$Session$Device0 = this.i;
                                                        if(crashlyticsReport$Session$Device0 != null) {
                                                            if(crashlyticsReport$Session$Device0.equals(((Session)object0).getDevice())) {
                                                            label_33:
                                                                ImmutableList immutableList0 = this.j;
                                                                if(immutableList0 != null) {
                                                                    if(immutableList0.equals(((Session)object0).getEvents())) {
                                                                    label_38:
                                                                        int v1 = ((Session)object0).getGeneratorType();
                                                                        return this.k == v1;
                                                                    }
                                                                }
                                                                else if(((Session)object0).getEvents() == null) {
                                                                    goto label_38;
                                                                }
                                                            }
                                                        }
                                                        else if(((Session)object0).getDevice() == null) {
                                                            goto label_33;
                                                        }
                                                    }
                                                }
                                                else if(((Session)object0).getOs() == null) {
                                                    goto label_28;
                                                }
                                            }
                                        }
                                        else if(((Session)object0).getUser() == null) {
                                            goto label_23;
                                        }
                                    }
                                }
                            }
                        }
                        else if(((Session)object0).getEndedAt() == null) {
                            goto label_14;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final Application getApp() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final Device getDevice() {
        return this.i;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final Long getEndedAt() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final ImmutableList getEvents() {
        return this.j;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final String getGenerator() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final int getGeneratorType() {
        return this.k;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final String getIdentifier() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final OperatingSystem getOs() {
        return this.h;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final long getStartedAt() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final User getUser() {
        return this.g;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c))) * 1000003;
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e ? 0x4CF : 0x4D5;
        int v4 = this.f.hashCode();
        int v5 = this.g == null ? 0 : this.g.hashCode();
        int v6 = this.h == null ? 0 : this.h.hashCode();
        int v7 = this.i == null ? 0 : this.i.hashCode();
        ImmutableList immutableList0 = this.j;
        if(immutableList0 != null) {
            v1 = immutableList0.hashCode();
        }
        return (((((((v ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v7) * 1000003 ^ v1) * 1000003 ^ this.k;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final boolean isCrashed() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session
    public final Builder toBuilder() {
        Builder crashlyticsReport$Session$Builder0 = new f0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Builder;-><init>()V
        crashlyticsReport$Session$Builder0.a = this.getGenerator();
        crashlyticsReport$Session$Builder0.b = this.getIdentifier();
        crashlyticsReport$Session$Builder0.c = this.getStartedAt();
        crashlyticsReport$Session$Builder0.d = this.getEndedAt();
        crashlyticsReport$Session$Builder0.e = Boolean.valueOf(this.isCrashed());
        crashlyticsReport$Session$Builder0.f = this.getApp();
        crashlyticsReport$Session$Builder0.g = this.getUser();
        crashlyticsReport$Session$Builder0.h = this.getOs();
        crashlyticsReport$Session$Builder0.i = this.getDevice();
        crashlyticsReport$Session$Builder0.j = this.getEvents();
        crashlyticsReport$Session$Builder0.k = this.getGeneratorType();
        return crashlyticsReport$Session$Builder0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Session{generator=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", identifier=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", startedAt=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", endedAt=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", crashed=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", app=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", user=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", os=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", device=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", events=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", generatorType=");
        return a.c(this.k, "}", stringBuilder0);
    }
}

