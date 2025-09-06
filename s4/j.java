package s4;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class j implements FlowCollector {
    public final IntRef a;
    public final FlowCollector b;

    public j(IntRef ref$IntRef0, FlowCollector flowCollector0) {
        this.a = ref$IntRef0;
        this.b = flowCollector0;
    }

    public final Object a(IndexedValue indexedValue0, Continuation continuation0) {
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.s;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, continuation0);
            }
            else {
                i0.s = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, continuation0);
        }
        Object object0 = i0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Intrinsics.checkNotNull(indexedValue0);
                if(indexedValue0.getIndex() > this.a.element) {
                    i0.o = this;
                    i0.p = indexedValue0;
                    i0.s = 1;
                    if(this.b.emit(indexedValue0.getValue(), i0) == object1) {
                        return object1;
                    }
                    this.a.element = indexedValue0.getIndex();
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                indexedValue0 = i0.p;
                j j0 = i0.o;
                ResultKt.throwOnFailure(object0);
                j0.a.element = indexedValue0.getIndex();
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        return this.a(((IndexedValue)object0), continuation0);
    }
}

