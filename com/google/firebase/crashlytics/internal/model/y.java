package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class y extends ApplicationExitInfo {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;

    public y(int v, String s, int v1, int v2, long v3, long v4, long v5, String s1) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof ApplicationExitInfo) {
            int v = ((ApplicationExitInfo)object0).getPid();
            if(this.a == v) {
                String s = ((ApplicationExitInfo)object0).getProcessName();
                if(this.b.equals(s)) {
                    int v1 = ((ApplicationExitInfo)object0).getReasonCode();
                    if(this.c == v1) {
                        int v2 = ((ApplicationExitInfo)object0).getImportance();
                        if(this.d == v2) {
                            long v3 = ((ApplicationExitInfo)object0).getPss();
                            if(this.e == v3) {
                                long v4 = ((ApplicationExitInfo)object0).getRss();
                                if(this.f == v4) {
                                    long v5 = ((ApplicationExitInfo)object0).getTimestamp();
                                    if(this.g == v5) {
                                        return this.h == null ? ((ApplicationExitInfo)object0).getTraceFile() == null : this.h.equals(((ApplicationExitInfo)object0).getTraceFile());
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

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo
    public final int getImportance() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo
    public final int getPid() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo
    public final String getProcessName() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo
    public final long getPss() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo
    public final int getReasonCode() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo
    public final long getRss() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo
    public final long getTimestamp() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo
    public final String getTraceFile() {
        return this.h;
    }

    @Override
    public final int hashCode() {
        int v = (((((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003;
        return this.h == null ? v : v ^ this.h.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ApplicationExitInfo{pid=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", processName=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", reasonCode=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", importance=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", pss=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", rss=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", timestamp=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", traceFile=");
        return a.o(stringBuilder0, this.h, "}");
    }
}

