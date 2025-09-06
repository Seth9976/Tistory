package com.google.firebase.installations.remote;

public final class d extends TokenResult {
    public final String a;
    public final long b;
    public final ResponseCode c;

    public d(String s, long v, ResponseCode tokenResult$ResponseCode0) {
        this.a = s;
        this.b = v;
        this.c = tokenResult$ResponseCode0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof TokenResult) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((TokenResult)object0).getToken())) {
                label_8:
                    long v = ((TokenResult)object0).getTokenExpirationTimestamp();
                    if(this.b == v) {
                        return this.c == null ? ((TokenResult)object0).getResponseCode() == null : this.c.equals(((TokenResult)object0).getResponseCode());
                    }
                }
            }
            else if(((TokenResult)object0).getToken() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.installations.remote.TokenResult
    public final ResponseCode getResponseCode() {
        return this.c;
    }

    @Override  // com.google.firebase.installations.remote.TokenResult
    public final String getToken() {
        return this.a;
    }

    @Override  // com.google.firebase.installations.remote.TokenResult
    public final long getTokenExpirationTimestamp() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003;
        ResponseCode tokenResult$ResponseCode0 = this.c;
        if(tokenResult$ResponseCode0 != null) {
            v = tokenResult$ResponseCode0.hashCode();
        }
        return v ^ v1;
    }

    @Override  // com.google.firebase.installations.remote.TokenResult
    public final Builder toBuilder() {
        Builder tokenResult$Builder0 = new c();  // 初始化器: Lcom/google/firebase/installations/remote/TokenResult$Builder;-><init>()V
        tokenResult$Builder0.a = this.getToken();
        tokenResult$Builder0.b = this.getTokenExpirationTimestamp();
        tokenResult$Builder0.c = this.getResponseCode();
        return tokenResult$Builder0;
    }

    @Override
    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}

