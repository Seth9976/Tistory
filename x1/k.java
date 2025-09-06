package x1;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class k extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final Function1 r;

    public k(Function1 function10, Continuation continuation0) {
        this.r = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                goto label_11;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            MotionEvent motionEvent0 = ((PointerEvent)object0).getMotionEvent$ui_release();
            if(motionEvent0 != null) {
                this.r.invoke(motionEvent0);
            }
        label_11:
            this.q = awaitPointerEventScope0;
            this.p = 1;
            object0 = awaitPointerEventScope0.awaitPointerEvent(PointerEventPass.Initial, this);
        }
        while(object0 != object1);
        return object1;
    }
}

