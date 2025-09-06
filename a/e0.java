package a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import qd.a;

public final class e0 implements Flow {
    public final Flow a;

    public e0(StateFlow stateFlow0) {
        this.a = stateFlow0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        d0 d00 = new d0(flowCollector0);
        Object object0 = this.a.collect(d00, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

