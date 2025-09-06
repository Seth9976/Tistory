package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

public class UserRecoverableException extends Exception {
    public final Intent a;

    public UserRecoverableException(@NonNull String s, @NonNull Intent intent0) {
        super(s);
        this.a = intent0;
    }

    @NonNull
    public Intent getIntent() {
        return new Intent(this.a);
    }
}

