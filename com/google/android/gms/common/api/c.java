package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

public final class c extends BasePendingResult {
    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status0) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}

