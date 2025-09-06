package w3;

import androidx.datastore.core.Data;
import androidx.datastore.core.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class m extends SuspendLambda implements Function2 {
    public Object o;
    public final State p;

    public m(State state0, Continuation continuation0) {
        this.p = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((State)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        State state0 = (State)this.o;
        return !(state0 instanceof Data) || state0.getVersion() > this.p.getVersion() ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
    }
}

