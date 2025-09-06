package com.google.firebase.crashlytics.internal.model;

import wb.a;

public final class c1 extends Frame {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public c1(long v, String s, int v1, long v2, String s1) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = v2;
        this.e = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Frame) {
            long v = ((Frame)object0).getPc();
            if(this.a == v) {
                String s = ((Frame)object0).getSymbol();
                if(this.b.equals(s)) {
                    String s1 = this.c;
                    if(s1 != null) {
                        if(s1.equals(((Frame)object0).getFile())) {
                        label_12:
                            long v1 = ((Frame)object0).getOffset();
                            if(this.d == v1) {
                                int v2 = ((Frame)object0).getImportance();
                                return this.e == v2;
                            }
                        }
                    }
                    else if(((Frame)object0).getFile() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame
    public final String getFile() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame
    public final int getImportance() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame
    public final long getOffset() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame
    public final long getPc() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame
    public final String getSymbol() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
        return this.c == null ? (v * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ this.e : ((v ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ this.e;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Frame{pc=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", symbol=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", file=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", offset=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", importance=");
        return a.c(this.e, "}", stringBuilder0);
    }
}

