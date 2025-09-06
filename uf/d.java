package uf;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BroadcastChannelImpl;
import kotlinx.coroutines.channels.BufferedChannelKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public int o;
    public final BroadcastChannelImpl p;
    public final Object q;
    public final SelectInstance r;

    public d(BroadcastChannelImpl broadcastChannelImpl0, Object object0, SelectInstance selectInstance0, Continuation continuation0) {
        this.p = broadcastChannelImpl0;
        this.q = object0;
        this.r = selectInstance0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        BroadcastChannelImpl broadcastChannelImpl0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    this.o = 1;
                    if(broadcastChannelImpl0.send(this.q, this) == object1) {
                        return object1;
                    label_9:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_12;
                }
            }
            case 1: {
                goto label_9;
            label_12:
                if(!broadcastChannelImpl0.isClosedForSend() || !(throwable0 instanceof ClosedSendChannelException) && broadcastChannelImpl0.getSendException() != throwable0) {
                    throw throwable0;
                }
                z = false;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ReentrantLock reentrantLock0 = broadcastChannelImpl0.m;
        SelectInstance selectInstance0 = this.r;
        reentrantLock0.lock();
        try {
            HashMap hashMap0 = broadcastChannelImpl0.p;
            Unit unit0 = z ? Unit.INSTANCE : BufferedChannelKt.getCHANNEL_CLOSED();
            hashMap0.put(selectInstance0, unit0);
            Intrinsics.checkNotNull(selectInstance0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            SelectImplementation selectImplementation0 = (SelectImplementation)selectInstance0;
            Unit unit1 = Unit.INSTANCE;
            if(((SelectImplementation)selectInstance0).trySelectDetailed(broadcastChannelImpl0, unit1) != TrySelectDetailedResult.REREGISTER) {
                broadcastChannelImpl0.p.remove(selectInstance0);
            }
            return unit1;
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

