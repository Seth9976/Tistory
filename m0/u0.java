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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

public final class u0 extends SuspendLambda implements Function2 {
    public Object o;
    public final TextFieldDecoratorModifierNode p;
    public final PointerInputScope q;

    public u0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0, PointerInputScope pointerInputScope0, Continuation continuation0) {
        this.p = textFieldDecoratorModifierNode0;
        this.q = pointerInputScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new u0(this.p, this.q, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        TextFieldSelectionState textFieldSelectionState0 = this.p.getTextFieldSelectionState();
        t1 t10 = new t1(9, textFieldSelectionState0, this.p);
        r0 r00 = new r0(textFieldSelectionState0, this.q, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, r00, 1, null);
        s0 s00 = new s0(this.p, textFieldSelectionState0, this.q, t10, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, s00, 1, null);
        t0 t00 = new t0(textFieldSelectionState0, this.q, t10, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, t00, 1, null);
        return Unit.INSTANCE;
    }
}

