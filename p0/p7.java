package p0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class p7 extends SuspendLambda implements Function2 {
    public int o;
    public final float p;
    public final float q;
    public final Function0 r;
    public final boolean s;
    public final MutableFloatState t;
    public final MutableFloatState u;
    public final State v;
    public final FloatRef w;
    public final FloatRef x;
    public final ClosedFloatingPointRange y;

    public p7(float f, float f1, Function0 function00, boolean z, MutableFloatState mutableFloatState0, MutableFloatState mutableFloatState1, State state0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, ClosedFloatingPointRange closedFloatingPointRange0, Continuation continuation0) {
        this.p = f;
        this.q = f1;
        this.r = function00;
        this.s = z;
        this.t = mutableFloatState0;
        this.u = mutableFloatState1;
        this.v = state0;
        this.w = ref$FloatRef0;
        this.x = ref$FloatRef1;
        this.y = closedFloatingPointRange0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p7(this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p7)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Animatable animatable0 = AnimatableKt.Animatable$default(this.p, 0.0f, 2, null);
                o7 o70 = new o7(this.s, this.t, this.u, this.v, this.w, this.x, this.y);
                this.o = 1;
                if(animatable0.animateTo(Boxing.boxFloat(this.q), SliderKt.g, Boxing.boxFloat(0.0f), o70, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Function0 function00 = this.r;
        if(function00 != null) {
            function00.invoke();
        }
        return Unit.INSTANCE;
    }
}

