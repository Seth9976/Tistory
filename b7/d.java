package b7;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public abstract class d extends e {
    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status0) {
        return status0;
    }
}

