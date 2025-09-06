package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class x9 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final String r;
    public final Function0 s;

    public x9(String s, Function0 function00, Continuation continuation0) {
        this.r = s;
        this.s = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new x9(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((x9)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
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
                object0 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, PointerEventPass.Initial, this, 1, null);
                if(object0 == object1) {
                    return object1;
                }
                goto label_12;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
            label_12:
                if(MenuAnchorType.equals-impl0(this.r, "SecondaryEditable")) {
                    ((PointerInputChange)object0).consume();
                }
                this.q = null;
                this.p = 2;
                object0 = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope0, PointerEventPass.Initial, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_20;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ResultKt.throwOnFailure(object0);
    label_20:
        if(((PointerInputChange)object0) != null) {
            this.s.invoke();
        }
        return Unit.INSTANCE;
    }
}

