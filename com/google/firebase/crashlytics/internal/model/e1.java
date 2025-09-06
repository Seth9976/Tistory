package com.google.firebase.crashlytics.internal.model;

import a5.b;

public final class e1 extends Device {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public e1(Double double0, int v, boolean z, int v1, long v2, long v3) {
        this.a = double0;
        this.b = v;
        this.c = z;
        this.d = v1;
        this.e = v2;
        this.f = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Device) {
            Double double0 = this.a;
            if(double0 != null) {
                if(double0.equals(((Device)object0).getBatteryLevel())) {
                label_8:
                    int v = ((Device)object0).getBatteryVelocity();
                    if(this.b == v) {
                        boolean z = ((Device)object0).isProximityOn();
                        if(this.c == z) {
                            int v1 = ((Device)object0).getOrientation();
                            if(this.d == v1) {
                                long v2 = ((Device)object0).getRamUsed();
                                if(this.e == v2) {
                                    long v3 = ((Device)object0).getDiskUsed();
                                    return this.f == v3;
                                }
                            }
                        }
                    }
                }
            }
            else if(((Device)object0).getBatteryLevel() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device
    public final Double getBatteryLevel() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device
    public final int getBatteryVelocity() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device
    public final long getDiskUsed() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device
    public final int getOrientation() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device
    public final long getRamUsed() {
        return this.e;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ this.b) * 1000003;
        return this.c ? (((v ^ 0x4CF) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20)) : (((v ^ 0x4D5) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20));
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device
    public final boolean isProximityOn() {
        return this.c;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Device{batteryLevel=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", batteryVelocity=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", proximityOn=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", orientation=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", ramUsed=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", diskUsed=");
        return b.g(this.f, "}", stringBuilder0);
    }
}

