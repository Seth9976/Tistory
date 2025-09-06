package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    public FirebaseException(@NonNull String s) {
        Preconditions.checkNotEmpty(s, "Detail message must not be empty");
        super(s);
    }

    public FirebaseException(@NonNull String s, @NonNull Throwable throwable0) {
        Preconditions.checkNotEmpty(s, "Detail message must not be empty");
        super(s, throwable0);
    }
}

