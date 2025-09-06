package com.google.android.datatransport.cct.internal;

public final class e extends ClientInfo {
    public final ClientType a;
    public final AndroidClientInfo b;

    public e(ClientType clientInfo$ClientType0, AndroidClientInfo androidClientInfo0) {
        this.a = clientInfo$ClientType0;
        this.b = androidClientInfo0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof ClientInfo) {
            ClientType clientInfo$ClientType0 = this.a;
            if(clientInfo$ClientType0 == null) {
                if(((ClientInfo)object0).getClientType() == null) {
                    return this.b == null ? ((ClientInfo)object0).getAndroidClientInfo() == null : this.b.equals(((ClientInfo)object0).getAndroidClientInfo());
                }
            }
            else if(clientInfo$ClientType0.equals(((ClientInfo)object0).getClientType())) {
                return this.b == null ? ((ClientInfo)object0).getAndroidClientInfo() == null : this.b.equals(((ClientInfo)object0).getAndroidClientInfo());
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.ClientInfo
    public final AndroidClientInfo getAndroidClientInfo() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientType getClientType() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        AndroidClientInfo androidClientInfo0 = this.b;
        if(androidClientInfo0 != null) {
            v = androidClientInfo0.hashCode();
        }
        return v ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}

