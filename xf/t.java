package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class t implements FlowCollector {
    public final Function2 a;
    public final IntRef b;

    public t(Function2 function20, IntRef ref$IntRef0) {
        this.a = function20;
        this.b = ref$IntRef0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        t t0;
        s s0;
        if(continuation0 instanceof s) {
            s0 = (s)continuation0;
            int v = s0.r;
            if((v & 0x80000000) == 0) {
                s0 = new s(this, continuation0);
            }
            else {
                s0.r = v ^ 0x80000000;
            }
        }
        else {
            s0 = new s(this, continuation0);
        }
        Object object1 = s0.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(s0.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                s0.o = this;
                s0.r = 1;
                object1 = this.a.invoke(object0, s0);
                if(object1 == object2) {
                    return object2;
                }
                t0 = this;
                break;
            }
            case 1: {
                t0 = s0.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object1).booleanValue()) {
            ++t0.b.element;
        }
        return Unit.INSTANCE;
    }
}

