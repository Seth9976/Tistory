package com.google.android.gms.common.api;

import a5.b;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@KeepForSdk
@Deprecated
public abstract class GoogleApiClient {
    @KeepForSdk
    @Deprecated
    public static final class Builder {
        public Account a;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public View e;
        public final String f;
        public final String g;
        public final ArrayMap h;
        public final Context i;
        public final ArrayMap j;
        public LifecycleActivity k;
        public int l;
        public OnConnectionFailedListener m;
        public Looper n;
        public final GoogleApiAvailability o;
        public final AbstractClientBuilder p;
        public final ArrayList q;
        public final ArrayList r;

        @KeepForSdk
        public Builder(@NonNull Context context0) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.h = new ArrayMap();
            this.j = new ArrayMap();
            this.l = -1;
            this.o = GoogleApiAvailability.getInstance();
            this.p = zad.zac;
            this.q = new ArrayList();
            this.r = new ArrayList();
            this.i = context0;
            this.n = context0.getMainLooper();
            this.f = "net.daum.android.tistoryapp";
            this.g = context0.getClass().getName();
        }

        @KeepForSdk
        public Builder(@NonNull Context context0, @NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0, @NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            this(context0);
            Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0, "Must provide a connected listener");
            this.q.add(googleApiClient$ConnectionCallbacks0);
            Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0, "Must provide a connection failed listener");
            this.r.add(googleApiClient$OnConnectionFailedListener0);
        }

        public final void a(Api api0, HasOptions api$ApiOptions$HasOptions0, Scope[] arr_scope) {
            HashSet hashSet0 = new HashSet(((BaseClientBuilder)Preconditions.checkNotNull(api0.zac(), "Base client builder must not be null")).getImpliedScopes(api$ApiOptions$HasOptions0));
            for(int v = 0; v < arr_scope.length; ++v) {
                hashSet0.add(arr_scope[v]);
            }
            zab zab0 = new zab(hashSet0);
            this.h.put(api0, zab0);
        }

        @NonNull
        public Builder addApi(@NonNull Api api0) {
            Preconditions.checkNotNull(api0, "Api must not be null");
            this.j.put(api0, null);
            List list0 = ((BaseClientBuilder)Preconditions.checkNotNull(api0.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.c.addAll(list0);
            this.b.addAll(list0);
            return this;
        }

        @NonNull
        public Builder addApi(@NonNull Api api0, @NonNull HasOptions api$ApiOptions$HasOptions0) {
            Preconditions.checkNotNull(api0, "Api must not be null");
            Preconditions.checkNotNull(api$ApiOptions$HasOptions0, "Null options are not permitted for this Api");
            this.j.put(api0, api$ApiOptions$HasOptions0);
            List list0 = ((BaseClientBuilder)Preconditions.checkNotNull(api0.zac(), "Base client builder must not be null")).getImpliedScopes(api$ApiOptions$HasOptions0);
            this.c.addAll(list0);
            this.b.addAll(list0);
            return this;
        }

        @NonNull
        public Builder addApiIfAvailable(@NonNull Api api0, @NonNull HasOptions api$ApiOptions$HasOptions0, @NonNull Scope[] arr_scope) {
            Preconditions.checkNotNull(api0, "Api must not be null");
            Preconditions.checkNotNull(api$ApiOptions$HasOptions0, "Null options are not permitted for this Api");
            this.j.put(api0, api$ApiOptions$HasOptions0);
            this.a(api0, api$ApiOptions$HasOptions0, arr_scope);
            return this;
        }

        @NonNull
        public Builder addApiIfAvailable(@NonNull Api api0, @NonNull Scope[] arr_scope) {
            Preconditions.checkNotNull(api0, "Api must not be null");
            this.j.put(api0, null);
            this.a(api0, null, arr_scope);
            return this;
        }

        @NonNull
        public Builder addConnectionCallbacks(@NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
            Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0, "Listener must not be null");
            this.q.add(googleApiClient$ConnectionCallbacks0);
            return this;
        }

        @NonNull
        public Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0, "Listener must not be null");
            this.r.add(googleApiClient$OnConnectionFailedListener0);
            return this;
        }

        @NonNull
        public Builder addScope(@NonNull Scope scope0) {
            Preconditions.checkNotNull(scope0, "Scope must not be null");
            this.b.add(scope0);
            return this;
        }

        @NonNull
        public GoogleApiClient build() {
            Preconditions.checkArgument(!this.j.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings clientSettings0 = this.zaa();
            Map map0 = clientSettings0.zad();
            ArrayMap arrayMap0 = new ArrayMap();
            ArrayMap arrayMap1 = new ArrayMap();
            ArrayList arrayList0 = new ArrayList();
            boolean z = false;
            Api api0 = null;
            for(Object object0: this.j.keySet()) {
                Object object1 = this.j.get(((Api)object0));
                boolean z1 = map0.get(((Api)object0)) != null;
                arrayMap0.put(((Api)object0), Boolean.valueOf(z1));
                zat zat0 = new zat(((Api)object0), z1);
                arrayList0.add(zat0);
                Client api$Client0 = ((AbstractClientBuilder)Preconditions.checkNotNull(((Api)object0).zaa())).buildClient(this.i, this.n, clientSettings0, object1, zat0, zat0);
                arrayMap1.put(((Api)object0).zab(), api$Client0);
                if(!api$Client0.providesSignIn()) {
                    continue;
                }
                if(api0 == null) {
                    api0 = (Api)object0;
                    continue;
                }
                String s = ((Api)object0).zad();
                String s1 = api0.zad();
                throw new IllegalStateException(b.q(new StringBuilder(String.valueOf(s).length() + 21 + String.valueOf(s1).length()), s, " cannot be used with ", s1));
            }
            if(api0 != null) {
                if(this.a == null) {
                    z = true;
                }
                Preconditions.checkState(z, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[]{api0.zad()});
                Preconditions.checkState(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[]{api0.zad()});
            }
            int v = zabe.zad(arrayMap1.values(), true);
            ReentrantLock reentrantLock0 = new ReentrantLock();
            GoogleApiClient googleApiClient0 = new zabe(this.i, reentrantLock0, this.n, clientSettings0, this.o, this.p, arrayMap0, this.q, this.r, arrayMap1, this.l, v, arrayList0);
            synchronized(GoogleApiClient.a) {
                GoogleApiClient.a.add(googleApiClient0);
            }
            if(this.l >= 0) {
                zak.zaa(this.k).zad(this.l, googleApiClient0, this.m);
            }
            return googleApiClient0;
        }

        @NonNull
        public Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity0, int v, @Nullable OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            LifecycleActivity lifecycleActivity0 = new LifecycleActivity(fragmentActivity0);
            Preconditions.checkArgument(v >= 0, "clientId must be non-negative");
            this.l = v;
            this.m = googleApiClient$OnConnectionFailedListener0;
            this.k = lifecycleActivity0;
            return this;
        }

        @NonNull
        public Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity0, @Nullable OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            this.enableAutoManage(fragmentActivity0, 0, googleApiClient$OnConnectionFailedListener0);
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String s) {
            this.a = s == null ? null : new Account(s, "com.google");
            return this;
        }

        @NonNull
        public Builder setGravityForPopups(int v) {
            this.d = v;
            return this;
        }

        @NonNull
        public Builder setHandler(@NonNull Handler handler0) {
            Preconditions.checkNotNull(handler0, "Handler must not be null");
            this.n = handler0.getLooper();
            return this;
        }

        @NonNull
        public Builder setViewForPopups(@NonNull View view0) {
            Preconditions.checkNotNull(view0, "View must not be null");
            this.e = view0;
            return this;
        }

        @NonNull
        public Builder useDefaultAccount() {
            this.setAccountName("<<default account>>");
            return this;
        }

        @NonNull
        @VisibleForTesting
        public final ClientSettings zaa() {
            SignInOptions signInOptions0 = SignInOptions.zaa;
            ArrayMap arrayMap0 = this.j;
            Api api0 = zad.zag;
            if(arrayMap0.containsKey(api0)) {
                signInOptions0 = (SignInOptions)arrayMap0.get(api0);
            }
            return new ClientSettings(this.a, this.b, this.h, this.d, this.e, this.f, this.g, signInOptions0, false);
        }
    }

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    public static final Set a;

    static {
        GoogleApiClient.a = Collections.newSetFromMap(new WeakHashMap());
    }

    @NonNull
    public abstract ConnectionResult blockingConnect();

    @NonNull
    public abstract ConnectionResult blockingConnect(long arg1, @NonNull TimeUnit arg2);

    @NonNull
    public abstract PendingResult clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int v) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@NonNull String arg1, @NonNull FileDescriptor arg2, @NonNull PrintWriter arg3, @NonNull String[] arg4);

    public static void dumpAll(@NonNull String s, @NonNull FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @NonNull String[] arr_s) {
        Set set0 = GoogleApiClient.a;
        synchronized(set0) {
            int v1 = 0;
            for(Object object0: set0) {
                printWriter0.append(s).append("GoogleApiClient#").println(v1);
                ((GoogleApiClient)object0).dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
                ++v1;
            }
        }
    }

    @NonNull
    @KeepForSdk
    public ApiMethodImpl enqueue(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public ApiMethodImpl execute(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public static Set getAllClients() {
        synchronized(GoogleApiClient.a) {
        }
        return GoogleApiClient.a;
    }

    @NonNull
    @KeepForSdk
    public Client getClient(@NonNull AnyClientKey api$AnyClientKey0) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult getConnectionResult(@NonNull Api arg1);

    @NonNull
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@NonNull Api api0) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@NonNull Api arg1);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks arg1);

    public abstract boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener arg1);

    @KeepForSdk
    public boolean maybeSignIn(@NonNull SignInConnectionListener signInConnectionListener0) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@NonNull ConnectionCallbacks arg1);

    public abstract void registerConnectionFailedListener(@NonNull OnConnectionFailedListener arg1);

    @NonNull
    @KeepForSdk
    public ListenerHolder registerListener(@NonNull Object object0) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@NonNull FragmentActivity arg1);

    public abstract void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks arg1);

    public abstract void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener arg1);

    public void zao(zada zada0) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zada0) {
        throw new UnsupportedOperationException();
    }
}

