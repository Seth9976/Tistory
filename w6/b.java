package w6;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;

public final class b implements CriticalSection {
    public final Uploader a;
    public final TransportContext b;
    public final int c;

    public b(Uploader uploader0, TransportContext transportContext0, int v) {
        this.a = uploader0;
        this.b = transportContext0;
        this.c = v;
    }

    @Override  // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public final Object execute() {
        this.a.d.schedule(this.b, this.c + 1);
        return null;
    }
}

