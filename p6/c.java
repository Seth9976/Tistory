package p6;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.x;
import androidx.compose.runtime.MutableState;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public final SwipeRefreshState p;
    public final int q;
    public final float r;
    public final MutableState s;

    public c(SwipeRefreshState swipeRefreshState0, int v, float f, MutableState mutableState0, Continuation continuation0) {
        this.p = swipeRefreshState0;
        this.q = v;
        this.r = f;
        this.s = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = SwipeRefreshIndicatorKt.access$SwipeRefreshIndicator__UAkqwU$lambda$4(this.s);
                float f1 = this.p.isRefreshing() ? ((float)this.q) + this.r : 0.0f;
                x x0 = new x(this.s, 7);
                this.o = 1;
                return SuspendAnimationKt.animate$default(f, f1, 0.0f, null, x0, this, 12, null) == object1 ? object1 : Unit.INSTANCE;
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

