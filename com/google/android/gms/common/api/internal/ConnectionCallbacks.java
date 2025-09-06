package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk
public interface ConnectionCallbacks {
    @KeepForSdk
    @ShowFirstParty
    void onConnected(@Nullable Bundle arg1);

    @KeepForSdk
    @ShowFirstParty
    void onConnectionSuspended(int arg1);
}

