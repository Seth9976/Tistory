package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse.Status;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.firebase.components.j;
import g3.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p8.a;
import sc.b;
import w6.c;
import w6.d;

public class Uploader {
    public final Context a;
    public final BackendRegistry b;
    public final EventStore c;
    public final WorkScheduler d;
    public final Executor e;
    public final SynchronizationGuard f;
    public final Clock g;
    public final Clock h;
    public final ClientHealthMetricsStore i;

    @Inject
    public Uploader(Context context0, BackendRegistry backendRegistry0, EventStore eventStore0, WorkScheduler workScheduler0, Executor executor0, SynchronizationGuard synchronizationGuard0, @WallTime Clock clock0, @Monotonic Clock clock1, ClientHealthMetricsStore clientHealthMetricsStore0) {
        this.a = context0;
        this.b = backendRegistry0;
        this.c = eventStore0;
        this.d = workScheduler0;
        this.e = executor0;
        this.f = synchronizationGuard0;
        this.g = clock0;
        this.h = clock1;
        this.i = clientHealthMetricsStore0;
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend0) {
        Objects.requireNonNull(this.i);
        b b0 = new b(this.i, 1);
        ClientMetrics clientMetrics0 = (ClientMetrics)this.f.runCriticalSection(b0);
        return transportBackend0.decorate(EventInternal.builder().setEventMillis(this.g.getTime()).setUptimeMillis(this.h.getTime()).setTransportName("GDT_CLIENT_METRICS").setEncodedPayload(new EncodedPayload(Encoding.of("proto"), clientMetrics0.toByteArray())).build());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public BackendResponse logAndUpdateState(TransportContext transportContext0, int v) {
        BackendResponse backendResponse1;
        SynchronizationGuard synchronizationGuard0;
        String s = transportContext0.getBackendName();
        TransportBackend transportBackend0 = this.b.get(s);
        BackendResponse backendResponse0 = BackendResponse.ok(0L);
        long v1 = 0L;
        while(true) {
            c c0 = new c(this, transportContext0, 0);
            synchronizationGuard0 = this.f;
            if(!((Boolean)synchronizationGuard0.runCriticalSection(c0)).booleanValue()) {
                break;
            }
            Iterable iterable0 = (Iterable)synchronizationGuard0.runCriticalSection(new c(this, transportContext0, 1));
            if(!iterable0.iterator().hasNext()) {
                return backendResponse0;
            }
            if(transportBackend0 == null) {
                Logging.d("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext0);
                backendResponse1 = BackendResponse.fatalError();
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    arrayList0.add(((PersistedEvent)object0).getEvent());
                }
                if(transportContext0.shouldUploadClientHealthMetrics()) {
                    arrayList0.add(this.createMetricsEvent(transportBackend0));
                }
                backendResponse1 = transportBackend0.send(BackendRequest.builder().setEvents(arrayList0).setExtras(transportContext0.getExtras()).build());
            }
            backendResponse0 = backendResponse1;
            if(backendResponse0.getStatus() == Status.TRANSIENT_ERROR) {
                synchronizationGuard0.runCriticalSection(new a(this, iterable0, transportContext0, v1));
                this.d.schedule(transportContext0, v + 1, true);
                return backendResponse0;
            }
            synchronizationGuard0.runCriticalSection(new j(5, this, iterable0));
            if(backendResponse0.getStatus() == Status.OK) {
                long v2 = Math.max(v1, backendResponse0.getNextRequestWaitMillis());
                if(transportContext0.shouldUploadClientHealthMetrics()) {
                    synchronizationGuard0.runCriticalSection(new b(this, 2));
                }
                v1 = v2;
            }
            else if(backendResponse0.getStatus() == Status.INVALID_PAYLOAD) {
                HashMap hashMap0 = new HashMap();
                for(Object object1: iterable0) {
                    String s1 = ((PersistedEvent)object1).getEvent().getTransportName();
                    if(hashMap0.containsKey(s1)) {
                        hashMap0.put(s1, ((int)(((int)(((Integer)hashMap0.get(s1)))) + 1)));
                    }
                    else {
                        hashMap0.put(s1, 1);
                    }
                }
                synchronizationGuard0.runCriticalSection(new j(6, this, hashMap0));
            }
        }
        synchronizationGuard0.runCriticalSection(new d(this, transportContext0, v1));
        return backendResponse0;
    }

    public void upload(TransportContext transportContext0, int v, Runnable runnable0) {
        u u0 = new u(v, 1, this, transportContext0, runnable0);
        this.e.execute(u0);
    }
}

