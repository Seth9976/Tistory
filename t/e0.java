package t;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.material3.y3;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class e0 extends SuspendLambda implements Function2 {
    public float o;
    public int p;
    public Object q;
    public final Transition r;

    public e0(Transition transition0, Continuation continuation0) {
        this.r = transition0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e0(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope1;
        float f;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.q;
                f = SuspendAnimationKt.getDurationScale(coroutineScope0.getCoroutineContext());
                coroutineScope1 = coroutineScope0;
                break;
            }
            case 1: {
                f = this.o;
                coroutineScope1 = (CoroutineScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(CoroutineScopeKt.isActive(coroutineScope1)) {
            y3 y30 = new y3(this.r, f, 5);
            this.q = coroutineScope1;
            this.o = f;
            this.p = 1;
            if(MonotonicFrameClockKt.withFrameNanos(y30, this) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}

