package xf;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SubscribedFlowCollector;
import qd.a;

public final class z2 implements SharedFlow {
    public final SharedFlow a;
    public final Function2 b;

    public z2(SharedFlow sharedFlow0, Function2 function20) {
        this.a = sharedFlow0;
        this.b = function20;
    }

    @Override  // kotlinx.coroutines.flow.SharedFlow
    public final Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        y2 y20;
        if(continuation0 instanceof y2) {
            y20 = (y2)continuation0;
            int v = y20.q;
            if((v & 0x80000000) == 0) {
                y20 = new y2(this, continuation0);
            }
            else {
                y20.q = v ^ 0x80000000;
            }
        }
        else {
            y20 = new y2(this, continuation0);
        }
        Object object0 = y20.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(y20.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SubscribedFlowCollector subscribedFlowCollector0 = new SubscribedFlowCollector(flowCollector0, this.b);
                y20.q = 1;
                if(this.a.collect(subscribedFlowCollector0, y20) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override  // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.a.getReplayCache();
    }
}

