package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import java.util.Arrays;

public final class m extends TransportContext {
    public final String a;
    public final byte[] b;
    public final Priority c;

    public m(String s, byte[] arr_b, Priority priority0) {
        this.a = s;
        this.b = arr_b;
        this.c = priority0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof TransportContext) {
            String s = ((TransportContext)object0).getBackendName();
            if(this.a.equals(s)) {
                byte[] arr_b = ((TransportContext)object0) instanceof m ? ((m)(((TransportContext)object0))).b : ((TransportContext)object0).getExtras();
                if(Arrays.equals(this.b, arr_b)) {
                    Priority priority0 = ((TransportContext)object0).getPriority();
                    return this.c.equals(priority0);
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.TransportContext
    public final String getBackendName() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.TransportContext
    public final byte[] getExtras() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.runtime.TransportContext
    public final Priority getPriority() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ v) * 1000003 ^ this.c.hashCode();
    }
}

