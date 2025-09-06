package com.google.firebase.iid.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

@KeepForSdk
public interface FirebaseInstanceIdInternal {
    @KeepForSdk
    public interface NewTokenListener {
        @KeepForSdk
        void onNewToken(String arg1);
    }

    @KeepForSdk
    void addNewTokenListener(NewTokenListener arg1);

    @KeepForSdk
    void deleteToken(@NonNull String arg1, @NonNull String arg2) throws IOException;

    @KeepForSdk
    String getId();

    @Nullable
    @KeepForSdk
    String getToken();

    @NonNull
    @KeepForSdk
    Task getTokenTask();
}

