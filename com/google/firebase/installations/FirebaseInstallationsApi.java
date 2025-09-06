package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;

public interface FirebaseInstallationsApi {
    @NonNull
    Task delete();

    @NonNull
    Task getId();

    @NonNull
    Task getToken(boolean arg1);

    @DeferredApi
    FidListenerHandle registerFidListener(@NonNull FidListener arg1);
}

