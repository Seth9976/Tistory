package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharingCommand;
import qd.a;

public final class q2 implements FlowCollector {
    public final BooleanRef a;
    public final FlowCollector b;

    public q2(BooleanRef ref$BooleanRef0, FlowCollector flowCollector0) {
        this.a = ref$BooleanRef0;
        this.b = flowCollector0;
    }

    public final Object a(int v, Continuation continuation0) {
        p2 p20;
        if(continuation0 instanceof p2) {
            p20 = (p2)continuation0;
            int v1 = p20.q;
            if((v1 & 0x80000000) == 0) {
                p20 = new p2(this, continuation0);
            }
            else {
                p20.q = v1 ^ 0x80000000;
            }
        }
        else {
            p20 = new p2(this, continuation0);
        }
        Object object0 = p20.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p20.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(v > 0) {
                    BooleanRef ref$BooleanRef0 = this.a;
                    if(!ref$BooleanRef0.element) {
                        ref$BooleanRef0.element = true;
                        p20.q = 1;
                        return this.b.emit(SharingCommand.START, p20) == object1 ? object1 : Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
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
        return this.a(((Number)object0).intValue(), continuation0);
    }
}

