package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class l implements FlowCollector {
    public final Channel a;
    public final int b;

    public l(Channel channel0, int v) {
        this.a = channel0;
        this.b = v;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        k k0;
        if(continuation0 instanceof k) {
            k0 = (k)continuation0;
            int v = k0.q;
            if((v & 0x80000000) == 0) {
                k0 = new k(this, continuation0);
            }
            else {
                k0.q = v ^ 0x80000000;
            }
        }
        else {
            k0 = new k(this, continuation0);
        }
        Object object1 = k0.o;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(k0.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                IndexedValue indexedValue0 = new IndexedValue(this.b, object0);
                k0.q = 1;
                if(this.a.send(indexedValue0, k0) == object2) {
                    return object2;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object1);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object1);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        k0.q = 2;
        return YieldKt.yield(k0) == object2 ? object2 : Unit.INSTANCE;
    }
}

