package com.google.firebase.installations;

public final class a extends Builder {
    public String a;
    public Long b;
    public Long c;

    @Override  // com.google.firebase.installations.InstallationTokenResult$Builder
    public final InstallationTokenResult build() {
        String s = this.a == null ? " token" : "";
        if(this.b == null) {
            s = s + " tokenExpirationTimestamp";
        }
        if(this.c == null) {
            s = s + " tokenCreationTimestamp";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new b(this.a, ((long)this.b), ((long)this.c));
    }

    @Override  // com.google.firebase.installations.InstallationTokenResult$Builder
    public final Builder setToken(String s) {
        if(s == null) {
            throw new NullPointerException("Null token");
        }
        this.a = s;
        return this;
    }

    @Override  // com.google.firebase.installations.InstallationTokenResult$Builder
    public final Builder setTokenCreationTimestamp(long v) {
        this.c = v;
        return this;
    }

    @Override  // com.google.firebase.installations.InstallationTokenResult$Builder
    public final Builder setTokenExpirationTimestamp(long v) {
        this.b = v;
        return this;
    }
}

