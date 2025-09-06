package com.google.android.gms.common.api.internal;

import a5.b;
import android.app.Application;
import android.content.Context;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
@ShowFirstParty
public class GoogleApiManager implements Handler.Callback {
    public long a;
    public boolean b;
    public TelemetryData c;
    public TelemetryLoggingClient d;
    public final Context e;
    public final GoogleApiAvailability f;
    public final zal g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public zaae k;
    public final ArraySet l;
    public final ArraySet m;
    public final zaq n;
    public volatile boolean o;
    public static final Status p;
    public static final Object q;
    public static GoogleApiManager r;
    @NonNull
    public static final Status zaa;

    static {
        GoogleApiManager.zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
        GoogleApiManager.p = new Status(4, "The user must be signed in to make this API call.");
        GoogleApiManager.q = new Object();
    }

    public GoogleApiManager(Context context0, Looper looper0, GoogleApiAvailability googleApiAvailability0) {
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = null;
        this.l = new ArraySet();
        this.m = new ArraySet();
        this.o = true;
        this.e = context0;
        zaq zaq0 = new zaq(looper0, this);
        this.n = zaq0;
        this.f = googleApiAvailability0;
        this.g = new zal(googleApiAvailability0);
        if(DeviceProperties.isAuto(context0)) {
            this.o = false;
        }
        zaq0.sendMessage(zaq0.obtainMessage(6));
    }

