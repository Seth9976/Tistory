package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext.Builder;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import w6.a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final int a;

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        String s = intent0.getData().getQueryParameter("backendName");
        String s1 = intent0.getData().getQueryParameter("extras");
        int v = (int)Integer.valueOf(intent0.getData().getQueryParameter("priority"));
        int v1 = intent0.getExtras().getInt("attemptNumber");
        TransportRuntime.initialize(context0);
        Builder transportContext$Builder0 = TransportContext.builder().setBackendName(s).setPriority(PriorityMapping.valueOf(v));
        if(s1 != null) {
            transportContext$Builder0.setExtras(Base64.decode(s1, 0));
        }
        TransportRuntime.getInstance().getUploader().upload(transportContext$Builder0.build(), v1, new a());  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

