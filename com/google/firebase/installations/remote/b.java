package com.google.firebase.installations.remote;

public final class b extends InstallationResponse {
    public final String a;
    public final String b;
    public final String c;
    public final TokenResult d;
    public final ResponseCode e;

    public b(String s, String s1, String s2, TokenResult tokenResult0, ResponseCode installationResponse$ResponseCode0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = tokenResult0;
        this.e = installationResponse$ResponseCode0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof InstallationResponse) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((InstallationResponse)object0).getUri())) {
                label_8:
                    String s1 = this.b;
                    if(s1 != null) {
                        if(s1.equals(((InstallationResponse)object0).getFid())) {
                        label_13:
                            String s2 = this.c;
                            if(s2 != null) {
                                if(s2.equals(((InstallationResponse)object0).getRefreshToken())) {
                                label_18:
                                    TokenResult tokenResult0 = this.d;
                                    if(tokenResult0 == null) {
                                        if(((InstallationResponse)object0).getAuthToken() == null) {
                                            return this.e == null ? ((InstallationResponse)object0).getResponseCode() == null : this.e.equals(((InstallationResponse)object0).getResponseCode());
                                        }
                                    }
                                    else if(tokenResult0.equals(((InstallationResponse)object0).getAuthToken())) {
                                        return this.e == null ? ((InstallationResponse)object0).getResponseCode() == null : this.e.equals(((InstallationResponse)object0).getResponseCode());
                                    }
                                }
                            }
                            else if(((InstallationResponse)object0).getRefreshToken() == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((InstallationResponse)object0).getFid() == null) {
                        goto label_13;
                    }
                }
            }
            else if(((InstallationResponse)object0).getUri() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse
    public final TokenResult getAuthToken() {
        return this.d;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse
    public final String getFid() {
        return this.b;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse
    public final String getRefreshToken() {
        return this.c;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse
    public final ResponseCode getResponseCode() {
        return this.e;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse
    public final String getUri() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        ResponseCode installationResponse$ResponseCode0 = this.e;
        if(installationResponse$ResponseCode0 != null) {
            v = installationResponse$ResponseCode0.hashCode();
        }
        return v ^ ((((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003;
    }

    @Override  // com.google.firebase.installations.remote.InstallationResponse
    public final Builder toBuilder() {
        Builder installationResponse$Builder0 = new a();  // 初始化器: Lcom/google/firebase/installations/remote/InstallationResponse$Builder;-><init>()V
        installationResponse$Builder0.a = this.getUri();
        installationResponse$Builder0.b = this.getFid();
        installationResponse$Builder0.c = this.getRefreshToken();
        installationResponse$Builder0.d = this.getAuthToken();
        installationResponse$Builder0.e = this.getResponseCode();
        return installationResponse$Builder0;
    }

    @Override
    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}

