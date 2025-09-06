package s4;

import androidx.paging.CachedPageEventFlow;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class n extends SuspendLambda implements Function2 {
    public Iterator o;
    public int p;
    public Object q;
    public final CachedPageEventFlow r;

    public n(CachedPageEventFlow cachedPageEventFlow0, Continuation continuation0) {
        this.r = cachedPageEventFlow0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new n(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Iterator iterator0;
        FlowCollector flowCollector1;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        CachedPageEventFlow cachedPageEventFlow0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.q;
                this.q = flowCollector0;
                this.p = 1;
                object0 = cachedPageEventFlow0.a.a(this);
                if(object0 == object1) {
                    return object1;
                }
                cachedPageEventFlow0.d.start();
                flowCollector1 = flowCollector0;
                iterator0 = ((List)object0).iterator();
                break;
            }
            case 1: {
                flowCollector0 = (FlowCollector)this.q;
                ResultKt.throwOnFailure(object0);
                cachedPageEventFlow0.d.start();
                flowCollector1 = flowCollector0;
                iterator0 = ((List)object0).iterator();
                break;
            }
            case 2: {
                iterator0 = this.o;
                flowCollector1 = (FlowCollector)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            this.q = flowCollector1;
            this.o = iterator0;
            this.p = 2;
            if(flowCollector1.emit(((IndexedValue)object2), this) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}

