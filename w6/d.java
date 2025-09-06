package w6;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;

public final class d implements CriticalSection {
    public final Uploader a;
    public final TransportContext b;
    public final long c;

    public d(Uploader uploader0, TransportContext transportContext0, long v) {
        this.a = uploader0;
        this.b = transportContext0;
        this.c = v;
    }

    @Override  // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public final Object execute() {
        long v = this.a.g.getTime();
        this.a.c.recordNextCallTime(this.b, v + this.c);
        return null;
    }
}

