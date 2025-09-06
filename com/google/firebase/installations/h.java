package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

public final class h implements StateListener {
    public final TaskCompletionSource a;

    public h(TaskCompletionSource taskCompletionSource0) {
        this.a = taskCompletionSource0;
    }

    @Override  // com.google.firebase.installations.StateListener
    public final boolean onException(Exception exception0) {
        return false;
    }

    @Override  // com.google.firebase.installations.StateListener
    public final boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry0) {
        if(!persistedInstallationEntry0.isUnregistered() && !persistedInstallationEntry0.isRegistered() && !persistedInstallationEntry0.isErrored()) {
            return false;
        }
        String s = persistedInstallationEntry0.getFirebaseInstallationId();
        this.a.trySetResult(s);
        return true;
    }
}

