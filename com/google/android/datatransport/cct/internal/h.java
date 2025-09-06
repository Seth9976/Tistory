package com.google.android.datatransport.cct.internal;

public final class h extends Builder {
    public NetworkType a;
    public MobileSubtype b;

    @Override  // com.google.android.datatransport.cct.internal.NetworkConnectionInfo$Builder
    public final NetworkConnectionInfo build() {
        return new i(this.a, this.b);
    }

    @Override  // com.google.android.datatransport.cct.internal.NetworkConnectionInfo$Builder
    public final Builder setMobileSubtype(MobileSubtype networkConnectionInfo$MobileSubtype0) {
        this.b = networkConnectionInfo$MobileSubtype0;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.NetworkConnectionInfo$Builder
    public final Builder setNetworkType(NetworkType networkConnectionInfo$NetworkType0) {
        this.a = networkConnectionInfo$NetworkType0;
        return this;
    }
}

