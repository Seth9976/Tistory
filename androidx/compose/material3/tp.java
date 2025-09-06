package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class tp extends SuspendLambda implements Function2 {
    public int o;
    public final AnalogTimePickerState p;
    public final float q;
    public final boolean r;
    public final MutableState s;
    public final MutableState t;

    public tp(AnalogTimePickerState analogTimePickerState0, float f, boolean z, MutableState mutableState0, MutableState mutableState1, Continuation continuation0) {
        this.p = analogTimePickerState0;
        this.q = f;
        this.r = z;
        this.s = mutableState0;
        this.t = mutableState1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new tp(this.p, this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((tp)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = Offset.getX-impl(TimePickerKt.access$ClockText$lambda$29(this.s));
                float f1 = Offset.getY-impl(TimePickerKt.access$ClockText$lambda$29(this.s));
                long v = TimePickerKt.access$ClockText$lambda$32(this.t);
                this.o = 1;
                return TimePickerKt.access$onTap-rOwcSBo(this.p, f, f1, this.q, this.r, v, this) == object1 ? object1 : Unit.INSTANCE;
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

