package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public interface SuccessContinuation {
    @NonNull
    Task then(Object arg1) throws Exception;
}

