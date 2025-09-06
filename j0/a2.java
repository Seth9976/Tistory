package j0;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class a2 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final TextDragObserver q;
    public final TextFieldSelectionManager r;

    public a2(TextDragObserver textDragObserver0, TextFieldSelectionManager textFieldSelectionManager0, Continuation continuation0) {
        this.q = textDragObserver0;
        this.r = textFieldSelectionManager0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a2(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a2)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                z1 z10 = new z1(((PointerInputScope)this.p), this.q, this.r, null);
                this.o = 1;
                return CoroutineScopeKt.coroutineScope(z10, this) == object1 ? object1 : Unit.INSTANCE;
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

