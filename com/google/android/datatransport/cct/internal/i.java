package com.google.android.datatransport.cct.internal;

public final class i extends NetworkConnectionInfo {
    public final NetworkType a;
    public final MobileSubtype b;

    public i(NetworkType networkConnectionInfo$NetworkType0, MobileSubtype networkConnectionInfo$MobileSubtype0) {
        this.a = networkConnectionInfo$NetworkType0;
        this.b = networkConnectionInfo$MobileSubtype0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof NetworkConnectionInfo) {
            NetworkType networkConnectionInfo$NetworkType0 = this.a;
            if(networkConnectionInfo$NetworkType0 == null) {
                if(((NetworkConnectionInfo)object0).getNetworkType() == null) {
                    return this.b == null ? ((NetworkConnectionInfo)object0).getMobileSubtype() == null : this.b.equals(((NetworkConnectionInfo)object0).getMobileSubtype());
                }
            }
            else if(networkConnectionInfo$NetworkType0.equals(((NetworkConnectionInfo)object0).getNetworkType())) {
                return this.b == null ? ((NetworkConnectionInfo)object0).getMobileSubtype() == null : this.b.equals(((NetworkConnectionInfo)object0).getMobileSubtype());
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final MobileSubtype getMobileSubtype() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkType getNetworkType() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        MobileSubtype networkConnectionInfo$MobileSubtype0 = this.b;
        if(networkConnectionInfo$MobileSubtype0 != null) {
            v = networkConnectionInfo$MobileSubtype0.hashCode();
        }
        return v ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}

