package j0;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

public final class m2 extends SuspendLambda implements Function2 {
    public Object o;
    public final PointerInputScope p;
    public final TextDragObserver q;

    public m2(PointerInputScope pointerInputScope0, TextDragObserver textDragObserver0, Continuation continuation0) {
        this.p = pointerInputScope0;
        this.q = textDragObserver0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m2(this.p, this.q, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        k2 k20 = new k2(this.p, this.q, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, k20, 1, null);
        l2 l20 = new l2(this.p, this.q, null);
        return BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, l20, 1, null);
    }
}

