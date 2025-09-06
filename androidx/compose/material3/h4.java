package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

public final class h4 extends SuspendLambda implements Function3 {
    public final int o;
    public long p;
    public final Object q;

    public h4(int v, Object object0, Continuation continuation0) {
        this.o = v;
        this.q = object0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        PressGestureScope pressGestureScope0 = (PressGestureScope)object0;
        long v = ((Offset)object1).unbox-impl();
        if(this.o != 0) {
            h4 h40 = new h4(1, ((SliderState)this.q), ((Continuation)object2));
            h40.p = v;
            return h40.invokeSuspend(Unit.INSTANCE);
        }
        h4 h41 = new h4(0, ((ClockDialNode)this.q), ((Continuation)object2));
        h41.p = v;
        return h41.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        if(this.o != 0) {
            ResultKt.throwOnFailure(object0);
            ((SliderState)this.q).onPress-k-4lQ0M$material3_release(this.p);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(object0);
        long v = this.p;
        ((ClockDialNode)this.q).s = Offset.getX-impl(v);
        ((ClockDialNode)this.q).t = Offset.getY-impl(v);
        return Unit.INSTANCE;
    }
}

