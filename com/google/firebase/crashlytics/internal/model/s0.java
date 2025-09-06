package com.google.firebase.crashlytics.internal.model;

public final class s0 extends Execution {
    public final ImmutableList a;
    public final Exception b;
    public final ApplicationExitInfo c;
    public final Signal d;
    public final ImmutableList e;

    public s0(ImmutableList immutableList0, Exception crashlyticsReport$Session$Event$Application$Execution$Exception0, ApplicationExitInfo crashlyticsReport$ApplicationExitInfo0, Signal crashlyticsReport$Session$Event$Application$Execution$Signal0, ImmutableList immutableList1) {
        this.a = immutableList0;
        this.b = crashlyticsReport$Session$Event$Application$Execution$Exception0;
        this.c = crashlyticsReport$ApplicationExitInfo0;
        this.d = crashlyticsReport$Session$Event$Application$Execution$Signal0;
        this.e = immutableList1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Execution) {
            ImmutableList immutableList0 = this.a;
            if(immutableList0 != null) {
                if(immutableList0.equals(((Execution)object0).getThreads())) {
                label_8:
                    Exception crashlyticsReport$Session$Event$Application$Execution$Exception0 = this.b;
                    if(crashlyticsReport$Session$Event$Application$Execution$Exception0 != null) {
                        if(crashlyticsReport$Session$Event$Application$Execution$Exception0.equals(((Execution)object0).getException())) {
                        label_13:
                            ApplicationExitInfo crashlyticsReport$ApplicationExitInfo0 = this.c;
                            if(crashlyticsReport$ApplicationExitInfo0 != null) {
                                if(crashlyticsReport$ApplicationExitInfo0.equals(((Execution)object0).getAppExitInfo())) {
                                label_18:
                                    Signal crashlyticsReport$Session$Event$Application$Execution$Signal0 = ((Execution)object0).getSignal();
                                    if(this.d.equals(crashlyticsReport$Session$Event$Application$Execution$Signal0)) {
                                        ImmutableList immutableList1 = ((Execution)object0).getBinaries();
                                        return this.e.equals(immutableList1);
                                    }
                                }
                            }
                            else if(((Execution)object0).getAppExitInfo() == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((Execution)object0).getException() == null) {
                        goto label_13;
                    }
                }
            }
            else if(((Execution)object0).getThreads() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution
    public final ApplicationExitInfo getAppExitInfo() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution
    public final ImmutableList getBinaries() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution
    public final Exception getException() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution
    public final Signal getSignal() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution
    public final ImmutableList getThreads() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        ApplicationExitInfo crashlyticsReport$ApplicationExitInfo0 = this.c;
        if(crashlyticsReport$ApplicationExitInfo0 != null) {
            v = crashlyticsReport$ApplicationExitInfo0.hashCode();
        }
        return ((v ^ ((v1 ^ 1000003) * 1000003 ^ v2) * 1000003) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}

