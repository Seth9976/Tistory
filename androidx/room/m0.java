package androidx.room;

import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class m0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final boolean q;
    public final RoomDatabase r;
    public final FlowCollector s;
    public final String[] t;
    public final Callable u;

    public m0(boolean z, RoomDatabase roomDatabase0, FlowCollector flowCollector0, String[] arr_s, Callable callable0, Continuation continuation0) {
        this.q = z;
        this.r = roomDatabase0;
        this.s = flowCollector0;
        this.t = arr_s;
        this.u = callable0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m0(this.q, this.r, this.s, this.t, this.u, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ContinuationInterceptor continuationInterceptor0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                Channel channel0 = ChannelKt.Channel$default(-1, null, null, 6, null);
                CoroutinesRoom.Companion.createFlow.1.1.observer.1 coroutinesRoom$Companion$createFlow$1$1$observer$10 = new CoroutinesRoom.Companion.createFlow.1.1.observer.1(this.t, channel0);
                channel0.trySend-JP2dKIU(Unit.INSTANCE);
                TransactionElement transactionElement0 = (TransactionElement)coroutineScope0.getCoroutineContext().get(TransactionElement.Key);
                if(transactionElement0 == null) {
                    continuationInterceptor0 = this.q ? CoroutinesRoomKt.getTransactionDispatcher(this.r) : CoroutinesRoomKt.getQueryDispatcher(this.r);
                }
                else {
                    continuationInterceptor0 = transactionElement0.getTransactionDispatcher$room_ktx_release();
                    if(continuationInterceptor0 == null) {
                        continuationInterceptor0 = this.q ? CoroutinesRoomKt.getTransactionDispatcher(this.r) : CoroutinesRoomKt.getQueryDispatcher(this.r);
                    }
                }
                Channel channel1 = ChannelKt.Channel$default(0, null, null, 7, null);
                BuildersKt.launch$default(coroutineScope0, continuationInterceptor0, null, new l0(this.r, coroutinesRoom$Companion$createFlow$1$1$observer$10, channel0, this.u, channel1, null), 2, null);
                this.o = 1;
                return FlowKt.emitAll(this.s, channel1, this) == object1 ? object1 : Unit.INSTANCE;
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

