package a;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class l implements FlowCollector {
    public final FlowCollector a;

    public l(FlowCollector flowCollector0) {
        this.a = flowCollector0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        k k0;
        if(continuation0 instanceof k) {
            k0 = (k)continuation0;
            int v = k0.b;
            if((v & 0x80000000) == 0) {
                k0 = new k(this, continuation0);
            }
            else {
                k0.b = v ^ 0x80000000;
            }
        }
        else {
            k0 = new k(this, continuation0);
        }
        Object object1 = k0.a;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(k0.b) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                FlowCollector flowCollector0 = this.a;
                if(object0 instanceof b.a) {
                    k0.b = 1;
                    if(flowCollector0.emit(object0, k0) == object2) {
                        return object2;
                    }
                }
                return Unit.INSTANCE;
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

