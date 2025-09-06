package j0;

import aa.w;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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

public final class e3 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final CoroutineScope q;
    public final MutableState r;
    public final MutableInteractionSource s;
    public final State t;

    public e3(CoroutineScope coroutineScope0, MutableState mutableState0, MutableInteractionSource mutableInteractionSource0, State state0, Continuation continuation0) {
        this.q = coroutineScope0;
        this.r = mutableState0;
        this.s = mutableInteractionSource0;
        this.t = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e3(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e3)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                d3 d30 = new d3(this.q, this.r, this.s, null);
                w w0 = new w(this.t, 10);
                this.o = 1;
                return TapGestureDetectorKt.detectTapAndPress(pointerInputScope0, d30, w0, this) == object1 ? object1 : Unit.INSTANCE;
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

