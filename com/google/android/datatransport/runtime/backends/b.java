package com.google.android.datatransport.runtime.backends;

public final class b extends BackendResponse {
    public final Status a;
    public final long b;

    public b(Status backendResponse$Status0, long v) {
        if(backendResponse$Status0 == null) {
            throw new NullPointerException("Null status");
        }
        this.a = backendResponse$Status0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof BackendResponse) {
            Status backendResponse$Status0 = ((BackendResponse)object0).getStatus();
            if(this.a.equals(backendResponse$Status0)) {
                long v = ((BackendResponse)object0).getNextRequestWaitMillis();
                return this.b == v;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long getNextRequestWaitMillis() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.runtime.backends.BackendResponse
    public final Status getStatus() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BackendResponse{status=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", nextRequestWaitMillis=");
        return a5.b.g(this.b, "}", stringBuilder0);
    }
}

