package xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import qd.a;

public final class k implements Flow {
    public final Flow a;
    public final Function1 b;
    public final Function2 c;

    public k(Flow flow0, Function1 function10, Function2 function20) {
        this.a = flow0;
        this.b = function10;
        this.c = function20;
    }

    @Override  // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = NullSurrogateKt.NULL;
        j j0 = new j(this, ref$ObjectRef0, flowCollector0);
        Object object0 = this.a.collect(j0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

