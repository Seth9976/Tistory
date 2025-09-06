package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public abstract class GoogleApi implements HasApiKey {
    @KeepForSdk
    public static class Settings {
        @KeepForSdk
        public static class Builder {
            public StatusExceptionMapper a;
            public Looper b;

            @NonNull
            @KeepForSdk
            public Settings build() {
                if(this.a == null) {
                    this.a = new ApiExceptionMapper();
                }
                if(this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new Settings(this.a, this.b);
            }

            @NonNull
            @KeepForSdk
            public Builder setLooper(@NonNull Looper looper0) {
                Preconditions.checkNotNull(looper0, "Looper must not be null.");
                this.b = looper0;
                return this;
            }

            @NonNull
            @KeepForSdk
            public Builder setMapper(@NonNull StatusExceptionMapper statusExceptionMapper0) {
                Preconditions.checkNotNull(statusExceptionMapper0, "StatusExceptionMapper must not be null.");
                this.a = statusExceptionMapper0;
                return this;
            }
        }

        @NonNull
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS;
        @NonNull
        public final StatusExceptionMapper zaa;
        @NonNull
        public final Looper zab;

        static {
            Settings.DEFAULT_SETTINGS = new Builder().build();
        }

        public Settings(StatusExceptionMapper statusExceptionMapper0, Looper looper0) {
            this.zaa = statusExceptionMapper0;
            this.zab = looper0;
        }
    }

    public final Context a;
    public final String b;
    public final Api c;
    public final ApiOptions d;
    public final ApiKey e;
    public final Looper f;
    public final int g;
    public final zabv h;
    public final StatusExceptionMapper i;
    @NonNull
    protected final GoogleApiManager zaa;

    @MainThread
    @KeepForSdk
    public GoogleApi(@NonNull Activity activity0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull Settings googleApi$Settings0) {
        this(activity0, activity0, api0, api$ApiOptions0, googleApi$Settings0);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Activity activity0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        googleApi$Settings$Builder0.setLooper(activity0.getMainLooper());
        this(activity0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    public GoogleApi(Context context0, Activity activity0, Api api0, ApiOptions api$ApiOptions0, Settings googleApi$Settings0) {
        Preconditions.checkNotNull(context0, "Null context is not permitted.");
        Preconditions.checkNotNull(api0, "Api must not be null.");
        Preconditions.checkNotNull(googleApi$Settings0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context0.getApplicationContext();
        String s = context0.getAttributionTag();
        this.b = s;
        this.c = api0;
        this.d = api$ApiOptions0;
        this.f = googleApi$Settings0.zab;
        ApiKey apiKey0 = ApiKey.zaa(api0, api$ApiOptions0, s);
        this.e = apiKey0;
        this.h = new zabv(this);
        GoogleApiManager googleApiManager0 = GoogleApiManager.zam(this.a);
        this.zaa = googleApiManager0;
        this.g = googleApiManager0.zaa();
        this.i = googleApi$Settings0.zaa;
        if(activity0 != null && !(activity0 instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity0, googleApiManager0, apiKey0);
        }
        googleApiManager0.zaB(this);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull Looper looper0, @NonNull StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setLooper(looper0);
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        this(context0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull Settings googleApi$Settings0) {
        this(context0, null, api0, api$ApiOptions0, googleApi$Settings0);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        this(context0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    @NonNull
    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.h;
    }

    @NonNull
    @KeepForSdk
    public com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
        Set set0;
        Account account0;
        com.google.android.gms.common.internal.ClientSettings.Builder clientSettings$Builder0 = new com.google.android.gms.common.internal.ClientSettings.Builder();
        ApiOptions api$ApiOptions0 = this.d;
        if(api$ApiOptions0 instanceof HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount0 = ((HasGoogleSignInAccountOptions)api$ApiOptions0).getGoogleSignInAccount();
            if(googleSignInAccount0 == null) {
                account0 = api$ApiOptions0 instanceof HasAccountOptions ? ((HasAccountOptions)api$ApiOptions0).getAccount() : null;
            }
            else {
                account0 = googleSignInAccount0.getAccount();
            }
        }
        else {
            account0 = api$ApiOptions0 instanceof HasAccountOptions ? ((HasAccountOptions)api$ApiOptions0).getAccount() : null;
        }
        clientSettings$Builder0.zab(account0);
        if(api$ApiOptions0 instanceof HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount1 = ((HasGoogleSignInAccountOptions)api$ApiOptions0).getGoogleSignInAccount();
            set0 = googleSignInAccount1 == null ? Collections.emptySet() : googleSignInAccount1.getRequestedScopes();
        }
        else {
            set0 = Collections.emptySet();
        }
        clientSettings$Builder0.zaa(set0);
        clientSettings$Builder0.zac(this.a.getClass().getName());
        clientSettings$Builder0.setRealClientPackageName("net.daum.android.tistoryapp");
        return clientSettings$Builder0;
    }

    @NonNull
    @KeepForSdk
    public Task disconnectService() {
        return this.zaa.zap(this);
    }

    @NonNull
    @KeepForSdk
    public ApiMethodImpl doBestEffortWrite(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.zaa.zaw(this, 2, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @NonNull
    @KeepForSdk
    public Task doBestEffortWrite(@NonNull TaskApiCall taskApiCall0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.zaa.zax(this, 2, taskApiCall0, taskCompletionSource0, this.i);
        return taskCompletionSource0.getTask();
    }

    @NonNull
    @KeepForSdk
    public ApiMethodImpl doRead(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.zaa.zaw(this, 0, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @NonNull
    @KeepForSdk
    public Task doRead(@NonNull TaskApiCall taskApiCall0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.zaa.zax(this, 0, taskApiCall0, taskCompletionSource0, this.i);
        return taskCompletionSource0.getTask();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public Task doRegisterEventListener(@NonNull RegisterListenerMethod registerListenerMethod0, @NonNull UnregisterListenerMethod unregisterListenerMethod0) {
        Preconditions.checkNotNull(registerListenerMethod0);
        Preconditions.checkNotNull(unregisterListenerMethod0);
        Preconditions.checkNotNull(registerListenerMethod0.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(unregisterListenerMethod0.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(registerListenerMethod0.getListenerKey(), unregisterListenerMethod0.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zaq(this, registerListenerMethod0, unregisterListenerMethod0, zad.zaa);
    }

    @NonNull
    @KeepForSdk
    public Task doRegisterEventListener(@NonNull RegistrationMethods registrationMethods0) {
        Preconditions.checkNotNull(registrationMethods0);
        Preconditions.checkNotNull(registrationMethods0.register.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods0.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zaq(this, registrationMethods0.register, registrationMethods0.zaa, registrationMethods0.zab);
    }

    @NonNull
    @KeepForSdk
    public Task doUnregisterEventListener(@NonNull ListenerKey listenerHolder$ListenerKey0) {
        return this.doUnregisterEventListener(listenerHolder$ListenerKey0, 0);
    }

    @NonNull
    @KeepForSdk
    public Task doUnregisterEventListener(@NonNull ListenerKey listenerHolder$ListenerKey0, int v) {
        Preconditions.checkNotNull(listenerHolder$ListenerKey0, "Listener key cannot be null.");
        return this.zaa.zar(this, listenerHolder$ListenerKey0, v);
    }

    @NonNull
    @KeepForSdk
    public ApiMethodImpl doWrite(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.zaa.zaw(this, 1, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @NonNull
    @KeepForSdk
    public Task doWrite(@NonNull TaskApiCall taskApiCall0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.zaa.zax(this, 1, taskApiCall0, taskCompletionSource0, this.i);
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.gms.common.api.HasApiKey
    @NonNull
    public final ApiKey getApiKey() {
        return this.e;
    }

    @NonNull
    @KeepForSdk
    public ApiOptions getApiOptions() {
        return this.d;
    }

    @NonNull
    @KeepForSdk
    public Context getApplicationContext() {
        return this.a;
    }

    @Nullable
    @KeepForSdk
    public String getContextAttributionTag() {
        return this.b;
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    public String getContextFeatureId() {
        return this.b;
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        return this.f;
    }

    @NonNull
    @KeepForSdk
    public ListenerHolder registerListener(@NonNull Object object0, @NonNull String s) {
        return ListenerHolders.createListenerHolder(object0, this.f, s);
    }

    public final int zaa() {
        return this.g;
    }

    @WorkerThread
    public final Client zab(Looper looper0, zabq zabq0) {
        ClientSettings clientSettings0 = this.createClientSettingsBuilder().build();
        Client api$Client0 = ((AbstractClientBuilder)Preconditions.checkNotNull(this.c.zaa())).buildClient(this.a, looper0, clientSettings0, this.d, zabq0, zabq0);
        String s = this.getContextAttributionTag();
        if(s != null && api$Client0 instanceof BaseGmsClient) {
            ((BaseGmsClient)api$Client0).setAttributionTag(s);
        }
        return api$Client0;
    }

    public final zact zac(Context context0, Handler handler0) {
        return new zact(context0, handler0, this.createClientSettingsBuilder().build());
    }
}

