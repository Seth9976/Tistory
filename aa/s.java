package aa;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;
import s4.i1;

public final class s extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final DecorationControllerInterface q;
    public final State r;
    public final DecorationStatus s;

    public s(DecorationControllerInterface decorationControllerInterface0, State state0, DecorationStatus decorationStatus0, Continuation continuation0) {
        this.q = decorationControllerInterface0;
        this.r = state0;
        this.s = decorationStatus0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new s(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                i1 i10 = new i1(this.q, this.r, null);
                r r0 = new r(this.s, this.q, 0, this.r);
                this.o = 1;
                return TapGestureDetectorKt.detectTapGestures$default(pointerInputScope0, null, null, i10, r0, this, 3, null) == object1 ? object1 : Unit.INSTANCE;
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

