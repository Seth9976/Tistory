package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import qd.a;

public final class q extends SuspendLambda implements Function1 {
    public int o;
    public final AnalogTimePickerState p;
    public final float q;
    public final boolean r;

    public q(AnalogTimePickerState analogTimePickerState0, float f, boolean z, Continuation continuation0) {
        this.p = analogTimePickerState0;
        this.q = f;
        this.r = z;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new q(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((q)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AnalogTimePickerState analogTimePickerState0 = this.p;
                int v = analogTimePickerState0.getSelection-yecRtBI();
                float f = this.q;
                if(TimePickerSelectionMode.equals-impl0(v, 0)) {
                    int v1 = 12;
                    analogTimePickerState0.b = ((float)(AnalogTimePickerState.access$toHour(analogTimePickerState0, f) % 12)) * 0.523599f;
                    TimePickerState timePickerState0 = analogTimePickerState0.getState();
                    int v2 = AnalogTimePickerState.access$toHour(analogTimePickerState0, analogTimePickerState0.b);
                    if(!analogTimePickerState0.isAfternoon()) {
                        v1 = 0;
                    }
                    timePickerState0.setHour(v2 % 12 + v1);
                }
                else {
                    analogTimePickerState0.c = ((float)AnalogTimePickerState.access$toMinute(analogTimePickerState0, f)) * 0.10472f;
                    analogTimePickerState0.getState().setMinute(AnalogTimePickerState.access$toMinute(analogTimePickerState0, analogTimePickerState0.c));
                }
                if(!this.r) {
                    Float float0 = Boxing.boxFloat(AnalogTimePickerState.access$offsetAngle(analogTimePickerState0, f));
                    this.o = 1;
                    return analogTimePickerState0.d.snapTo(float0, this) == object1 ? object1 : Unit.INSTANCE;
                }
                Float float1 = Boxing.boxFloat(analogTimePickerState0.a(AnalogTimePickerState.access$offsetAngle(analogTimePickerState0, f)));
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null);
                this.o = 2;
                object0 = Animatable.animateTo$default(analogTimePickerState0.d, float1, springSpec0, null, null, this, 12, null);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

