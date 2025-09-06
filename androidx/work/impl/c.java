package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.impl.model.WorkGenerationalId;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.firebase.messaging.k;
import java.util.List;
import java.util.logging.Logger;

public final class c implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public c(int v, Object object0, Object object1, Object object2, Object object3) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        this.d = object2;
        this.e = object3;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.b;
        Object object1 = this.e;
        Object object2 = this.d;
        Object object3 = this.c;
        if(this.a != 0) {
            TransportContext transportContext0 = (TransportContext)object3;
            TransportScheduleCallback transportScheduleCallback0 = (TransportScheduleCallback)object2;
            EventInternal eventInternal0 = (EventInternal)object1;
            DefaultScheduler defaultScheduler0 = (DefaultScheduler)object0;
            defaultScheduler0.getClass();
            Logger logger0 = DefaultScheduler.f;
            try {
                String s = transportContext0.getBackendName();
                TransportBackend transportBackend0 = defaultScheduler0.c.get(s);
                if(transportBackend0 == null) {
                    String s1 = "Transport backend \'" + transportContext0.getBackendName() + "\' is not registered";
                    logger0.warning(s1);
                    transportScheduleCallback0.onSchedule(new IllegalArgumentException(s1));
                    return;
                }
                k k0 = new k(defaultScheduler0, transportContext0, transportBackend0.decorate(eventInternal0));
                defaultScheduler0.e.runCriticalSection(k0);
                transportScheduleCallback0.onSchedule(null);
                return;
            }
            catch(Exception exception0) {
            }
            logger0.warning("Error scheduling event " + exception0.getMessage());
            transportScheduleCallback0.onSchedule(exception0);
            return;
        }
        for(Object object4: ((List)object0)) {
            ((Scheduler)object4).cancel(((WorkGenerationalId)object3).getWorkSpecId());
        }
        Schedulers.schedule(((Configuration)object2), ((WorkDatabase)object1), ((List)object0));
    }
}

