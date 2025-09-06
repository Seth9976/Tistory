package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class b1 implements FlowCollector {
    public final IntRef a;
    public final int b;
    public final FlowCollector c;

    public b1(IntRef ref$IntRef0, int v, FlowCollector flowCollector0) {
        this.a = ref$IntRef0;
        this.b = v;
        this.c = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        a1 a10;
        if(continuation0 instanceof a1) {
            a10 = (a1)continuation0;
            int v = a10.q;
            if((v & 0x80000000) == 0) {
                a10 = new a1(this, continuation0);
            }
            else {
                a10.q = v ^ 0x80000000;
            }
        }
        else {
            a10 = new a1(this, continuation0);
        }
        Object object1 = a10.o;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(a10.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                int v1 = this.a.element + 1;
                this.a.element = v1;
                FlowCollector flowCollector0 = this.c;
                if(v1 < this.b) {
                    a10.q = 1;
                    return flowCollector0.emit(object0, a10) == object2 ? object2 : Unit.INSTANCE;
                }
                a10.q = 2;
                return d1.a(flowCollector0, object0, a10) == object2 ? object2 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object1);
                return Unit.INSTANCE;
            }
            case 2: {
                ResultKt.throwOnFailure(object1);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

