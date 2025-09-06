package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class b extends BasePendingResult {
    public final int o;
    public final Result p;

    public b(Result result0) {
        this.o = 0;
        super(Looper.getMainLooper());
        this.p = result0;
    }

    public b(Result result0, GoogleApiClient googleApiClient0) {
        this.o = 1;
        super(googleApiClient0);
        this.p = result0;
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status0) {
        if(this.o != 0) {
            return this.p;
        }
        Result result0 = this.p;
        if(status0.getStatusCode() != result0.getStatus().getStatusCode()) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
        return result0;
    }
}

