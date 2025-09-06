package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class n0 implements FlowCollector {
    public final BooleanRef a;
    public final FlowCollector b;

    public n0(BooleanRef ref$BooleanRef0, FlowCollector flowCollector0) {
        this.a = ref$BooleanRef0;
        this.b = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        m0 m00;
        if(continuation0 instanceof m0) {
            m00 = (m0)continuation0;
            int v = m00.q;
            if((v & 0x80000000) == 0) {
                m00 = new m0(this, continuation0);
            }
            else {
                m00.q = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(this, continuation0);
        }
        Object object1 = m00.o;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(m00.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                this.a.element = false;
                m00.q = 1;
                return this.b.emit(object0, m00) == object2 ? object2 : Unit.INSTANCE;
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

