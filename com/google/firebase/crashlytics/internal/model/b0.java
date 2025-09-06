package com.google.firebase.crashlytics.internal.model;

public final class b0 extends Builder {
    public ImmutableList a;
    public String b;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder
    public final FilesPayload build() {
        String s = this.a == null ? " files" : "";
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new c0(this.a, this.b);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder
    public final Builder setFiles(ImmutableList immutableList0) {
        if(immutableList0 == null) {
            throw new NullPointerException("Null files");
        }
        this.a = immutableList0;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder
    public final Builder setOrgId(String s) {
        this.b = s;
        return this;
    }
}

