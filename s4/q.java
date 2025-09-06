package s4;

import androidx.paging.ContiguousPagedList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class q extends SuspendLambda implements Function2 {
    public final ContiguousPagedList o;
    public final boolean p;
    public final boolean q;

    public q(ContiguousPagedList contiguousPagedList0, boolean z, boolean z1, Continuation continuation0) {
        this.o = contiguousPagedList0;
        this.p = z;
        this.q = z1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new q(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.o.a(this.p, this.q);
        return Unit.INSTANCE;
    }
}

