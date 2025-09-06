package r8;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.messaging.k;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class c {
    public final double a;
    public final double b;
    public final long c;
    public final int d;
    public final ArrayBlockingQueue e;
    public final ThreadPoolExecutor f;
    public final Transport g;
    public final OnDemandCounter h;
    public int i;
    public long j;

    public c(Transport transport0, Settings settings0, OnDemandCounter onDemandCounter0) {
        this.a = settings0.onDemandUploadRatePerMinute;
        this.b = settings0.onDemandBackoffBase;
        this.c = ((long)settings0.onDemandBackoffStepDurationSeconds) * 1000L;
        this.g = transport0;
        this.h = onDemandCounter0;
        this.d = (int)settings0.onDemandUploadRatePerMinute;
        ArrayBlockingQueue arrayBlockingQueue0 = new ArrayBlockingQueue(((int)settings0.onDemandUploadRatePerMinute));
        this.e = arrayBlockingQueue0;
        this.f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue0);
        this.i = 0;
        this.j = 0L;
    }

    public final int a() {
        if(this.j == 0L) {
            this.j = System.currentTimeMillis();
        }
        int v = (int)((System.currentTimeMillis() - this.j) / this.c);
        int v1 = this.e.size() == this.d ? Math.min(100, this.i + v) : Math.max(0, this.i - v);
        if(this.i != v1) {
            this.i = v1;
            this.j = System.currentTimeMillis();
        }
        return v1;
    }

    public final void b(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId0, TaskCompletionSource taskCompletionSource0) {
        Logger.getLogger().d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId0.getSessionId());
        Event event0 = Event.ofUrgent(crashlyticsReportWithSessionId0.getReport());
        k k0 = new k(this, taskCompletionSource0, crashlyticsReportWithSessionId0);
        this.g.schedule(event0, k0);
    }
}

