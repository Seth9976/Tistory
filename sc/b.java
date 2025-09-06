package sc;

import android.graphics.Canvas;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.canvas.CanvasCompat.CanvasOperation;
import com.google.android.material.navigation.NavigationView;
import com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel;
import com.kakao.tistory.presentation.viewmodel.f7;

public final class b implements CriticalSection, OnSuccessListener, CanvasOperation {
    public final int a;
    public final Object b;

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        switch(this.a) {
            case 1: {
                return ((ClientHealthMetricsStore)this.b).loadClientMetrics();
            }
            case 2: {
                ((Uploader)this.b).i.resetClientMetrics();
                return null;
            }
            case 3: {
                return ((EventStore)this.b).cleanUp();
            }
            default: {
                WorkInitializer workInitializer0 = (WorkInitializer)this.b;
                for(Object object0: workInitializer0.b.loadActiveContexts()) {
                    workInitializer0.c.schedule(((TransportContext)object0), 1);
                }
                return null;
            }
        }
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        TistoryLoginViewModel.a(((f7)this.b), object0);
    }

    @Override  // com.google.android.material.canvas.CanvasCompat$CanvasOperation
    public void run(Canvas canvas0) {
        ((NavigationView)this.b).super.dispatchDraw(canvas0);
    }
}

