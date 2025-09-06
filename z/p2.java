package z;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.unit.Velocity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class p2 extends SuspendLambda implements Function2 {
    public long o;
    public int p;
    public long q;
    public final ScrollingLogic r;

    public p2(ScrollingLogic scrollingLogic0, Continuation continuation0) {
        this.r = scrollingLogic0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new p2(this.r, continuation0);
        continuation1.q = ((Velocity)object0).unbox-impl();
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p2)this.create(Velocity.box-impl(((Velocity)object0).unbox-impl()), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        long v4;
        Object object3;
        Object object2;
        long v2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ScrollingLogic scrollingLogic0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                v2 = this.q;
                this.q = v2;
                this.p = 1;
                object2 = scrollingLogic0.f.dispatchPreFling-QWom1Mo(v2, this);
                if(object2 == object1) {
                    return object1;
                }
                goto label_18;
            }
            case 1: {
                v2 = this.q;
                ResultKt.throwOnFailure(object0);
                object2 = object0;
            label_18:
                long v3 = Velocity.minus-AH228Gc(v2, ((Velocity)object2).unbox-impl());
                this.q = v2;
                this.o = v3;
                this.p = 2;
                object3 = scrollingLogic0.doFlingAnimation-QWom1Mo(v3, this);
                if(object3 == object1) {
                    return object1;
                }
                v4 = v3;
                break;
            }
            case 2: {
                v4 = this.o;
                v2 = this.q;
                ResultKt.throwOnFailure(object0);
                object3 = object0;
                break;
            }
            case 3: {
                long v = this.o;
                long v1 = this.q;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(Velocity.minus-AH228Gc(v1, Velocity.minus-AH228Gc(v, ((Velocity)object0).unbox-impl())));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v5 = ((Velocity)object3).unbox-impl();
        this.q = v2;
        this.o = v5;
        this.p = 3;
        Object object4 = scrollingLogic0.f.dispatchPostFling-RZ2iAVY(Velocity.minus-AH228Gc(v4, v5), v5, this);
        return object4 == object1 ? object1 : Velocity.box-impl(Velocity.minus-AH228Gc(v2, Velocity.minus-AH228Gc(v5, ((Velocity)object4).unbox-impl())));
    }
}

