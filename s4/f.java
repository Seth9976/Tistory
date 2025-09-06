package s4;

import androidx.paging.AsyncPagingDataDiffer;
import androidx.paging.PagingDataEvent.Refresh;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class f extends ContinuationImpl {
    public AsyncPagingDataDiffer o;
    public Refresh p;
    public Object q;
    public final androidx.paging.AsyncPagingDataDiffer.presenter.1 r;
    public int s;

    public f(androidx.paging.AsyncPagingDataDiffer.presenter.1 asyncPagingDataDiffer$presenter$10, Continuation continuation0) {
        this.r = asyncPagingDataDiffer$presenter$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.presentPagingDataEvent(null, this);
    }
}

