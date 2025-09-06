package a;

import b.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class h implements FlowCollector {
    public final FlowCollector a;

    public h(FlowCollector flowCollector0) {
        this.a = flowCollector0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.b;
            if((v & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.b = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object1 = g0.a;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(g0.b) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                g0.b = 1;
                return this.a.emit(((b)object0).a, g0) == object2 ? object2 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object1);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

