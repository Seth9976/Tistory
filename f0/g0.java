package f0;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.c;
import qd.a;

public final class g0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Function2 q;
    public final int r;
    public final LazyLayoutAnimateScrollScope s;
    public final float t;
    public final AnimationSpec u;

    public g0(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0, int v, float f, AnimationSpec animationSpec0, Function2 function20, Continuation continuation0) {
        this.q = function20;
        this.r = v;
        this.s = lazyLayoutAnimateScrollScope0;
        this.t = f;
        this.u = animationSpec0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g0(this.s, this.r, this.t, this.u, this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g0)this.create(((ScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ScrollScope scrollScope0 = (ScrollScope)this.p;
                int v = this.r;
                this.q.invoke(scrollScope0, Boxing.boxInt(v));
                LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0 = this.s;
                boolean z = v > lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex();
                int v1 = lazyLayoutAnimateScrollScope0.getLastVisibleItemIndex() - lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex() + 1;
                if((z && v > lazyLayoutAnimateScrollScope0.getLastVisibleItemIndex() || !z && v < lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex()) && Math.abs(v - lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex()) >= 3) {
                    lazyLayoutAnimateScrollScope0.snapToItem(scrollScope0, (z ? c.coerceAtLeast(v - v1, lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex()) : c.coerceAtMost(v1 + v, lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex())), 0);
                }
                float f = lazyLayoutAnimateScrollScope0.calculateDistanceTo(v);
                f0 f00 = new f0(new FloatRef(), scrollScope0);
                this.o = 1;
                return SuspendAnimationKt.animate$default(0.0f, f + this.t, 0.0f, this.u, f00, this, 4, null) == object1 ? object1 : Unit.INSTANCE;
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

