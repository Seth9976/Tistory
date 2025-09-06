package n0;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class w extends SuspendLambda implements Function3 {
    public int o;
    public PressGestureScope p;
    public long q;
    public final MutableInteractionSource r;
    public final TextFieldSelectionState s;

    public w(MutableInteractionSource mutableInteractionSource0, TextFieldSelectionState textFieldSelectionState0, Continuation continuation0) {
        this.r = mutableInteractionSource0;
        this.s = textFieldSelectionState0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        w w0 = new w(this.r, this.s, ((Continuation)object2));
        w0.p = (PressGestureScope)object0;
        w0.q = ((Offset)object1).unbox-impl();
        return w0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PressGestureScope pressGestureScope0 = this.p;
                long v = this.q;
                MutableInteractionSource mutableInteractionSource0 = this.r;
                if(mutableInteractionSource0 != null) {
                    v v1 = new v(pressGestureScope0, this.s, v, mutableInteractionSource0, null);
                    this.o = 1;
                    if(CoroutineScopeKt.coroutineScope(v1, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
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

