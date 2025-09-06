package p0;

import aa.r;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class s8 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final boolean q;
    public final float r;
    public final MutableState s;
    public final State t;
    public final CoroutineScope u;
    public final DraggableState v;
    public final State w;

    public s8(boolean z, float f, MutableState mutableState0, State state0, CoroutineScope coroutineScope0, DraggableState draggableState0, State state1, Continuation continuation0) {
        this.q = z;
        this.r = f;
        this.s = mutableState0;
        this.t = state0;
        this.u = coroutineScope0;
        this.v = draggableState0;
        this.w = state1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new s8(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s8)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                p8 p80 = new p8(this.q, this.r, this.s, this.t, null);
                r r0 = new r(this.u, this.v, 19, this.w);
                this.o = 1;
                return TapGestureDetectorKt.detectTapGestures$default(pointerInputScope0, null, null, p80, r0, this, 3, null) == object1 ? object1 : Unit.INSTANCE;
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

