package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.material3.internal.PredictiveBack;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.flow.FlowCollector;

public final class xf implements FlowCollector {
    public final DrawerPredictiveBackState a;
    public final boolean b;
    public final FloatRef c;
    public final FloatRef d;
    public final FloatRef e;

    public xf(DrawerPredictiveBackState drawerPredictiveBackState0, boolean z, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, FloatRef ref$FloatRef2) {
        this.a = drawerPredictiveBackState0;
        this.b = z;
        this.c = ref$FloatRef0;
        this.d = ref$FloatRef1;
        this.e = ref$FloatRef2;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        float f = ((BackEventCompat)object0).getProgress();
        float f1 = PredictiveBack.INSTANCE.transform$material3_release(f);
        this.a.update(f1, ((BackEventCompat)object0).getSwipeEdge() == 0, this.b, this.c.element, this.d.element, this.e.element);
        return Unit.INSTANCE;
    }
}

