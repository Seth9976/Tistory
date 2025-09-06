package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.f;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zak;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zabe extends GoogleApiClient implements zabz {
    public final Lock b;
    public final zak c;
    public zaca d;
    public final int e;
    public final Context f;
    public final Looper g;
    public final LinkedList h;
    public volatile boolean i;
    public final long j;
    public final long k;
    public final s l;
    public final GoogleApiAvailability m;
    public zabx n;
    public final Map o;
    public Set p;
    public final ClientSettings q;
    public final Map r;
    public final AbstractClientBuilder s;
    public final ListenerHolders t;
    public final ArrayList u;
    public Integer v;
    public HashSet w;
    public final zadc x;
    public static final int y;

    public zabe(Context context0, Lock lock0, Looper looper0, ClientSettings clientSettings0, GoogleApiAvailability googleApiAvailability0, AbstractClientBuilder api$AbstractClientBuilder0, Map map0, List list0, List list1, Map map1, int v, int v1, ArrayList arrayList0) {
        this.d = null;
        this.h = new LinkedList();
        this.j = 120000L;
        this.k = 5000L;
        this.p = new HashSet();
        this.t = new ListenerHolders();
        this.v = null;
        this.w = null;
        f f0 = new f(this, 10);
        this.f = context0;
        this.b = lock0;
        this.c = new zak(looper0, f0);
        this.g = looper0;
        this.l = new s(this, looper0, 0);
        this.m = googleApiAvailability0;
        this.e = v;
        if(v >= 0) {
            this.v = v1;
        }
        this.r = map0;
        this.o = map1;
        this.u = arrayList0;
        this.x = new zadc();
        for(Object object0: list0) {
            this.c.zaf(((ConnectionCallbacks)object0));
        }
        for(Object object1: list1) {
            this.c.zag(((OnConnectionFailedListener)object1));
        }
        this.q = clientSettings0;
        this.s = api$AbstractClientBuilder0;
    }

    public final String a() {
        StringWriter stringWriter0 = new StringWriter();
        this.dump("", null, new PrintWriter(stringWriter0), null);
        return stringWriter0.toString();
    }

    public static void b(zabe zabe0) {
        zabe0.b.lock();
        try {
            if(zabe0.i) {
                zabe0.e();
            }
        }
        finally {
            zabe0.b.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Lock lock0 = this.b;
        lock0.lock();
        try {
            if(this.e >= 0) {
                if(this.v == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
                this.d(((int)(((Integer)Preconditions.checkNotNull(this.v)))));
                this.c.zab();
                return ((zaca)Preconditions.checkNotNull(this.d)).zab();
            }
            Integer integer0 = this.v;
            boolean z1 = false;
            if(integer0 == null) {
                z1 = true;
                this.v = zabe.zad(this.o.values(), false);
            }
            else if(((int)integer0) != 2) {
                z1 = true;
            }
            if(z1) {
                this.d(((int)(((Integer)Preconditions.checkNotNull(this.v)))));
                this.c.zab();
                return ((zaca)Preconditions.checkNotNull(this.d)).zab();
            }
        }
        finally {
            lock0.unlock();
        }
        throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long v, @NonNull TimeUnit timeUnit0) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit0, "TimeUnit must not be null");
        Lock lock0 = this.b;
        lock0.lock();
        try {
            Integer integer0 = this.v;
            boolean z = false;
            if(integer0 == null) {
                z = true;
                this.v = zabe.zad(this.o.values(), false);
            }
            else if(((int)integer0) != 2) {
                z = true;
            }
            if(z) {
                this.d(((int)(((Integer)Preconditions.checkNotNull(this.v)))));
                this.c.zab();
                return ((zaca)Preconditions.checkNotNull(this.d)).zac(v, timeUnit0);
            }
        }
        finally {
            lock0.unlock();
        }
        throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }

    public final boolean c() {
        if(!this.i) {
            return false;
        }
        this.i = false;
        this.l.removeMessages(2);
        this.l.removeMessages(1);
        zabx zabx0 = this.n;
        if(zabx0 != null) {
            zabx0.zab();
            this.n = null;
        }
        return true;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult clearDefaultAccountAndReconnect() {
        Preconditions.checkState(this.isConnected(), "GoogleApiClient is not connected yet.");
        Preconditions.checkState(this.v == null || ((int)this.v) != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        PendingResult pendingResult0 = new StatusPendingResult(this);
        if(this.o.containsKey(Common.CLIENT_KEY)) {
            Common.zaa.zaa(this).setResultCallback(new r(this, ((StatusPendingResult)pendingResult0), false, this));
            return pendingResult0;
        }
        AtomicReference atomicReference0 = new AtomicReference();
        p p0 = new p(this, atomicReference0, ((StatusPendingResult)pendingResult0));
        q q0 = new q(((StatusPendingResult)pendingResult0));
        Builder googleApiClient$Builder0 = new Builder(this.f);
        googleApiClient$Builder0.addApi(Common.API);
        googleApiClient$Builder0.addConnectionCallbacks(p0);
        googleApiClient$Builder0.addOnConnectionFailedListener(q0);
        googleApiClient$Builder0.setHandler(this.l);
        GoogleApiClient googleApiClient0 = googleApiClient$Builder0.build();
        atomicReference0.set(googleApiClient0);
        googleApiClient0.connect();
        return pendingResult0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        Lock lock0 = this.b;
        lock0.lock();
        try {
            int v1 = 2;
            boolean z = false;
            if(this.e >= 0) {
                Preconditions.checkState(this.v != null, "Sign-in mode should have been set explicitly by auto-manage.");
                goto label_13;
            }
            Integer integer0 = this.v;
            boolean z1 = false;
            if(integer0 == null) {
                z1 = true;
                this.v = zabe.zad(this.o.values(), false);
            }
            else if(((int)integer0) != 2) {
                z1 = true;
            }
            if(z1) {
            label_13:
                int v2 = (int)(((Integer)Preconditions.checkNotNull(this.v)));
                lock0.lock();
                switch(v2) {
                    case 2: {
                        z = true;
                        break;
                    }
                    case 1: 
                    case 3: {
                        v1 = v2;
                        z = true;
                        break;
                    }
                    default: {
                        v1 = v2;
                    }
                }
                try {
                    Preconditions.checkArgument(z, "Illegal sign-in mode: " + v1);
                    this.d(v1);
                    this.e();
                }
                catch(Throwable throwable0) {
                    lock0.unlock();
                    throw throwable0;
                }
                lock0.unlock();
                return;
            }
        }
        finally {
            lock0.unlock();
        }
        throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int v) {
        Lock lock0 = this.b;
        lock0.lock();
        boolean z = true;
        if(v != 1 && v != 3) {
            if(v == 2) {
                v = 2;
            }
            else {
                z = false;
            }
        }
        try {
            Preconditions.checkArgument(z, "Illegal sign-in mode: " + v);
            this.d(v);
            this.e();
        }
        finally {
            lock0.unlock();
        }
    }

    public final void d(int v) {
        String s1;
        Integer integer0 = this.v;
        boolean z2 = false;
        if(integer0 == null) {
            z2 = true;
            this.v = v;
        }
        else if(((int)integer0) == v) {
            z2 = true;
        }
        if(z2) {
            if(this.d != null) {
                return;
            }
            Map map0 = this.o;
            boolean z = false;
            boolean z1 = false;
            for(Object object0: map0.values()) {
                z |= ((Client)object0).requiresSignIn();
                z1 |= ((Client)object0).providesSignIn();
            }
            switch(((int)this.v)) {
                case 1: {
                    if(!z) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    if(z1) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                }
                case 2: {
                    if(z) {
                        ArrayMap arrayMap0 = new ArrayMap();
                        ArrayMap arrayMap1 = new ArrayMap();
                        Client api$Client0 = null;
                        for(Object object1: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            Client api$Client1 = (Client)map$Entry0.getValue();
                            if(api$Client1.providesSignIn()) {
                                api$Client0 = api$Client1;
                            }
                            if(api$Client1.requiresSignIn()) {
                                arrayMap0.put(((AnyClientKey)map$Entry0.getKey()), api$Client1);
                            }
                            else {
                                arrayMap1.put(((AnyClientKey)map$Entry0.getKey()), api$Client1);
                            }
                        }
                        Preconditions.checkState(!arrayMap0.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        ArrayMap arrayMap2 = new ArrayMap();
                        ArrayMap arrayMap3 = new ArrayMap();
                        Map map1 = this.r;
                        for(Object object2: map1.keySet()) {
                            Api api0 = (Api)object2;
                            AnyClientKey api$AnyClientKey0 = api0.zab();
                            if(arrayMap0.containsKey(api$AnyClientKey0)) {
                                arrayMap2.put(api0, ((Boolean)map1.get(api0)));
                            }
                            else {
                                if(!arrayMap1.containsKey(api$AnyClientKey0)) {
                                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                                }
                                arrayMap3.put(api0, ((Boolean)map1.get(api0)));
                            }
                        }
                        ArrayList arrayList0 = new ArrayList();
                        ArrayList arrayList1 = new ArrayList();
                        ArrayList arrayList2 = this.u;
                        int v2 = arrayList2.size();
                        for(int v1 = 0; v1 < v2; ++v1) {
                            zat zat0 = (zat)arrayList2.get(v1);
                            if(arrayMap2.containsKey(zat0.zaa)) {
                                arrayList0.add(zat0);
                            }
                            else {
                                if(!arrayMap3.containsKey(zat0.zaa)) {
                                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                                }
                                arrayList1.add(zat0);
                            }
                        }
                        this.d = new b(this.f, this, this.b, this.g, this.m, arrayMap0, arrayMap1, this.q, this.s, api$Client0, arrayList0, arrayList1, arrayMap2, arrayMap3);
                        return;
                    }
                }
            }
            this.d = new zabi(this.f, this, this.b, this.g, this.m, this.o, this.q, this.r, this.s, this.u, this);
            return;
        }
        String s = "SIGN_IN_MODE_REQUIRED";
        switch(v) {
            case 1: {
                s1 = "SIGN_IN_MODE_REQUIRED";
                break;
            }
            case 2: {
                s1 = "SIGN_IN_MODE_OPTIONAL";
                break;
            }
            case 3: {
                s1 = "SIGN_IN_MODE_NONE";
                break;
            }
            default: {
                s1 = "UNKNOWN";
            }
        }
        switch(((int)this.v)) {
            case 1: {
                break;
            }
            case 2: {
                s = "SIGN_IN_MODE_OPTIONAL";
                break;
            }
            case 3: {
                s = "SIGN_IN_MODE_NONE";
                break;
            }
            default: {
                s = "UNKNOWN";
            }
        }
        throw new IllegalStateException(a5.b.r(new StringBuilder(s.length() + (s1.length() + 51)), "Cannot use sign-in mode: ", s1, ". Mode was already set to ", s));
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock0 = this.b;
        lock0.lock();
        try {
            this.x.zab();
            zaca zaca0 = this.d;
            if(zaca0 != null) {
                zaca0.zar();
            }
            this.t.zab();
            LinkedList linkedList0 = this.h;
            for(Object object0: linkedList0) {
                ((ApiMethodImpl)object0).zan(null);
                ((ApiMethodImpl)object0).cancel();
            }
            linkedList0.clear();
            if(this.d != null) {
                this.c();
                this.c.zaa();
                goto label_22;
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        lock0.unlock();
        throw throwable0;
    label_22:
        lock0.unlock();
        return;
    label_24:
        lock0.unlock();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String s, @Nullable FileDescriptor fileDescriptor0, PrintWriter printWriter0, @Nullable String[] arr_s) {
        printWriter0.append(s).append("mContext=").println(this.f);
        printWriter0.append(s).append("mResuming=").print(this.i);
        printWriter0.append(" mWorkQueue.size()=").print(this.h.size());
        printWriter0.append(" mUnconsumedApiCalls.size()=").println(this.x.a.size());
        zaca zaca0 = this.d;
        if(zaca0 != null) {
            zaca0.zas(s, fileDescriptor0, printWriter0, arr_s);
        }
    }

    public final void e() {
        this.c.zab();
        ((zaca)Preconditions.checkNotNull(this.d)).zaq();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ApiMethodImpl enqueue(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        Api api0 = baseImplementation$ApiMethodImpl0.getApi();
        Preconditions.checkArgument(this.o.containsKey(baseImplementation$ApiMethodImpl0.getClientKey()), "GoogleApiClient is not configured to use " + (api0 == null ? "the API" : api0.zad()) + " required for this call.");
        Lock lock0 = this.b;
        lock0.lock();
        try {
            zaca zaca0 = this.d;
            if(zaca0 == null) {
                this.h.add(baseImplementation$ApiMethodImpl0);
                return baseImplementation$ApiMethodImpl0;
            }
            return zaca0.zae(baseImplementation$ApiMethodImpl0);
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ApiMethodImpl execute(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        Api api0 = baseImplementation$ApiMethodImpl0.getApi();
        Preconditions.checkArgument(this.o.containsKey(baseImplementation$ApiMethodImpl0.getClientKey()), "GoogleApiClient is not configured to use " + (api0 == null ? "the API" : api0.zad()) + " required for this call.");
        this.b.lock();
        try {
            zaca zaca0 = this.d;
            if(zaca0 != null) {
                if(this.i) {
                    this.h.add(baseImplementation$ApiMethodImpl0);
                    while(!this.h.isEmpty()) {
                        ApiMethodImpl baseImplementation$ApiMethodImpl1 = (ApiMethodImpl)this.h.remove();
                        this.x.a.add(baseImplementation$ApiMethodImpl1);
                        baseImplementation$ApiMethodImpl1.zan(this.x.b);
                        baseImplementation$ApiMethodImpl1.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                    }
                }
                else {
                    baseImplementation$ApiMethodImpl0 = zaca0.zaf(baseImplementation$ApiMethodImpl0);
                }
                return baseImplementation$ApiMethodImpl0;
            }
        }
        finally {
            this.b.unlock();
        }
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final Client getClient(@NonNull AnyClientKey api$AnyClientKey0) {
        Client api$Client0 = (Client)this.o.get(api$AnyClientKey0);
        Preconditions.checkNotNull(api$Client0, "Appropriate Api was not requested.");
        return api$Client0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api api0) {
        ConnectionResult connectionResult1;
        ConnectionResult connectionResult0;
        this.b.lock();
        try {
            if(!this.isConnected() && !this.i) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if(!this.o.containsKey(api0.zab())) {
                throw new IllegalArgumentException(api0.zad() + " was never registered with GoogleApiClient");
            }
            connectionResult0 = ((zaca)Preconditions.checkNotNull(this.d)).zad(api0);
            if(connectionResult0 == null) {
                if(this.i) {
                    connectionResult1 = ConnectionResult.RESULT_SUCCESS;
                }
                else {
                    Log.w("GoogleApiClientImpl", this.a());
                    Log.wtf("GoogleApiClientImpl", api0.zad() + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new Exception());
                    connectionResult1 = new ConnectionResult(8, null);
                }
                goto label_17;
            }
            goto label_19;
        }
        catch(Throwable throwable0) {
        }
        this.b.unlock();
        throw throwable0;
    label_17:
        this.b.unlock();
        return connectionResult1;
    label_19:
        this.b.unlock();
        return connectionResult0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.f;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.g;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@NonNull Api api0) {
        return this.o.containsKey(api0.zab());
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api api0) {
        if(!this.isConnected()) {
            return false;
        }
        Client api$Client0 = (Client)this.o.get(api0.zab());
        return api$Client0 != null && api$Client0.isConnected();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        return this.d != null && this.d.zaw();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        return this.d != null && this.d.zax();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        return this.c.zaj(googleApiClient$ConnectionCallbacks0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        return this.c.zak(googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener0) {
        return this.d != null && this.d.zay(signInConnectionListener0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zaca0 = this.d;
        if(zaca0 != null) {
            zaca0.zau();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        this.disconnect();
        this.connect();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        this.c.zaf(googleApiClient$ConnectionCallbacks0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this.c.zag(googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ListenerHolder registerListener(@NonNull Object object0) {
        this.b.lock();
        try {
            return this.t.zaa(object0, this.g, "NO_TYPE");
        }
        finally {
            this.b.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity0) {
        LifecycleActivity lifecycleActivity0 = new LifecycleActivity(fragmentActivity0);
        int v = this.e;
        if(v < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        com.google.android.gms.common.api.internal.zak.zaa(lifecycleActivity0).zae(v);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        this.c.zah(googleApiClient$ConnectionCallbacks0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this.c.zai(googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult0) {
        if(!this.m.isPlayServicesPossiblyUpdating(this.f, connectionResult0.getErrorCode())) {
            this.c();
        }
        if(!this.i) {
            this.c.zac(connectionResult0);
            this.c.zaa();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zab(@Nullable Bundle bundle0) {
        while(true) {
            LinkedList linkedList0 = this.h;
            if(linkedList0.isEmpty()) {
                break;
            }
            this.execute(((ApiMethodImpl)linkedList0.remove()));
        }
        this.c.zad(bundle0);
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zac(int v, boolean z) {
        if(v == 1) {
            if(!z && !this.i) {
                this.i = true;
                if(this.n == null) {
                    try {
                        Context context0 = this.f.getApplicationContext();
                        t t0 = new t(this);
                        this.n = this.m.zac(context0, t0);
                    }
                    catch(SecurityException unused_ex) {
                    }
                }
                Message message0 = this.l.obtainMessage(1);
                this.l.sendMessageDelayed(message0, this.j);
                Message message1 = this.l.obtainMessage(2);
                this.l.sendMessageDelayed(message1, this.k);
            }
            v = 1;
        }
        BasePendingResult[] arr_basePendingResult = (BasePendingResult[])this.x.a.toArray(new BasePendingResult[0]);
        for(int v1 = 0; v1 < arr_basePendingResult.length; ++v1) {
            arr_basePendingResult[v1].forceFailureUnlessReady(zadc.zaa);
        }
        this.c.zae(v);
        this.c.zaa();
        if(v == 2) {
            this.e();
        }
    }

    public static int zad(Iterable iterable0, boolean z) {
        boolean z1 = false;
        boolean z2 = false;
        for(Object object0: iterable0) {
            z1 |= ((Client)object0).requiresSignIn();
            z2 |= ((Client)object0).providesSignIn();
        }
        if(z1) {
            return !z2 || !z ? 1 : 2;
        }
        return 3;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zada0) {
        Lock lock0 = this.b;
        lock0.lock();
        try {
            if(this.w == null) {
                this.w = new HashSet();
            }
            this.w.add(zada0);
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zada zada0) {
        Lock lock0 = this.b;
        lock0.lock();
        try {
            HashSet hashSet0 = this.w;
            if(hashSet0 == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            }
            else if(hashSet0.remove(zada0)) {
                lock0.lock();
                HashSet hashSet1 = this.w;
                if(hashSet1 == null) {
                    lock0.unlock();
                label_23:
                    zaca zaca0 = this.d;
                    if(zaca0 != null) {
                        zaca0.zat();
                    }
                }
                else {
                    try {
                        boolean z = hashSet1.isEmpty();
                    }
                    catch(Throwable throwable0) {
                        lock0.unlock();
                        throw throwable0;
                    }
                    lock0.unlock();
                    if(z) {
                        goto label_23;
                    }
                }
            }
            else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        }
        finally {
            lock0.unlock();
        }
    }
}

