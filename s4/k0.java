package s4;

import androidx.paging.PageEvent;
import androidx.paging.SimpleProducerScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class k0 implements FlowCollector {
    public final int a;
    public final SimpleProducerScope b;

    public k0(SimpleProducerScope simpleProducerScope0, int v) {
        this.a = v;
        this.b = simpleProducerScope0;
        super();
    }

    public Object a(PageEvent pageEvent0, Continuation continuation0) {
        r0 r00;
        if(continuation0 instanceof r0) {
            r00 = (r0)continuation0;
            int v = r00.q;
            if((v & 0x80000000) == 0) {
                r00 = new r0(this, continuation0);
            }
            else {
                r00.q = v ^ 0x80000000;
            }
        }
        else {
            r00 = new r0(this, continuation0);
        }
        Object object0 = r00.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    r00.q = 1;
                    if(this.b.send(pageEvent0, r00) == object1) {
                        return object1;
                    }
                }
                catch(ClosedSendChannelException unused_ex) {
                }
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(ClosedSendChannelException unused_ex) {
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        if(this.a != 0) {
            return this.a(((PageEvent)object0), continuation0);
        }
        Unit unit0 = this.b.send(((PageEvent)object0), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }
}

