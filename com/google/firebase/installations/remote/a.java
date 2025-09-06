package com.google.firebase.installations.remote;

public final class a extends Builder {
    public String a;
    public String b;
    public String c;
    public TokenResult d;
    public ResponseCode e;

    @Override  // com.google.firebase.installations.remote.InstallationResponse$Builder
    public final InstallationResponse build() {
        return new b(this.a, this.b, this.c, this.d, this.e);
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse$Builder
    public final Builder setAuthToken(TokenResult tokenResult0) {
        this.d = tokenResult0;
        return this;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse$Builder
    public final Builder setFid(String s) {
        this.b = s;
        return this;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse$Builder
    public final Builder setRefreshToken(String s) {
        this.c = s;
        return this;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse$Builder
    public final Builder setResponseCode(ResponseCode installationResponse$ResponseCode0) {
        this.e = installationResponse$ResponseCode0;
        return this;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse$Builder
    public final Builder setUri(String s) {
        this.a = s;
        return this;
    }
}

