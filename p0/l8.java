package p0;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.material3.e9;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l8 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final PointerInputScope q;
    public final boolean r;
    public final float s;
    public final e9 t;
    public final State u;
    public final State v;
    public final State w;
    public final State x;

    public l8(PointerInputScope pointerInputScope0, boolean z, float f, e9 e90, State state0, State state1, State state2, State state3, Continuation continuation0) {
        this.q = pointerInputScope0;
        this.r = z;
        this.s = f;
        this.t = e90;
        this.u = state0;
        this.v = state1;
        this.w = state2;
        this.x = state3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new l8(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l8)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                k8 k80 = new k8(this.r, this.s, this.t, this.u, ((CoroutineScope)this.p), this.v, this.w, this.x, null);
                this.o = 1;
                return ForEachGestureKt.awaitEachGesture(this.q, k80, this) == object1 ? object1 : Unit.INSTANCE;
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

