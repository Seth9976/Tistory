package a;

import b.b0;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class d0 implements FlowCollector {
    public final FlowCollector a;

    public d0(FlowCollector flowCollector0) {
        this.a = flowCollector0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        c0 c00;
        if(continuation0 instanceof c0) {
            c00 = (c0)continuation0;
            int v = c00.b;
            if((v & 0x80000000) == 0) {
                c00 = new c0(this, continuation0);
            }
            else {
                c00.b = v ^ 0x80000000;
            }
        }
        else {
            c00 = new c0(this, continuation0);
        }
        Object object1 = c00.a;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(c00.b) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                Pair pair0 = TuplesKt.to(((b0)object0).o, ((b0)object0).a);
                c00.b = 1;
                return this.a.emit(pair0, c00) == object2 ? object2 : Unit.INSTANCE;
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

