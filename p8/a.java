package p8;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred.DeferredHandler;
import com.google.firebase.inject.Provider;

public final class a implements CriticalSection, DeferredHandler {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public a(Uploader uploader0, Iterable iterable0, TransportContext transportContext0, long v) {
        this.b = uploader0;
        this.c = iterable0;
        this.d = transportContext0;
        this.a = v;
    }

    public a(String s, String s1, long v, StaticSessionData staticSessionData0) {
        this.b = s;
        this.c = s1;
        this.a = v;
        this.d = staticSessionData0;
    }

    @Override  // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        ((Uploader)this.b).c.recordFailure(((Iterable)this.c));
        long v = ((Uploader)this.b).g.getTime();
        ((Uploader)this.b).c.recordNextCallTime(((TransportContext)this.d), v + this.a);
        return null;
    }

    @Override  // com.google.firebase.inject.Deferred$DeferredHandler
    public void handle(Provider provider0) {
        ((CrashlyticsNativeComponent)provider0.get()).prepareNativeSession(((String)this.b), ((String)this.c), this.a, ((StaticSessionData)this.d));
    }
}

