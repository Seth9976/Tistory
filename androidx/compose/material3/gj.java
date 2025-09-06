package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class gj extends SuspendLambda implements Function1 {
    public int o;
    public final MutableFloatState p;
    public final Flow q;
    public final Animatable r;
    public final Function1 s;
    public final MutableState t;
    public final MutableState u;

    public gj(MutableFloatState mutableFloatState0, Flow flow0, Animatable animatable0, Function1 function10, MutableState mutableState0, MutableState mutableState1, Continuation continuation0) {
        this.p = mutableFloatState0;
        this.q = flow0;
        this.r = animatable0;
        this.s = function10;
        this.t = mutableState0;
        this.u = mutableState1;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new gj(this.p, this.q, this.r, this.s, this.t, this.u, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((gj)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Animatable animatable0 = this.r;
        MutableState mutableState0 = this.u;
        MutableState mutableState1 = this.t;
        MutableFloatState mutableFloatState0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    mutableFloatState0.setFloatValue(NaNf);
                    fj fj0 = new fj(mutableState1, mutableState0, 0, animatable0);
                    this.o = 1;
                    if(this.q.collect(fj0, this) == object1) {
                        return object1;
                    label_13:
                        ResultKt.throwOnFailure(object0);
                    }
                    mutableFloatState0.setFloatValue(((Number)animatable0.getValue()).floatValue());
                    this.s.invoke(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                catch(CancellationException unused_ex) {
                    goto label_17;
                }
            }
            case 1: {
                goto label_13;
            label_17:
                this.o = 2;
                if(Animatable.animateTo$default(this.r, Boxing.boxFloat(1.0f), SearchBar_androidKt.l, null, null, this, 12, null) == object1) {
                    return object1;
                }
                mutableFloatState0.setFloatValue(NaNf);
                mutableState1.setValue(null);
                mutableState0.setValue(null);
                return Unit.INSTANCE;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ResultKt.throwOnFailure(object0);
        mutableFloatState0.setFloatValue(NaNf);
        mutableState1.setValue(null);
        mutableState0.setValue(null);
        return Unit.INSTANCE;
    }
}

