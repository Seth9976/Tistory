package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import qd.a;

public final class j4 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final n4 q;
    public final int r;
    public final float s;
    public final w3 t;
    public final int u;
    public final int v;
    public final FloatRef w;
    public final WindowInsetsAnimationController x;
    public final boolean y;

    public j4(float f, int v, int v1, int v2, WindowInsetsAnimationController windowInsetsAnimationController0, w3 w30, n4 n40, Continuation continuation0, FloatRef ref$FloatRef0, boolean z) {
        this.q = n40;
        this.r = v;
        this.s = f;
        this.t = w30;
        this.u = v1;
        this.v = v2;
        this.w = ref$FloatRef0;
        this.x = windowInsetsAnimationController0;
        this.y = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j4(this.s, this.r, this.u, this.v, this.x, this.t, this.q, continuation0, this.w, this.y);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j4)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        n4 n40 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                n40.i = BuildersKt.launch$default(((CoroutineScope)this.p), null, null, new i4(this.s, this.r, this.u, this.v, this.x, this.t, n40, null, this.w, this.y), 3, null);
                Job job0 = n40.i;
                if(job0 != null) {
                    this.o = 1;
                    if(job0.join(this) == object1) {
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
        n40.i = null;
        return Unit.INSTANCE;
    }
}

