package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public final class OptionalPendingResultImpl extends OptionalPendingResult {
    public final BasePendingResult a;

    public OptionalPendingResultImpl(@NonNull PendingResult pendingResult0) {
        this.a = (BasePendingResult)pendingResult0;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@NonNull StatusListener pendingResult$StatusListener0) {
        this.a.addStatusListener(pendingResult$StatusListener0);
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final Result await() {
        return this.a.await();
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final Result await(long v, @NonNull TimeUnit timeUnit0) {
        return this.a.await(v, timeUnit0);
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        this.a.cancel();
    }

    @Override  // com.google.android.gms.common.api.OptionalPendingResult
    @NonNull
    public final Result get() {
        BasePendingResult basePendingResult0 = this.a;
        if(!basePendingResult0.isReady()) {
            throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
        }
        return basePendingResult0.await(0L, TimeUnit.MILLISECONDS);
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        return this.a.isCanceled();
    }

    @Override  // com.google.android.gms.common.api.OptionalPendingResult
    public final boolean isDone() {
        return this.a.isReady();
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@NonNull ResultCallback resultCallback0) {
        this.a.setResultCallback(resultCallback0);
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@NonNull ResultCallback resultCallback0, long v, @NonNull TimeUnit timeUnit0) {
        this.a.setResultCallback(resultCallback0, v, timeUnit0);
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final TransformedResult then(@NonNull ResultTransform resultTransform0) {
        return this.a.then(resultTransform0);
    }
}

