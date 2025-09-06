package t0;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material.pullrefresh.PullRefreshState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import qd.a;

public final class j extends SuspendLambda implements Function1 {
    public int o;
    public final PullRefreshState p;
    public final float q;

    public j(PullRefreshState pullRefreshState0, float f, Continuation continuation0) {
        this.p = pullRefreshState0;
        this.q = f;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new j(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((j)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = PullRefreshState.access$get_position(this.p);
                b1 b10 = new b1(this.p, 20);
                this.o = 1;
                return SuspendAnimationKt.animate$default(f, this.q, 0.0f, null, b10, this, 12, null) == object1 ? object1 : Unit.INSTANCE;
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

