package u;

import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class j0 extends RestrictedSuspendLambda implements Function2 {
    public PointerEventPass p;
    public long q;
    public int r;
    public Object s;
    public final CoroutineScope t;
    public final BasicTooltipState u;

    public j0(CoroutineScope coroutineScope0, BasicTooltipState basicTooltipState0, Continuation continuation0) {
        this.t = coroutineScope0;
        this.u = basicTooltipState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j0(this.t, this.u, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j0)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope0;
        PointerEventPass pointerEventPass0;
        long v1;
        PointerEventPass pointerEventPass2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AwaitPointerEventScope awaitPointerEventScope1 = (AwaitPointerEventScope)this.s;
                long v = awaitPointerEventScope1.getViewConfiguration().getLongPressTimeoutMillis();
                PointerEventPass pointerEventPass1 = PointerEventPass.Initial;
                this.s = awaitPointerEventScope1;
                this.p = pointerEventPass1;
                this.q = v;
                this.r = 1;
                Object object2 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope1, false, pointerEventPass1, this, 1, null);
                if(object2 == object1) {
                    return object1;
                }
                awaitPointerEventScope2 = awaitPointerEventScope1;
                pointerEventPass2 = pointerEventPass1;
                object0 = object2;
                v1 = v;
                goto label_27;
            }
            case 1: {
                v1 = this.q;
                pointerEventPass2 = this.p;
                awaitPointerEventScope2 = (AwaitPointerEventScope)this.s;
                ResultKt.throwOnFailure(object0);
            label_27:
                int v2 = ((PointerInputChange)object0).getType-T8wyACA();
                if(PointerType.equals-impl0(v2, 1) || PointerType.equals-impl0(v2, 3)) {
                    try {
                        h0 h00 = new h0(pointerEventPass2, null);
                        this.s = awaitPointerEventScope2;
                        this.p = pointerEventPass2;
                        this.r = 2;
                        if(awaitPointerEventScope2.withTimeout(v1, h00, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    catch(PointerEventTimeoutCancellationException unused_ex) {
                        pointerEventPass0 = pointerEventPass2;
                        awaitPointerEventScope0 = awaitPointerEventScope2;
                    }
                label_37:
                    i0 i00 = new i0(this.u, null);
                    BuildersKt.launch$default(this.t, null, null, i00, 3, null);
                    this.s = null;
                    this.p = null;
                    this.r = 3;
                    object0 = awaitPointerEventScope0.awaitPointerEvent(pointerEventPass0, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_47;
                }
                break;
            }
            case 2: {
                pointerEventPass0 = this.p;
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                try {
                    ResultKt.throwOnFailure(object0);
                    return Unit.INSTANCE;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    goto label_37;
                }
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
            label_47:
                List list0 = ((PointerEvent)object0).getChanges();
                int v3 = list0.size();
                for(int v4 = 0; true; ++v4) {
                    if(v4 >= v3) {
                        break alab1;
                    }
                    ((PointerInputChange)list0.get(v4)).consume();
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

