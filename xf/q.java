package xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowCollector;

public final class q implements FlowCollector {
    public final IntRef a;

    public q(IntRef ref$IntRef0) {
        this.a = ref$IntRef0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        ++this.a.element;
        return Unit.INSTANCE;
    }
}

