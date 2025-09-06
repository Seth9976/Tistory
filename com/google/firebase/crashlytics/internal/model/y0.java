package com.google.firebase.crashlytics.internal.model;

import a5.b;

public final class y0 extends Signal {
    public final String a;
    public final String b;
    public final long c;

    public y0(String s, String s1, long v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Signal) {
            String s = ((Signal)object0).getName();
            if(this.a.equals(s)) {
                String s1 = ((Signal)object0).getCode();
                if(this.b.equals(s1)) {
                    long v = ((Signal)object0).getAddress();
                    return this.c == v;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal
    public final long getAddress() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal
    public final String getCode() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal
    public final String getName() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Signal{name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", code=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", address=");
        return b.g(this.c, "}", stringBuilder0);
    }
}

