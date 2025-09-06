package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

public final class g implements StateListener {
    public final Utils a;
    public final TaskCompletionSource b;

    public g(Utils utils0, TaskCompletionSource taskCompletionSource0) {
        this.a = utils0;
        this.b = taskCompletionSource0;
    }

    @Override  // com.google.firebase.installations.StateListener
    public final boolean onException(Exception exception0) {
        this.b.trySetException(exception0);
        return true;
    }

    @Override  // com.google.firebase.installations.StateListener
    public final boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry0) {
        if(persistedInstallationEntry0.isRegistered() && !this.a.isAuthTokenExpired(persistedInstallationEntry0)) {
            InstallationTokenResult installationTokenResult0 = InstallationTokenResult.builder().setToken(persistedInstallationEntry0.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry0.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry0.getTokenCreationEpochInSecs()).build();
            this.b.setResult(installationTokenResult0);
            return true;
        }
        return false;
    }
}

