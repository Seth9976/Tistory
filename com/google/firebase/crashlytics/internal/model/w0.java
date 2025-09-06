package com.google.firebase.crashlytics.internal.model;

import wb.a;

public final class w0 extends Exception {
    public final String a;
    public final String b;
    public final ImmutableList c;
    public final Exception d;
    public final int e;

    public w0(String s, String s1, ImmutableList immutableList0, Exception crashlyticsReport$Session$Event$Application$Execution$Exception0, int v) {
        this.a = s;
        this.b = s1;
        this.c = immutableList0;
        this.d = crashlyticsReport$Session$Event$Application$Execution$Exception0;
        this.e = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Exception) {
            String s = ((Exception)object0).getType();
            if(this.a.equals(s)) {
                String s1 = this.b;
                if(s1 != null) {
                    if(s1.equals(((Exception)object0).getReason())) {
                    label_10:
                        ImmutableList immutableList0 = ((Exception)object0).getFrames();
                        if(this.c.equals(immutableList0)) {
                            Exception crashlyticsReport$Session$Event$Application$Execution$Exception0 = this.d;
                            if(crashlyticsReport$Session$Event$Application$Execution$Exception0 != null) {
                                if(crashlyticsReport$Session$Event$Application$Execution$Exception0.equals(((Exception)object0).getCausedBy())) {
                                label_17:
                                    int v = ((Exception)object0).getOverflowCount();
                                    return this.e == v;
                                }
                            }
                            else if(((Exception)object0).getCausedBy() == null) {
                                goto label_17;
                            }
                        }
                    }
                }
                else if(((Exception)object0).getReason() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception
    public final Exception getCausedBy() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception
    public final ImmutableList getFrames() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception
    public final int getOverflowCount() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception
    public final String getReason() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception
    public final String getType() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c.hashCode();
        Exception crashlyticsReport$Session$Event$Application$Execution$Exception0 = this.d;
        if(crashlyticsReport$Session$Event$Application$Execution$Exception0 != null) {
            v1 = crashlyticsReport$Session$Event$Application$Execution$Exception0.hashCode();
        }
        return ((((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1) * 1000003 ^ this.e;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Exception{type=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", reason=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", frames=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", causedBy=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", overflowCount=");
        return a.c(this.e, "}", stringBuilder0);
    }
}

