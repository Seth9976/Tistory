package n6;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material3.fj;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class g extends SuspendLambda implements Function2 {
    public int o;
    public final ModalBottomSheetState p;
    public final NavBackStackEntry q;
    public final State r;
    public final State s;

    public g(ModalBottomSheetState modalBottomSheetState0, NavBackStackEntry navBackStackEntry0, State state0, State state1, Continuation continuation0) {
        this.p = modalBottomSheetState0;
        this.q = navBackStackEntry0;
        this.r = state0;
        this.s = state1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new f(this.p, 0))), 1);
                fj fj0 = new fj(this.q, this.r, 2, this.s);
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

