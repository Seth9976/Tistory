package xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class f implements CancellableFlow {
    public final Flow a;

    public f(Flow flow0) {
        this.a = flow0;
    }

    @Override  // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        e e0 = new e(flowCollector0, 0);
        Object object0 = this.a.collect(e0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

