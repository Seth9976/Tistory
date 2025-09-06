package xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

public final class o1 implements FlowCollector {
    public final ObjectRef a;

    public o1(ObjectRef ref$ObjectRef0) {
        this.a = ref$ObjectRef0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        this.a.element = object0;
        return Unit.INSTANCE;
    }
}

