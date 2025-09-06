package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {
    public static enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS;

    }

    public final Status a;

    public FirebaseInstallationsException(@NonNull Status firebaseInstallationsException$Status0) {
        this.a = firebaseInstallationsException$Status0;
    }

    public FirebaseInstallationsException(@NonNull String s, @NonNull Status firebaseInstallationsException$Status0) {
        super(s);
        this.a = firebaseInstallationsException$Status0;
    }

    public FirebaseInstallationsException(@NonNull String s, @NonNull Status firebaseInstallationsException$Status0, @NonNull Throwable throwable0) {
        super(s, throwable0);
        this.a = firebaseInstallationsException$Status0;
    }

    @NonNull
    public Status getStatus() {
        return this.a;
    }
}

