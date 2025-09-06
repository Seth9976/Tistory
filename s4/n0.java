package s4;

import androidx.paging.GenerationalViewportHint;
import androidx.paging.LoadType;
import androidx.paging.PageFetcherSnapshotKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

public final class n0 extends SuspendLambda implements Function3 {
    public GenerationalViewportHint o;
    public GenerationalViewportHint p;
    public final LoadType q;

    public n0(LoadType loadType0, Continuation continuation0) {
        this.q = loadType0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        n0 n00 = new n0(this.q, ((Continuation)object2));
        n00.o = (GenerationalViewportHint)object0;
        n00.p = (GenerationalViewportHint)object1;
        return n00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        GenerationalViewportHint generationalViewportHint0 = this.o;
        GenerationalViewportHint generationalViewportHint1 = this.p;
        return PageFetcherSnapshotKt.shouldPrioritizeOver(generationalViewportHint1, generationalViewportHint0, this.q) ? generationalViewportHint1 : generationalViewportHint0;
    }
}

