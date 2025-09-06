package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class c0 extends FilesPayload {
    public final ImmutableList a;
    public final String b;

    public c0(ImmutableList immutableList0, String s) {
        this.a = immutableList0;
        this.b = s;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload
    public final b0 a() {
        b0 b00 = new b0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$FilesPayload$Builder;-><init>()V
        b00.a = this.a;
        b00.b = this.b;
        return b00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof FilesPayload) {
            ImmutableList immutableList0 = ((FilesPayload)object0).getFiles();
            if(this.a.equals(immutableList0)) {
                return this.b == null ? ((FilesPayload)object0).getOrgId() == null : this.b.equals(((FilesPayload)object0).getOrgId());
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload
    public final ImmutableList getFiles() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload
    public final String getOrgId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (v ^ 1000003) * 1000003 : (v ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FilesPayload{files=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", orgId=");
        return a.o(stringBuilder0, this.b, "}");
    }
}

