package androidx.paging;

import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class f extends SuspendLambda implements Function2 {
    public final Refresh o;
    public final AsyncPagingDataDiffer p;

    public f(Refresh pagingDataEvent$Refresh0, AsyncPagingDataDiffer asyncPagingDataDiffer0, Continuation continuation0) {
        this.o = pagingDataEvent$Refresh0;
        this.p = asyncPagingDataDiffer0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ItemCallback diffUtil$ItemCallback0 = this.p.a;
        return PlaceholderPaddedListDiffHelperKt.computeDiff(this.o.getPreviousList(), this.o.getNewList(), diffUtil$ItemCallback0);
    }
}

