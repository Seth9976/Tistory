package f0;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class i extends RestrictedSuspendLambda implements Function2 {
    public PointerInputChange p;
    public PointerInputChange q;
    public int r;
    public Object s;
    public final PagerState t;

    public i(PagerState pagerState0, Continuation continuation0) {
        this.t = pagerState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i(this.t, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        PointerInputChange pointerInputChange1;
        PointerInputChange pointerInputChange0;
        AwaitPointerEventScope awaitPointerEventScope1;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PagerState pagerState0 = this.t;
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                this.s = awaitPointerEventScope0;
                this.r = 1;
                object0 = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope0, false, PointerEventPass.Initial, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_13;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                ResultKt.throwOnFailure(object0);
            label_13:
                pagerState0.setUpDownDifference-k-4lQ0M$foundation_release(0L);
                awaitPointerEventScope1 = awaitPointerEventScope0;
                pointerInputChange0 = null;
                pointerInputChange1 = (PointerInputChange)object0;
                goto label_31;
            }
            case 2: {
                pointerInputChange0 = this.q;
                pointerInputChange1 = this.p;
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.s;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).getChanges();
            int v = list0.size();
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(PointerEventKt.changedToUp(((PointerInputChange)list0.get(v1)))) {
                        ++v1;
                        continue;
                    }
                    else {
                        break;
                    }
                }
                pointerInputChange0 = (PointerInputChange)((PointerEvent)object0).getChanges().get(0);
                break;
            }
        label_31:
            if(pointerInputChange0 != null) {
                break;
            }
            this.s = awaitPointerEventScope1;
            this.p = pointerInputChange1;
            this.q = null;
            this.r = 2;
            object0 = awaitPointerEventScope1.awaitPointerEvent(PointerEventPass.Initial, this);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        pagerState0.setUpDownDifference-k-4lQ0M$foundation_release(Offset.minus-MK-Hz9U(pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange1.getPosition-F1C5BW0()));
        return Unit.INSTANCE;
    }
}

