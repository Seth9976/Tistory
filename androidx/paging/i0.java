package androidx.paging;

import androidx.activity.c0;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.JobKt;
import qd.a;
import s4.g0;

public final class i0 extends SuspendLambda implements Function3 {
    public PagingSource o;
    public int p;
    public g0 q;
    public boolean r;
    public final RemoteMediatorAccessor s;
    public final PageFetcher t;

    public i0(Continuation continuation0, PageFetcher pageFetcher0, RemoteMediatorAccessor remoteMediatorAccessor0) {
        this.s = remoteMediatorAccessor0;
        this.t = pageFetcher0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        i0 i00 = new i0(((Continuation)object2), this.t, this.s);
        i00.q = (g0)object0;
        i00.r = ((Boolean)object1).booleanValue();
        return i00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object4;
        Integer integer0;
        PagingSource pagingSource0;
        PagingState pagingState0;
        Object object2;
        g0 g00;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PageFetcher pageFetcher0 = this.t;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g00 = this.q;
                if(this.r) {
                    RemoteMediatorAccessor remoteMediatorAccessor0 = this.s;
                    if(remoteMediatorAccessor0 != null) {
                        remoteMediatorAccessor0.allowRefresh();
                    }
                }
                this.q = g00;
                this.p = 1;
                object2 = PageFetcher.access$generateNewPagingSource(pageFetcher0, (g00 == null ? null : g00.a.getPagingSource$paging_common_release()), this);
                if(object2 == object1) {
                    return object1;
                }
                goto label_18;
            }
            case 1: {
                g00 = this.q;
                ResultKt.throwOnFailure(object0);
                object2 = object0;
            label_18:
                if(g00 == null) {
                    pagingState0 = null;
                }
                else {
                    this.q = g00;
                    this.o = (PagingSource)object2;
                    this.p = 2;
                    Object object3 = g00.a.currentPagingState(this);
                    if(object3 == object1) {
                        return object1;
                    }
                    pagingState0 = (PagingState)object3;
                }
                pagingSource0 = (PagingSource)object2;
                break;
            }
            case 2: {
                PagingSource pagingSource1 = this.o;
                g00 = this.q;
                ResultKt.throwOnFailure(object0);
                pagingState0 = (PagingState)object0;
                pagingSource0 = pagingSource1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        List list0 = pagingState0 == null ? null : pagingState0.getPages();
        if((list0 == null || list0.isEmpty()) && g00 != null) {
            PagingState pagingState1 = g00.b;
            if(pagingState1 != null) {
                List list1 = pagingState1.getPages();
                if(list1 != null && !list1.isEmpty() == 1) {
                    pagingState0 = pagingState1;
                }
            }
        }
        if((pagingState0 == null ? null : pagingState0.getAnchorPosition()) == null) {
            if(g00 == null) {
                integer0 = null;
            }
            else {
                PagingState pagingState2 = g00.b;
                integer0 = pagingState2 == null ? null : pagingState2.getAnchorPosition();
            }
            if(integer0 != null) {
                pagingState0 = g00.b;
            }
        }
        if(pagingState0 == null) {
            object4 = pageFetcher0.b;
        }
        else {
            object4 = pagingSource0.getRefreshKey(pagingState0);
            PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
            if(pagingLogger0.isLoggable(3)) {
                pagingLogger0.log(3, "Refresh key " + object4 + " returned from PagingSource " + pagingSource0, null);
            }
        }
        if(g00 != null) {
            g00.a.close();
        }
        if(g00 != null) {
            CompletableJob completableJob0 = g00.c;
            if(completableJob0 != null) {
                DefaultImpls.cancel$default(completableJob0, null, 1, null);
            }
        }
        c0 c00 = new c0(pageFetcher0, 14);
        return new g0(new PageFetcherSnapshot(object4, pagingSource0, pageFetcher0.c, pageFetcher0.e.getFlow(), this.s, pagingState0, c00), pagingState0, JobKt.Job$default(null, 1, null));
    }
}

