package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.LongRef;
import qd.a;

public final class r0 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final long r;
    public final LongRef s;

    public r0(long v, LongRef ref$LongRef0, Continuation continuation0) {
        this.r = v;
        this.s = ref$LongRef0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new r0(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r0)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        LongRef ref$LongRef0 = this.s;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                q0 q00 = new q0(ref$LongRef0);
                this.q = awaitPointerEventScope0;
                this.p = 1;
                Object object2 = DragGestureDetectorKt.awaitTouchSlopOrCancellation-jO51t88(awaitPointerEventScope0, this.r, q00, this);
                if(object2 == object1) {
                    return object1;
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                object0 = object2;
                break;
            }
            case 1: {
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((PointerInputChange)object0) != null && OffsetKt.isSpecified-k-4lQ0M(ref$LongRef0.element)) {
            return l.b;
        }
        PointerInputChange pointerInputChange0 = (PointerInputChange)CollectionsKt___CollectionsKt.first(awaitPointerEventScope1.getCurrentEvent().getChanges());
        if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
            pointerInputChange0.consume();
            return l.a;
        }
        return l.d;
    }
}

