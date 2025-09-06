package z;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class m extends SuspendLambda implements Function2 {
    public d o;
    public int p;
    public long q;
    public final d r;

    public m(d d0, Continuation continuation0) {
        this.r = d0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m(this.r, continuation0);
        continuation1.q = ((Velocity)object0).unbox-impl();
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(Velocity.box-impl(((Velocity)object0).unbox-impl()), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        long v1;
        d d1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        d d0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                long v = this.q;
                this.o = d0;
                this.q = v;
                this.p = 1;
                object0 = d0.x.settle((d0.y == Orientation.Vertical ? Velocity.getY-impl(v) : Velocity.getX-impl(v)), this);
                if(object0 == object1) {
                    return object1;
                }
                d1 = d0;
                v1 = v;
                break;
            }
            case 1: {
                v1 = this.q;
                d1 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        float f = ((Number)object0).floatValue();
        float f1 = d1.y == Orientation.Horizontal ? f : 0.0f;
        if(d1.y != Orientation.Vertical) {
            f = 0.0f;
        }
        long v2 = VelocityKt.Velocity(f1, f);
        float f2 = d0.x.requireOffset();
        float f3 = d0.x.getAnchors().minAnchor();
        if(f2 >= d0.x.getAnchors().maxAnchor() || f2 <= f3) {
            v1 = v2;
        }
        return Velocity.box-impl(v1);
    }
}

