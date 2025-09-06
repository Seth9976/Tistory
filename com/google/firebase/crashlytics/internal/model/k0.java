package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class k0 extends Organization {
    public final String a;

    public k0(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Organization) {
            String s = ((Organization)object0).getClsId();
            return this.a.equals(s);
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization
    public final String getClsId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization
    public final Builder toBuilder() {
        Builder crashlyticsReport$Session$Application$Organization$Builder0 = new j0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Application$Organization$Builder;-><init>()V
        crashlyticsReport$Session$Application$Organization$Builder0.a = this.getClsId();
        return crashlyticsReport$Session$Application$Organization$Builder0;
    }

    @Override
    public final String toString() {
        return a.o(new StringBuilder("Organization{clsId="), this.a, "}");
    }
}

