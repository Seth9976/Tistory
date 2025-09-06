package z;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class z2 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final PointerInputScope q;
    public final Function3 r;
    public final Function1 s;
    public final PressGestureScopeImpl t;

    public z2(PointerInputScope pointerInputScope0, Function3 function30, Function1 function10, PressGestureScopeImpl pressGestureScopeImpl0, Continuation continuation0) {
        this.q = pointerInputScope0;
        this.r = function30;
        this.s = function10;
        this.t = pressGestureScopeImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new z2(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((z2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                y2 y20 = new y2(((CoroutineScope)this.p), this.r, this.s, this.t, null);
                this.o = 1;
                return ForEachGestureKt.awaitEachGesture(this.q, y20, this) == object1 ? object1 : Unit.INSTANCE;
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

