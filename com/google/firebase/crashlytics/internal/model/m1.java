package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

public final class m1 extends AppData {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final DevelopmentPlatformProvider f;

    public m1(String s, String s1, String s2, String s3, int v, DevelopmentPlatformProvider developmentPlatformProvider0) {
        if(s == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = s1;
        if(s2 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = s2;
        if(s3 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = s3;
        this.e = v;
        if(developmentPlatformProvider0 == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f = developmentPlatformProvider0;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData
    public final String appIdentifier() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData
    public final int deliveryMechanism() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData
    public final DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof AppData) {
            String s = ((AppData)object0).appIdentifier();
            if(this.a.equals(s)) {
                String s1 = ((AppData)object0).versionCode();
                if(this.b.equals(s1)) {
                    String s2 = ((AppData)object0).versionName();
                    if(this.c.equals(s2)) {
                        String s3 = ((AppData)object0).installUuid();
                        if(this.d.equals(s3)) {
                            int v = ((AppData)object0).deliveryMechanism();
                            if(this.e == v) {
                                DevelopmentPlatformProvider developmentPlatformProvider0 = ((AppData)object0).developmentPlatformProvider();
                                return this.f.equals(developmentPlatformProvider0);
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData
    public final String installUuid() {
        return this.d;
    }

    @Override
    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData
    public final String versionCode() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData
    public final String versionName() {
        return this.c;
    }
}

