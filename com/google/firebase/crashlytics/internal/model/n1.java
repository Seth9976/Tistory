package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class n1 extends DeviceData {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public n1(int v, String s, int v1, long v2, long v3, boolean z, int v4, String s1, String s2) {
        this.a = v;
        if(s == null) {
            throw new NullPointerException("Null model");
        }
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
        this.g = v4;
        if(s1 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.h = s1;
        if(s2 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.i = s2;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final int arch() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final int availableProcessors() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final long diskSpace() {
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof DeviceData) {
            int v = ((DeviceData)object0).arch();
            if(this.a == v) {
                String s = ((DeviceData)object0).model();
                if(this.b.equals(s)) {
                    int v1 = ((DeviceData)object0).availableProcessors();
                    if(this.c == v1) {
                        long v2 = ((DeviceData)object0).totalRam();
                        if(this.d == v2) {
                            long v3 = ((DeviceData)object0).diskSpace();
                            if(this.e == v3) {
                                boolean z = ((DeviceData)object0).isEmulator();
                                if(this.f == z) {
                                    int v4 = ((DeviceData)object0).state();
                                    if(this.g == v4) {
                                        String s1 = ((DeviceData)object0).manufacturer();
                                        if(this.h.equals(s1)) {
                                            String s2 = ((DeviceData)object0).modelClass();
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

    @Override
    public final int hashCode() {
        int v = (((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003;
        return this.f ? (((v ^ 0x4CF) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode() : (((v ^ 0x4D5) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final boolean isEmulator() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final String manufacturer() {
        return this.h;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final String model() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final String modelClass() {
        return this.i;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final int state() {
        return this.g;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DeviceData{arch=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", model=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", availableProcessors=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", totalRam=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", diskSpace=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", isEmulator=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", state=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", manufacturer=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", modelClass=");
        return a.o(stringBuilder0, this.i, "}");
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData
    public final long totalRam() {
        return this.d;
    }
}

