package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class l0 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final k r;
    public final MouseSelectionObserver s;
    public final TextDragObserver t;

    public l0(TextDragObserver textDragObserver0, k k0, MouseSelectionObserver mouseSelectionObserver0, Continuation continuation0) {
        this.r = k0;
        this.s = mouseSelectionObserver0;
        this.t = textDragObserver0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new l0(this.t, this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l0)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                this.q = awaitPointerEventScope0;
                this.p = 1;
                object0 = SelectionGesturesKt.access$awaitDown(awaitPointerEventScope0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        k k0 = this.r;
        k0.a(((PointerEvent)object0));
        boolean z = SelectionGesturesKt.isPrecisePointer(((PointerEvent)object0));
        if(!z || !PointerEvent_androidKt.isPrimaryPressed-aHzCx-E(((PointerEvent)object0).getButtons-ry648PA())) {
        label_30:
            if(!z) {
                TextDragObserver textDragObserver0 = this.t;
                if(k0.b == 1) {
                    this.q = null;
                    this.p = 3;
                    if(SelectionGesturesKt.access$touchSelectionFirstPress(awaitPointerEventScope0, textDragObserver0, ((PointerEvent)object0), this) == object1) {
                        return object1;
                    }
                }
                else {
                    this.q = null;
                    this.p = 4;
                    if(SelectionGesturesKt.access$touchSelectionSubsequentPress(awaitPointerEventScope0, textDragObserver0, ((PointerEvent)object0), this) == object1) {
                        return object1;
                    }
                }
            }
        }
        else {
            List list0 = ((PointerEvent)object0).getChanges();
            int v = list0.size();
            int v1 = 0;
            while(v1 < v) {
                if(((PointerInputChange)list0.get(v1)).isConsumed()) {
                    goto label_30;
                }
                ++v1;
            }
            this.q = null;
            this.p = 2;
            if(SelectionGesturesKt.access$mouseSelectionBtf2(awaitPointerEventScope0, this.s, k0, ((PointerEvent)object0), this) == object1) {
                return object1;
            }
        }
        return Unit.INSTANCE;
    }
}

