package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.unit.IntOffset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class n extends SuspendLambda implements Function2 {
    public int o;
    public final LazyLayoutItemAnimation p;

    public n(LazyLayoutItemAnimation lazyLayoutItemAnimation0, Continuation continuation0) {
        this.p = lazyLayoutItemAnimation0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new n(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        LazyLayoutItemAnimation lazyLayoutItemAnimation0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                IntOffset intOffset0 = IntOffset.box-impl(0L);
                this.o = 1;
                if(lazyLayoutItemAnimation0.o.snapTo(intOffset0, this) == object1) {
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
        LazyLayoutItemAnimation.access$setPlacementDelta--gyyYBs(lazyLayoutItemAnimation0, 0L);
        LazyLayoutItemAnimation.access$setPlacementAnimationInProgress(lazyLayoutItemAnimation0, false);
        return Unit.INSTANCE;
    }
}

