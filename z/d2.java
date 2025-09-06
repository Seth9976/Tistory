package z;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import qd.a;

public final class d2 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final ScrollingLogic q;
    public final long r;
    public final FloatRef s;

    public d2(ScrollingLogic scrollingLogic0, long v, FloatRef ref$FloatRef0, Continuation continuation0) {
        this.q = scrollingLogic0;
        this.r = v;
        this.s = ref$FloatRef0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d2(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d2)this.create(((NestedScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                NestedScrollScope nestedScrollScope0 = (NestedScrollScope)this.p;
                float f = this.q.toFloat-k-4lQ0M(this.r);
                c2 c20 = new c2(this.s, this.q, nestedScrollScope0);
                this.o = 1;
                return SuspendAnimationKt.animate$default(0.0f, f, 0.0f, null, c20, this, 12, null) == object1 ? object1 : Unit.INSTANCE;
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

