package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.SnapSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class ep extends SuspendLambda implements Function2 {
    public int o;
    public final ip p;
    public final float q;

    public ep(ip ip0, float f, Continuation continuation0) {
        this.p = ip0;
        this.q = f;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new ep(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((ep)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AnimationResult animationResult0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ip ip0 = this.p;
                Animatable animatable0 = ip0.q;
                if(animatable0 != null) {
                    Float float0 = Boxing.boxFloat(this.q);
                    SnapSpec snapSpec0 = ip0.p ? SwitchKt.f : SwitchKt.g;
                    this.o = 1;
                    object0 = Animatable.animateTo$default(animatable0, float0, snapSpec0, null, null, this, 12, null);
                    if(object0 == object1) {
                        return object1;
                    }
                    animationResult0 = (AnimationResult)object0;
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                animationResult0 = (AnimationResult)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

