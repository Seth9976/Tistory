package s;

import androidx.compose.animation.core.Transition;
import androidx.compose.material3.fj;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class r extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Transition q;
    public final State r;

    public r(Transition transition0, State state0, Continuation continuation0) {
        this.q = transition0;
        this.r = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new r(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r)this.create(((ProduceStateScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProduceStateScope produceStateScope0 = (ProduceStateScope)this.p;
                Flow flow0 = SnapshotStateKt.snapshotFlow(new q(this.q, 0));
                fj fj0 = new fj(produceStateScope0, this.q, 4, this.r);
                this.o = 1;
                return flow0.collect(fj0, this) == object1 ? object1 : Unit.INSTANCE;
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

