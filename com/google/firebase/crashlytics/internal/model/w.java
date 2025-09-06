package com.google.firebase.crashlytics.internal.model;

public final class w extends CrashlyticsReport {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final Session h;
    public final FilesPayload i;

    public w(String s, String s1, int v, String s2, String s3, String s4, Session crashlyticsReport$Session0, FilesPayload crashlyticsReport$FilesPayload0) {
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = crashlyticsReport$Session0;
        this.i = crashlyticsReport$FilesPayload0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof CrashlyticsReport) {
            String s = ((CrashlyticsReport)object0).getSdkVersion();
            if(this.b.equals(s)) {
                String s1 = ((CrashlyticsReport)object0).getGmpAppId();
                if(this.c.equals(s1)) {
                    int v = ((CrashlyticsReport)object0).getPlatform();
                    if(this.d == v) {
                        String s2 = ((CrashlyticsReport)object0).getInstallationUuid();
                        if(this.e.equals(s2)) {
                            String s3 = ((CrashlyticsReport)object0).getBuildVersion();
                            if(this.f.equals(s3)) {
                                String s4 = ((CrashlyticsReport)object0).getDisplayVersion();
                                if(this.g.equals(s4)) {
                                    Session crashlyticsReport$Session0 = this.h;
                                    if(crashlyticsReport$Session0 == null) {
                                        if(((CrashlyticsReport)object0).getSession() == null) {
                                            return this.i == null ? ((CrashlyticsReport)object0).getNdkPayload() == null : this.i.equals(((CrashlyticsReport)object0).getNdkPayload());
                                        }
                                    }
                                    else if(crashlyticsReport$Session0.equals(((CrashlyticsReport)object0).getSession())) {
                                        return this.i == null ? ((CrashlyticsReport)object0).getNdkPayload() == null : this.i.equals(((CrashlyticsReport)object0).getNdkPayload());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getBuildVersion() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getDisplayVersion() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getGmpAppId() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getInstallationUuid() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final FilesPayload getNdkPayload() {
        return this.i;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int getPlatform() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getSdkVersion() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final Session getSession() {
        return this.h;
    }

    @Override
    public final int hashCode() {
        int v = ((((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003;
        int v1 = 0;
        int v2 = this.h == null ? 0 : this.h.hashCode();
        FilesPayload crashlyticsReport$FilesPayload0 = this.i;
        if(crashlyticsReport$FilesPayload0 != null) {
            v1 = crashlyticsReport$FilesPayload0.hashCode();
        }
        return (v ^ v2) * 1000003 ^ v1;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final Builder toBuilder() {
        Builder crashlyticsReport$Builder0 = new v();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Builder;-><init>()V
        crashlyticsReport$Builder0.a = this.getSdkVersion();
        crashlyticsReport$Builder0.b = this.getGmpAppId();
        crashlyticsReport$Builder0.c = this.getPlatform();
        crashlyticsReport$Builder0.d = this.getInstallationUuid();
        crashlyticsReport$Builder0.e = this.getBuildVersion();
        crashlyticsReport$Builder0.f = this.getDisplayVersion();
        crashlyticsReport$Builder0.g = this.getSession();
        crashlyticsReport$Builder0.h = this.getNdkPayload();
        return crashlyticsReport$Builder0;
    }

    @Override
    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + "}";
    }
}

