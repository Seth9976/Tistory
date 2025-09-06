package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaaw implements zabf {
    public final zabi a;
    public final Lock b;
    public final Context c;
    public final GoogleApiAvailabilityLight d;
    public ConnectionResult e;
    public int f;
    public int g;
    public int h;
    public final Bundle i;
    public final HashSet j;
    public zae k;
    public boolean l;
    public boolean m;
    public boolean n;
    public IAccountAccessor o;
    public boolean p;
    public boolean q;
    public final ClientSettings r;
    public final Map s;
    public final AbstractClientBuilder t;
    public final ArrayList u;

    public zaaw(zabi zabi0, @Nullable ClientSettings clientSettings0, Map map0, GoogleApiAvailabilityLight googleApiAvailabilityLight0, @Nullable AbstractClientBuilder api$AbstractClientBuilder0, Lock lock0, Context context0) {
        this.g = 0;
        this.i = new Bundle();
        this.j = new HashSet();
        this.u = new ArrayList();
        this.a = zabi0;
        this.r = clientSettings0;
        this.s = map0;
        this.d = googleApiAvailabilityLight0;
        this.t = api$AbstractClientBuilder0;
        this.b = lock0;
        this.c = context0;
    }

    public final void a() {
        this.m = false;
        zabi zabi0 = this.a;
        zabi0.n.p = Collections.emptySet();
        for(Object object0: this.j) {
            AnyClientKey api$AnyClientKey0 = (AnyClientKey)object0;
            HashMap hashMap0 = zabi0.g;
            if(!hashMap0.containsKey(api$AnyClientKey0)) {
                hashMap0.put(api$AnyClientKey0, new ConnectionResult(17, null));
            }
        }
    }

    public final void b(boolean z) {
        zae zae0 = this.k;
        if(zae0 != null) {
            if(zae0.isConnected() && z) {
                zae0.zaa();
            }
            zae0.disconnect();
            ClientSettings clientSettings0 = (ClientSettings)Preconditions.checkNotNull(this.r);
            this.o = null;
        }
    }

    public final void c() {
        this.a.a.lock();
        try {
            this.a.n.c();
            this.a.k = new zaaj(this.a);
            this.a.k.zad();
            this.a.b.signalAll();
        }
        finally {
            this.a.a.unlock();
        }
        zabj.zaa().execute(new a(this, 8));
        zae zae0 = this.k;
        if(zae0 != null) {
            if(this.p) {
                zae0.zac(((IAccountAccessor)Preconditions.checkNotNull(this.o)), this.q);
            }
            this.b(false);
        }
        for(Object object0: this.a.g.keySet()) {
            ((Client)Preconditions.checkNotNull(((Client)this.a.f.get(((AnyClientKey)object0))))).disconnect();
        }
        this.a.o.zab((this.i.isEmpty() ? null : this.i));
    }

    public final void d(ConnectionResult connectionResult0) {
        ArrayList arrayList0 = this.u;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Future)arrayList0.get(v1)).cancel(true);
        }
        arrayList0.clear();
        this.b(!connectionResult0.hasResolution());
        this.a.a(connectionResult0);
        this.a.o.zaa(connectionResult0);
    }

    public final void e(ConnectionResult connectionResult0, Api api0, boolean z) {
        if((!z || connectionResult0.hasResolution() || this.d.getErrorResolutionIntent(connectionResult0.getErrorCode()) != null) && (this.e == null || 0x7FFFFFFF < this.f)) {
            this.e = connectionResult0;
            this.f = 0x7FFFFFFF;
        }
        this.a.g.put(api0.zab(), connectionResult0);
    }

    public final void f() {
        if(this.h != 0) {
            return;
        }
        if(!this.m || this.n) {
            ArrayList arrayList0 = new ArrayList();
            this.g = 1;
            zabi zabi0 = this.a;
            this.h = zabi0.f.size();
            Map map0 = zabi0.f;
            for(Object object0: map0.keySet()) {
                AnyClientKey api$AnyClientKey0 = (AnyClientKey)object0;
                if(!zabi0.g.containsKey(api$AnyClientKey0)) {
                    arrayList0.add(((Client)map0.get(api$AnyClientKey0)));
                }
                else if(this.h()) {
                    this.c();
                }
            }
            if(!arrayList0.isEmpty()) {
                Future future0 = zabj.zaa().submit(new l(this, arrayList0));
                this.u.add(future0);
            }
        }
    }

    public final boolean g(int v) {
        if(this.g != v) {
            Log.w("GACConnecting", this.a.n.a());
            Log.w("GACConnecting", "Unexpected callback in " + this.toString());
            Log.w("GACConnecting", "mRemainingConnections=" + this.h);
            String s = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            String s1 = this.g == 0 ? "STEP_SERVICE_BINDINGS_AND_SIGN_IN" : "STEP_GETTING_REMOTE_SERVICE";
            if(v != 0) {
                s = "STEP_GETTING_REMOTE_SERVICE";
            }
            Log.e("GACConnecting", "GoogleApiClient connecting is in step " + s1 + " but received callback for step " + s, new Exception());
            this.d(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    public final boolean h() {
        int v = this.h - 1;
        this.h = v;
        if(v > 0) {
            return false;
        }
        zabi zabi0 = this.a;
        if(v < 0) {
            Log.w("GACConnecting", zabi0.n.a());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            this.d(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult0 = this.e;
        if(connectionResult0 != null) {
            zabi0.m = this.f;
            this.d(connectionResult0);
            return false;
        }
        return true;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zaa(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        this.a.n.h.add(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zab(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zad() {
        Map map1;
        zabi zabi0 = this.a;
        zabi0.g.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap0 = new HashMap();
        Map map0 = this.s;
        Iterator iterator0 = map0.keySet().iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            map1 = zabi0.f;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            Api api0 = (Api)object0;
            Client api$Client0 = (Client)Preconditions.checkNotNull(((Client)map1.get(api0.zab())));
            boolean z1 = ((Boolean)map0.get(api0)).booleanValue();
            if(api$Client0.requiresSignIn()) {
                this.m = true;
                if(z1) {
                    this.j.add(api0.zab());
                }
                else {
                    this.l = false;
                }
            }
            hashMap0.put(api$Client0, new h(this, api0, z1));
        }
        if(this.m) {
            Preconditions.checkNotNull(this.r);
            Preconditions.checkNotNull(this.t);
            this.r.zae(System.identityHashCode(zabi0.n));
            n n0 = new n(this);
            this.k = this.t.buildClient(this.c, zabi0.n.getLooper(), this.r, this.r.zaa(), n0, n0);
        }
        this.h = map1.size();
        Future future0 = zabj.zaa().submit(new k(this, hashMap0));
        this.u.add(future0);
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zag(@Nullable Bundle bundle0) {
        if(!this.g(1)) {
            return;
        }
        if(bundle0 != null) {
            this.i.putAll(bundle0);
        }
        if(this.h()) {
            this.c();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zah(ConnectionResult connectionResult0, Api api0, boolean z) {
        if(!this.g(1)) {
            return;
        }
        this.e(connectionResult0, api0, z);
        if(this.h()) {
            this.c();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zai(int v) {
        this.d(new ConnectionResult(8, null));
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final boolean zaj() {
        ArrayList arrayList0 = this.u;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Future)arrayList0.get(v1)).cancel(true);
        }
        arrayList0.clear();
        this.b(true);
        this.a.a(null);
        return true;
    }
}

