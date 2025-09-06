package o6;

import com.google.accompanist.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;

public final class d extends SuspendLambda implements Function2 {
    public final PagerState o;
    public final int p;

    public d(PagerState pagerState0, int v, Continuation continuation0) {
        this.o = pagerState0;
        this.p = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        int v = this.o.getCurrentPage();
        this.o.setCurrentPage$pager_release(c.coerceAtLeast(Math.min(this.p - 1, v), 0));
        return Unit.INSTANCE;
    }
}

