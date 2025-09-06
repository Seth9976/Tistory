package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public abstract class PendingResult {
    @KeepForSdk
    public interface StatusListener {
        @KeepForSdk
        void onComplete(@NonNull Status arg1);
    }

    @KeepForSdk
    public void addStatusListener(@NonNull StatusListener pendingResult$StatusListener0) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract Result await();

    @NonNull
    public abstract Result await(long arg1, @NonNull TimeUnit arg2);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@NonNull ResultCallback arg1);

    public abstract void setResultCallback(@NonNull ResultCallback arg1, long arg2, @NonNull TimeUnit arg3);

    @NonNull
    public TransformedResult then(@NonNull ResultTransform resultTransform0) {
        throw new UnsupportedOperationException();
    }
}

