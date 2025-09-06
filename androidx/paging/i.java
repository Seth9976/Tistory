package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class i extends SuspendLambda implements Function2 {
    public final boolean o;
    public final ContiguousPagedList p;
    public final boolean q;
    public final boolean r;

    public i(boolean z, ContiguousPagedList contiguousPagedList0, boolean z1, boolean z2, Continuation continuation0) {
        this.o = z;
        this.p = contiguousPagedList0;
        this.q = z1;
        this.r = z2;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i(this.o, this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ContiguousPagedList contiguousPagedList0 = this.p;
        if(this.o) {
            contiguousPagedList0.getBoundaryCallback$paging_common_release().onZeroItemsLoaded();
        }
        if(this.q) {
            contiguousPagedList0.o = true;
        }
        if(this.r) {
            contiguousPagedList0.p = true;
        }
        contiguousPagedList0.c(false);
        return Unit.INSTANCE;
    }
}

