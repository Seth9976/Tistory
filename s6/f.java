package s6;

import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import java.util.List;
import wb.a;

public final class f extends BatchedLogRequest {
    public final List a;

    public f(List list0) {
        if(list0 == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof BatchedLogRequest) {
            List list0 = ((BatchedLogRequest)object0).getLogRequests();
            return this.a.equals(list0);
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.BatchedLogRequest
    public final List getLogRequests() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return a.e(new StringBuilder("BatchedLogRequest{logRequests="), this.a, "}");
    }
}

