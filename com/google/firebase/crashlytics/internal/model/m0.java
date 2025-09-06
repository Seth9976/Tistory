package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class m0 extends Device {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public m0(int v, String s, int v1, long v2, long v3, boolean z, int v4, String s1, String s2) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
        this.g = v4;
        this.h = s1;
        this.i = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Device) {
            int v = ((Device)object0).getArch();
            if(this.a == v) {
                String s = ((Device)object0).getModel();
                if(this.b.equals(s)) {
                    int v1 = ((Device)object0).getCores();
                    if(this.c == v1) {
                        long v2 = ((Device)object0).getRam();
                        if(this.d == v2) {
                            long v3 = ((Device)object0).getDiskSpace();
                            if(this.e == v3) {
                                boolean z = ((Device)object0).isSimulator();
                                if(this.f == z) {
                                    int v4 = ((Device)object0).getState();
                                    if(this.g == v4) {
                                        String s1 = ((Device)object0).getManufacturer();
                                        if(this.h.equals(s1)) {
                                            String s2 = ((Device)object0).getModelClass();
                                            return this.i.equals(s2);
                                        }
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

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final int getArch() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final int getCores() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final long getDiskSpace() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final String getManufacturer() {
        return this.h;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final String getModel() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final String getModelClass() {
        return this.i;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final long getRam() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final int getState() {
        return this.g;
    }

    @Override
    public final int hashCode() {
        int v = (((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003;
        return this.f ? (((v ^ 0x4CF) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode() : (((v ^ 0x4D5) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device
    public final boolean isSimulator() {
        return this.f;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Device{arch=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", model=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", cores=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", ram=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", diskSpace=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", simulator=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", state=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", manufacturer=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", modelClass=");
        return a.o(stringBuilder0, this.i, "}");
    }
}

