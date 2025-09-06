package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
    public final int b;

    public GooglePlayServicesRepairableException(int v, @NonNull String s, @NonNull Intent intent0) {
        super(s, intent0);
        this.b = v;
    }

    public int getConnectionStatusCode() {
        return this.b;
    }
}