    public final boolean a() {
        if(this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration0 = RootTelemetryConfigManager.getInstance().getConfig();
        if(rootTelemetryConfiguration0 != null && !rootTelemetryConfiguration0.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        switch(this.g.zaa(this.e, 203400000)) {
            case -1: 
            case 0: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static Status b(ApiKey apiKey0, ConnectionResult connectionResult0) {
        String s = apiKey0.zab();
        String s1 = String.valueOf(connectionResult0);
        return new Status(connectionResult0, b.r(new StringBuilder(String.valueOf(s).length() + 0x3F + s1.length()), "API: ", s, " is not available on this device. Connection failed with: ", s1));
    }

    public final zabq c(GoogleApi googleApi0) {
        ApiKey apiKey0 = googleApi0.getApiKey();
        ConcurrentHashMap concurrentHashMap0 = this.j;
        zabq zabq0 = (zabq)concurrentHashMap0.get(apiKey0);
        if(zabq0 == null) {
            zabq0 = new zabq(this, googleApi0);
            concurrentHashMap0.put(apiKey0, zabq0);
        }
        if(zabq0.zaz()) {
            this.m.add(apiKey0);
        }
        zabq0.zao();
        return zabq0;
    }

    public final void d(TaskCompletionSource taskCompletionSource0, int v, GoogleApi googleApi0) {
        if(v != 0) {
            ApiKey apiKey0 = googleApi0.getApiKey();
            OnCompleteListener onCompleteListener0 = null;
            if(this.a()) {
                RootTelemetryConfiguration rootTelemetryConfiguration0 = RootTelemetryConfigManager.getInstance().getConfig();
                if(rootTelemetryConfiguration0 == null) {
                    onCompleteListener0 = new b0(this, v, apiKey0, System.currentTimeMillis(), SystemClock.elapsedRealtime());
                }
                else if(rootTelemetryConfiguration0.getMethodInvocationTelemetryEnabled()) {
                    boolean z = rootTelemetryConfiguration0.getMethodTimingTelemetryEnabled();
                    zabq zabq0 = (zabq)this.j.get(apiKey0);
                    if(zabq0 == null) {
                        onCompleteListener0 = new b0(this, v, apiKey0, (z ? System.currentTimeMillis() : 0L), (z ? SystemClock.elapsedRealtime() : 0L));
                    }
                    else if(zabq0.zaf() instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient0 = (BaseGmsClient)zabq0.zaf();
                        if(!baseGmsClient0.hasConnectionInfo() || baseGmsClient0.isConnecting()) {
                            onCompleteListener0 = new b0(this, v, apiKey0, (z ? System.currentTimeMillis() : 0L), (z ? SystemClock.elapsedRealtime() : 0L));
                        }
                        else {
                            ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = b0.a(zabq0, baseGmsClient0, v);
                            if(connectionTelemetryConfiguration0 != null) {
                                ++zabq0.l;
                                boolean z1 = connectionTelemetryConfiguration0.getMethodTimingTelemetryEnabled();
                                onCompleteListener0 = new b0(this, v, apiKey0, (z1 ? System.currentTimeMillis() : 0L), (z1 ? SystemClock.elapsedRealtime() : 0L));
                            }
                        }
                    }
                }
            }
            if(onCompleteListener0 != null) {
                this.n.getClass();
                taskCompletionSource0.getTask().addOnCompleteListener(new zabk(this.n), onCompleteListener0);
            }
        }
    }

    @Override  // android.os.Handler$Callback
    @WorkerThread
    public final boolean handleMessage(@NonNull Message message0) {
        Feature feature0;
        int v = message0.what;
        zaq zaq0 = this.n;
        ConcurrentHashMap concurrentHashMap0 = this.j;
        Context context0 = this.e;
        long v1 = 300000L;
        zabq zabq0 = null;
        switch(v) {
            case 1: {
                if(((Boolean)message0.obj).booleanValue()) {
                    v1 = 10000L;
                }
                this.a = v1;
                zaq0.removeMessages(12);
                for(Object object0: concurrentHashMap0.keySet()) {
                    zaq0.sendMessageDelayed(zaq0.obtainMessage(12, ((ApiKey)object0)), this.a);
                }
                return true;
            }
            case 2: {
                com.google.android.gms.common.api.internal.zal zal0 = (com.google.android.gms.common.api.internal.zal)message0.obj;
                for(Object object1: zal0.zab()) {
                    ApiKey apiKey0 = (ApiKey)object1;
                    zabq zabq1 = (zabq)concurrentHashMap0.get(apiKey0);
                    if(zabq1 == null) {
                        zal0.zac(apiKey0, new ConnectionResult(13), null);
                        return true;
                    }
                    if(zabq1.b.isConnected()) {
                        String s = zabq1.zaf().getEndpointPackageName();
                        zal0.zac(apiKey0, ConnectionResult.RESULT_SUCCESS, s);
                    }
                    else {
                        ConnectionResult connectionResult0 = zabq1.zad();
                        if(connectionResult0 == null) {
                            zabq1.zat(zal0);
                            zabq1.zao();
                        }
                        else {
                            zal0.zac(apiKey0, connectionResult0, null);
                        }
                    }
                }
                return true;
            }
            case 3: {
                for(Object object2: concurrentHashMap0.values()) {
                    ((zabq)object2).zan();
                    ((zabq)object2).zao();
                }
                return true;
            }
            case 5: {
                int v3 = message0.arg1;
                ConnectionResult connectionResult1 = (ConnectionResult)message0.obj;
                for(Object object3: concurrentHashMap0.values()) {
                    zabq zabq3 = (zabq)object3;
                    if(zabq3.zab() == v3) {
                        zabq0 = zabq3;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                if(zabq0 != null) {
                    if(connectionResult1.getErrorCode() == 13) {
                        String s1 = this.f.getErrorString(connectionResult1.getErrorCode());
                        String s2 = connectionResult1.getErrorMessage();
                        zabq0.c(new Status(17, b.r(new StringBuilder(String.valueOf(s1).length() + 69 + String.valueOf(s2).length()), "Error resolution was canceled by the user, original error message: ", s1, ": ", s2)));
                        return true;
                    }
                    zabq0.c(GoogleApiManager.b(zabq0.c, connectionResult1));
                    return true;
                }
                Log.wtf("GoogleApiManager", "Could not find API instance " + v3 + " while trying to fail enqueued calls.", new Exception());
                return true;
            }
            case 6: {
                if(context0.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize(((Application)context0.getApplicationContext()));
                    BackgroundDetector.getInstance().addListener(new v(this));
                    if(!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.a = 300000L;
                        return true;
                    }
                }
                break;
            }
            case 7: {
                this.c(((GoogleApi)message0.obj));
                return true;
            }
            case 9: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    ((zabq)concurrentHashMap0.get(message0.obj)).zau();
                    return true;
                }
                break;
            }
            case 10: {
                ArraySet arraySet0 = this.m;
                for(Object object4: arraySet0) {
                    zabq zabq4 = (zabq)concurrentHashMap0.remove(((ApiKey)object4));
                    if(zabq4 != null) {
                        zabq4.zav();
                    }
                }
                arraySet0.clear();
                return true;
            }
            case 11: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    ((zabq)concurrentHashMap0.get(message0.obj)).zaw();
                    return true;
                }
                break;
            }
            case 12: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    ((zabq)concurrentHashMap0.get(message0.obj)).zaA();
                    return true;
                }
                break;
            }
            case 4: 
            case 8: 
            case 13: {
                zach zach0 = (zach)message0.obj;
                zabq zabq2 = (zabq)concurrentHashMap0.get(zach0.zac.getApiKey());
                if(zabq2 == null) {
                    zabq2 = this.c(zach0.zac);
                }
                if(zabq2.zaz() && this.i.get() != zach0.zab) {
                    zach0.zaa.zad(GoogleApiManager.zaa);
                    zabq2.zav();
                    return true;
                }
                zabq2.zap(zach0.zaa);
                return true;
            }
            case 14: {
                e e0 = (e)message0.obj;
                ApiKey apiKey1 = e0.a;
                boolean z = concurrentHashMap0.containsKey(apiKey1);
                TaskCompletionSource taskCompletionSource0 = e0.b;
                if(!z) {
                    taskCompletionSource0.setResult(Boolean.FALSE);
                    return true;
                }
                taskCompletionSource0.setResult(Boolean.valueOf(((zabq)concurrentHashMap0.get(apiKey1)).k(false)));
                return true;
            }
            case 15: {
                y y0 = (y)message0.obj;
                if(concurrentHashMap0.containsKey(y0.a)) {
                    zabq zabq5 = (zabq)concurrentHashMap0.get(y0.a);
                    if(zabq5.j.contains(y0) && !zabq5.i) {
                        if(!zabq5.b.isConnected()) {
                            zabq5.zao();
                            return true;
                        }
                        zabq5.e();
                        return true;
                    }
                }
                break;
            }
            case 16: {
                y y1 = (y)message0.obj;
                if(concurrentHashMap0.containsKey(y1.a)) {
                    zabq zabq6 = (zabq)concurrentHashMap0.get(y1.a);
                    if(zabq6.j.remove(y1)) {
                        zabq6.m.n.removeMessages(15, y1);
                        zabq6.m.n.removeMessages(16, y1);
                        LinkedList linkedList0 = zabq6.a;
                        ArrayList arrayList0 = new ArrayList(linkedList0.size());
                        Iterator iterator5 = linkedList0.iterator();
                        while(true) {
                            boolean z1 = iterator5.hasNext();
                            feature0 = y1.b;
                            if(!z1) {
                                break;
                            }
                            Object object5 = iterator5.next();
                            zai zai0 = (zai)object5;
                            if(zai0 instanceof zac) {
                                Feature[] arr_feature = ((zac)zai0).zab(zabq6);
                                if(arr_feature != null && ArrayUtils.contains(arr_feature, feature0)) {
                                    arrayList0.add(zai0);
                                }
                            }
                        }
                        int v4 = arrayList0.size();
                        for(int v2 = 0; v2 < v4; ++v2) {
                            zai zai1 = (zai)arrayList0.get(v2);
                            linkedList0.remove(zai1);
                            zai1.zae(new UnsupportedApiCallException(feature0));
                        }
                        return true;
                    }
                }
                break;
            }
            case 17: {
                TelemetryData telemetryData0 = this.c;
                if(telemetryData0 != null) {
                    if(telemetryData0.zaa() > 0 || this.a()) {
                        if(this.d == null) {
                            this.d = TelemetryLogging.getClient(context0);
                        }
                        this.d.log(telemetryData0);
                    }
                    this.c = null;
                    return true;
                }
                break;
            }
            case 18: {
                c0 c00 = (c0)message0.obj;
                MethodInvocation methodInvocation0 = c00.a;
                int v5 = c00.b;
                if(Long.compare(c00.c, 0L) == 0) {
                    TelemetryData telemetryData1 = new TelemetryData(v5, Arrays.asList(new MethodInvocation[]{methodInvocation0}));
                    if(this.d == null) {
                        this.d = TelemetryLogging.getClient(context0);
                    }
                    this.d.log(telemetryData1);
                    return true;
                }
                TelemetryData telemetryData2 = this.c;
                if(telemetryData2 != null) {
                    List list0 = telemetryData2.zab();
                    if(telemetryData2.zaa() != v5 || list0 != null && list0.size() >= c00.d) {
                        zaq0.removeMessages(17);
                        TelemetryData telemetryData3 = this.c;
                        if(telemetryData3 != null) {
                            if(telemetryData3.zaa() > 0 || this.a()) {
                                if(this.d == null) {
                                    this.d = TelemetryLogging.getClient(context0);
                                }
                                this.d.log(telemetryData3);
                            }
                            this.c = null;
                        }
                    }
                    else {
                        this.c.zac(methodInvocation0);
                    }
                }
                if(this.c == null) {
                    ArrayList arrayList1 = new ArrayList();
                    arrayList1.add(methodInvocation0);
                    this.c = new TelemetryData(v5, arrayList1);
                    zaq0.sendMessageDelayed(zaq0.obtainMessage(17), c00.c);
                    return true;
                }
                break;
            }
            case 19: {
                this.b = false;
                return true;
            }
            default: {
                Log.w("GoogleApiManager", "Unknown message id: " + v);
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized(GoogleApiManager.q) {
            GoogleApiManager googleApiManager0 = GoogleApiManager.r;
            if(googleApiManager0 != null) {
                googleApiManager0.i.incrementAndGet();
                Message message0 = googleApiManager0.n.obtainMessage(10);
                googleApiManager0.n.sendMessageAtFrontOfQueue(message0);
            }
        }
    }

    public final void zaA() {
        Message message0 = this.n.obtainMessage(3);
        this.n.sendMessage(message0);
    }

    public final void zaB(@NonNull GoogleApi googleApi0) {
        Message message0 = this.n.obtainMessage(7, googleApi0);
        this.n.sendMessage(message0);
    }

    public final void zaC(@NonNull zaae zaae0) {
        synchronized(GoogleApiManager.q) {
            if(this.k != zaae0) {
                this.k = zaae0;
                this.l.clear();
            }
            this.l.addAll(zaae0.b);
        }
    }

    public final int zaa() {
        return this.h.getAndIncrement();
    }

    @NonNull
    public static GoogleApiManager zal() {
        synchronized(GoogleApiManager.q) {
            Preconditions.checkNotNull(GoogleApiManager.r, "Must guarantee manager is non-null before using getInstance");
            return GoogleApiManager.r;
        }
    }

    @NonNull
    public static GoogleApiManager zam(@NonNull Context context0) {
        synchronized(GoogleApiManager.q) {
            if(GoogleApiManager.r == null) {
                Looper looper0 = GmsClientSupervisor.getOrStartHandlerThread().getLooper();
                GoogleApiManager.r = new GoogleApiManager(context0.getApplicationContext(), looper0, GoogleApiAvailability.getInstance());
            }
            return GoogleApiManager.r;
        }
    }

    @NonNull
    public final Task zao(@NonNull Iterable iterable0) {
        com.google.android.gms.common.api.internal.zal zal0 = new com.google.android.gms.common.api.internal.zal(iterable0);
        Message message0 = this.n.obtainMessage(2, zal0);
        this.n.sendMessage(message0);
        return zal0.zaa();
    }

    @NonNull
    public final Task zap(@NonNull GoogleApi googleApi0) {
        e e0 = new e(googleApi0.getApiKey());
        Message message0 = this.n.obtainMessage(14, e0);
        this.n.sendMessage(message0);
        return e0.b.getTask();
    }

    @NonNull
    public final Task zaq(@NonNull GoogleApi googleApi0, @NonNull RegisterListenerMethod registerListenerMethod0, @NonNull UnregisterListenerMethod unregisterListenerMethod0, @NonNull Runnable runnable0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.d(taskCompletionSource0, registerListenerMethod0.zaa(), googleApi0);
        zach zach0 = new zach(new zaf(new zaci(registerListenerMethod0, unregisterListenerMethod0, runnable0), taskCompletionSource0), this.i.get(), googleApi0);
        Message message0 = this.n.obtainMessage(8, zach0);
        this.n.sendMessage(message0);
        return taskCompletionSource0.getTask();
    }

    @NonNull
    public final Task zar(@NonNull GoogleApi googleApi0, @NonNull ListenerKey listenerHolder$ListenerKey0, int v) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.d(taskCompletionSource0, v, googleApi0);
        zach zach0 = new zach(new zah(listenerHolder$ListenerKey0, taskCompletionSource0), this.i.get(), googleApi0);
        Message message0 = this.n.obtainMessage(13, zach0);
        this.n.sendMessage(message0);
        return taskCompletionSource0.getTask();
    }

    public final void zaw(@NonNull GoogleApi googleApi0, int v, @NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        zach zach0 = new zach(new zae(v, baseImplementation$ApiMethodImpl0), this.i.get(), googleApi0);
        Message message0 = this.n.obtainMessage(4, zach0);
        this.n.sendMessage(message0);
    }

    public final void zax(@NonNull GoogleApi googleApi0, int v, @NonNull TaskApiCall taskApiCall0, @NonNull TaskCompletionSource taskCompletionSource0, @NonNull StatusExceptionMapper statusExceptionMapper0) {
        this.d(taskCompletionSource0, taskApiCall0.zaa(), googleApi0);
        zach zach0 = new zach(new zag(v, taskApiCall0, taskCompletionSource0, statusExceptionMapper0), this.i.get(), googleApi0);
        Message message0 = this.n.obtainMessage(4, zach0);
        this.n.sendMessage(message0);
    }

    public final void zaz(@NonNull ConnectionResult connectionResult0, int v) {
        if(!this.f.zah(this.e, connectionResult0, v)) {
            Message message0 = this.n.obtainMessage(5, v, 0, connectionResult0);
            this.n.sendMessage(message0);
        }
    }
}

