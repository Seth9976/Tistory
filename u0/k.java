package u0;

import androidx.compose.material.ripple.RippleAnimation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class k extends SuspendLambda implements Function2 {
    public Object o;
    public final RippleAnimation p;

    public k(RippleAnimation rippleAnimation0, Continuation continuation0) {
        this.p = rippleAnimation0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        BuildersKt.launch$default(coroutineScope0, null, null, new h(this.p, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new i(this.p, null), 3, null);
        return BuildersKt.launch$default(coroutineScope0, null, null, new j(this.p, null), 3, null);
    }
}

