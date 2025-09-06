package androidx.core.app;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {
    interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    public c0 a;
    public a0 b;
    public boolean c;
    public boolean d;
    public static final Object e;
    public static final HashMap f;

    static {
        JobIntentService.e = new Object();
        JobIntentService.f = new HashMap();
    }

    public JobIntentService() {
        this.c = false;
        this.d = false;
    }

    public static void enqueueWork(@NonNull Context context0, @NonNull ComponentName componentName0, int v, @NonNull Intent intent0) {
        if(intent0 == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized(JobIntentService.e) {
            HashMap hashMap0 = JobIntentService.f;
            d0 d00 = (d0)hashMap0.get(componentName0);
            if(d00 == null) {
                d00 = new d0(context0, componentName0, v);
                hashMap0.put(componentName0, d00);
            }
            d00.a(v);
            JobWorkItem jobWorkItem0 = new JobWorkItem(intent0);
            d00.d.enqueue(d00.c, jobWorkItem0);
        }
    }

    public static void enqueueWork(@NonNull Context context0, @NonNull Class class0, int v, @NonNull Intent intent0) {
        JobIntentService.enqueueWork(context0, new ComponentName(context0, class0), v, intent0);
    }

    public boolean isStopped() {
        return this.d;
    }

    @Override  // android.app.Service
    public IBinder onBind(@NonNull Intent intent0) {
        return this.a == null ? null : this.a.getBinder();
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = new c0(this);
    }

    @Override  // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public abstract void onHandleWork(@NonNull Intent arg1);

    @Override  // android.app.Service
    public int onStartCommand(@Nullable Intent intent0, int v, int v1) {
        return 2;
    }

    public boolean onStopCurrentWork() [...] // Inlined contents

    public void setInterruptIfStopped(boolean z) {
        this.c = z;
    }
}

