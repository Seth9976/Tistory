package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class ej extends SuspendLambda implements Function2 {
    public int o;
    public final Animatable p;
    public final boolean q;
    public final MutableFloatState r;
    public final MutableState s;
    public final MutableState t;

    public ej(Animatable animatable0, boolean z, MutableFloatState mutableFloatState0, MutableState mutableState0, MutableState mutableState1, Continuation continuation0) {
        this.p = animatable0;
        this.q = z;
        this.r = mutableFloatState0;
        this.s = mutableState0;
        this.t = mutableState1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new ej(this.p, this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((ej)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FiniteAnimationSpec finiteAnimationSpec0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Animatable animatable0 = this.p;
                float f = 0.0f;
                if(Float.compare(((Number)animatable0.getValue()).floatValue(), 0.0f) <= 0 || ((Number)animatable0.getValue()).floatValue() >= 1.0f) {
                    finiteAnimationSpec0 = z ? SearchBar_androidKt.j : SearchBar_androidKt.k;
                }
                else {
                    finiteAnimationSpec0 = SearchBar_androidKt.l;
                }
                if(z) {
                    f = 1.0f;
                }
                if(((Number)animatable0.getValue()).floatValue() != f) {
                    this.o = 1;
                    if(Animatable.animateTo$default(this.p, Boxing.boxFloat(f), finiteAnimationSpec0, null, null, this, 12, null) == object1) {
                        return object1;
                    }
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
        if(!z) {
            this.r.setFloatValue(NaNf);
            this.s.setValue(null);
            this.t.setValue(null);
        }
        return Unit.INSTANCE;
    }
}

