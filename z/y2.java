package z;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class y2 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final CoroutineScope r;
    public final Function3 s;
    public final Function1 t;
    public final PressGestureScopeImpl u;

    public y2(CoroutineScope coroutineScope0, Function3 function30, Function1 function10, PressGestureScopeImpl pressGestureScopeImpl0, Continuation continuation0) {
        this.r = coroutineScope0;
        this.s = function30;
        this.t = function10;
        this.u = pressGestureScopeImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new y2(this.r, this.s, this.t, this.u, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y2)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PressGestureScopeImpl pressGestureScopeImpl0 = this.u;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                u2 u20 = new u2(pressGestureScopeImpl0, null);
                BuildersKt.launch$default(this.r, null, null, u20, 3, null);
                this.q = awaitPointerEventScope0;
                this.p = 1;
                object0 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, this, 3, null);
                if(object0 == object1) {
                    return object1;
                }
                goto label_15;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
            label_15:
                ((PointerInputChange)object0).consume();
                Function3 function30 = this.s;
                if(function30 != TapGestureDetectorKt.a) {
                    v2 v20 = new v2(function30, pressGestureScopeImpl0, ((PointerInputChange)object0), null);
                    BuildersKt.launch$default(this.r, null, null, v20, 3, null);
                }
                this.q = null;
                this.p = 2;
                object0 = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope0, null, this, 1, null);
                if(object0 == object1) {
                    return object1;
                }
                goto label_26;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ResultKt.throwOnFailure(object0);
    label_26:
        if(((PointerInputChange)object0) == null) {
            w2 w20 = new w2(pressGestureScopeImpl0, null);
            BuildersKt.launch$default(this.r, null, null, w20, 3, null);
            return Unit.INSTANCE;
        }
        ((PointerInputChange)object0).consume();
        x2 x20 = new x2(pressGestureScopeImpl0, null);
        BuildersKt.launch$default(this.r, null, null, x20, 3, null);
        Function1 function10 = this.t;
        if(function10 != null) {
            function10.invoke(Offset.box-impl(((PointerInputChange)object0).getPosition-F1C5BW0()));
        }
        return Unit.INSTANCE;
    }
}

