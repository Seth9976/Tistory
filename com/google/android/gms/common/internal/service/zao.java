package com.google.android.gms.common.internal.service;

import android.content.Context;
import b7.f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall.Builder;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;

public final class zao extends GoogleApi implements TelemetryLoggingClient {
    public static final Api j;
    public static final int zab;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        zao.j = new Api("ClientTelemetry.API", new f(), api$ClientKey0);  // 初始化器: Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;-><init>()V
    }

    public zao(Context context0, TelemetryLoggingOptions telemetryLoggingOptions0) {
        super(context0, zao.j, telemetryLoggingOptions0, Settings.DEFAULT_SETTINGS);
    }

    @Override  // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final Task log(TelemetryData telemetryData0) {
        Builder taskApiCall$Builder0 = TaskApiCall.builder();
        taskApiCall$Builder0.setFeatures(new Feature[]{zad.zaa});
        taskApiCall$Builder0.setAutoResolveMissingFeatures(false);
        taskApiCall$Builder0.run(new zam(telemetryData0));
        return this.doBestEffortWrite(taskApiCall$Builder0.build());
    }
}

