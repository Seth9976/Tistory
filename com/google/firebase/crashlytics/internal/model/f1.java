package com.google.firebase.crashlytics.internal.model;

public final class f1 extends Builder {
    public String a;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log$Builder
    public final Log build() {
        String s = this.a == null ? " content" : "";
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new g1(this.a);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log$Builder
    public final Builder setContent(String s) {
        if(s == null) {
            throw new NullPointerException("Null content");
        }
        this.a = s;
        return this;
    }
}

