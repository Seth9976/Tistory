package com.google.android.datatransport.runtime.retries;

import androidx.annotation.Nullable;

public interface RetryStrategy {
    @Nullable
    Object shouldRetry(Object arg1, Object arg2);
}

