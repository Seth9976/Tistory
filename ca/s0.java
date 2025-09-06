package ca;

import androidx.compose.foundation.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class s0 extends SuspendLambda implements Function2 {
    public int o;
    public final PagerState p;
    public final int q;

    public s0(PagerState pagerState0, int v, Continuation continuation0) {
        this.p = pagerState0;
        this.q = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s0(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PagerState pagerState0 = this.p;
                if(!pagerState0.isScrollInProgress()) {
                    int v = pagerState0.getTargetPage();
                    int v1 = this.q;
                    if(v != v1) {
                        Integer integer0 = Boxing.boxInt(v1).intValue() >= 0 ? Boxing.boxInt(v1) : null;
                        this.o = 1;
                        if(PagerState.animateScrollToPage$default(pagerState0, (integer0 == null ? 0 : ((int)integer0)), 0.0f, null, this, 6, null) == object1) {
                            return object1;
                        }
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

