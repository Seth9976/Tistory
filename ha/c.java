package ha;

import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.foundation.text.selection.a1;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.kakao.kandinsky.gesture.GestureInteraction;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final GestureInteraction q;

    public c(GestureInteraction gestureInteraction0, Continuation continuation0) {
        this.q = gestureInteraction0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                a1 a10 = new a1(this.q, 2);
                this.o = 1;
                return TransformGestureDetectorKt.detectTransformGestures$default(pointerInputScope0, false, a10, this, 1, null) == object1 ? object1 : Unit.INSTANCE;
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

