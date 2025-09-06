package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class y0 implements FlowCollector {
    public final BooleanRef a;
    public final FlowCollector b;
    public final Function2 c;

    public y0(BooleanRef ref$BooleanRef0, FlowCollector flowCollector0, Function2 function20) {
        this.a = ref$BooleanRef0;
        this.b = flowCollector0;
        this.c = function20;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        y0 y00;
        x0 x00;
        if(continuation0 instanceof x0) {
            x00 = (x0)continuation0;
            int v = x00.s;
            if((v & 0x80000000) == 0) {
                x00 = new x0(this, continuation0);
            }
            else {
                x00.s = v ^ 0x80000000;
            }
        }
        else {
            x00 = new x0(this, continuation0);
        }
        Object object1 = x00.q;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(x00.s) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                if(this.a.element) {
                    x00.s = 1;
                    return this.b.emit(object0, x00) == object2 ? object2 : Unit.INSTANCE;
                }
                x00.o = this;
                x00.p = object0;
                x00.s = 2;
                object1 = this.c.invoke(object0, x00);
                if(object1 == object2) {
                    return object2;
                }
                y00 = this;
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object1);
                return Unit.INSTANCE;
            }
            case 2: {
                object0 = x00.p;
                y00 = x00.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object1);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!((Boolean)object1).booleanValue()) {
            y00.a.element = true;
            x00.o = null;
            x00.p = null;
            x00.s = 3;
            return y00.b.emit(object0, x00) == object2 ? object2 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

