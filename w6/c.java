package w6;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;

public final class c implements CriticalSection {
    public final int a;
    public final Uploader b;
    public final TransportContext c;

    public c(Uploader uploader0, TransportContext transportContext0, int v) {
        this.a = v;
        this.b = uploader0;
        this.c = transportContext0;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public final Object execute() {
        return this.a != 0 ? this.b.c.loadBatch(this.c) : Boolean.valueOf(this.b.c.hasPendingEventsFor(this.c));
    }
}

