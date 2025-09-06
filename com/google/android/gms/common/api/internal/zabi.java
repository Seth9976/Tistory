package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zabi implements zaca, zau {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final GoogleApiAvailabilityLight d;
    public final s e;
    public final Map f;
    public final HashMap g;
    public final ClientSettings h;
    public final Map i;
    public final AbstractClientBuilder j;
    public volatile zabf k;
    public ConnectionResult l;
    public int m;
    public final zabe n;
    public final zabz o;

    public zabi(Context context0, zabe zabe0, Lock lock0, Looper looper0, GoogleApiAvailabilityLight googleApiAvailabilityLight0, Map map0, @Nullable ClientSettings clientSettings0, Map map1, @Nullable AbstractClientBuilder api$AbstractClientBuilder0, ArrayList arrayList0, zabz zabz0) {
        this.g = new HashMap();
        this.l = null;
        this.c = context0;
        this.a = lock0;
        this.d = googleApiAvailabilityLight0;
        this.f = map0;
        this.h = clientSettings0;
        this.i = map1;
        this.j = api$AbstractClientBuilder0;
        this.n = zabe0;
        this.o = zabz0;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((zat)arrayList0.get(v1)).zaa(this);
        }
        this.e = new s(this, looper0, 1);
        this.b = lock0.newCondition();
        this.k = new zaax(this);
    }

    public final void a(ConnectionResult connectionResult0) {
        this.a.lock();
        try {
            this.l = connectionResult0;
            this.k = new zaax(this);
            this.k.zad();
            this.b.signalAll();
        }
        finally {
            this.a.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle0) {
        this.a.lock();
        try {
            this.k.zag(bundle0);
        }
        finally {
            this.a.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        this.a.lock();
        try {
            this.k.zai(v);
        }
        finally {
            this.a.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zau
    public final void zaa(@NonNull ConnectionResult connectionResult0, @NonNull Api api0, boolean z) {
        this.a.lock();
        try {
            this.k.zah(connectionResult0, api0, z);
        }
        finally {
            this.a.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zab() {
        this.zaq();
        while(this.k instanceof zaaw) {
            try {
                this.b.await();
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if(this.k instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult0 = this.l;
        return connectionResult0 == null ? new ConnectionResult(13, null) : connectionResult0;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zac(long v, TimeUnit timeUnit0) {
        this.zaq();
        for(long v1 = timeUnit0.toNanos(v); this.k instanceof zaaw; v1 = this.b.awaitNanos(v1)) {
            try {
                if(v1 <= 0L) {
                    this.zar();
                    return new ConnectionResult(14, null);
                }
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if(this.k instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult0 = this.l;
        return connectionResult0 == null ? new ConnectionResult(13, null) : connectionResult0;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult zad(@NonNull Api api0) {
        AnyClientKey api$AnyClientKey0 = api0.zab();
        Map map0 = this.f;
        if(map0.containsKey(api$AnyClientKey0)) {
            if(((Client)map0.get(api$AnyClientKey0)).isConnected()) {
                return ConnectionResult.RESULT_SUCCESS;
            }
            return this.g.containsKey(api$AnyClientKey0) ? ((ConnectionResult)this.g.get(api$AnyClientKey0)) : null;
        }
        return null;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ApiMethodImpl zae(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.k.zaa(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ApiMethodImpl zaf(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        return this.k.zab(baseImplementation$ApiMethodImpl0);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zaq() {
        this.k.zae();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zar() {
        if(this.k.zaj()) {
            this.g.clear();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zas(String s, @Nullable FileDescriptor fileDescriptor0, PrintWriter printWriter0, @Nullable String[] arr_s) {
        printWriter0.append(s).append("mState=").println(this.k);
        for(Object object0: this.i.keySet()) {
            printWriter0.append(s).append(((Api)object0).zad()).println(":");
            ((Client)Preconditions.checkNotNull(((Client)this.f.get(((Api)object0).zab())))).dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zat() {
        if(this.k instanceof zaaj) {
            zaaj zaaj0 = (zaaj)this.k;
            if(zaaj0.b) {
                zaaj0.b = false;
                zaaj0.a.n.x.zab();
                zaaj0.zaj();
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        return this.k instanceof zaaj;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        return this.k instanceof zaaw;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener0) {
        return false;
    }
}

