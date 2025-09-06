package y0;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.RecomposerKt;
import androidx.compose.runtime.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

public final class i0 extends Lambda implements Function1 {
    public final Recomposer w;
    public final List x;
    public final List y;
    public final b0 z;

    public i0(Recomposer recomposer0, List list0, List list1, b0 b00) {
        this.w = recomposer0;
        this.x = list0;
        this.y = list1;
        this.z = b00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        CancellableContinuation cancellableContinuation0;
        long v = ((Number)object0).longValue();
        if(Recomposer.access$getHasBroadcastFrameClockAwaiters(this.w)) {
            Trace trace0 = Trace.INSTANCE;
            Object object1 = trace0.beginSection("Recomposer:animation");
            try {
                this.w.b.sendFrame(v);
                Snapshot.Companion.sendApplyNotifications();
            }
            catch(Throwable throwable0) {
                Trace.INSTANCE.endSection(object1);
                throw throwable0;
            }
            trace0.endSection(object1);
        }
        Recomposer recomposer0 = this.w;
        List list0 = this.x;
        List list1 = this.y;
        b0 b00 = this.z;
        Object object2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            Recomposer.access$recordComposerModifications(recomposer0);
            synchronized(recomposer0.c) {
                List list2 = recomposer0.j;
                int v3 = list2.size();
                for(int v5 = 0; v5 < v3; ++v5) {
                    list1.add(((ControlledComposition)list2.get(v5)));
                }
                recomposer0.j.clear();
                MutableVector mutableVector0 = recomposer0.i;
                int v6 = mutableVector0.getSize();
                if(v6 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v7 = 0;
                    while(true) {
                        list0.add(((ControlledComposition)arr_object[v7]));
                        ++v7;
                        if(v7 >= v6) {
                            break;
                        }
                    }
                }
                recomposer0.i.clear();
                if(b00.a != RecomposerKt.b) {
                    PreconditionsKt.throwIllegalStateException("frame not pending");
                }
                b00.a = null;
            }
            MutableScatterSet mutableScatterSet0 = new MutableScatterSet(0, 1, null);
            try {
                int v9 = list0.size();
                for(int v10 = 0; v10 < v9; ++v10) {
                    ControlledComposition controlledComposition0 = Recomposer.access$performRecompose(recomposer0, ((ControlledComposition)list0.get(v10)), mutableScatterSet0);
                    if(controlledComposition0 != null) {
                        list1.add(controlledComposition0);
                    }
                }
            }
            finally {
                list0.clear();
            }
            if(!list1.isEmpty()) {
                recomposer0.a = recomposer0.getChangeCount() + 1L;
            }
            try {
                int v11 = list1.size();
                for(int v4 = 0; v4 < v11; ++v4) {
                    ((ControlledComposition)list1.get(v4)).applyChanges();
                }
            }
            catch(Throwable throwable1) {
                list1.clear();
                throw throwable1;
            }
            list1.clear();
            synchronized(recomposer0.c) {
                cancellableContinuation0 = recomposer0.b();
            }
            return cancellableContinuation0;
        }
        finally {
            Trace.INSTANCE.endSection(object2);
        }
    }
}

