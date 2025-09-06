package xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class l2 extends AbstractFlow {
    public final Function2 a;

    public l2(Function2 function20) {
        this.a = function20;
    }

    @Override  // kotlinx.coroutines.flow.AbstractFlow
    public final Object collectSafely(FlowCollector flowCollector0, Continuation continuation0) {
        Object object0 = this.a.invoke(flowCollector0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

