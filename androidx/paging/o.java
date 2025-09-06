package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class o extends SuspendLambda implements Function2 {
    public final LoadResult o;
    public final LegacyPageFetcher p;
    public final LoadType q;

    public o(LoadResult pagingSource$LoadResult0, LegacyPageFetcher legacyPageFetcher0, LoadType loadType0, Continuation continuation0) {
        this.o = pagingSource$LoadResult0;
        this.p = legacyPageFetcher0;
        this.q = loadType0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new o(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        LoadResult pagingSource$LoadResult0 = this.o;
        LoadType loadType0 = this.q;
        LegacyPageFetcher legacyPageFetcher0 = this.p;
        if(pagingSource$LoadResult0 instanceof Page) {
            legacyPageFetcher0.a(loadType0, ((Page)pagingSource$LoadResult0));
            return Unit.INSTANCE;
        }
        if(pagingSource$LoadResult0 instanceof Error) {
            LegacyPageFetcher.access$onLoadError(legacyPageFetcher0, loadType0, ((Error)pagingSource$LoadResult0).getThrowable());
            return Unit.INSTANCE;
        }
        if(pagingSource$LoadResult0 instanceof Invalid) {
            LegacyPageFetcher.access$onLoadInvalid(legacyPageFetcher0);
        }
        return Unit.INSTANCE;
    }
}

