package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class w0 implements FlowCollector {
    public final IntRef a;
    public final int b;
    public final FlowCollector c;

    public w0(IntRef ref$IntRef0, int v, FlowCollector flowCollector0) {
        this.a = ref$IntRef0;
        this.b = v;
        this.c = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        v0 v00;
        if(continuation0 instanceof v0) {
            v00 = (v0)continuation0;
            int v = v00.q;
            if((v & 0x80000000) == 0) {
                v00 = new v0(this, continuation0);
            }
            else {
                v00.q = v ^ 0x80000000;
            }
        }
        else {
            v00 = new v0(this, continuation0);
        }
        Object object1 = v00.o;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(v00.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                IntRef ref$IntRef0 = this.a;
                int v1 = ref$IntRef0.element;
                if(v1 >= this.b) {
                    v00.q = 1;
                    return this.c.emit(object0, v00) == object2 ? object2 : Unit.INSTANCE;
                }
                ref$IntRef0.element = v1 + 1;
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

