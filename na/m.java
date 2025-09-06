package na;

import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class m extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final MutableState q;
    public final MutableState r;
    public final MutableState s;
    public final MutableState t;
    public final MutableState u;

    public m(MutableState mutableState0, MutableState mutableState1, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation0) {
        this.q = mutableState0;
        this.r = mutableState1;
        this.s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m(this.q, this.r, this.s, this.t, this.u, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                l l0 = new l(this.q, this.r, this.s, this.t, this.u);
                this.o = 1;
                return TransformGestureDetectorKt.detectTransformGestures$default(pointerInputScope0, false, l0, this, 1, null) == object1 ? object1 : Unit.INSTANCE;
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

