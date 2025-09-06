package xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

public final class v1 implements FlowCollector {
    public final ObjectRef a;

    public v1(ObjectRef ref$ObjectRef0) {
        this.a = ref$ObjectRef0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        ObjectRef ref$ObjectRef0 = this.a;
        if(ref$ObjectRef0.element != NullSurrogateKt.NULL) {
            throw new IllegalArgumentException("Flow has more than one element");
        }
        ref$ObjectRef0.element = object0;
        return Unit.INSTANCE;
    }
}

