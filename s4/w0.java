package s4;

import androidx.paging.PageFetcherSnapshot;
import androidx.paging.ViewportHint;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class w0 extends SuspendLambda implements Function2 {
    public Object o;
    public final PageFetcherSnapshot p;

    public w0(PageFetcherSnapshot pageFetcherSnapshot0, Continuation continuation0) {
        this.p = pageFetcherSnapshot0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new w0(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w0)this.create(((ViewportHint)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ViewportHint viewportHint0 = (ViewportHint)this.o;
        return -viewportHint0.getPresentedItemsBefore() > this.p.c.jumpThreshold || -viewportHint0.getPresentedItemsAfter() > this.p.c.jumpThreshold ? Boxing.boxBoolean(true) : Boxing.boxBoolean(false);
    }
}

