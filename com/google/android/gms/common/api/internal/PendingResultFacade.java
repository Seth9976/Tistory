package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public abstract class PendingResultFacade extends PendingResult {
    @Override  // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@NonNull StatusListener pendingResult$StatusListener0) {
        throw null;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final Result await() {
        throw null;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final Result await(long v, @NonNull TimeUnit timeUnit0) {
        throw null;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        throw null;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        throw null;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@NonNull ResultCallback resultCallback0) {
        throw null;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@NonNull ResultCallback resultCallback0, long v, @NonNull TimeUnit timeUnit0) {
        throw null;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final TransformedResult then(@NonNull ResultTransform resultTransform0) {
        throw null;
    }
}

