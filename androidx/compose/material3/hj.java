package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class hj extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final MutatorMutex q;
    public final MutableFloatState r;
    public final Animatable s;
    public final Function1 t;
    public final MutableState u;
    public final MutableState v;

    public hj(MutatorMutex mutatorMutex0, MutableFloatState mutableFloatState0, Animatable animatable0, Function1 function10, MutableState mutableState0, MutableState mutableState1, Continuation continuation0) {
        this.q = mutatorMutex0;
        this.r = mutableFloatState0;
        this.s = animatable0;
        this.t = function10;
        this.u = mutableState0;
        this.v = mutableState1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new hj(this.q, this.r, this.s, this.t, this.u, this.v, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((hj)this.create(((Flow)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                gj gj0 = new gj(this.r, ((Flow)this.p), this.s, this.t, this.u, this.v, null);
                this.o = 1;
                return MutatorMutex.mutate$default(this.q, null, gj0, this, 1, null) == object1 ? object1 : Unit.INSTANCE;
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

