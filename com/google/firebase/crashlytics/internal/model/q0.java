package com.google.firebase.crashlytics.internal.model;

import wb.a;

public final class q0 extends Application {
    public final Execution a;
    public final ImmutableList b;
    public final ImmutableList c;
    public final Boolean d;
    public final int e;

    public q0(Execution crashlyticsReport$Session$Event$Application$Execution0, ImmutableList immutableList0, ImmutableList immutableList1, Boolean boolean0, int v) {
        this.a = crashlyticsReport$Session$Event$Application$Execution0;
        this.b = immutableList0;
        this.c = immutableList1;
        this.d = boolean0;
        this.e = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Application) {
            Execution crashlyticsReport$Session$Event$Application$Execution0 = ((Application)object0).getExecution();
            if(this.a.equals(crashlyticsReport$Session$Event$Application$Execution0)) {
                ImmutableList immutableList0 = this.b;
                if(immutableList0 != null) {
                    if(immutableList0.equals(((Application)object0).getCustomAttributes())) {
                    label_10:
                        ImmutableList immutableList1 = this.c;
                        if(immutableList1 != null) {
                            if(immutableList1.equals(((Application)object0).getInternalKeys())) {
                            label_15:
                                Boolean boolean0 = this.d;
                                if(boolean0 != null) {
                                    if(boolean0.equals(((Application)object0).getBackground())) {
                                    label_20:
                                        int v = ((Application)object0).getUiOrientation();
                                        return this.e == v;
                                    }
                                }
                                else if(((Application)object0).getBackground() == null) {
                                    goto label_20;
                                }
                            }
                        }
                        else if(((Application)object0).getInternalKeys() == null) {
                            goto label_15;
                        }
                    }
                }
                else if(((Application)object0).getCustomAttributes() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application
    public final Boolean getBackground() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application
    public final ImmutableList getCustomAttributes() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application
    public final Execution getExecution() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application
    public final ImmutableList getInternalKeys() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application
    public final int getUiOrientation() {
        return this.e;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Boolean boolean0 = this.d;
        if(boolean0 != null) {
            v1 = boolean0.hashCode();
        }
        return ((((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1) * 1000003 ^ this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application
    public final Builder toBuilder() {
        Builder crashlyticsReport$Session$Event$Application$Builder0 = new p0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$Builder;-><init>()V
        crashlyticsReport$Session$Event$Application$Builder0.a = this.getExecution();
        crashlyticsReport$Session$Event$Application$Builder0.b = this.getCustomAttributes();
        crashlyticsReport$Session$Event$Application$Builder0.c = this.getInternalKeys();
        crashlyticsReport$Session$Event$Application$Builder0.d = this.getBackground();
        crashlyticsReport$Session$Event$Application$Builder0.e = this.getUiOrientation();
        return crashlyticsReport$Session$Event$Application$Builder0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Application{execution=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", customAttributes=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", internalKeys=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", background=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", uiOrientation=");
        return a.c(this.e, "}", stringBuilder0);
    }
}

