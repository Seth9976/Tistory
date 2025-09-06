package s4;

import androidx.compose.foundation.text.selection.y0;
import androidx.paging.PagingData;
import androidx.paging.PagingDataPresenter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import qd.a;

public final class g1 extends SuspendLambda implements Function1 {
    public int o;
    public final PagingDataPresenter p;
    public final PagingData q;

    public g1(PagingDataPresenter pagingDataPresenter0, PagingData pagingData0, Continuation continuation0) {
        this.p = pagingDataPresenter0;
        this.q = pagingData0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new g1(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((g1)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.p.c = this.q.getUiReceiver$paging_common_release();
                y0 y00 = new y0(6, this.p, this.q);
                this.o = 1;
                return this.q.getFlow$paging_common_release().collect(y00, this) == object1 ? object1 : Unit.INSTANCE;
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

