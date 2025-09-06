package s4;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class z implements FlowCollector {
    public final ObjectRef a;
    public final Function3 b;
    public final FlowCollector c;

    public z(ObjectRef ref$ObjectRef0, Function3 function30, FlowCollector flowCollector0) {
        this.a = ref$ObjectRef0;
        this.b = function30;
        this.c = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        ObjectRef ref$ObjectRef1;
        z z0;
        y y0;
        if(continuation0 instanceof y) {
            y0 = (y)continuation0;
            int v = y0.s;
            if((v & 0x80000000) == 0) {
                y0 = new y(this, continuation0);
            }
            else {
                y0.s = v ^ 0x80000000;
            }
        }
        else {
            y0 = new y(this, continuation0);
        }
        Object object1 = y0.q;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(y0.s) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ObjectRef ref$ObjectRef0 = this.a;
                y0.o = this;
                y0.p = ref$ObjectRef0;
                y0.s = 1;
                Object object3 = this.b.invoke(ref$ObjectRef0.element, object0, y0);
                if(object3 == object2) {
                    return object2;
                }
                z0 = this;
                object1 = object3;
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                ref$ObjectRef1 = y0.p;
                z0 = y0.o;
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
        ref$ObjectRef1.element = object1;
        y0.o = null;
        y0.p = null;
        y0.s = 2;
        return z0.c.emit(z0.a.element, y0) == object2 ? object2 : Unit.INSTANCE;
    }
}

