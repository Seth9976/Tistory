package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l4 extends SuspendLambda implements Function2 {
    public int o;
    public final int p;
    public final int q;
    public final float r;
    public final WindowInsetsAnimationController s;
    public final boolean t;
    public final n4 u;

    public l4(float f, int v, int v1, WindowInsetsAnimationController windowInsetsAnimationController0, n4 n40, Continuation continuation0, boolean z) {
        this.p = v;
        this.q = v1;
        this.r = f;
        this.s = windowInsetsAnimationController0;
        this.t = z;
        this.u = n40;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l4(this.r, this.p, this.q, this.s, this.u, continuation0, this.t);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l4)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        n4 n40 = this.u;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Animatable animatable0 = AnimatableKt.Animatable$default(this.p, 0.0f, 2, null);
                k4 k40 = new k4(n40, 0);
                this.o = 1;
                if(Animatable.animateTo$default(animatable0, Boxing.boxFloat(this.q), null, Boxing.boxFloat(this.r), k40, this, 2, null) == object1) {
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
        this.s.finish(this.t);
        n40.e = null;
        return Unit.INSTANCE;
    }
}

