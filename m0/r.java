package m0;

import androidx.activity.d0;
import androidx.compose.foundation.text.input.internal.CursorAnchorInfoController;
import androidx.compose.runtime.SnapshotStateKt;
import j2.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class r extends SuspendLambda implements Function2 {
    public int o;
    public final CursorAnchorInfoController p;

    public r(CursorAnchorInfoController cursorAnchorInfoController0, Continuation continuation0) {
        this.p = cursorAnchorInfoController0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = FlowKt.filterNotNull(FlowKt.drop(SnapshotStateKt.snapshotFlow(new j(this.p, 21)), 1));
                d0 d00 = new d0(this.p, 8);
                this.o = 1;
                return flow0.collect(d00, this) == object1 ? object1 : Unit.INSTANCE;
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

