package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Collections;
import javax.inject.Singleton;

@Singleton
public class TransportRuntime implements TransportInternal {
    public final Clock a;
    public final Clock b;
    public final Scheduler c;
    public final Uploader d;
    public static volatile w e;

    public TransportRuntime(Clock clock0, Clock clock1, Scheduler scheduler0, Uploader uploader0, WorkInitializer workInitializer0) {
        this.a = clock0;
        this.b = clock1;
        this.c = scheduler0;
        this.d = uploader0;
        workInitializer0.ensureContextsScheduled();
    }

    public static TransportRuntime getInstance() {
        w w0 = TransportRuntime.e;
        if(w0 == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return (TransportRuntime)((o)w0).k.get();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public Uploader getUploader() {
        return this.d;
    }

    public static void initialize(Context context0) {
        if(TransportRuntime.e == null) {
            Class class0 = TransportRuntime.class;
            synchronized(class0) {
                if(TransportRuntime.e == null) {
                    n n0 = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
                    n0.setApplicationContext(context0);
                    TransportRuntime.e = n0.build();
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    public TransportFactory newFactory(Destination destination0) {
        return destination0 instanceof EncodedDestination ? new u(Collections.unmodifiableSet(((EncodedDestination)destination0).getSupportedEncodings()), TransportContext.builder().setBackendName(destination0.getName()).setExtras(destination0.getExtras()).build(), this) : new u(Collections.singleton(Encoding.of("proto")), TransportContext.builder().setBackendName(destination0.getName()).setExtras(destination0.getExtras()).build(), this);
    }

    @Deprecated
    public TransportFactory newFactory(String s) {
        return new u(Collections.singleton(Encoding.of("proto")), TransportContext.builder().setBackendName(s).build(), this);
    }

    @Override  // com.google.android.datatransport.runtime.TransportInternal
    public void send(t t0, TransportScheduleCallback transportScheduleCallback0) {
        Priority priority0 = ((k)t0).c.getPriority();
        TransportContext transportContext0 = ((k)t0).a.withPriority(priority0);
        Builder eventInternal$Builder0 = EventInternal.builder().setEventMillis(this.a.getTime()).setUptimeMillis(this.b.getTime()).setTransportName(((k)t0).b);
        Object object0 = ((k)t0).c.getPayload();
        byte[] arr_b = (byte[])((k)t0).d.apply(object0);
        EventInternal eventInternal0 = eventInternal$Builder0.setEncodedPayload(new EncodedPayload(((k)t0).e, arr_b)).setCode(((k)t0).c.getCode()).build();
        this.c.schedule(transportContext0, eventInternal0, transportScheduleCallback0);
    }
}

