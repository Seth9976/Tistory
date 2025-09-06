package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.widget.a;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zaq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public final class b implements zaca {
    public final Context a;
    public final zabe b;
    public final Looper c;
    public final zabi d;
    public final zabi e;
    public final Map f;
    public final Set g;
    public final Client h;
    public Bundle i;
    public ConnectionResult j;
    public ConnectionResult k;
    public boolean l;
    public final Lock m;
    public int n;

    public b(Context context0, zabe zabe0, Lock lock0, Looper looper0, GoogleApiAvailabilityLight googleApiAvailabilityLight0, ArrayMap arrayMap0, ArrayMap arrayMap1, ClientSettings clientSettings0, AbstractClientBuilder api$AbstractClientBuilder0, Client api$Client0, ArrayList arrayList0, ArrayList arrayList1, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        this.g = Collections.newSetFromMap(new WeakHashMap());
        this.j = null;
        this.k = null;
        this.l = false;
        this.n = 0;
        this.a = context0;
        this.b = zabe0;
        this.m = lock0;
        this.c = looper0;
        this.h = api$Client0;
        this.d = new zabi(context0, zabe0, lock0, looper0, googleApiAvailabilityLight0, arrayMap1, null, arrayMap3, null, arrayList1, new o0(this, 0));
        this.e = new zabi(context0, zabe0, lock0, looper0, googleApiAvailabilityLight0, arrayMap0, clientSettings0, arrayMap2, api$AbstractClientBuilder0, arrayList0, new o0(this, 1));
        ArrayMap arrayMap4 = new ArrayMap();
        for(Object object0: arrayMap1.keySet()) {
            arrayMap4.put(((AnyClientKey)object0), this.d);
        }
        for(Object object1: arrayMap0.keySet()) {
            arrayMap4.put(((AnyClientKey)object1), this.e);
        }
        this.f = Collections.unmodifiableMap(arrayMap4);
    }

    public final void a(ConnectionResult connectionResult0) {
        switch(this.n) {
            case 1: {
                this.b();
                break;
            }
            case 2: {
                this.b.zaa(connectionResult0);
                this.b();
                break;
            }
            default: {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
            }
        }
        this.n = 0;
    }

    public final void b() {
        Set set0 = this.g;
        for(Object object0: set0) {
            ((SignInConnectionListener)object0).onComplete();
        }
        set0.clear();
    }

    public final boolean c() {
        return this.k != null && this.k.getErrorCode() == 4;
    }

    public static void d(b b0) {
        zabi zabi0 = b0.d;
        if(b0.j == null || !b0.j.isSuccess()) {
            zabi zabi1 = b0.e;
            if(b0.j != null && (b0.k != null && b0.k.isSuccess())) {
                zabi1.zar();
                b0.a(((ConnectionResult)Preconditions.checkNotNull(b0.j)));
                return;
            }
            ConnectionResult connectionResult1 = b0.j;
            if(connectionResult1 != null) {
                ConnectionResult connectionResult2 = b0.k;
                if(connectionResult2 != null) {
                    if(zabi1.m < zabi0.m) {
                        connectionResult1 = connectionResult2;
                    }
                    b0.a(connectionResult1);
                }
            }
        }
        else {
            if(b0.k != null && b0.k.isSuccess() || b0.c()) {
                goto label_11;
            }
            ConnectionResult connectionResult0 = b0.k;
            if(connectionResult0 != null) {
                if(b0.n == 1) {
                    b0.b();
                    return;
                }
                b0.a(connectionResult0);
                zabi0.zar();
                return;
            label_11:
                switch(b0.n) {
                    case 1: {
                        b0.b();
                        break;
                    }
                    case 2: {
                        ((zabe)Preconditions.checkNotNull(b0.b)).zab(b0.i);
                        b0.b();
                        break;
                    }
                    default: {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    }
                }
                b0.n = 0;
            }
        }
    }

    public final PendingIntent e() {
        Client api$Client0 = this.h;
        if(api$Client0 == null) {
            return null;
        }
        Intent intent0 = api$Client0.getSignInIntent();
        return zal.zaa(this.a, System.identityHashCode(this.b), intent0, zal.zaa | 0x8000000);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long v, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(Api api0) {
        Object object0 = this.f.get(api0.zab());
        zabi zabi0 = this.e;
        if(Objects.equal(object0, zabi0)) {
            return this.c() ? new ConnectionResult(4, this.e()) : zabi0.zad(api0);
        }
        return this.d.zad(api0);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ApiMethodImpl zae(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        zabi zabi0 = (zabi)this.f.get(baseImplementation$ApiMethodImpl0.getClientKey());
        Preconditions.checkNotNull(zabi0, "GoogleApiClient is not configured to use the API required for this call.");
        zabi zabi1 = this.e;
        if(zabi0.equals(zabi1)) {
            if(this.c()) {
                baseImplementation$ApiMethodImpl0.setFailedResult(new Status(4, null, this.e()));
                return baseImplementation$ApiMethodImpl0;
            }
            zabi1.zae(baseImplementation$ApiMethodImpl0);
            return baseImplementation$ApiMethodImpl0;
        }
        this.d.zae(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ApiMethodImpl zaf(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        zabi zabi0 = (zabi)this.f.get(baseImplementation$ApiMethodImpl0.getClientKey());
        Preconditions.checkNotNull(zabi0, "GoogleApiClient is not configured to use the API required for this call.");
        zabi zabi1 = this.e;
        if(zabi0.equals(zabi1)) {
            if(this.c()) {
                baseImplementation$ApiMethodImpl0.setFailedResult(new Status(4, null, this.e()));
                return baseImplementation$ApiMethodImpl0;
            }
            return zabi1.zaf(baseImplementation$ApiMethodImpl0);
        }
        return this.d.zaf(baseImplementation$ApiMethodImpl0);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.zaq();
        this.e.zaq();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.zar();
        this.e.zar();
        this.b();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zas(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.append(s).append("authClient").println(":");
        this.e.zas(s + "  ", fileDescriptor0, printWriter0, arr_s);
        printWriter0.append(s).append("anonClient").println(":");
        this.d.zas(s + "  ", fileDescriptor0, printWriter0, arr_s);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.d.zat();
        this.e.zat();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        Lock lock0 = this.m;
        lock0.lock();
        try {
            boolean z = this.zax();
            this.e.zar();
            this.k = new ConnectionResult(4);
            if(z) {
                new zaq(this.c).post(new a(this, 11));
            }
            else {
                this.b();
            }
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        boolean z = false;
        Lock lock0 = this.m;
        lock0.lock();
        try {
            if(this.d.zaw() && (this.e.zaw() || this.c() || this.n == 1)) {
                z = true;
            }
            return z;
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.m.lock();
        boolean z = this.n == 2;
        this.m.unlock();
        return z;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener0) {
        zabi zabi0 = this.e;
        Lock lock0 = this.m;
        lock0.lock();
        try {
            if((this.zax() || this.zaw()) && !zabi0.zaw()) {
                this.g.add(signInConnectionListener0);
                if(this.n == 0) {
                    this.n = 1;
                }
                this.k = null;
                zabi0.zaq();
                goto label_13;
            }
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
        lock0.unlock();
        throw throwable0;
    label_13:
        lock0.unlock();
        return true;
    label_15:
        lock0.unlock();
        return false;
    }
}

