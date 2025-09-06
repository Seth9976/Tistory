package s4;

import androidx.paging.LoadState;
import androidx.paging.LoadType;
import androidx.paging.PagedList;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class b1 extends SuspendLambda implements Function2 {
    public final PagedList o;
    public final LoadType p;
    public final LoadState q;

    public b1(PagedList pagedList0, LoadType loadType0, LoadState loadState0, Continuation continuation0) {
        this.o = pagedList0;
        this.p = loadType0;
        this.q = loadState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b1(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        o.removeAll(this.o.i, a1.y);
        for(Object object1: this.o.i) {
            Function2 function20 = (Function2)((WeakReference)object1).get();
            if(function20 != null) {
                function20.invoke(this.p, this.q);
            }
        }
        return Unit.INSTANCE;
    }
}

