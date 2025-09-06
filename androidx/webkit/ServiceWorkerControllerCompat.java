package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h5.b;

public abstract class ServiceWorkerControllerCompat {
    @NonNull
    public static ServiceWorkerControllerCompat getInstance() {
        return b.a;
    }

    @NonNull
    public abstract ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(@Nullable ServiceWorkerClientCompat arg1);
}

