package m5;

import androidx.compose.material.ripple.RippleHostView;
import androidx.paging.LivePagedList;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.material.motion.MaterialBackOrchestrator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import sc.b;
import u2.j;

public final class a implements Runnable {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Job)object0), "$job");
                ((Job)object0).cancel(null);
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((LivePagedList)object0), "this$0");
                ((LivePagedList)object0).d(true);
                return;
            }
            case 2: {
                RippleHostView.setRippleState$lambda$2(((RippleHostView)object0));
                return;
            }
            case 3: {
                ((j)object0).invoke();
                return;
            }
            case 4: {
                ((WorkInitializer)object0).getClass();
                b b0 = new b(((WorkInitializer)object0), 4);
                ((WorkInitializer)object0).d.runCriticalSection(b0);
                return;
            }
            default: {
                ((MaterialBackOrchestrator)object0).startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }
}

