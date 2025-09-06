package a;

import b.b0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class i0 implements FlowCollector {
    public final FlowCollector a;

    public i0(FlowCollector flowCollector0) {
        this.a = flowCollector0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        h0 h00;
        if(continuation0 instanceof h0) {
            h00 = (h0)continuation0;
            int v = h00.b;
            if((v & 0x80000000) == 0) {
                h00 = new h0(this, continuation0);
            }
            else {
                h00.b = v ^ 0x80000000;
            }
        }
        else {
            h00 = new h0(this, continuation0);
        }
        Object object1 = h00.a;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(h00.b) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                h00.b = 1;
                return this.a.emit(((b0)object0).o, h00) == object2 ? object2 : Unit.INSTANCE;
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

