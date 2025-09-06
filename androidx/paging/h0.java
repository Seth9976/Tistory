package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class h0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final RemoteMediatorAccessor q;

    public h0(RemoteMediatorAccessor remoteMediatorAccessor0, Continuation continuation0) {
        this.q = remoteMediatorAccessor0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h0(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h0)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        InitializeAction remoteMediator$InitializeAction0;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.p;
                RemoteMediatorAccessor remoteMediatorAccessor0 = this.q;
                if(remoteMediatorAccessor0 == null) {
                    remoteMediator$InitializeAction0 = null;
                }
                else {
                    this.p = flowCollector0;
                    this.o = 1;
                    object0 = remoteMediatorAccessor0.initialize(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    remoteMediator$InitializeAction0 = (InitializeAction)object0;
                }
                break;
            }
            case 1: {
                flowCollector0 = (FlowCollector)this.p;
                ResultKt.throwOnFailure(object0);
                remoteMediator$InitializeAction0 = (InitializeAction)object0;
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(remoteMediator$InitializeAction0 != InitializeAction.LAUNCH_INITIAL_REFRESH) {
            z = false;
        }
        this.p = null;
        this.o = 2;
        return flowCollector0.emit(Boxing.boxBoolean(z), this) == object1 ? object1 : Unit.INSTANCE;
    }
}

