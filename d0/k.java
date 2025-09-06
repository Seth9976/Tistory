package d0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k extends SuspendLambda implements Function2 {
    public int o;
    public final LazyLayoutItemAnimation p;
    public final FiniteAnimationSpec q;
    public final GraphicsLayer r;

    public k(LazyLayoutItemAnimation lazyLayoutItemAnimation0, FiniteAnimationSpec finiteAnimationSpec0, GraphicsLayer graphicsLayer0, Continuation continuation0) {
        this.p = lazyLayoutItemAnimation0;
        this.q = finiteAnimationSpec0;
        this.r = graphicsLayer0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        LazyLayoutItemAnimation lazyLayoutItemAnimation0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    i i0 = new i(this.r, lazyLayoutItemAnimation0, 1);
                    this.o = 1;
                    if(Animatable.animateTo$default(lazyLayoutItemAnimation0.p, Boxing.boxFloat(0.0f), this.q, null, i0, this, 4, null) == object1) {
                        return object1;
                    label_9:
                        ResultKt.throwOnFailure(object0);
                    }
                    LazyLayoutItemAnimation.access$setDisappearanceAnimationFinished(lazyLayoutItemAnimation0, true);
                    goto label_15;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            case 1: {
                goto label_9;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        LazyLayoutItemAnimation.access$setDisappearanceAnimationInProgress(lazyLayoutItemAnimation0, false);
        throw throwable0;
    label_15:
        LazyLayoutItemAnimation.access$setDisappearanceAnimationInProgress(lazyLayoutItemAnimation0, false);
        return Unit.INSTANCE;
    }
}

