package w0;

import androidx.compose.material3.TooltipState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class o0 extends RestrictedSuspendLambda implements Function2 {
    public PointerEventPass p;
    public int q;
    public Object r;
    public final CoroutineScope s;
    public final TooltipState t;

    public o0(CoroutineScope coroutineScope0, TooltipState tooltipState0, Continuation continuation0) {
        this.s = coroutineScope0;
        this.t = tooltipState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new o0(this.s, this.t, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o0)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope0;
        PointerEventPass pointerEventPass0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                pointerEventPass0 = PointerEventPass.Main;
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                goto label_19;
            }
            case 1: {
                pointerEventPass0 = this.p;
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(PointerType.equals-impl0(((PointerInputChange)((PointerEvent)object0).getChanges().get(0)).getType-T8wyACA(), 2)) {
                int v = ((PointerEvent)object0).getType-7fucELk();
                TooltipState tooltipState0 = this.t;
                if(PointerEventType.equals-impl0(v, 4)) {
                    n0 n00 = new n0(tooltipState0, null);
                    BuildersKt.launch$default(this.s, null, null, n00, 3, null);
                }
                else if(PointerEventType.equals-impl0(v, 5)) {
                    tooltipState0.dismiss();
                }
            }
        label_19:
            this.r = awaitPointerEventScope0;
            this.p = pointerEventPass0;
            this.q = 1;
            object0 = awaitPointerEventScope0.awaitPointerEvent(pointerEventPass0, this);
        }
        while(object0 != object1);
        return object1;
    }
}

