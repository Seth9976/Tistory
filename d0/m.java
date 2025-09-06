package d0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class m extends SuspendLambda implements Function2 {
    public FiniteAnimationSpec o;
    public int p;
    public final LazyLayoutItemAnimation q;
    public final FiniteAnimationSpec r;
    public final long s;

    public m(LazyLayoutItemAnimation lazyLayoutItemAnimation0, FiniteAnimationSpec finiteAnimationSpec0, long v, Continuation continuation0) {
        this.q = lazyLayoutItemAnimation0;
        this.r = finiteAnimationSpec0;
        this.s = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new m(this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        LazyLayoutItemAnimation lazyLayoutItemAnimation0;
        long v;
        Object object1;
        try {
            object1 = a.getCOROUTINE_SUSPENDED();
            v = this.s;
            lazyLayoutItemAnimation0 = this.q;
            switch(this.p) {
                case 0: {
                    goto label_5;
                }
                case 1: {
                    goto label_17;
                }
                case 2: {
                    goto label_27;
                }
            }
        }
        catch(CancellationException unused_ex) {
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_5:
        ResultKt.throwOnFailure(object0);
        try {
            boolean z = lazyLayoutItemAnimation0.o.isRunning();
            FiniteAnimationSpec finiteAnimationSpec0 = this.r;
            if(z) {
                finiteAnimationSpec0 = finiteAnimationSpec0 instanceof SpringSpec ? ((SpringSpec)finiteAnimationSpec0) : LazyLayoutItemAnimationKt.a;
            }
            FiniteAnimationSpec finiteAnimationSpec1 = finiteAnimationSpec0;
            if(!lazyLayoutItemAnimation0.o.isRunning()) {
                IntOffset intOffset0 = IntOffset.box-impl(v);
                this.o = finiteAnimationSpec1;
                this.p = 1;
                if(lazyLayoutItemAnimation0.o.snapTo(intOffset0, this) == object1) {
                    return object1;
                label_17:
                    finiteAnimationSpec1 = this.o;
                    ResultKt.throwOnFailure(object0);
                }
                lazyLayoutItemAnimation0.c.invoke();
            }
            long v1 = IntOffset.minus-qkQi6aY(((IntOffset)lazyLayoutItemAnimation0.o.getValue()).unbox-impl(), v);
            IntOffset intOffset1 = IntOffset.box-impl(v1);
            l l0 = new l(0, v1, lazyLayoutItemAnimation0);
            this.o = null;
            this.p = 2;
            if(Animatable.animateTo$default(lazyLayoutItemAnimation0.o, intOffset1, finiteAnimationSpec1, null, l0, this, 4, null) == object1) {
                return object1;
            label_27:
                ResultKt.throwOnFailure(object0);
            }
            LazyLayoutItemAnimation.access$setPlacementAnimationInProgress(lazyLayoutItemAnimation0, false);
            lazyLayoutItemAnimation0.g = false;
        }
        catch(CancellationException unused_ex) {
        }
        return Unit.INSTANCE;
    }
}

