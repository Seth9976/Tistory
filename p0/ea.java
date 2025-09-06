package p0;

import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class ea extends SuspendLambda implements Function2 {
    public boolean o;
    public final State p;
    public final State q;
    public final MutableState r;

    public ea(State state0, State state1, MutableState mutableState0, Continuation continuation0) {
        this.p = state0;
        this.q = state1;
        this.r = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new ea(this.p, this.q, this.r, continuation0);
        continuation1.o = ((Boolean)object0).booleanValue();
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Boolean)object0).booleanValue();
        return ((ea)this.create(((Boolean)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        boolean z = this.o;
        if(SwitchKt.access$Switch$lambda$8(this.p) != z) {
            Function1 function10 = SwitchKt.access$Switch$lambda$7(this.q);
            if(function10 != null) {
                function10.invoke(Boxing.boxBoolean(z));
            }
            boolean z1 = SwitchKt.access$Switch$lambda$3(this.r);
            SwitchKt.access$Switch$lambda$4(this.r, !z1);
        }
        return Unit.INSTANCE;
    }
}

