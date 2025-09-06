package s;

import androidx.compose.animation.SizeAnimationModifierNode.AnimData;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.ui.unit.IntSize;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class n1 extends SuspendLambda implements Function2 {
    public int o;
    public final SizeAnimationModifierNode.AnimData p;
    public final long q;
    public final p1 r;

    public n1(SizeAnimationModifierNode.AnimData sizeAnimationModifierNode$AnimData0, long v, p1 p10, Continuation continuation0) {
        this.p = sizeAnimationModifierNode$AnimData0;
        this.q = v;
        this.r = p10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new n1(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        SizeAnimationModifierNode.AnimData sizeAnimationModifierNode$AnimData0 = this.p;
        p1 p10 = this.r;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                IntSize intSize0 = IntSize.box-impl(this.q);
                this.o = 1;
                object0 = Animatable.animateTo$default(sizeAnimationModifierNode$AnimData0.getAnim(), intSize0, p10.n, null, null, this, 12, null);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((AnimationResult)object0).getEndReason() == AnimationEndReason.Finished) {
            Function2 function20 = p10.p;
            if(function20 != null) {
                function20.invoke(IntSize.box-impl(sizeAnimationModifierNode$AnimData0.getStartSize-YbymL2g()), ((AnimationResult)object0).getEndState().getValue());
            }
        }
        return Unit.INSTANCE;
    }
}

