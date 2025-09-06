package z;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i3 extends SuspendLambda implements Function2 {
    public int o;
    public final Function3 p;
    public final PressGestureScopeImpl q;
    public final PointerInputChange r;

    public i3(Function3 function30, PressGestureScopeImpl pressGestureScopeImpl0, PointerInputChange pointerInputChange0, Continuation continuation0) {
        this.p = function30;
        this.q = pressGestureScopeImpl0;
        this.r = pointerInputChange0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i3(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Offset offset0 = Offset.box-impl(this.r.getPosition-F1C5BW0());
                this.o = 1;
                return this.p.invoke(this.q, offset0, this) == object1 ? object1 : Unit.INSTANCE;
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

