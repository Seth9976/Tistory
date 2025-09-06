package androidx.room;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final RoomDatabase q;
    public final CancellableContinuationImpl r;
    public final Function2 s;

    public c1(RoomDatabase roomDatabase0, CancellableContinuationImpl cancellableContinuationImpl0, Function2 function20, Continuation continuation0) {
        this.q = roomDatabase0;
        this.r = cancellableContinuationImpl0;
        this.s = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c1(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Continuation continuation0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Element coroutineContext$Element0 = ((CoroutineScope)this.p).getCoroutineContext().get(ContinuationInterceptor.Key);
                Intrinsics.checkNotNull(coroutineContext$Element0);
                CoroutineContext coroutineContext0 = RoomDatabaseKt.access$createTransactionContext(this.q, ((ContinuationInterceptor)coroutineContext$Element0));
                CancellableContinuationImpl cancellableContinuationImpl0 = this.r;
                this.p = cancellableContinuationImpl0;
                this.o = 1;
                object0 = BuildersKt.withContext(coroutineContext0, this.s, this);
                if(object0 == object1) {
                    return object1;
                }
                continuation0 = cancellableContinuationImpl0;
                break;
            }
            case 1: {
                continuation0 = (Continuation)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        continuation0.resumeWith(object0);
        return Unit.INSTANCE;
    }
}

