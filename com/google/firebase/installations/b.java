package com.google.firebase.installations;

public final class b extends InstallationTokenResult {
    public final String a;
    public final long b;
    public final long c;

    public b(String s, long v, long v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof InstallationTokenResult) {
            String s = ((InstallationTokenResult)object0).getToken();
            if(this.a.equals(s)) {
                long v = ((InstallationTokenResult)object0).getTokenExpirationTimestamp();
                if(this.b == v) {
                    long v1 = ((InstallationTokenResult)object0).getTokenCreationTimestamp();
                    return this.c == v1;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.installations.InstallationTokenResult
    public final String getToken() {
        return this.a;
    }

    @Override  // com.google.firebase.installations.InstallationTokenResult
    public final long getTokenCreationTimestamp() {
        return this.c;
    }

    @Override  // com.google.firebase.installations.InstallationTokenResult
    public final long getTokenExpirationTimestamp() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override  // com.google.firebase.installations.InstallationTokenResult
    public final Builder toBuilder() {
        Builder installationTokenResult$Builder0 = new a();  // 初始化器: Lcom/google/firebase/installations/InstallationTokenResult$Builder;-><init>()V
        installationTokenResult$Builder0.a = this.getToken();
        installationTokenResult$Builder0.b = this.getTokenExpirationTimestamp();
        installationTokenResult$Builder0.c = this.getTokenCreationTimestamp();
        return installationTokenResult$Builder0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("InstallationTokenResult{token=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", tokenExpirationTimestamp=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", tokenCreationTimestamp=");
        return a5.b.g(this.c, "}", stringBuilder0);
    }
}

