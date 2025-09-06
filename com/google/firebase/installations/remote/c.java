package com.google.firebase.installations.remote;

public final class c extends Builder {
    public String a;
    public Long b;
    public ResponseCode c;

    @Override  // com.google.firebase.installations.remote.TokenResult$Builder
    public final TokenResult build() {
        String s = this.b == null ? " tokenExpirationTimestamp" : "";
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new d(this.a, ((long)this.b), this.c);
    }

    @Override  // com.google.firebase.installations.remote.TokenResult$Builder
    public final Builder setResponseCode(ResponseCode tokenResult$ResponseCode0) {
        this.c = tokenResult$ResponseCode0;
        return this;
    }

    @Override  // com.google.firebase.installations.remote.TokenResult$Builder
    public final Builder setToken(String s) {
        this.a = s;
        return this;
    }

    @Override  // com.google.firebase.installations.remote.TokenResult$Builder
    public final Builder setTokenExpirationTimestamp(long v) {
        this.b = v;
        return this;
    }
}

