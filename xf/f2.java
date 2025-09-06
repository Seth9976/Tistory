package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import qd.a;

public final class f2 implements FlowCollector {
    public final ObjectRef a;
    public final Function3 b;
    public final FlowCollector c;

    public f2(ObjectRef ref$ObjectRef0, Function3 function30, FlowCollector flowCollector0) {
        this.a = ref$ObjectRef0;
        this.b = function30;
        this.c = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        f2 f20;
        ObjectRef ref$ObjectRef0;
        e2 e20;
        if(continuation0 instanceof e2) {
            e20 = (e2)continuation0;
            int v = e20.s;
            if((v & 0x80000000) == 0) {
                e20 = new e2(this, continuation0);
            }
            else {
                e20.s = v ^ 0x80000000;
            }
        }
        else {
            e20 = new e2(this, continuation0);
        }
        Object object1 = e20.q;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(e20.s) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ref$ObjectRef0 = this.a;
                Object object3 = ref$ObjectRef0.element;
                if(object3 == NullSurrogateKt.NULL) {
                    f20 = this;
                }
                else {
                    e20.o = this;
                    e20.p = ref$ObjectRef0;
                    e20.s = 1;
                    Object object4 = this.b.invoke(object3, object0, e20);
                    if(object4 == object2) {
                        return object2;
                    }
                    f20 = this;
                    object0 = object4;
                }
                break;
            }
            case 1: {
                ObjectRef ref$ObjectRef1 = e20.p;
                f20 = e20.o;
                ResultKt.throwOnFailure(object1);
                ref$ObjectRef0 = ref$ObjectRef1;
                object0 = object1;
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
        ref$ObjectRef0.element = object0;
        e20.o = null;
        e20.p = null;
        e20.s = 2;
        return f20.c.emit(f20.a.element, e20) == object2 ? object2 : Unit.INSTANCE;
    }
}

