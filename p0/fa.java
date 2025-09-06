package p0;

import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class fa extends SuspendLambda implements Function2 {
    public int o;
    public final AnchoredDraggableState p;
    public final State q;
    public final State r;
    public final MutableState s;

    public fa(AnchoredDraggableState anchoredDraggableState0, State state0, State state1, MutableState mutableState0, Continuation continuation0) {
        this.p = anchoredDraggableState0;
        this.q = state0;
        this.r = state1;
        this.s = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new fa(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((fa)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = SnapshotStateKt.snapshotFlow(new t(this.p, 5));
                ea ea0 = new ea(this.q, this.r, this.s, null);
                this.o = 1;
                return FlowKt.collectLatest(flow0, ea0, this) == object1 ? object1 : Unit.INSTANCE;
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

