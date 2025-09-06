package f0;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class d0 extends SuspendLambda implements Function2 {
    public int o;
    public final PagerState p;
    public final float q;
    public final int r;

    public d0(PagerState pagerState0, float f, int v, Continuation continuation0) {
        this.p = pagerState0;
        this.q = f;
        this.r = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d0(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d0)this.create(((ScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PagerState pagerState0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                if(PagerState.access$awaitScrollDependencies(pagerState0, this) == object1) {
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
        float f = this.q;
        if(-0.5 > ((double)f) || ((double)f) > 0.5) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        pagerState0.snapToItem$foundation_release(pagerState0.a(this.r), f, true);
        return Unit.INSTANCE;
    }
}

