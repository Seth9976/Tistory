package androidx.paging;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import m5.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004B[\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000B\u0012\u0018\u0010\u000F\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E0\r\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0012\u001A\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/paging/LivePagedList;", "", "Key", "Value", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "initialKey", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Landroidx/paging/PagedList$Config;Landroidx/paging/PagedList$BoundaryCallback;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "onActive", "()V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LivePagedList extends LiveData {
    public final CoroutineScope o;
    public final Config p;
    public final BoundaryCallback q;
    public final Function0 r;
    public final CoroutineDispatcher s;
    public final CoroutineDispatcher t;
    public PagedList u;
    public Job v;
    public final u w;
    public final a x;

    public LivePagedList(@NotNull CoroutineScope coroutineScope0, @Nullable Object object0, @NotNull Config pagedList$Config0, @Nullable BoundaryCallback pagedList$BoundaryCallback0, @NotNull Function0 function00, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull CoroutineDispatcher coroutineDispatcher1) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        Intrinsics.checkNotNullParameter(function00, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(coroutineDispatcher1, "fetchDispatcher");
        super(new InitialPagedList(coroutineScope0, coroutineDispatcher0, coroutineDispatcher1, pagedList$Config0, object0));
        this.o = coroutineScope0;
        this.p = pagedList$Config0;
        this.q = pagedList$BoundaryCallback0;
        this.r = function00;
        this.s = coroutineDispatcher0;
        this.t = coroutineDispatcher1;
        this.w = new u(this);
        a a0 = new a(this, 1);
        this.x = a0;
        Object object1 = this.getValue();
        Intrinsics.checkNotNull(object1);
        this.u = (PagedList)object1;
        ((PagedList)object1).setRetryCallback(a0);
    }

    public static final void access$onItemUpdate(LivePagedList livePagedList0, PagedList pagedList0, PagedList pagedList1) {
        livePagedList0.getClass();
        pagedList0.setRetryCallback(null);
        pagedList1.setRetryCallback(livePagedList0.x);
    }

    public final void d(boolean z) {
        Job job0 = this.v;
        if(job0 != null && !z) {
            return;
        }
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        w w0 = new w(this, null);
        this.v = BuildersKt.launch$default(this.o, this.t, null, w0, 2, null);
    }

    @Override  // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.d(false);
    }
}

