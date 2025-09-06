package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import qd.a;

public final class b1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final boolean q;
    public final RoomDatabase r;
    public final String[] s;

    public b1(boolean z, RoomDatabase roomDatabase0, String[] arr_s, Continuation continuation0) {
        this.q = z;
        this.r = roomDatabase0;
        this.s = arr_s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b1(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b1)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ContinuationInterceptor continuationInterceptor0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.p;
                AtomicBoolean atomicBoolean0 = new AtomicBoolean(this.q);
                RoomDatabaseKt.invalidationTrackerFlow.1.observer.1 roomDatabaseKt$invalidationTrackerFlow$1$observer$10 = new RoomDatabaseKt.invalidationTrackerFlow.1.observer.1(this.s, atomicBoolean0, producerScope0);
                TransactionElement transactionElement0 = (TransactionElement)producerScope0.getCoroutineContext().get(TransactionElement.Key);
                if(transactionElement0 == null) {
                    continuationInterceptor0 = CoroutinesRoomKt.getQueryDispatcher(this.r);
                }
                else {
                    continuationInterceptor0 = transactionElement0.getTransactionDispatcher$room_ktx_release();
                    if(continuationInterceptor0 == null) {
                        continuationInterceptor0 = CoroutinesRoomKt.getQueryDispatcher(this.r);
                    }
                }
                z0 z00 = new z0(BuildersKt.launch$default(producerScope0, continuationInterceptor0, null, new a1(this.r, roomDatabaseKt$invalidationTrackerFlow$1$observer$10, this.q, producerScope0, this.s, atomicBoolean0, null), 2, null));
                this.o = 1;
                return ProduceKt.awaitClose(producerScope0, z00, this) == object1 ? object1 : Unit.INSTANCE;
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

