package aa;

import android.graphics.Matrix;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class y extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final MutableState q;
    public final DecorationControllerInterface r;
    public final Matrix s;
    public final State t;
    public final State u;

    public y(MutableState mutableState0, DecorationControllerInterface decorationControllerInterface0, Matrix matrix0, State state0, State state1, Continuation continuation0) {
        this.q = mutableState0;
        this.r = decorationControllerInterface0;
        this.s = matrix0;
        this.t = state0;
        this.u = state1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new y(this.q, this.r, this.s, this.t, this.u, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                t t0 = new t(this.q);
                u u0 = new u(this.r, this.s, this.t, this.q);
                v v0 = new v(this.r, this.s, this.t, this.q);
                x x0 = new x(0, this.q, this.u);
                this.o = 1;
                return DragGestureDetectorKt.detectDragGestures(pointerInputScope0, t0, u0, v0, x0, this) == object1 ? object1 : Unit.INSTANCE;
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

