package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

public final class j extends SuspendLambda implements Function2 {
    public Object o;
    public final TextFieldSelectionState p;
    public final PointerInputScope q;

    public j(TextFieldSelectionState textFieldSelectionState0, PointerInputScope pointerInputScope0, Continuation continuation0) {
        this.p = textFieldSelectionState0;
        this.q = pointerInputScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j(this.p, this.q, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        g g0 = new g(this.p, this.q, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, g0, 1, null);
        h h0 = new h(this.p, this.q, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, h0, 1, null);
        i i0 = new i(this.p, this.q, null);
        return BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, i0, 1, null);
    }
}

