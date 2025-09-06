package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

public final class xd extends SuspendLambda implements Function3 {
    public final int o;
    public float p;
    public final Object q;

    public xd(int v, Object object0, Continuation continuation0) {
        this.o = v;
        this.q = object0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        float f = ((Number)object1).floatValue();
        if(this.o != 0) {
            xd xd0 = new xd(1, ((State)this.q), ((Continuation)object2));
            xd0.p = f;
            return xd0.invokeSuspend(Unit.INSTANCE);
        }
        xd xd1 = new xd(0, ((Function1)this.q), ((Continuation)object2));
        xd1.p = f;
        return xd1.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        if(this.o != 0) {
            ResultKt.throwOnFailure(object0);
            Float float0 = Boxing.boxFloat(this.p);
            ((Function1)((State)this.q).getValue()).invoke(float0);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(object0);
        ((Function1)this.q).invoke(Boxing.boxFloat(this.p));
        return Unit.INSTANCE;
    }
}

