package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

@RequiresApi(api = 21)
public class JobInfoScheduler implements WorkScheduler {
    public final Context a;
    public final EventStore b;
    public final SchedulerConfig c;

    public JobInfoScheduler(Context context0, EventStore eventStore0, SchedulerConfig schedulerConfig0) {
        this.a = context0;
        this.b = eventStore0;
        this.c = schedulerConfig0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext0, int v) {
        this.schedule(transportContext0, v, false);
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext0, int v, boolean z) {
        ComponentName componentName0 = new ComponentName(this.a, JobInfoSchedulerService.class);
        Object object0 = this.a.getSystemService("jobscheduler");
        Adler32 adler320 = new Adler32();
        adler320.update("net.daum.android.tistoryapp".getBytes(Charset.forName("UTF-8")));
        adler320.update(transportContext0.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler320.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(transportContext0.getPriority())).array());
        if(transportContext0.getExtras() != null) {
            adler320.update(transportContext0.getExtras());
        }
        int v1 = (int)adler320.getValue();
        if(!z) {
            for(Object object1: ((JobScheduler)object0).getAllPendingJobs()) {
                int v2 = ((JobInfo)object1).getExtras().getInt("attemptNumber");
                if(((JobInfo)object1).getId() == v1) {
                    if(v2 < v) {
                        break;
                    }
                    Logging.d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext0);
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
        long v3 = this.b.getNextCallTime(transportContext0);
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v1, componentName0);
        Priority priority0 = transportContext0.getPriority();
        JobInfo.Builder jobInfo$Builder1 = this.c.configureJob(jobInfo$Builder0, priority0, v3, v);
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("attemptNumber", v);
        persistableBundle0.putString("backendName", transportContext0.getBackendName());
        persistableBundle0.putInt("priority", PriorityMapping.toInt(transportContext0.getPriority()));
        if(transportContext0.getExtras() != null) {
            persistableBundle0.putString("extras", Base64.encodeToString(transportContext0.getExtras(), 0));
        }
        jobInfo$Builder1.setExtras(persistableBundle0);
        Priority priority1 = transportContext0.getPriority();
        Logging.d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[]{transportContext0, v1, this.c.getScheduleDelay(priority1, v3, v), v3, v});
        ((JobScheduler)object0).schedule(jobInfo$Builder1.build());
    }
}

