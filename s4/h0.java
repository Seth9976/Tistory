package s4;

import androidx.paging.PageEvent;
import androidx.paging.PagingLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class h0 extends SuspendLambda implements Function2 {
    public Object o;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h0(2, continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h0)this.create(((PageEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        PageEvent pageEvent0 = (PageEvent)this.o;
        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
        if(pagingLogger0.isLoggable(2)) {
            pagingLogger0.log(2, "Sent " + pageEvent0, null);
        }
        return Unit.INSTANCE;
    }
}

