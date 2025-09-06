package t4;

import androidx.paging.compose.LazyPagingItems;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class f extends SuspendLambda implements Function2 {
    public int o;
    public final CoroutineContext p;
    public final LazyPagingItems q;

    public f(CoroutineContext coroutineContext0, LazyPagingItems lazyPagingItems0, Continuation continuation0) {
        this.p = coroutineContext0;
        this.q = lazyPagingItems0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineContext coroutineContext0 = this.p;
                boolean z = Intrinsics.areEqual(coroutineContext0, EmptyCoroutineContext.INSTANCE);
                LazyPagingItems lazyPagingItems0 = this.q;
                if(z) {
                    this.o = 1;
                    if(lazyPagingItems0.collectLoadState$paging_compose_release(this) == object1) {
                        return object1;
                    }
                }
                else {
                    e e0 = new e(lazyPagingItems0, null);
                    this.o = 2;
                    if(BuildersKt.withContext(coroutineContext0, e0, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: 
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

