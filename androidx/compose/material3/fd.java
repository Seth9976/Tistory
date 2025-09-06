package androidx.compose.material3;

import android.window.BackEvent;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.internal.PredictiveBack;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class fd extends SuspendLambda implements Function2 {
    public int o;
    public final Animatable p;
    public final BackEvent q;

    public fd(Animatable animatable0, BackEvent backEvent0, Continuation continuation0) {
        this.p = animatable0;
        this.q = backEvent0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new fd(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((fd)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = this.q.getProgress();
                Float float0 = Boxing.boxFloat(PredictiveBack.INSTANCE.transform$material3_release(f));
                this.o = 1;
                return this.p.snapTo(float0, this) == object1 ? object1 : Unit.INSTANCE;
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

