package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class w extends SuspendLambda implements Function2 {
    public PagingSource o;
    public Object p;
    public int q;
    public final LivePagedList r;

    public w(LivePagedList livePagedList0, Continuation continuation0) {
        this.r = livePagedList0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w(this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        PagingSource pagingSource2;
        Object object4;
        PagingSource pagingSource1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        LivePagedList livePagedList0 = this.r;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                livePagedList0.u.getPagingSource().unregisterInvalidatedCallback(livePagedList0.w);
                PagingSource pagingSource0 = (PagingSource)livePagedList0.r.invoke();
                pagingSource0.registerInvalidatedCallback(livePagedList0.w);
                if(pagingSource0 instanceof LegacyPagingSource) {
                    ((LegacyPagingSource)pagingSource0).setPageSize(livePagedList0.p.pageSize);
                }
                v v0 = new v(livePagedList0, null);
                this.o = pagingSource0;
                this.q = 1;
                if(BuildersKt.withContext(livePagedList0.s, v0, this) == object1) {
                    return object1;
                }
                pagingSource1 = pagingSource0;
                goto label_19;
            }
            case 1: {
                pagingSource1 = this.o;
                ResultKt.throwOnFailure(object0);
            label_19:
                Object object2 = livePagedList0.u.getLastKey();
                LoadParams pagingSource$LoadParams0 = PagedListKt.toRefreshLoadParams(livePagedList0.p, object2);
                this.o = pagingSource1;
                this.p = object2;
                this.q = 2;
                Object object3 = pagingSource1.load(pagingSource$LoadParams0, this);
                if(object3 == object1) {
                    return object1;
                }
                object4 = object2;
                pagingSource2 = pagingSource1;
                object0 = object3;
                break;
            }
            case 2: {
                Object object5 = this.p;
                PagingSource pagingSource3 = this.o;
                ResultKt.throwOnFailure(object0);
                object4 = object5;
                pagingSource2 = pagingSource3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((LoadResult)object0) instanceof Invalid) {
            NotLoading loadState$NotLoading0 = new NotLoading(false);
            livePagedList0.u.setInitialLoadState(LoadType.REFRESH, loadState$NotLoading0);
            pagingSource2.invalidate();
            return Unit.INSTANCE;
        }
        if(((LoadResult)object0) instanceof Error) {
            androidx.paging.LoadState.Error loadState$Error0 = new androidx.paging.LoadState.Error(((Error)(((LoadResult)object0))).getThrowable());
            livePagedList0.u.setInitialLoadState(LoadType.REFRESH, loadState$Error0);
            return Unit.INSTANCE;
        }
        if(((LoadResult)object0) instanceof Page) {
            PagedList pagedList0 = PagedList.Companion.create(pagingSource2, ((Page)(((LoadResult)object0))), livePagedList0.o, livePagedList0.s, livePagedList0.t, livePagedList0.q, livePagedList0.p, object4);
            LivePagedList.access$onItemUpdate(livePagedList0, livePagedList0.u, pagedList0);
            livePagedList0.u = pagedList0;
            livePagedList0.postValue(pagedList0);
        }
        return Unit.INSTANCE;
    }
}

