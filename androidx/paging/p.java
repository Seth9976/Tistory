package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class p extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final LegacyPageFetcher q;
    public final LoadParams r;
    public final LoadType s;

    public p(LegacyPageFetcher legacyPageFetcher0, LoadParams pagingSource$LoadParams0, LoadType loadType0, Continuation continuation0) {
        this.q = legacyPageFetcher0;
        this.r = pagingSource$LoadParams0;
        this.s = loadType0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new p(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        LegacyPageFetcher legacyPageFetcher0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                this.p = coroutineScope0;
                this.o = 1;
                Object object2 = legacyPageFetcher0.getSource().load(this.r, this);
                if(object2 == object1) {
                    return object1;
                }
                coroutineScope1 = coroutineScope0;
                object0 = object2;
                break;
            }
            case 1: {
                CoroutineScope coroutineScope2 = (CoroutineScope)this.p;
                ResultKt.throwOnFailure(object0);
                coroutineScope1 = coroutineScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(legacyPageFetcher0.getSource().getInvalid()) {
            legacyPageFetcher0.detach();
            return Unit.INSTANCE;
        }
        BuildersKt.launch$default(coroutineScope1, legacyPageFetcher0.d, null, new o(((LoadResult)object0), legacyPageFetcher0, this.s, null), 2, null);
        return Unit.INSTANCE;
    }
}

