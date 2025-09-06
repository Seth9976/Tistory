package z;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class s2 extends RestrictedSuspendLambda implements Function2 {
    public long p;
    public int q;
    public Object r;
    public final PointerInputChange s;

    public s2(PointerInputChange pointerInputChange0, Continuation continuation0) {
        this.s = pointerInputChange0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new s2(this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s2)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        long v;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                v = ((AwaitPointerEventScope)this.r).getViewConfiguration().getDoubleTapMinTimeMillis() + this.s.getUptimeMillis();
                goto label_12;
            }
            case 1: {
                v = this.p;
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(((PointerInputChange)object0).getUptimeMillis() >= v) {
                return (PointerInputChange)object0;
            }
        label_12:
            this.r = awaitPointerEventScope0;
            this.p = v;
            this.q = 1;
            object0 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, this, 3, null);
        }
        while(object0 != object1);
        return object1;
    }
}

