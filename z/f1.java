package z;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.j;
import androidx.compose.foundation.gestures.k;
import androidx.compose.foundation.gestures.l;
import androidx.compose.foundation.gestures.m;
import androidx.compose.foundation.gestures.n;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class f1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final DragGestureNode q;

    public f1(DragGestureNode dragGestureNode0, Continuation continuation0) {
        this.q = dragGestureNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f1(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f1)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                VelocityTracker velocityTracker0 = new VelocityTracker();
                n n0 = new n(this.q);
                m m0 = new m(velocityTracker0, this.q);
                l l0 = new l(this.q);
                w1.a a0 = new w1.a(this.q, 7);
                k k0 = new k(velocityTracker0, this.q);
                j j0 = new j(this.q, pointerInputScope0, n0, m0, l0, a0, k0, null);
                this.o = 1;
                return CoroutineScopeKt.coroutineScope(j0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

