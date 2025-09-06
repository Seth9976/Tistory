package androidx.paging;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class r0 extends SuspendLambda implements Function2 {
    public int o;
    public final PagingSource p;
    public final Refresh q;

    public r0(PagingSource pagingSource0, Refresh pagingSource$LoadParams$Refresh0, Continuation continuation0) {
        this.p = pagingSource0;
        this.q = pagingSource$LoadParams$Refresh0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r0(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                object0 = this.p.load(this.q, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((LoadResult)object0) instanceof Page) {
            return (Page)(((LoadResult)object0));
        }
        if(((LoadResult)object0) instanceof Error) {
            throw ((Error)(((LoadResult)object0))).getThrowable();
        }
        if(!(((LoadResult)object0) instanceof Invalid)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
    }
}

