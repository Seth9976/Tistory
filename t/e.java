package t;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int o;
    public final Object p;
    public final Animatable q;
    public final State r;
    public final State s;

    public e(Object object0, Animatable animatable0, State state0, State state1, Continuation continuation0) {
        this.p = object0;
        this.q = animatable0;
        this.r = state0;
        this.s = state1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Animatable animatable0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Object object2 = animatable0.getTargetValue();
                if(!Intrinsics.areEqual(this.p, object2)) {
                    AnimationSpec animationSpec0 = AnimateAsStateKt.access$animateValueAsState$lambda$6(this.r);
                    this.o = 1;
                    if(Animatable.animateTo$default(this.q, this.p, animationSpec0, null, null, this, 12, null) == object1) {
                        return object1;
                    }
                    goto label_12;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_12:
                Function1 function10 = AnimateAsStateKt.access$animateValueAsState$lambda$4(this.s);
                if(function10 != null) {
                    function10.invoke(animatable0.getValue());
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

