package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api {
    @KeepForSdk
    @VisibleForTesting
    public static abstract class AbstractClientBuilder extends BaseClientBuilder {
        @NonNull
        @KeepForSdk
        @Deprecated
        public Client buildClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull ClientSettings clientSettings0, @NonNull Object object0, @NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0, @NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            return this.buildClient(context0, looper0, clientSettings0, object0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }

        @NonNull
        @KeepForSdk
        public Client buildClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull ClientSettings clientSettings0, @NonNull Object object0, @NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks0, @NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener0) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @KeepForSdk
    public interface AnyClient {
    }

    @KeepForSdk
    public static class AnyClientKey {
    }

    public interface ApiOptions {
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @NonNull
            Account getAccount();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @Nullable
            GoogleSignInAccount getGoogleSignInAccount();
        }

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }

        @NonNull
        public static final NoOptions NO_OPTIONS;

        static {
            ApiOptions.NO_OPTIONS = new NoOptions();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public static abstract class BaseClientBuilder {
        @KeepForSdk
        public static final int API_PRIORITY_GAMES = 1;
        @KeepForSdk
        public static final int API_PRIORITY_OTHER = 0x7FFFFFFF;
        @KeepForSdk
        public static final int API_PRIORITY_PLUS = 2;

        @NonNull
        @KeepForSdk
        public List getImpliedScopes(@Nullable Object object0) {
            return Collections.emptyList();
        }

        @KeepForSdk
        public int getPriority() [...] // Inlined contents
    }

    @KeepForSdk
    public interface Client extends AnyClient {
        @KeepForSdk
        void connect(@NonNull ConnectionProgressReportCallbacks arg1);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void disconnect(@NonNull String arg1);

        @KeepForSdk
        void dump(@NonNull String arg1, @Nullable FileDescriptor arg2, @NonNull PrintWriter arg3, @Nullable String[] arg4);

        @NonNull
        @KeepForSdk
        Feature[] getAvailableFeatures();

        @NonNull
        @KeepForSdk
        String getEndpointPackageName();

        @Nullable
        @KeepForSdk
        String getLastDisconnectMessage();

        @KeepForSdk
        int getMinApkVersion();

        @KeepForSdk
        void getRemoteService(@Nullable IAccountAccessor arg1, @Nullable Set arg2);

        @NonNull
        @KeepForSdk
        Feature[] getRequiredFeatures();

        @NonNull
        @KeepForSdk
        Set getScopesForConnectionlessNonSignIn();

        @Nullable
        @KeepForSdk
        IBinder getServiceBrokerBinder();

        @NonNull
        @KeepForSdk
        Intent getSignInIntent();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        boolean isConnecting();

        @KeepForSdk
        void onUserSignOut(@NonNull SignOutCallbacks arg1);

        @KeepForSdk
        boolean providesSignIn();

        @KeepForSdk
        boolean requiresAccount();

        @KeepForSdk
        boolean requiresGooglePlayServices();

        @KeepForSdk
        boolean requiresSignIn();
    }

    @KeepForSdk
    @VisibleForTesting
    public static final class ClientKey extends AnyClientKey {
    }

    public final AbstractClientBuilder a;
    public final ClientKey b;
    public final String c;

    @KeepForSdk
    public Api(@NonNull String s, @NonNull AbstractClientBuilder api$AbstractClientBuilder0, @NonNull ClientKey api$ClientKey0) {
        Preconditions.checkNotNull(api$AbstractClientBuilder0, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(api$ClientKey0, "Cannot construct an Api with a null ClientKey");
        this.c = s;
        this.a = api$AbstractClientBuilder0;
        this.b = api$ClientKey0;
    }

    @NonNull
    public final AbstractClientBuilder zaa() {
        return this.a;
    }

    @NonNull
    public final AnyClientKey zab() {
        return this.b;
    }

    @NonNull
    public final BaseClientBuilder zac() {
        return this.a;
    }

    @NonNull
    public final String zad() {
        return this.c;
    }
}

