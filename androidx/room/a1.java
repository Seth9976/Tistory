package androidx.room;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProducerScope;
import qd.a;

public final class a1 extends SuspendLambda implements Function2 {
    public int o;
    public final RoomDatabase p;
    public final RoomDatabaseKt.invalidationTrackerFlow.1.observer.1 q;
    public final boolean r;
    public final ProducerScope s;
    public final String[] t;
    public final AtomicBoolean u;

    public a1(RoomDatabase roomDatabase0, RoomDatabaseKt.invalidationTrackerFlow.1.observer.1 roomDatabaseKt$invalidationTrackerFlow$1$observer$10, boolean z, ProducerScope producerScope0, String[] arr_s, AtomicBoolean atomicBoolean0, Continuation continuation0) {
        this.p = roomDatabase0;
        this.q = roomDatabaseKt$invalidationTrackerFlow$1$observer$10;
        this.r = z;
        this.s = producerScope0;
        this.t = arr_s;
        this.u = atomicBoolean0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a1(this.p, this.q, this.r, this.s, this.t, this.u, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        RoomDatabaseKt.invalidationTrackerFlow.1.observer.1 roomDatabaseKt$invalidationTrackerFlow$1$observer$10 = this.q;
        RoomDatabase roomDatabase0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                roomDatabase0.getInvalidationTracker().addObserver(roomDatabaseKt$invalidationTrackerFlow$1$observer$10);
                try {
                    if(this.r) {
                        Set set0 = ArraysKt___ArraysKt.toSet(this.t);
                        this.s.trySend-JP2dKIU(set0);
                    }
                    this.u.set(false);
                    this.o = 1;
                    if(DelayKt.awaitCancellation(this) == object1) {
                        return object1;
                    label_14:
                        ResultKt.throwOnFailure(object0);
                    }
                    throw new KotlinNothingValueException();
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_14;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        roomDatabase0.getInvalidationTracker().removeObserver(roomDatabaseKt$invalidationTrackerFlow$1$observer$10);
        throw throwable0;
    }
}

