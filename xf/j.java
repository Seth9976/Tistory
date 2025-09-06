package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import qd.a;

public final class j implements FlowCollector {
    public final k a;
    public final ObjectRef b;
    public final FlowCollector c;

    public j(k k0, ObjectRef ref$ObjectRef0, FlowCollector flowCollector0) {
        this.a = k0;
        this.b = ref$ObjectRef0;
        this.c = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.q;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, continuation0);
            }
            else {
                i0.q = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, continuation0);
        }
        Object object1 = i0.o;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(i0.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                Object object3 = this.a.b.invoke(object0);
                ObjectRef ref$ObjectRef0 = this.b;
                if(ref$ObjectRef0.element != NullSurrogateKt.NULL && ((Boolean)this.a.c.invoke(ref$ObjectRef0.element, object3)).booleanValue()) {
                    return Unit.INSTANCE;
                }
                ref$ObjectRef0.element = object3;
                i0.q = 1;
                return this.c.emit(object0, i0) == object2 ? object2 : Unit.INSTANCE;
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

