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

public final class i0 extends SuspendLambda implements Function2 {
    public Object o;
    public final TextFieldSelectionState p;
    public final PointerInputScope q;
    public final boolean r;

    public i0(TextFieldSelectionState textFieldSelectionState0, PointerInputScope pointerInputScope0, boolean z, Continuation continuation0) {
        this.p = textFieldSelectionState0;
        this.q = pointerInputScope0;
        this.r = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i0(this.p, this.q, this.r, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        f0 f00 = new f0(this.p, this.q, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, f00, 1, null);
        g0 g00 = new g0(this.p, this.q, this.r, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, g00, 1, null);
        h0 h00 = new h0(this.p, this.q, this.r, null);
        return BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, h00, 1, null);
    }
}

