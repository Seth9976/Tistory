package androidx.paging;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class t extends SuspendLambda implements Function2 {
    public int o;
    public final LegacyPagingSource p;
    public final Params q;
    public final LoadParams r;

    public t(LegacyPagingSource legacyPagingSource0, Params dataSource$Params0, LoadParams pagingSource$LoadParams0, Continuation continuation0) {
        this.p = legacyPagingSource0;
        this.q = dataSource$Params0;
        this.r = pagingSource$LoadParams0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new t(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                object0 = this.p.getDataSource$paging_common_release().load$paging_common_release(this.q, this);
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
        List list0 = ((BaseResult)object0).data;
        Object object2 = !list0.isEmpty() || !(this.r instanceof Prepend) ? ((BaseResult)object0).getPrevKey() : null;
        return !((BaseResult)object0).data.isEmpty() || !(this.r instanceof Append) ? new Page(list0, object2, ((BaseResult)object0).getNextKey(), ((BaseResult)object0).getItemsBefore(), ((BaseResult)object0).getItemsAfter()) : new Page(list0, object2, null, ((BaseResult)object0).getItemsBefore(), ((BaseResult)object0).getItemsAfter());
    }
}

