package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

@KeepForSdk
public abstract class GmsClient extends BaseGmsClient implements Client, zaj {
    public final ClientSettings C;
    public final Set D;
    public final Account E;

    @KeepForSdk
    @VisibleForTesting
    public GmsClient(@NonNull Context context0, @NonNull Handler handler0, int v, @NonNull ClientSettings clientSettings0) {
        super(context0, handler0, GmsClientSupervisor.getInstance(context0), GoogleApiAvailability.getInstance(), v, null, null);
        this.C = (ClientSettings)Preconditions.checkNotNull(clientSettings0);
        this.E = clientSettings0.getAccount();
        this.D = this.e(clientSettings0.getAllRequestedScopes());
    }

    @KeepForSdk
    public GmsClient(@NonNull Context context0, @NonNull Looper looper0, int v, @NonNull ClientSettings clientSettings0) {
        this(context0, looper0, GmsClientSupervisor.getInstance(context0), GoogleApiAvailability.getInstance(), v, clientSettings0, null, null);
    }

    @KeepForSdk
    @Deprecated
    public GmsClient(@NonNull Context context0, @NonNull Looper looper0, int v, @NonNull ClientSettings clientSettings0, @NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0, @NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this(context0, looper0, v, clientSettings0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
    }

    @KeepForSdk
    public GmsClient(@NonNull Context context0, @NonNull Looper looper0, int v, @NonNull ClientSettings clientSettings0, @NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks0, @NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener0) {
        this(context0, looper0, GmsClientSupervisor.getInstance(context0), GoogleApiAvailability.getInstance(), v, clientSettings0, ((com.google.android.gms.common.api.internal.ConnectionCallbacks)Preconditions.checkNotNull(connectionCallbacks0)), ((com.google.android.gms.common.api.internal.OnConnectionFailedListener)Preconditions.checkNotNull(onConnectionFailedListener0)));
    }

    @VisibleForTesting
    public GmsClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull GmsClientSupervisor gmsClientSupervisor0, @NonNull GoogleApiAvailability googleApiAvailability0, int v, @NonNull ClientSettings clientSettings0, @Nullable com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks0, @Nullable com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener0) {
        super(context0, looper0, gmsClientSupervisor0, googleApiAvailability0, v, (connectionCallbacks0 == null ? null : new c(connectionCallbacks0)), (onConnectionFailedListener0 == null ? null : new d(onConnectionFailedListener0)), clientSettings0.zac());
        this.C = clientSettings0;
        this.E = clientSettings0.getAccount();
        this.D = this.e(clientSettings0.getAllRequestedScopes());
    }

    public final Set e(Set set0) {
        for(Object object0: set0) {
            if(!set0.contains(((Scope)object0))) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
            if(false) {
                break;
            }
        }
        return set0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    public final Account getAccount() {
        return this.E;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public final ClientSettings getClientSettings() {
        return this.C;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    @KeepForSdk
    public final Set getScopes() {
        return this.D;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    @KeepForSdk
    public Set getScopesForConnectionlessNonSignIn() {
        return this.requiresSignIn() ? this.D : Collections.emptySet();
    }

    @NonNull
    @KeepForSdk
    public Set validateScopes(@NonNull Set set0) [...] // Inlined contents
}

