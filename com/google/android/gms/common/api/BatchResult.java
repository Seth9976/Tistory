package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

public final class BatchResult implements Result {
    public final Status a;
    public final PendingResult[] b;

    public BatchResult(Status status0, PendingResult[] arr_pendingResult) {
        this.a = status0;
        this.b = arr_pendingResult;
    }

    @Override  // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.a;
    }

    @NonNull
    public Result take(@NonNull BatchResultToken batchResultToken0) {
        Preconditions.checkArgument(batchResultToken0.mId < this.b.length, "The result token does not belong to this batch");
        return this.b[batchResultToken0.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}

