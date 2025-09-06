package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class r0 implements FlowCollector {
    public final FlowCollector a;
    public final ObjectRef b;

    public r0(FlowCollector flowCollector0, ObjectRef ref$ObjectRef0) {
        this.a = flowCollector0;
        this.b = ref$ObjectRef0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        r0 r00;
        q0 q00;
        if(continuation0 instanceof q0) {
            q00 = (q0)continuation0;
            int v = q00.r;
            if((v & 0x80000000) == 0) {
                q00 = new q0(this, continuation0);
            }
            else {
                q00.r = v ^ 0x80000000;
            }
        }
        else {
            q00 = new q0(this, continuation0);
        }
        Object object1 = q00.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(q00.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                try {
                    q00.o = this;
                    q00.r = 1;
                    return this.a.emit(object0, q00) == object2 ? object2 : Unit.INSTANCE;
                }
                catch(Throwable throwable0) {
                    r00 = this;
                    r00.b.element = throwable0;
                    throw throwable0;
                }
            }
            case 1: {
                try {
                    r00 = q00.o;
                    ResultKt.throwOnFailure(object1);
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable0) {
                }
                r00.b.element = throwable0;
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

