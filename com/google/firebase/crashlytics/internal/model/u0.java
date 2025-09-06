package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class u0 extends BinaryImage {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public u0(long v, String s, String s1, long v1) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof BinaryImage) {
            long v = ((BinaryImage)object0).getBaseAddress();
            if(this.a == v) {
                long v1 = ((BinaryImage)object0).getSize();
                if(this.b == v1) {
                    String s = ((BinaryImage)object0).getName();
                    if(this.c.equals(s)) {
                        return this.d == null ? ((BinaryImage)object0).getUuid() == null : this.d.equals(((BinaryImage)object0).getUuid());
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage
    public final long getBaseAddress() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage
    public final String getName() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage
    public final long getSize() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage
    public final String getUuid() {
        return this.d;
    }

    @Override
    public final int hashCode() {
        int v = (((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ this.c.hashCode()) * 1000003;
        return this.d == null ? v : v ^ this.d.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BinaryImage{baseAddress=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", size=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", uuid=");
        return a.o(stringBuilder0, this.d, "}");
    }
}

