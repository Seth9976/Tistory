package com.google.firebase.crashlytics.internal.model;

public final class i1 extends OperatingSystem {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public i1(int v, String s, boolean z, String s1) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof OperatingSystem) {
            int v = ((OperatingSystem)object0).getPlatform();
            if(this.a == v) {
                String s = ((OperatingSystem)object0).getVersion();
                if(this.b.equals(s)) {
                    String s1 = ((OperatingSystem)object0).getBuildVersion();
                    if(this.c.equals(s1)) {
                        boolean z = ((OperatingSystem)object0).isJailbroken();
                        return this.d == z;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem
    public final String getBuildVersion() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem
    public final int getPlatform() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem
    public final String getVersion() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
        return this.d ? v ^ 0x4CF : v ^ 0x4D5;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem
    public final boolean isJailbroken() {
        return this.d;
    }

    @Override
    public final String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}

