package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ShareKt.launchSharing.1.2.WhenMappings;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingCommand;
import qd.a;

public final class z1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Flow q;
    public final MutableSharedFlow r;
    public final Object s;

    public z1(Flow flow0, MutableSharedFlow mutableSharedFlow0, Object object0, Continuation continuation0) {
        this.q = flow0;
        this.r = mutableSharedFlow0;
        this.s = object0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new z1(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((z1)this.create(((SharingCommand)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                MutableSharedFlow mutableSharedFlow0 = this.r;
                switch(FlowKt__ShareKt.launchSharing.1.2.WhenMappings.$EnumSwitchMapping$0[((SharingCommand)this.p).ordinal()]) {
                    case 1: {
                        this.o = 1;
                        return this.q.collect(mutableSharedFlow0, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 3: {
                        Object object2 = this.s;
                        if(object2 == SharedFlowKt.NO_VALUE) {
                            mutableSharedFlow0.resetReplayCache();
                            return Unit.INSTANCE;
                        }
                        mutableSharedFlow0.tryEmit(object2);
                        return Unit.INSTANCE;
                    }
                    default: {
                        return Unit.INSTANCE;
                    }
                }
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
}

