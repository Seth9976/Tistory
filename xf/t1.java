package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import qd.a;

public final class t1 implements FlowCollector {
    public final ObjectRef a;
    public final Function3 b;

    public t1(ObjectRef ref$ObjectRef0, Function3 function30) {
        this.a = ref$ObjectRef0;
        this.b = function30;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        ObjectRef ref$ObjectRef0;
        s1 s10;
        if(continuation0 instanceof s1) {
            s10 = (s1)continuation0;
            int v = s10.r;
            if((v & 0x80000000) == 0) {
                s10 = new s1(this, continuation0);
            }
            else {
                s10.r = v ^ 0x80000000;
            }
        }
        else {
            s10 = new s1(this, continuation0);
        }
        Object object1 = s10.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(s10.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ref$ObjectRef0 = this.a;
                Object object3 = ref$ObjectRef0.element;
                if(object3 != NullSurrogateKt.NULL) {
                    s10.o = ref$ObjectRef0;
                    s10.r = 1;
                    Object object4 = this.b.invoke(object3, object0, s10);
                    if(object4 == object2) {
                        return object2;
                    }
                    object0 = object4;
                }
                break;
            }
            case 1: {
                ObjectRef ref$ObjectRef1 = s10.o;
                ResultKt.throwOnFailure(object1);
                ref$ObjectRef0 = ref$ObjectRef1;
                object0 = object1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ref$ObjectRef0.element = object0;
        return Unit.INSTANCE;
    }
}

