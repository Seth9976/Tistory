package u0;

import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.material.ripple.RippleAnimation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public int o;
    public final RippleAnimation p;
    public final c q;
    public final Press r;

    public b(RippleAnimation rippleAnimation0, c c0, Press pressInteraction$Press0, Continuation continuation0) {
        this.p = rippleAnimation0;
        this.q = c0;
        this.r = pressInteraction$Press0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Press pressInteraction$Press0 = this.r;
        c c0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    this.o = 1;
                    if(this.p.animate(this) == object1) {
                        return object1;
                    label_9:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    c0.g.remove(pressInteraction$Press0);
                    throw throwable0;
                }
            }
            case 1: {
                goto label_9;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        c0.g.remove(pressInteraction$Press0);
        return Unit.INSTANCE;
    }
}

