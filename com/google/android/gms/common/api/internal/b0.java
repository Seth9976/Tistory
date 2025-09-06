package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class b0 implements OnCompleteListener {
    public final GoogleApiManager a;
    public final int b;
    public final ApiKey c;
    public final long d;
    public final long e;

    public b0(GoogleApiManager googleApiManager0, int v, ApiKey apiKey0, long v1, long v2) {
        this.a = googleApiManager0;
        this.b = v;
        this.c = apiKey0;
        this.d = v1;
        this.e = v2;
    }

    public static ConnectionTelemetryConfiguration a(zabq zabq0, BaseGmsClient baseGmsClient0, int v) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = baseGmsClient0.getTelemetryConfiguration();
        if(connectionTelemetryConfiguration0 != null && connectionTelemetryConfiguration0.getMethodInvocationTelemetryEnabled()) {
            int[] arr_v = connectionTelemetryConfiguration0.getMethodInvocationMethodKeyAllowlist();
            if(arr_v == null) {
                int[] arr_v1 = connectionTelemetryConfiguration0.getMethodInvocationMethodKeyDisallowlist();
                if(arr_v1 == null || !ArrayUtils.contains(arr_v1, v)) {
                    return zabq0.l >= connectionTelemetryConfiguration0.getMaxMethodInvocationsLogged() ? null : connectionTelemetryConfiguration0;
                }
                return null;
            }
            if(ArrayUtils.contains(arr_v, v)) {
                return zabq0.l >= connectionTelemetryConfiguration0.getMaxMethodInvocationsLogged() ? null : connectionTelemetryConfiguration0;
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        int v13;
        long v12;
        long v11;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        GoogleApiManager googleApiManager0 = this.a;
        if(!googleApiManager0.a()) {
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration0 = RootTelemetryConfigManager.getInstance().getConfig();
        if(rootTelemetryConfiguration0 != null && !rootTelemetryConfiguration0.getMethodInvocationTelemetryEnabled()) {
            return;
        }
        zabq zabq0 = (zabq)googleApiManager0.j.get(this.c);
        if(zabq0 != null && zabq0.zaf() instanceof BaseGmsClient) {
            BaseGmsClient baseGmsClient0 = (BaseGmsClient)zabq0.zaf();
            long v = this.d;
            int v1 = Long.compare(v, 0L);
            boolean z = true;
            boolean z1 = v1 > 0;
            int v2 = baseGmsClient0.getGCoreServiceId();
            if(rootTelemetryConfiguration0 == null) {
                v5 = 0;
                v7 = 100;
                v6 = 5000;
            }
            else {
                z1 &= rootTelemetryConfiguration0.getMethodTimingTelemetryEnabled();
                int v3 = rootTelemetryConfiguration0.getBatchPeriodMillis();
                int v4 = rootTelemetryConfiguration0.getMaxMethodInvocationsInBatch();
                v5 = rootTelemetryConfiguration0.getVersion();
                if(baseGmsClient0.hasConnectionInfo() && !baseGmsClient0.isConnecting()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = b0.a(zabq0, baseGmsClient0, this.b);
                    if(connectionTelemetryConfiguration0 == null) {
                        return;
                    }
                    if(!connectionTelemetryConfiguration0.getMethodTimingTelemetryEnabled() || v1 <= 0) {
                        z = false;
                    }
                    v4 = connectionTelemetryConfiguration0.getMaxMethodInvocationsLogged();
                    z1 = z;
                }
                v6 = v3;
                v7 = v4;
            }
            if(task0.isSuccessful()) {
                v8 = 0;
                v9 = 0;
            }
            else if(task0.isCanceled()) {
                v9 = -1;
                v8 = 100;
            }
            else {
                Exception exception0 = task0.getException();
                if(exception0 instanceof ApiException) {
                    Status status0 = ((ApiException)exception0).getStatus();
                    v10 = status0.getStatusCode();
                    ConnectionResult connectionResult0 = status0.getConnectionResult();
                    v9 = connectionResult0 == null ? -1 : connectionResult0.getErrorCode();
                }
                else {
                    v10 = 101;
                    v9 = -1;
                }
                v8 = v10;
            }
            if(z1) {
                v11 = v;
                v12 = System.currentTimeMillis();
                v13 = (int)(SystemClock.elapsedRealtime() - this.e);
            }
            else {
                v11 = 0L;
                v12 = 0L;
                v13 = -1;
            }
            c0 c00 = new c0(new MethodInvocation(this.b, v8, v9, v11, v12, null, null, v2, v13), v5, ((long)v6), v7);
            Message message0 = googleApiManager0.n.obtainMessage(18, c00);
            googleApiManager0.n.sendMessage(message0);
        }
    }
}

