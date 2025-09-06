package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.room.a;
import androidx.work.impl.foreground.b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zap;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class zabq implements ConnectionCallbacks, OnConnectionFailedListener, zau {
    public final LinkedList a;
    public final Client b;
    public final ApiKey c;
    public final zaad d;
    public final HashSet e;
    public final HashMap f;
    public final int g;
    public final zact h;
    public boolean i;
    public final ArrayList j;
    public ConnectionResult k;
    public int l;
    public final GoogleApiManager m;

    @WorkerThread
    public zabq(GoogleApiManager googleApiManager0, GoogleApi googleApi0) {
        this.m = googleApiManager0;
        super();
        this.a = new LinkedList();
        this.e = new HashSet();
        this.f = new HashMap();
        this.j = new ArrayList();
        this.k = null;
        this.l = 0;
        Client api$Client0 = googleApi0.zab(googleApiManager0.n.getLooper(), this);
        this.b = api$Client0;
        this.c = googleApi0.getApiKey();
        this.d = new zaad();
        this.g = googleApi0.zaa();
        if(api$Client0.requiresSignIn()) {
            this.h = googleApi0.zac(googleApiManager0.e, googleApiManager0.n);
            return;
        }
        this.h = null;
    }

    public final Feature a(Feature[] arr_feature) {
        if(arr_feature != null && arr_feature.length != 0) {
            Feature[] arr_feature1 = this.b.getAvailableFeatures();
            int v = 0;
            if(arr_feature1 == null) {
                arr_feature1 = new Feature[0];
            }
            ArrayMap arrayMap0 = new ArrayMap(arr_feature1.length);
            for(int v1 = 0; v1 < arr_feature1.length; ++v1) {
                Feature feature0 = arr_feature1[v1];
                arrayMap0.put(feature0.getName(), feature0.getVersion());
            }
            while(v < arr_feature.length) {
                Feature feature1 = arr_feature[v];
                Long long0 = (Long)arrayMap0.get(feature1.getName());
                if(long0 != null && ((long)long0) >= feature1.getVersion()) {
                    ++v;
                    continue;
                }
                return feature1;
            }
        }
        return null;
    }

    public final void b(ConnectionResult connectionResult0) {
        HashSet hashSet0 = this.e;
        for(Object object0: hashSet0) {
            String s = Objects.equal(connectionResult0, ConnectionResult.RESULT_SUCCESS) ? this.b.getEndpointPackageName() : null;
            ((zal)object0).zac(this.c, connectionResult0, s);
        }
        hashSet0.clear();
    }

    public final void c(Status status0) {
        Preconditions.checkHandlerThread(this.m.n);
        this.d(status0, null, false);
    }

    public final void d(Status status0, Exception exception0, boolean z) {
        Preconditions.checkHandlerThread(this.m.n);
        if((status0 == null ? 1 : 0) == (exception0 == null ? 1 : 0)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator iterator0 = this.a.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zai zai0 = (zai)object0;
            if(!z || zai0.zac == 2) {
                if(status0 == null) {
                    zai0.zae(exception0);
                }
                else {
                    zai0.zad(status0);
                }
                iterator0.remove();
            }
        }
    }

    public final void e() {
        LinkedList linkedList0 = this.a;
        ArrayList arrayList0 = new ArrayList(linkedList0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            zai zai0 = (zai)arrayList0.get(v1);
            if(!this.b.isConnected()) {
                break;
            }
            if(this.i(zai0)) {
                linkedList0.remove(zai0);
            }
        }
    }

    public final void f() {
        Client api$Client0 = this.b;
        this.zan();
        this.b(ConnectionResult.RESULT_SUCCESS);
        if(this.i) {
            this.m.n.removeMessages(11, this.c);
            this.m.n.removeMessages(9, this.c);
            this.i = false;
        }
        Iterator iterator0 = this.f.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zaci zaci0 = (zaci)object0;
            if(this.a(zaci0.zaa.getRequiredFeatures()) == null) {
                try {
                    TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
                    zaci0.zaa.registerListener(api$Client0, taskCompletionSource0);
                }
                catch(DeadObjectException unused_ex) {
                    this.onConnectionSuspended(3);
                    api$Client0.disconnect("DeadObjectException thrown while calling register listener method.");
                    break;
                }
                catch(RemoteException unused_ex) {
                    iterator0.remove();
                }
            }
            else {
                iterator0.remove();
            }
        }
        this.e();
        this.h();
    }

    public final void g(int v) {
        this.zan();
        this.i = true;
        String s = this.b.getLastDisconnectMessage();
        zaad zaad0 = this.d;
        zaad0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder("The connection to Google Play services was lost");
        if(v == 1) {
            stringBuilder0.append(" due to service disconnection.");
        }
        else if(v == 3) {
            stringBuilder0.append(" due to dead object exception.");
        }
        if(s != null) {
            stringBuilder0.append(" Last reason for disconnect: ");
            stringBuilder0.append(s);
        }
        zaad0.a(new Status(20, stringBuilder0.toString()), true);
        Message message0 = Message.obtain(this.m.n, 9, this.c);
        this.m.n.sendMessageDelayed(message0, 5000L);
        Message message1 = Message.obtain(this.m.n, 11, this.c);
        this.m.n.sendMessageDelayed(message1, 120000L);
        this.m.g.zac();
        for(Object object0: this.f.values()) {
            ((zaci)object0).zac.run();
        }
    }

    public final void h() {
        this.m.n.removeMessages(12, this.c);
        Message message0 = this.m.n.obtainMessage(12, this.c);
        this.m.n.sendMessageDelayed(message0, this.m.a);
    }

    public final boolean i(zai zai0) {
        if(!(zai0 instanceof zac)) {
            boolean z = this.zaz();
            zai0.zag(this.d, z);
            try {
                zai0.zaf(this);
            }
            catch(DeadObjectException unused_ex) {
                this.onConnectionSuspended(1);
                this.b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Feature feature0 = this.a(((zac)zai0).zab(this));
        if(feature0 == null) {
            boolean z1 = this.zaz();
            zai0.zag(this.d, z1);
            try {
                zai0.zaf(this);
            }
            catch(DeadObjectException unused_ex) {
                this.onConnectionSuspended(1);
                this.b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String s = this.b.getClass().getName();
        String s1 = feature0.getName();
        long v = feature0.getVersion();
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 77 + String.valueOf(s1).length());
        a.w(stringBuilder0, s, " could not execute call because it requires feature (", s1, ", ");
        stringBuilder0.append(v);
        stringBuilder0.append(").");
        Log.w("GoogleApiManager", stringBuilder0.toString());
        if(this.m.o && ((zac)zai0).zaa(this)) {
            y y0 = new y(this.c, feature0);
            int v1 = this.j.indexOf(y0);
            if(v1 >= 0) {
                y y1 = (y)this.j.get(v1);
                this.m.n.removeMessages(15, y1);
                Message message0 = Message.obtain(this.m.n, 15, y1);
                this.m.getClass();
                this.m.n.sendMessageDelayed(message0, 5000L);
                return false;
            }
            this.j.add(y0);
            Message message1 = Message.obtain(this.m.n, 15, y0);
            this.m.getClass();
            this.m.n.sendMessageDelayed(message1, 5000L);
            Message message2 = Message.obtain(this.m.n, 16, y0);
            this.m.getClass();
            this.m.n.sendMessageDelayed(message2, 120000L);
            ConnectionResult connectionResult0 = new ConnectionResult(2, null);
            if(!this.j(connectionResult0)) {
                this.m.f.zah(this.m.e, connectionResult0, this.g);
            }
            return false;
        }
        ((zac)zai0).zae(new UnsupportedApiCallException(feature0));
        return true;
    }

    public final boolean j(ConnectionResult connectionResult0) {
        synchronized(GoogleApiManager.q) {
            if(this.m.k != null && this.m.l.contains(this.c)) {
                this.m.k.zah(connectionResult0, this.g);
                return true;
            }
            return false;
        }
    }

    public final boolean k(boolean z) {
        Preconditions.checkHandlerThread(this.m.n);
        Client api$Client0 = this.b;
        if(api$Client0.isConnected() && this.f.size() == 0) {
            if(this.d.a.isEmpty() && this.d.b.isEmpty()) {
                api$Client0.disconnect("Timing out service connection.");
                return true;
            }
            if(z) {
                this.h();
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle0) {
        Looper looper0 = Looper.myLooper();
        GoogleApiManager googleApiManager0 = this.m;
        if(looper0 == googleApiManager0.n.getLooper()) {
            this.f();
            return;
        }
        androidx.appcompat.widget.a a0 = new androidx.appcompat.widget.a(this, 9);
        googleApiManager0.n.post(a0);
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        this.zar(connectionResult0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        Looper looper0 = Looper.myLooper();
        GoogleApiManager googleApiManager0 = this.m;
        if(looper0 == googleApiManager0.n.getLooper()) {
            this.g(v);
            return;
        }
        b b0 = new b(this, v, 1);
        googleApiManager0.n.post(b0);
    }

    @WorkerThread
    public final boolean zaA() {
        return this.k(true);
    }

    @Override  // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult0, Api api0, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.g;
    }

    @Nullable
    @WorkerThread
    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(this.m.n);
        return this.k;
    }

    public final Client zaf() {
        return this.b;
    }

    public final Map zah() {
        return this.f;
    }

    @WorkerThread
    public final void zan() {
        Preconditions.checkHandlerThread(this.m.n);
        this.k = null;
    }

    @WorkerThread
    public final void zao() {
        GoogleApiManager googleApiManager0 = this.m;
        Preconditions.checkHandlerThread(googleApiManager0.n);
        Client api$Client0 = this.b;
        if(!api$Client0.isConnected() && !api$Client0.isConnecting()) {
            try {
                int v = googleApiManager0.g.zab(googleApiManager0.e, api$Client0);
                if(v != 0) {
                    ConnectionResult connectionResult0 = new ConnectionResult(v, null);
                    Log.w("GoogleApiManager", "The service for " + api$Client0.getClass().getName() + " is not available: " + connectionResult0.toString());
                    this.zar(connectionResult0, null);
                    return;
                }
            }
            catch(IllegalStateException illegalStateException0) {
                this.zar(new ConnectionResult(10), illegalStateException0);
                return;
            }
            a0 a00 = new a0(googleApiManager0, api$Client0, this.c);
            if(api$Client0.requiresSignIn()) {
                ((zact)Preconditions.checkNotNull(this.h)).zae(a00);
            }
            try {
                api$Client0.connect(a00);
            }
            catch(SecurityException securityException0) {
                this.zar(new ConnectionResult(10), securityException0);
            }
        }
    }

    @WorkerThread
    public final void zap(zai zai0) {
        Preconditions.checkHandlerThread(this.m.n);
        boolean z = this.b.isConnected();
        LinkedList linkedList0 = this.a;
        if(z) {
            if(this.i(zai0)) {
                this.h();
                return;
            }
            linkedList0.add(zai0);
            return;
        }
        linkedList0.add(zai0);
        if(this.k != null && this.k.hasResolution()) {
            this.zar(this.k, null);
            return;
        }
        this.zao();
    }

    @WorkerThread
    public final void zar(@NonNull ConnectionResult connectionResult0, @Nullable Exception exception0) {
        Preconditions.checkHandlerThread(this.m.n);
        zact zact0 = this.h;
        if(zact0 != null) {
            zact0.zaf();
        }
        this.zan();
        this.m.g.zac();
        this.b(connectionResult0);
        if(this.b instanceof zap && connectionResult0.getErrorCode() != 24) {
            this.m.b = true;
            Message message0 = this.m.n.obtainMessage(19);
            this.m.n.sendMessageDelayed(message0, 300000L);
        }
        if(connectionResult0.getErrorCode() == 4) {
            this.c(GoogleApiManager.p);
            return;
        }
        if(this.a.isEmpty()) {
            this.k = connectionResult0;
            return;
        }
        if(exception0 != null) {
            Preconditions.checkHandlerThread(this.m.n);
            this.d(null, exception0, false);
            return;
        }
        if(this.m.o) {
            this.d(GoogleApiManager.b(this.c, connectionResult0), null, true);
            if(this.a.isEmpty()) {
                return;
            }
            if(this.j(connectionResult0)) {
                return;
            }
            if(!this.m.f.zah(this.m.e, connectionResult0, this.g)) {
                if(connectionResult0.getErrorCode() == 18) {
                    this.i = true;
                }
                if(this.i) {
                    Message message1 = Message.obtain(this.m.n, 9, this.c);
                    this.m.getClass();
                    this.m.n.sendMessageDelayed(message1, 5000L);
                    return;
                }
                this.c(GoogleApiManager.b(this.c, connectionResult0));
            }
            return;
        }
        this.c(GoogleApiManager.b(this.c, connectionResult0));
    }

    @WorkerThread
    public final void zas(@NonNull ConnectionResult connectionResult0) {
        Preconditions.checkHandlerThread(this.m.n);
        String s = this.b.getClass().getName();
        String s1 = String.valueOf(connectionResult0);
        String s2 = a5.b.r(new StringBuilder(s.length() + 25 + s1.length()), "onSignInFailed for ", s, " with ", s1);
        this.b.disconnect(s2);
        this.zar(connectionResult0, null);
    }

    @WorkerThread
    public final void zat(zal zal0) {
        Preconditions.checkHandlerThread(this.m.n);
        this.e.add(zal0);
    }

    @WorkerThread
    public final void zau() {
        Preconditions.checkHandlerThread(this.m.n);
        if(this.i) {
            this.zao();
        }
    }

    @WorkerThread
    public final void zav() {
        Preconditions.checkHandlerThread(this.m.n);
        this.c(GoogleApiManager.zaa);
        this.d.zaf();
        ListenerKey[] arr_listenerHolder$ListenerKey = (ListenerKey[])this.f.keySet().toArray(new ListenerKey[0]);
        for(int v = 0; v < arr_listenerHolder$ListenerKey.length; ++v) {
            this.zap(new zah(arr_listenerHolder$ListenerKey[v], new TaskCompletionSource()));
        }
        this.b(new ConnectionResult(4));
        Client api$Client0 = this.b;
        if(api$Client0.isConnected()) {
            api$Client0.onUserSignOut(new x(this));
        }
    }

    @WorkerThread
    public final void zaw() {
        GoogleApiManager googleApiManager0 = this.m;
        Preconditions.checkHandlerThread(googleApiManager0.n);
        if(this.i) {
            googleApiManager0.n.removeMessages(11, this.c);
            googleApiManager0.n.removeMessages(9, this.c);
            this.i = false;
            this.c((googleApiManager0.f.isGooglePlayServicesAvailable(googleApiManager0.e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error.")));
            this.b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.b.requiresSignIn();
    }
}

