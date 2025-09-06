package a;

import b.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class e implements FlowCollector {
    public final FlowCollector a;

    public e(FlowCollector flowCollector0) {
        this.a = flowCollector0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.b;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.b = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object1 = d0.a;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(d0.b) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                FlowCollector flowCollector0 = this.a;
                if(object0 instanceof b) {
                    d0.b = 1;
                    if(flowCollector0.emit(object0, d0) == object2) {
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

