package s4;

import androidx.paging.PageFetcherSnapshotState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

public final class y0 extends SuspendLambda implements Function2 {
    public final PageFetcherSnapshotState o;

    public y0(PageFetcherSnapshotState pageFetcherSnapshotState0, Continuation continuation0) {
        this.o = pageFetcherSnapshotState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new y0(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y0)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.o.j.trySend-JP2dKIU(Boxing.boxInt(this.o.h));
        return Unit.INSTANCE;
    }
}

