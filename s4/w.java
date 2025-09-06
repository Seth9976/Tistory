package s4;

import androidx.paging.FlowExtKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class w implements FlowCollector {
    public final ObjectRef a;
    public final Function3 b;
    public final FlowCollector c;

    public w(ObjectRef ref$ObjectRef0, Function3 function30, FlowCollector flowCollector0) {
        this.a = ref$ObjectRef0;
        this.b = function30;
        this.c = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        w w0;
        ObjectRef ref$ObjectRef0;
        v v0;
        if(continuation0 instanceof v) {
            v0 = (v)continuation0;
            int v1 = v0.s;
            if((v1 & 0x80000000) == 0) {
                v0 = new v(this, continuation0);
            }
            else {
                v0.s = v1 ^ 0x80000000;
            }
        }
        else {
            v0 = new v(this, continuation0);
        }
        Object object1 = v0.q;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(v0.s) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ref$ObjectRef0 = this.a;
                if(ref$ObjectRef0.element == FlowExtKt.a) {
                    w0 = this;
                }
                else {
                    v0.o = this;
                    v0.p = ref$ObjectRef0;
                    v0.s = 1;
                    Object object3 = this.b.invoke(ref$ObjectRef0.element, object0, v0);
                    if(object3 == object2) {
                        return object2;
                    }
                    w0 = this;
                    object0 = object3;
                }
                break;
            }
            case 1: {
                ObjectRef ref$ObjectRef1 = v0.p;
                w0 = v0.o;
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
        v0.o = null;
        v0.p = null;
        v0.s = 2;
        return w0.c.emit(w0.a.element, v0) == object2 ? object2 : Unit.INSTANCE;
    }
}

