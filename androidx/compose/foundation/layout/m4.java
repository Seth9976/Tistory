package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class m4 extends SuspendLambda implements Function2 {
    public Object o;
    public final n4 p;
    public final int q;
    public final int r;
    public final float s;
    public final WindowInsetsAnimationController t;
    public final boolean u;

    public m4(float f, int v, int v1, WindowInsetsAnimationController windowInsetsAnimationController0, n4 n40, Continuation continuation0, boolean z) {
        this.p = n40;
        this.q = v;
        this.r = v1;
        this.s = f;
        this.t = windowInsetsAnimationController0;
        this.u = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m4(this.s, this.q, this.r, this.t, this.p, continuation0, this.u);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m4)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.p.i = BuildersKt.launch$default(((CoroutineScope)this.o), null, null, new l4(this.s, this.q, this.r, this.t, this.p, null, this.u), 3, null);
        return Unit.INSTANCE;
    }
}

