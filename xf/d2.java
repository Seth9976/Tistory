package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class d2 implements FlowCollector {
    public final ObjectRef a;
    public final Function3 b;
    public final FlowCollector c;

    public d2(ObjectRef ref$ObjectRef0, Function3 function30, FlowCollector flowCollector0) {
        this.a = ref$ObjectRef0;
        this.b = function30;
        this.c = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        ObjectRef ref$ObjectRef1;
        d2 d20;
        c2 c20;
        if(continuation0 instanceof c2) {
            c20 = (c2)continuation0;
            int v = c20.s;
            if((v & 0x80000000) == 0) {
                c20 = new c2(this, continuation0);
            }
            else {
                c20.s = v ^ 0x80000000;
            }
        }
        else {
            c20 = new c2(this, continuation0);
        }
        Object object1 = c20.q;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(c20.s) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ObjectRef ref$ObjectRef0 = this.a;
                c20.o = this;
                c20.p = ref$ObjectRef0;
                c20.s = 1;
                Object object3 = this.b.invoke(ref$ObjectRef0.element, object0, c20);
                if(object3 == object2) {
                    return object2;
                }
                d20 = this;
                object1 = object3;
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                ref$ObjectRef1 = c20.p;
                d20 = c20.o;
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
        c20.o = null;
        c20.p = null;
        c20.s = 2;
        return d20.c.emit(d20.a.element, c20) == object2 ? object2 : Unit.INSTANCE;
    }
}

