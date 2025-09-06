package s4;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.runtime.State;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

public final class i1 extends SuspendLambda implements Function3 {
    public final int o;
    public Object p;
    public final Object q;

    public i1(int v, Object object0, Continuation continuation0) {
        this.o = v;
        this.q = object0;
        super(3, continuation0);
    }

    public i1(DecorationControllerInterface decorationControllerInterface0, State state0, Continuation continuation0) {
        this.o = 2;
        this.p = decorationControllerInterface0;
        this.q = state0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.o) {
            case 0: {
                i1 i10 = new i1(0, this.q, ((Continuation)object2));
                i10.p = object1;
                return i10.invokeSuspend(Unit.INSTANCE);
            }
            case 1: {
                i1 i11 = new i1(1, this.q, ((Continuation)object2));
                i11.p = object0;
                return i11.invokeSuspend(Unit.INSTANCE);
            }
            default: {
                PressGestureScope pressGestureScope0 = (PressGestureScope)object0;
                return new i1(((DecorationControllerInterface)this.p), ((State)this.q), ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
            }
        }
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                return this.p == null ? this.q : null;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return this.p == null ? this.q : null;
            }
            default: {
                ResultKt.throwOnFailure(object0);
                Object object1 = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$12(((State)this.q));
                ((DecorationControllerInterface)this.p).onPress(object1);
                return Unit.INSTANCE;
            }
        }
    }
}

