package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;

public class AlarmManagerScheduler implements WorkScheduler {
    public final Context a;
    public final EventStore b;
    public final AlarmManager c;
    public final SchedulerConfig d;
    public final Clock e;

    public AlarmManagerScheduler(Context context0, EventStore eventStore0, Clock clock0, SchedulerConfig schedulerConfig0) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        super();
        this.a = context0;
        this.b = eventStore0;
        this.c = alarmManager0;
        this.e = clock0;
        this.d = schedulerConfig0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext0, int v) {
        this.schedule(transportContext0, v, false);
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext0, int v, boolean z) {
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.appendQueryParameter("backendName", transportContext0.getBackendName());
        uri$Builder0.appendQueryParameter("priority", String.valueOf(PriorityMapping.toInt(transportContext0.getPriority())));
        if(transportContext0.getExtras() != null) {
            uri$Builder0.appendQueryParameter("extras", Base64.encodeToString(transportContext0.getExtras(), 0));
        }
        Context context0 = this.a;
        Intent intent0 = new Intent(context0, AlarmManagerSchedulerBroadcastReceiver.class);
        intent0.setData(uri$Builder0.build());
        intent0.putExtra("attemptNumber", v);
        if(!z && PendingIntent.getBroadcast(context0, 0, intent0, 0x24000000) != null) {
            Logging.d("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext0);
            return;
        }
        long v1 = this.b.getNextCallTime(transportContext0);
        Priority priority0 = transportContext0.getPriority();
        long v2 = this.d.getScheduleDelay(priority0, v1, v);
        Logging.d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", new Object[]{transportContext0, v2, v1, v});
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, 0, intent0, 0x4000000);
        long v3 = this.e.getTime();
        this.c.set(3, v3 + v2, pendingIntent0);
    }
}

