package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class h2 implements FlowCollector {
    public final FlowCollector a;
    public final IntRef b;

    public h2(IntRef ref$IntRef0, FlowCollector flowCollector0) {
        this.a = flowCollector0;
        this.b = ref$IntRef0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        g2 g20;
        if(continuation0 instanceof g2) {
            g20 = (g2)continuation0;
            int v = g20.q;
            if((v & 0x80000000) == 0) {
                g20 = new g2(this, continuation0);
            }
            else {
                g20.q = v ^ 0x80000000;
            }
        }
        else {
            g20 = new g2(this, continuation0);
        }
        Object object1 = g20.o;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(g20.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                int v1 = this.b.element;
                this.b.element = v1 + 1;
                if(v1 < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                IndexedValue indexedValue0 = new IndexedValue(v1, object0);
                g20.q = 1;
                return this.a.emit(indexedValue0, g20) == object2 ? object2 : Unit.INSTANCE;
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

