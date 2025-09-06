package com.google.firebase.crashlytics.internal.model;

public final class r0 extends Builder {
    public ImmutableList a;
    public Exception b;
    public ApplicationExitInfo c;
    public Signal d;
    public ImmutableList e;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder
    public final Execution build() {
        String s = this.d == null ? " signal" : "";
        if(this.e == null) {
            s = s + " binaries";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new s0(this.a, this.b, this.c, this.d, this.e);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder
    public final Builder setAppExitInfo(ApplicationExitInfo crashlyticsReport$ApplicationExitInfo0) {
        this.c = crashlyticsReport$ApplicationExitInfo0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder
    public final Builder setBinaries(ImmutableList immutableList0) {
        if(immutableList0 == null) {
            throw new NullPointerException("Null binaries");
        }
        this.e = immutableList0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder
    public final Builder setException(Exception crashlyticsReport$Session$Event$Application$Execution$Exception0) {
        this.b = crashlyticsReport$Session$Event$Application$Execution$Exception0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder
    public final Builder setSignal(Signal crashlyticsReport$Session$Event$Application$Execution$Signal0) {
        if(crashlyticsReport$Session$Event$Application$Execution$Signal0 == null) {
            throw new NullPointerException("Null signal");
        }
        this.d = crashlyticsReport$Session$Event$Application$Execution$Signal0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder
    public final Builder setThreads(ImmutableList immutableList0) {
        this.a = immutableList0;
        return this;
    }
}

