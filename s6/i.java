package s6;

import a5.b;
import com.google.android.datatransport.cct.internal.LogResponse;

public final class i extends LogResponse {
    public final long a;

    public i(long v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof LogResponse) {
            long v = ((LogResponse)object0).getNextRequestWaitMillis();
            return this.a == v;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogResponse
    public final long getNextRequestWaitMillis() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.a >>> 0x20 ^ this.a)) ^ 1000003;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        return b.g(this.a, "}", stringBuilder0);
    }
}

