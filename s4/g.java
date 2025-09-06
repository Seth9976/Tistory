package s4;

import androidx.paging.AsyncPagingDataDiffer;
import androidx.paging.PagingData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class g extends SuspendLambda implements Function2 {
    public int o;
    public final AsyncPagingDataDiffer p;
    public final int q;
    public final PagingData r;

    public g(AsyncPagingDataDiffer asyncPagingDataDiffer0, int v, PagingData pagingData0, Continuation continuation0) {
        this.p = asyncPagingDataDiffer0;
        this.q = v;
        this.r = pagingData0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AsyncPagingDataDiffer asyncPagingDataDiffer0 = this.p;
                if(asyncPagingDataDiffer0.g.get() == this.q) {
                    this.o = 1;
                    if(asyncPagingDataDiffer0.getPresenter$paging_runtime_release().collectFrom(this.r, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
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

