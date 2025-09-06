package j0;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

public final class z1 extends SuspendLambda implements Function2 {
    public Object o;
    public final PointerInputScope p;
    public final TextDragObserver q;
    public final TextFieldSelectionManager r;

    public z1(PointerInputScope pointerInputScope0, TextDragObserver textDragObserver0, TextFieldSelectionManager textFieldSelectionManager0, Continuation continuation0) {
        this.p = pointerInputScope0;
        this.q = textDragObserver0;
        this.r = textFieldSelectionManager0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new z1(this.p, this.q, this.r, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((z1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        x1 x10 = new x1(this.p, this.q, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, x10, 1, null);
        y1 y10 = new y1(this.p, this.r, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, y10, 1, null);
        return Unit.INSTANCE;
    }
}

