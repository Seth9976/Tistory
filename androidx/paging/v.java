package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class v extends SuspendLambda implements Function2 {
    public final LivePagedList o;

    public v(LivePagedList livePagedList0, Continuation continuation0) {
        this.o = livePagedList0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new v(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((v)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.o.u.setInitialLoadState(LoadType.REFRESH, Loading.INSTANCE);
        return Unit.INSTANCE;
    }
}

