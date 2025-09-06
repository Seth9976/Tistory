package com.google.firebase.crashlytics.internal.model;

public final class d0 extends Builder {
    public String a;
    public byte[] b;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder
    public final File build() {
        String s = this.a == null ? " filename" : "";
        if(this.b == null) {
            s = s + " contents";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new e0(this.a, this.b);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder
    public final Builder setContents(byte[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("Null contents");
        }
        this.b = arr_b;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder
    public final Builder setFilename(String s) {
        if(s == null) {
            throw new NullPointerException("Null filename");
        }
        this.a = s;
        return this;
    }
}

