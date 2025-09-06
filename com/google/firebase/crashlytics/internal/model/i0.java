package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class i0 extends Application {
    public final String a;
    public final String b;
    public final String c;
    public final Organization d;
    public final String e;
    public final String f;
    public final String g;

    public i0(String s, String s1, String s2, Organization crashlyticsReport$Session$Application$Organization0, String s3, String s4, String s5) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = crashlyticsReport$Session$Application$Organization0;
        this.e = s3;
        this.f = s4;
        this.g = s5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Application) {
            String s = ((Application)object0).getIdentifier();
            if(this.a.equals(s)) {
                String s1 = ((Application)object0).getVersion();
                if(this.b.equals(s1)) {
                    String s2 = this.c;
                    if(s2 != null) {
                        if(s2.equals(((Application)object0).getDisplayVersion())) {
                        label_12:
                            Organization crashlyticsReport$Session$Application$Organization0 = this.d;
                            if(crashlyticsReport$Session$Application$Organization0 != null) {
                                if(crashlyticsReport$Session$Application$Organization0.equals(((Application)object0).getOrganization())) {
                                label_17:
                                    String s3 = this.e;
                                    if(s3 != null) {
                                        if(s3.equals(((Application)object0).getInstallationUuid())) {
                                        label_22:
                                            String s4 = this.f;
                                            if(s4 == null) {
                                                if(((Application)object0).getDevelopmentPlatform() == null) {
                                                    return this.g == null ? ((Application)object0).getDevelopmentPlatformVersion() == null : this.g.equals(((Application)object0).getDevelopmentPlatformVersion());
                                                }
                                            }
                                            else if(s4.equals(((Application)object0).getDevelopmentPlatform())) {
                                                return this.g == null ? ((Application)object0).getDevelopmentPlatformVersion() == null : this.g.equals(((Application)object0).getDevelopmentPlatformVersion());
                                            }
                                        }
                                    }
                                    else if(((Application)object0).getInstallationUuid() == null) {
                                        goto label_22;
                                    }
                                }
                            }
                            else if(((Application)object0).getOrganization() == null) {
                                goto label_17;
                            }
                        }
                    }
                    else if(((Application)object0).getDisplayVersion() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application
    public final String getDevelopmentPlatform() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application
    public final String getDevelopmentPlatformVersion() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application
    public final String getDisplayVersion() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application
    public final String getIdentifier() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application
    public final String getInstallationUuid() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application
    public final Organization getOrganization() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application
    public final String getVersion() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        String s = this.g;
        if(s != null) {
            v2 = s.hashCode();
        }
        return ((((((v ^ 1000003) * 1000003 ^ v1) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v2;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application
    public final Builder toBuilder() {
        Builder crashlyticsReport$Session$Application$Builder0 = new h0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Application$Builder;-><init>()V
        crashlyticsReport$Session$Application$Builder0.a = this.getIdentifier();
        crashlyticsReport$Session$Application$Builder0.b = this.getVersion();
        crashlyticsReport$Session$Application$Builder0.c = this.getDisplayVersion();
        crashlyticsReport$Session$Application$Builder0.d = this.getOrganization();
        crashlyticsReport$Session$Application$Builder0.e = this.getInstallationUuid();
        crashlyticsReport$Session$Application$Builder0.f = this.getDevelopmentPlatform();
        crashlyticsReport$Session$Application$Builder0.g = this.getDevelopmentPlatformVersion();
        return crashlyticsReport$Session$Application$Builder0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Application{identifier=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", version=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", displayVersion=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", organization=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", installationUuid=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", developmentPlatform=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", developmentPlatformVersion=");
        return a.o(stringBuilder0, this.g, "}");
    }
}

