package t6;

import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

public final class a extends BackendRequest {
    public final Iterable a;
    public final byte[] b;

    public a(byte[] arr_b, Iterable iterable0) {
        this.a = iterable0;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof BackendRequest) {
            Iterable iterable0 = ((BackendRequest)object0).getEvents();
            if(this.a.equals(iterable0)) {
                byte[] arr_b = ((BackendRequest)object0) instanceof a ? ((a)(((BackendRequest)object0))).b : ((BackendRequest)object0).getExtras();
                return Arrays.equals(this.b, arr_b);
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.backends.BackendRequest
    public final Iterable getEvents() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.backends.BackendRequest
    public final byte[] getExtras() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}

