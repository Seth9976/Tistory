package com.google.android.material.motion;

import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(@NonNull BackEventCompat arg1);

    void updateBackProgress(@NonNull BackEventCompat arg1);
}

