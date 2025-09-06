package com.google.android.datatransport.cct.internal;

public final class d extends Builder {
    public ClientType a;
    public AndroidClientInfo b;

    @Override  // com.google.android.datatransport.cct.internal.ClientInfo$Builder
    public final ClientInfo build() {
        return new e(this.a, this.b);
    }

    @Override  // com.google.android.datatransport.cct.internal.ClientInfo$Builder
    public final Builder setAndroidClientInfo(AndroidClientInfo androidClientInfo0) {
        this.b = androidClientInfo0;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.ClientInfo$Builder
    public final Builder setClientType(ClientType clientInfo$ClientType0) {
        this.a = clientInfo$ClientType0;
        return this;
    }
}

