package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class f4 extends SuspendLambda implements Function2 {
    public int o;
    public final ClockDialNode p;
    public final long q;

    public f4(ClockDialNode clockDialNode0, long v, Continuation continuation0) {
        this.p = clockDialNode0;
        this.q = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f4(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f4)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.p.s = Offset.getX-impl(this.q) + this.p.s;
                this.p.t = Offset.getY-impl(this.q) + this.p.t;
                this.o = 1;
                return AnalogTimePickerState.rotateTo$default(this.p.p, TimePickerKt.access$atan(this.p.t - ((float)IntOffset.getY-impl(this.p.u)), this.p.s - ((float)IntOffset.getX-impl(this.p.u))), false, this, 2, null) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

