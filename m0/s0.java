package m0;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j0.t1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class s0 extends SuspendLambda implements Function2 {
    public int o;
    public final TextFieldDecoratorModifierNode p;
    public final TextFieldSelectionState q;
    public final PointerInputScope r;
    public final t1 s;

    public s0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0, TextFieldSelectionState textFieldSelectionState0, PointerInputScope pointerInputScope0, t1 t10, Continuation continuation0) {
        this.p = textFieldDecoratorModifierNode0;
        this.q = textFieldSelectionState0;
        this.r = pointerInputScope0;
        this.s = t10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s0(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                l0 l00 = new l0(this.p, 8);
                this.o = 1;
                return this.q.detectTextFieldTapGestures(this.r, this.p.getInteractionSource(), this.s, l00, this) == object1 ? object1 : Unit.INSTANCE;
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

