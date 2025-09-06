package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i4 extends SuspendLambda implements Function2 {
    public int o;
    public final int p;
    public final float q;
    public final w3 r;
    public final int s;
    public final int t;
    public final n4 u;
    public final FloatRef v;
    public final WindowInsetsAnimationController w;
    public final boolean x;

    public i4(float f, int v, int v1, int v2, WindowInsetsAnimationController windowInsetsAnimationController0, w3 w30, n4 n40, Continuation continuation0, FloatRef ref$FloatRef0, boolean z) {
        this.p = v;
        this.q = f;
        this.r = w30;
        this.s = v1;
        this.t = v2;
        this.u = n40;
        this.v = ref$FloatRef0;
        this.w = windowInsetsAnimationController0;
        this.x = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i4(this.q, this.p, this.s, this.t, this.w, this.r, this.u, continuation0, this.v, this.x);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i4)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h4 h40 = new h4(this.s, this.t, this.u, this.v, this.w, this.x);
                this.o = 1;
                return SuspendAnimationKt.animateDecay(this.p, this.q, this.r, h40, this) == object1 ? object1 : Unit.INSTANCE;
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

