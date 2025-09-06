package z;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.unit.Velocity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class n extends SuspendLambda implements Function2 {
    public d o;
    public int p;
    public final d q;
    public final long r;

    public n(d d0, long v, Continuation continuation0) {
        this.q = d0;
        this.r = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new n(this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                d d0 = this.q;
                OverscrollEffect overscrollEffect0 = d0.A;
                long v = this.r;
                if(overscrollEffect0 == null) {
                    AnchoredDraggableState anchoredDraggableState0 = d0.x;
                    long v1 = d0.c() ? Velocity.times-adjELrA(v, -1.0f) : Velocity.times-adjELrA(v, 1.0f);
                    this.o = d0;
                    this.p = 1;
                    Object object2 = anchoredDraggableState0.settle((d0.y == Orientation.Vertical ? Velocity.getY-impl(v1) : Velocity.getX-impl(v1)), this);
                    if(object2 == object1) {
                        return object1;
                    }
                    object0 = object2;
                    break;
                }
                Intrinsics.checkNotNull(overscrollEffect0);
                long v2 = d0.c() ? Velocity.times-adjELrA(v, -1.0f) : Velocity.times-adjELrA(v, 1.0f);
                m m0 = new m(d0, null);
                this.p = 2;
                return overscrollEffect0.applyToFling-BMRW4eQ(v2, m0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((Number)object0).floatValue();
        return Unit.INSTANCE;
    }
}

