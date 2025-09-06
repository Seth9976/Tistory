package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {
    public final int a;

    public GooglePlayServicesManifestException(int v, @NonNull String s) {
        super(s);
        this.a = v;
    }

    public int getActualVersion() {
        return this.a;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}

