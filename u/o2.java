package u;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class o2 extends SuspendLambda implements Function2 {
    public AnimationSpec o;
    public int p;
    public Object q;
    public final q2 r;

    public o2(q2 q20, Continuation continuation0) {
        this.r = q20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new o2(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o2)this.create(((Float)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable0;
        AnimationSpec animationSpec1;
        Float float0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        q2 q20 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Float float1 = (Float)this.q;
                if(float1 == null) {
                    return Unit.INSTANCE;
                }
                animationSpec1 = BasicMarqueeKt.access$createMarqueeAnimationSpec-Z4HSEVQ(q20.n, ((float)float1), q20.p, q20.o, q20.q, DelegatableNodeKt.requireDensity(q20));
                this.q = float1;
                this.o = animationSpec1;
                this.p = 1;
                if(q20.x.snapTo(Boxing.boxFloat(0.0f), this) == object1) {
                    return object1;
                }
                float0 = float1;
                try {
                label_27:
                    this.q = null;
                    this.o = null;
                    this.p = 2;
                    if(Animatable.animateTo$default(q20.x, float0, animationSpec1, null, null, this, 12, null) == object1) {
                        return object1;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                label_33:
                    this.q = throwable0;
                    this.o = null;
                    this.p = 4;
                    if(q20.x.snapTo(Boxing.boxFloat(0.0f), this) == object1) {
                        return object1;
                    }
                }
                throw throwable0;
            }
            case 1: {
                AnimationSpec animationSpec0 = this.o;
                float0 = (Float)this.q;
                ResultKt.throwOnFailure(object0);
                animationSpec1 = animationSpec0;
                goto label_27;
            }
            case 2: {
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 4: {
                throwable0 = (Throwable)this.q;
                ResultKt.throwOnFailure(object0);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.p = 3;
        return q20.x.snapTo(Boxing.boxFloat(0.0f), this) == object1 ? object1 : Unit.INSTANCE;
    }
}

