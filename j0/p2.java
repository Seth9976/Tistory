package j0;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class p2 extends RestrictedSuspendLambda implements Function2 {
    public PointerInputChange p;
    public int q;
    public Object r;
    public final TextDragObserver s;

    public p2(TextDragObserver textDragObserver0, Continuation continuation0) {
        this.s = textDragObserver0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new p2(this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p2)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        PointerInputChange pointerInputChange0;
        AwaitPointerEventScope awaitPointerEventScope1;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        TextDragObserver textDragObserver0 = this.s;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                this.r = awaitPointerEventScope0;
                this.q = 1;
                object0 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, this, 2, null);
                if(object0 == object1) {
                    return object1;
                }
                textDragObserver0.onDown-k-4lQ0M(((PointerInputChange)object0).getPosition-F1C5BW0());
                awaitPointerEventScope1 = awaitPointerEventScope0;
                pointerInputChange0 = (PointerInputChange)object0;
                goto label_28;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                ResultKt.throwOnFailure(object0);
                textDragObserver0.onDown-k-4lQ0M(((PointerInputChange)object0).getPosition-F1C5BW0());
                awaitPointerEventScope1 = awaitPointerEventScope0;
                pointerInputChange0 = (PointerInputChange)object0;
                goto label_28;
            }
            case 2: {
                pointerInputChange0 = this.p;
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            List list0 = ((PointerEvent)object0).getChanges();
            int v = list0.size();
            int v1 = 0;
            while(true) {
                if(v1 >= v) {
                    break alab1;
                }
                PointerInputChange pointerInputChange1 = (PointerInputChange)list0.get(v1);
                if(!PointerId.equals-impl0(pointerInputChange1.getId-J3iCeTQ(), pointerInputChange0.getId-J3iCeTQ()) || !pointerInputChange1.getPressed()) {
                    ++v1;
                    continue;
                }
            label_28:
                this.r = awaitPointerEventScope1;
                this.p = pointerInputChange0;
                this.q = 2;
                object0 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, this, 1, null);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        textDragObserver0.onUp();
        return Unit.INSTANCE;
    }
}

