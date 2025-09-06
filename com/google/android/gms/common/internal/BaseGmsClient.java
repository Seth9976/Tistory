package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public abstract class BaseGmsClient {
    @KeepForSdk
    public interface BaseConnectionCallbacks {
        @KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        @KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @KeepForSdk
        void onConnected(@Nullable Bundle arg1);

        @KeepForSdk
        void onConnectionSuspended(int arg1);
    }

    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void onConnectionFailed(@NonNull ConnectionResult arg1);
    }

    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void onReportServiceBinding(@NonNull ConnectionResult arg1);
    }

    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public final BaseGmsClient a;

        @Override  // com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult0) {
            BaseGmsClient baseGmsClient0 = BaseGmsClient.this;
            if(connectionResult0.isSuccess()) {
                baseGmsClient0.getRemoteService(null, baseGmsClient0.getScopes());
                return;
            }
            BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0 = baseGmsClient0.u;
            if(baseGmsClient$BaseOnConnectionFailedListener0 != null) {
                baseGmsClient$BaseOnConnectionFailedListener0.onConnectionFailed(connectionResult0);
            }
        }
    }

    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        void onSignOutComplete();
    }

    public volatile zzj A;
    public static final Feature[] B = null;
    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;
    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    @NonNull
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = null;
    @NonNull
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public zzu g;
    public final Context h;
    public final Looper i;
    public final GmsClientSupervisor j;
    public final GoogleApiAvailabilityLight k;
    public final Handler l;
    public final Object m;
    public final Object n;
    public IGmsServiceBroker o;
    public IInterface p;
    public final ArrayList q;
    public zze r;
    public int s;
    public final BaseConnectionCallbacks t;
    public final BaseOnConnectionFailedListener u;
    public final int v;
    public final String w;
    public volatile String x;
    public ConnectionResult y;
    public boolean z;
    @NonNull
    @VisibleForTesting
    protected ConnectionProgressReportCallbacks zzc;
    @NonNull
    @VisibleForTesting
    protected AtomicInteger zzd;

    static {
        BaseGmsClient.B = new Feature[0];
        BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES = new String[]{"service_esmobile", "service_googleme"};
    }

    @KeepForSdk
    @VisibleForTesting
    public BaseGmsClient(@NonNull Context context0, @NonNull Handler handler0, @NonNull GmsClientSupervisor gmsClientSupervisor0, @NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight0, int v, @Nullable BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, @Nullable BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.q = new ArrayList();
        this.s = 1;
        this.y = null;
        this.z = false;
        this.A = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context0, "Context must not be null");
        this.h = context0;
        Preconditions.checkNotNull(handler0, "Handler must not be null");
        this.l = handler0;
        this.i = handler0.getLooper();
        Preconditions.checkNotNull(gmsClientSupervisor0, "Supervisor must not be null");
        this.j = gmsClientSupervisor0;
        Preconditions.checkNotNull(googleApiAvailabilityLight0, "API availability must not be null");
        this.k = googleApiAvailabilityLight0;
        this.v = v;
        this.t = baseGmsClient$BaseConnectionCallbacks0;
        this.u = baseGmsClient$BaseOnConnectionFailedListener0;
        this.w = null;
    }

    @KeepForSdk
    public BaseGmsClient(@NonNull Context context0, @NonNull Looper looper0, int v, @Nullable BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, @Nullable BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0, @Nullable String s) {
        GmsClientSupervisor gmsClientSupervisor0 = GmsClientSupervisor.getInstance(context0);
        Preconditions.checkNotNull(baseGmsClient$BaseConnectionCallbacks0);
        Preconditions.checkNotNull(baseGmsClient$BaseOnConnectionFailedListener0);
        this(context0, looper0, gmsClientSupervisor0, GoogleApiAvailabilityLight.getInstance(), v, baseGmsClient$BaseConnectionCallbacks0, baseGmsClient$BaseOnConnectionFailedListener0, s);
    }

    @KeepForSdk
    @VisibleForTesting
    public BaseGmsClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull GmsClientSupervisor gmsClientSupervisor0, @NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight0, int v, @Nullable BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, @Nullable BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0, @Nullable String s) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.q = new ArrayList();
        this.s = 1;
        this.y = null;
        this.z = false;
        this.A = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context0, "Context must not be null");
        this.h = context0;
        Preconditions.checkNotNull(looper0, "Looper must not be null");
        this.i = looper0;
        Preconditions.checkNotNull(gmsClientSupervisor0, "Supervisor must not be null");
        this.j = gmsClientSupervisor0;
        Preconditions.checkNotNull(googleApiAvailabilityLight0, "API availability must not be null");
        this.k = googleApiAvailabilityLight0;
        this.l = new j(this, looper0);
        this.v = v;
        this.t = baseGmsClient$BaseConnectionCallbacks0;
        this.u = baseGmsClient$BaseOnConnectionFailedListener0;
        this.w = s;
    }

    public static void a(BaseGmsClient baseGmsClient0) {
        int v;
        synchronized(baseGmsClient0.m) {
        }
        if(baseGmsClient0.s == 3) {
            baseGmsClient0.z = true;
            v = 5;
        }
        else {
            v = 4;
        }
        int v1 = baseGmsClient0.zzd.get();
        Message message0 = baseGmsClient0.l.obtainMessage(v, v1, 16);
        baseGmsClient0.l.sendMessage(message0);
    }

    public static boolean b(BaseGmsClient baseGmsClient0, int v, int v1, IInterface iInterface0) {
        synchronized(baseGmsClient0.m) {
            if(baseGmsClient0.s != v) {
                return false;
            }
            baseGmsClient0.d(iInterface0, v1);
            return true;
        }
    }

    public static boolean c(BaseGmsClient baseGmsClient0) {
        if(!baseGmsClient0.z && !TextUtils.isEmpty(baseGmsClient0.getServiceDescriptor()) && !TextUtils.isEmpty(null)) {
            try {
                Class.forName(baseGmsClient0.getServiceDescriptor());
                return true;
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        return false;
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int v = this.getMinApkVersion();
        int v1 = this.k.isGooglePlayServicesAvailable(this.h, v);
        if(v1 != 0) {
            this.d(null, 1);
            this.triggerNotAvailable(new LegacyClientCallbackAdapter(this), v1, null);
            return;
        }
        this.connect(new LegacyClientCallbackAdapter(this));
    }

    @KeepForSdk
    public final void checkConnected() {
        if(!this.isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @KeepForSdk
    public void connect(@NonNull ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0) {
        Preconditions.checkNotNull(baseGmsClient$ConnectionProgressReportCallbacks0, "Connection progress callbacks cannot be null.");
        this.zzc = baseGmsClient$ConnectionProgressReportCallbacks0;
        this.d(null, 2);
    }

    @Nullable
    @KeepForSdk
    public abstract IInterface createServiceInterface(@NonNull IBinder arg1);

    public final void d(IInterface iInterface0, int v) {
        Preconditions.checkArgument((v == 4 ? 1 : 0) == (iInterface0 == null ? 0 : 1));
        synchronized(this.m) {
            this.s = v;
            this.p = iInterface0;
            if(v == 1) {
                zze zze2 = this.r;
                if(zze2 != null) {
                    String s6 = this.g.a;
                    Preconditions.checkNotNull(s6);
                    String s7 = this.g.b;
                    int v4 = this.g.c;
                    String s8 = this.zze();
                    this.j.zzb(s6, s7, v4, zze2, s8, this.g.d);
                    this.r = null;
                }
            }
            else {
                switch(v) {
                    case 2: 
                    case 3: {
                        zze zze0 = this.r;
                        if(zze0 != null) {
                            zzu zzu0 = this.g;
                            if(zzu0 != null) {
                                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzu0.a + " on " + zzu0.b);
                                String s = this.g.a;
                                Preconditions.checkNotNull(s);
                                String s1 = this.g.b;
                                int v2 = this.g.c;
                                String s2 = this.zze();
                                this.j.zzb(s, s1, v2, zze0, s2, this.g.d);
                                this.zzd.incrementAndGet();
                            }
                        }
                        zze zze1 = new zze(this, this.zzd.get());
                        this.r = zze1;
                        zzu zzu1 = new zzu("com.google.android.gms", this.getStartServiceAction(), false, 0x1081, this.getUseDynamicLookup());
                        this.g = zzu1;
                        if(zzu1.d && this.getMinApkVersion() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: " + this.g.a);
                        }
                        String s3 = this.g.a;
                        Preconditions.checkNotNull(s3);
                        String s4 = this.g.b;
                        int v3 = this.g.c;
                        String s5 = this.zze();
                        zzn zzn0 = new zzn(s3, s4, v3, this.g.d);
                        if(!this.j.zzc(zzn0, zze1, s5, this.getBindServiceExecutor())) {
                            Log.w("GmsClient", "unable to connect to service: " + this.g.a + " on " + this.g.b);
                            this.zzl(16, null, this.zzd.get());
                        }
                        break;
                    }
                    case 4: {
                        Preconditions.checkNotNull(iInterface0);
                        this.onConnectedLocked(iInterface0);
                    }
                }
            }
        }
    }

    @KeepForSdk
    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized(this.q) {
            int v1 = this.q.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((zzc)this.q.get(v2)).zzf();
            }
            this.q.clear();
        }
        synchronized(this.n) {
            this.o = null;
        }
        this.d(null, 1);
    }

    @KeepForSdk
    public void disconnect(@NonNull String s) {
        this.f = s;
        this.disconnect();
    }

    @KeepForSdk
    public void dump(@NonNull String s, @NonNull FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @NonNull String[] arr_s) {
        IGmsServiceBroker iGmsServiceBroker0;
        IInterface iInterface0;
        synchronized(this.m) {
            int v = this.s;
            iInterface0 = this.p;
        }
        synchronized(this.n) {
            iGmsServiceBroker0 = this.o;
        }
        printWriter0.append(s).append("mConnectState=");
        switch(v) {
            case 1: {
                printWriter0.print("DISCONNECTED");
                break;
            }
            case 2: {
                printWriter0.print("REMOTE_CONNECTING");
                break;
            }
            case 3: {
                printWriter0.print("LOCAL_CONNECTING");
                break;
            }
            case 4: {
                printWriter0.print("CONNECTED");
                break;
            }
            case 5: {
                printWriter0.print("DISCONNECTING");
                break;
            }
            default: {
                printWriter0.print("UNKNOWN");
            }
        }
        printWriter0.append(" mService=");
        if(iInterface0 == null) {
            printWriter0.append("null");
        }
        else {
            printWriter0.append(this.getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface0.asBinder())));
        }
        printWriter0.append(" mServiceBroker=");
        if(iGmsServiceBroker0 == null) {
            printWriter0.println("null");
        }
        else {
            printWriter0.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker0.asBinder())));
        }
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if(this.c > 0L) {
            printWriter0.append(s).append("lastConnectedTime=").println(this.c + " " + simpleDateFormat0.format(new Date(this.c)));
        }
        if(this.b > 0L) {
            printWriter0.append(s).append("lastSuspendedCause=");
            int v1 = this.a;
            switch(v1) {
                case 1: {
                    printWriter0.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                }
                case 2: {
                    printWriter0.append("CAUSE_NETWORK_LOST");
                    break;
                }
                case 3: {
                    printWriter0.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    break;
                }
                default: {
                    printWriter0.append(String.valueOf(v1));
                }
            }
            printWriter0.append(" lastSuspendedTime=").println(this.b + " " + simpleDateFormat0.format(new Date(this.b)));
        }
        if(this.e > 0L) {
            printWriter0.append(s).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.d));
            printWriter0.append(" lastFailedTime=").println(this.e + " " + simpleDateFormat0.format(new Date(this.e)));
        }
    }

    @KeepForSdk
    public boolean enableLocalFallback() [...] // Inlined contents

    @Nullable
    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public Feature[] getApiFeatures() {
        return BaseGmsClient.B;
    }

    @Nullable
    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        return this.A == null ? null : this.A.b;
    }

    @Nullable
    @KeepForSdk
    public Executor getBindServiceExecutor() {
        return null;
    }

    @Nullable
    @KeepForSdk
    public Bundle getConnectionHint() [...] // Inlined contents

    @NonNull
    @KeepForSdk
    public final Context getContext() {
        return this.h;
    }

    @NonNull
    @KeepForSdk
    public String getEndpointPackageName() {
        if(this.isConnected()) {
            zzu zzu0 = this.g;
            if(zzu0 != null) {
                return zzu0.b;
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk
    public int getGCoreServiceId() {
        return this.v;
    }

    @NonNull
    @KeepForSdk
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @Nullable
    @KeepForSdk
    public String getLastDisconnectMessage() {
        return this.f;
    }

    @Nullable
    @KeepForSdk
    public String getLocalStartServiceAction() [...] // Inlined contents

    @NonNull
    @KeepForSdk
    public final Looper getLooper() {
        return this.i;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @WorkerThread
    @KeepForSdk
    public void getRemoteService(@Nullable IAccountAccessor iAccountAccessor0, @NonNull Set set0) {
        Bundle bundle0 = this.getGetServiceRequestExtraArgs();
        String s = this.x;
        Bundle bundle1 = new Bundle();
        GetServiceRequest getServiceRequest0 = new GetServiceRequest(6, this.v, GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, null, null, GetServiceRequest.o, bundle1, null, GetServiceRequest.p, GetServiceRequest.p, true, 0, false, s);
        getServiceRequest0.d = "net.daum.android.tistoryapp";
        getServiceRequest0.g = bundle0;
        if(set0 != null) {
            getServiceRequest0.f = (Scope[])set0.toArray(new Scope[0]);
        }
        if(this.requiresSignIn()) {
            Account account0 = this.getAccount();
            if(account0 == null) {
                account0 = new Account("<<default account>>", "com.google");
            }
            getServiceRequest0.h = account0;
            if(iAccountAccessor0 != null) {
                getServiceRequest0.e = iAccountAccessor0.asBinder();
            }
        }
        else if(this.requiresAccount()) {
            getServiceRequest0.h = this.getAccount();
        }
        getServiceRequest0.i = BaseGmsClient.B;
        getServiceRequest0.j = this.getApiFeatures();
        try {
            synchronized(this.n) {
                IGmsServiceBroker iGmsServiceBroker0 = this.o;
                if(iGmsServiceBroker0 == null) {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
                else {
                    iGmsServiceBroker0.getService(new zzd(this, this.zzd.get()), getServiceRequest0);
                }
            }
        }
        catch(DeadObjectException deadObjectException0) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", deadObjectException0);
            this.triggerConnectionSuspended(3);
        }
        catch(SecurityException securityException0) {
            throw securityException0;
        }
        catch(RemoteException | RuntimeException remoteException0) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", remoteException0);
            this.onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    @NonNull
    @KeepForSdk
    public Set getScopes() {
        return Collections.emptySet();
    }

    @NonNull
    @KeepForSdk
    public final IInterface getService() throws DeadObjectException {
        synchronized(this.m) {
            if(this.s != 5) {
                this.checkConnected();
                IInterface iInterface0 = this.p;
                Preconditions.checkNotNull(iInterface0, "Client is connected but service is null");
                return iInterface0;
            }
        }
        throw new DeadObjectException();
    }

    @Nullable
    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        IGmsServiceBroker iGmsServiceBroker0;
        synchronized(this.n) {
            iGmsServiceBroker0 = this.o;
            if(iGmsServiceBroker0 == null) {
                return null;
            }
        }
        return iGmsServiceBroker0.asBinder();
    }

    @NonNull
    @KeepForSdk
    public abstract String getServiceDescriptor();

    @NonNull
    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @NonNull
    @KeepForSdk
    public abstract String getStartServiceAction();

    @NonNull
    @KeepForSdk
    public String getStartServicePackage() [...] // Inlined contents

    @Nullable
    @KeepForSdk
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        return this.A == null ? null : this.A.d;
    }

    @KeepForSdk
    public boolean getUseDynamicLookup() {
        return this.getMinApkVersion() >= 211700000;
    }

    @KeepForSdk
    public boolean hasConnectionInfo() {
        return this.A != null;
    }

    @KeepForSdk
    public boolean isConnected() {
        synchronized(this.m) {
        }
        return this.s == 4;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z = true;
        synchronized(this.m) {
            if(this.s != 2 && this.s != 3) {
                z = false;
            }
        }
        return z;
    }

    @CallSuper
    @KeepForSdk
    public void onConnectedLocked(@NonNull IInterface iInterface0) {
        this.c = System.currentTimeMillis();
    }

    @CallSuper
    @KeepForSdk
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        this.d = connectionResult0.getErrorCode();
        this.e = System.currentTimeMillis();
    }

    @CallSuper
    @KeepForSdk
    public void onConnectionSuspended(int v) {
        this.a = v;
        this.b = System.currentTimeMillis();
    }

    @KeepForSdk
    public void onPostInitHandler(int v, @Nullable IBinder iBinder0, @Nullable Bundle bundle0, int v1) {
        zzf zzf0 = new zzf(this, v, iBinder0, bundle0);
        Message message0 = this.l.obtainMessage(1, v1, -1, zzf0);
        this.l.sendMessage(message0);
    }

    @KeepForSdk
    public void onUserSignOut(@NonNull SignOutCallbacks baseGmsClient$SignOutCallbacks0) {
        baseGmsClient$SignOutCallbacks0.onSignOutComplete();
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @KeepForSdk
    public void setAttributionTag(@NonNull String s) {
        this.x = s;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int v) {
        int v1 = this.zzd.get();
        Message message0 = this.l.obtainMessage(6, v1, v);
        this.l.sendMessage(message0);
    }

    @KeepForSdk
    @VisibleForTesting
    public void triggerNotAvailable(@NonNull ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0, int v, @Nullable PendingIntent pendingIntent0) {
        Preconditions.checkNotNull(baseGmsClient$ConnectionProgressReportCallbacks0, "Connection progress callbacks cannot be null.");
        this.zzc = baseGmsClient$ConnectionProgressReportCallbacks0;
        int v1 = this.zzd.get();
        Message message0 = this.l.obtainMessage(3, v1, v, pendingIntent0);
        this.l.sendMessage(message0);
    }

    @KeepForSdk
    public boolean usesClientTelemetry() [...] // Inlined contents

    @NonNull
    public final String zze() {
        return this.w == null ? this.h.getClass().getName() : this.w;
    }

    public final void zzl(int v, @Nullable Bundle bundle0, int v1) {
        zzg zzg0 = new zzg(this, v, null);
        Message message0 = this.l.obtainMessage(7, v1, -1, zzg0);
        this.l.sendMessage(message0);
    }
}

