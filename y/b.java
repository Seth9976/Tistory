package y;

import androidx.compose.foundation.draganddrop.DragAndDropSourceNode.1.1;
import androidx.compose.foundation.draganddrop.DragAndDropSourceNode;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final DragAndDropSourceNode q;
    public final DragAndDropModifierNode r;

    public b(DragAndDropSourceNode dragAndDropSourceNode0, DragAndDropModifierNode dragAndDropModifierNode0, Continuation continuation0) {
        this.q = dragAndDropSourceNode0;
        this.r = dragAndDropModifierNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                DragAndDropSourceNode.1.1 dragAndDropSourceNode$1$10 = new DragAndDropSourceNode.1.1(((PointerInputScope)this.p), this.r, this.q);
                this.o = 1;
                return this.q.getDragAndDropSourceHandler().invoke(dragAndDropSourceNode$1$10, this) == object1 ? object1 : Unit.INSTANCE;
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

