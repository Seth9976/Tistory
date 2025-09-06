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

public final class j extends SuspendLambda implements Function2 {
    public int o;
    public final boolean p;
    public final LazyLayoutItemAnimation q;
    public final FiniteAnimationSpec r;
    public final GraphicsLayer s;

    public j(boolean z, LazyLayoutItemAnimation lazyLayoutItemAnimation0, FiniteAnimationSpec finiteAnimationSpec0, GraphicsLayer graphicsLayer0, Continuation continuation0) {
        this.p = z;
        this.q = lazyLayoutItemAnimation0;
        this.r = finiteAnimationSpec0;
        this.s = graphicsLayer0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        LazyLayoutItemAnimation lazyLayoutItemAnimation0;
        Object object1;
        try {
            object1 = a.getCOROUTINE_SUSPENDED();
            lazyLayoutItemAnimation0 = this.q;
            switch(this.o) {
                case 0: {
                    goto label_4;
                }
                case 1: {
                    goto label_9;
                }
                case 2: {
                    goto label_14;
                }
            }
        }
        catch(Throwable throwable0) {
            LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(lazyLayoutItemAnimation0, false);
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_4:
        ResultKt.throwOnFailure(object0);
        try {
            if(this.p) {
                this.o = 1;
                if(lazyLayoutItemAnimation0.p.snapTo(Boxing.boxFloat(0.0f), this) == object1) {
                    return object1;
                label_9:
                    ResultKt.throwOnFailure(object0);
                }
            }
            i i0 = new i(this.s, lazyLayoutItemAnimation0, 0);
            this.o = 2;
            if(Animatable.animateTo$default(lazyLayoutItemAnimation0.p, Boxing.boxFloat(1.0f), this.r, null, i0, this, 4, null) == object1) {
                return object1;
            label_14:
                ResultKt.throwOnFailure(object0);
            }
        }
        catch(Throwable throwable0) {
            LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(lazyLayoutItemAnimation0, false);
            throw throwable0;
        }
        LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(lazyLayoutItemAnimation0, false);
        return Unit.INSTANCE;
    }
}

