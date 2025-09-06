package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class e implements FlowCollector {
    public final int a;
    public final FlowCollector b;

    public e(FlowCollector flowCollector0, int v) {
        this.a = v;
        this.b = flowCollector0;
        super();
    }

    public Object a(Flow flow0, Continuation continuation0) {
        e1 e10;
        if(continuation0 instanceof e1) {
            e10 = (e1)continuation0;
            int v = e10.q;
            if((v & 0x80000000) == 0) {
                e10 = new e1(this, continuation0);
            }
            else {
                e10.q = v ^ 0x80000000;
            }
        }
        else {
            e10 = new e1(this, continuation0);
        }
        Object object0 = e10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                e10.q = 1;
                return FlowKt.emitAll(this.b, flow0, e10) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        d d0;
        if(this.a != 0) {
            return this.a(((Flow)object0), continuation0);
        }
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.q;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.q = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object1 = d0.o;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(d0.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                JobKt.ensureActive(d0.getContext());
                d0.q = 1;
                return this.b.emit(object0, d0) == unit0 ? unit0 : Unit.INSTANCE;
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

