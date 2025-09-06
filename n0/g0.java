package n0;

import androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j0.h0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class g0 extends SuspendLambda implements Function2 {
    public int o;
    public final PointerInputScope p;
    public final TextFieldSelectionState q;
    public final boolean r;

    public g0(TextFieldSelectionState textFieldSelectionState0, PointerInputScope pointerInputScope0, boolean z, Continuation continuation0) {
        this.p = pointerInputScope0;
        this.q = textFieldSelectionState0;
        this.r = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g0(this.q, this.p, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                com.bumptech.glide.load.engine.g0 g00 = new com.bumptech.glide.load.engine.g0(this.q, this.r);
                h0 h00 = new h0(this.q, 4);
                this.o = 1;
                return PressDownGestureKt.detectPressDownGesture(this.p, g00, h00, this) == object1 ? object1 : Unit.INSTANCE;
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

