package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.q;

@RestrictTo({Scope.LIBRARY})
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b!\b\u0017\u0018\u0000 Q*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u0006:\u0001QBi\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\u0012\b\u0010\u0014\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0018\u001A\u00020\u00172\u0010\u0010\u0019\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u0012H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010 \u001A\u00020\u001F2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b \u0010!J\'\u0010\'\u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020\u001A2\u0006\u0010#\u001A\u00020\u001A2\u0006\u0010$\u001A\u00020\u001AH\u0001\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010(\u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b(\u0010)J)\u0010,\u001A\u00020\u001F2\u0018\u0010+\u001A\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u001F0*H\u0016\u00A2\u0006\u0004\b,\u0010-J\u001F\u00100\u001A\u00020\u001F2\u0006\u0010.\u001A\u00020\u00172\u0006\u0010/\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b0\u0010!J\u0017\u00103\u001A\u00020\u001F2\u0006\u00102\u001A\u000201H\u0017\u00A2\u0006\u0004\b3\u00104J\u000F\u00105\u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b5\u0010)J\u0017\u00107\u001A\u00020\u001F2\u0006\u00106\u001A\u000201H\u0017\u00A2\u0006\u0004\b7\u00104J\'\u0010;\u001A\u00020\u001F2\u0006\u00108\u001A\u0002012\u0006\u00109\u001A\u0002012\u0006\u0010:\u001A\u000201H\u0017\u00A2\u0006\u0004\b;\u0010<J\'\u0010>\u001A\u00020\u001F2\u0006\u0010=\u001A\u0002012\u0006\u00109\u001A\u0002012\u0006\u0010:\u001A\u000201H\u0017\u00A2\u0006\u0004\b>\u0010<J\u001F\u0010@\u001A\u00020\u001F2\u0006\u0010?\u001A\u0002012\u0006\u00106\u001A\u000201H\u0016\u00A2\u0006\u0004\b@\u0010AJ\u001F\u0010B\u001A\u00020\u001F2\u0006\u0010?\u001A\u0002012\u0006\u00106\u001A\u000201H\u0016\u00A2\u0006\u0004\bB\u0010AR#\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010FR\"\u0010\u000F\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR\u001C\u0010N\u001A\u0004\u0018\u00018\u00008VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\bM\u0010)\u001A\u0004\bK\u0010LR\u0014\u0010O\u001A\u00020\u001A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010P\u00A8\u0006R"}, d2 = {"Landroidx/paging/ContiguousPagedList;", "", "K", "V", "Landroidx/paging/PagedList;", "Landroidx/paging/PagedStorage$Callback;", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Landroidx/paging/PagingSource;", "pagingSource", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "backgroundDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "initialLastKey", "<init>", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource$LoadResult$Page;Ljava/lang/Object;)V", "Landroidx/paging/LoadType;", "type", "page", "", "onPageResult", "(Landroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)Z", "Landroidx/paging/LoadState;", "state", "", "onStateChanged", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "deferEmpty", "deferBegin", "deferEnd", "deferBoundaryCallbacks$paging_common_release", "(ZZZ)V", "deferBoundaryCallbacks", "retry", "()V", "Lkotlin/Function2;", "callback", "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "loadType", "loadState", "setInitialLoadState", "", "index", "loadAroundInternal", "(I)V", "detach", "count", "onInitialized", "leadingNulls", "changed", "added", "onPagePrepended", "(III)V", "endPosition", "onPageAppended", "startOfDrops", "onPagesRemoved", "(II)V", "onPagesSwappedToPlaceholder", "j", "Landroidx/paging/PagingSource;", "getPagingSource", "()Landroidx/paging/PagingSource;", "k", "Landroidx/paging/PagedList$BoundaryCallback;", "getBoundaryCallback$paging_common_release", "()Landroidx/paging/PagedList$BoundaryCallback;", "getLastKey", "()Ljava/lang/Object;", "getLastKey$annotations", "lastKey", "isDetached", "()Z", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContiguousPagedList.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContiguousPagedList.jvm.kt\nandroidx/paging/ContiguousPagedList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,408:1\n1#2:409\n*E\n"})
public class ContiguousPagedList extends PagedList implements PageConsumer, Callback {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\'\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/paging/ContiguousPagedList$Companion;", "", "", "prefetchDistance", "index", "leadingNulls", "getPrependItemsRequested$paging_common_release", "(III)I", "getPrependItemsRequested", "itemsBeforeTrailingNulls", "getAppendItemsRequested$paging_common_release", "getAppendItemsRequested", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int getAppendItemsRequested$paging_common_release(int v, int v1, int v2) {
            return v1 + v + 1 - v2;
        }

        public final int getPrependItemsRequested$paging_common_release(int v, int v1, int v2) {
            return v - (v1 - v2);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final PagingSource j;
    public final BoundaryCallback k;
    public final Object l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public boolean s;
    public final boolean t;
    public final LegacyPageFetcher u;

    static {
        ContiguousPagedList.Companion = new Companion(null);
    }

    public ContiguousPagedList(@NotNull PagingSource pagingSource0, @NotNull CoroutineScope coroutineScope0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull CoroutineDispatcher coroutineDispatcher1, @Nullable BoundaryCallback pagedList$BoundaryCallback0, @NotNull Config pagedList$Config0, @NotNull Page pagingSource$LoadResult$Page0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(pagingSource0, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(coroutineDispatcher1, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "initialPage");
        super(pagingSource0, coroutineScope0, coroutineDispatcher0, new PagedStorage(), pagedList$Config0);
        this.j = pagingSource0;
        this.k = pagedList$BoundaryCallback0;
        this.l = object0;
        this.q = 0x7FFFFFFF;
        this.r = 0x80000000;
        this.t = pagedList$Config0.maxSize != 0x7FFFFFFF;
        PagedStorage pagedStorage0 = this.getStorage$paging_common_release();
        Intrinsics.checkNotNull(pagedStorage0, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.u = new LegacyPageFetcher(coroutineScope0, pagedList$Config0, pagingSource0, coroutineDispatcher0, coroutineDispatcher1, this, pagedStorage0);
        if(pagedList$Config0.enablePlaceholders) {
            this.getStorage$paging_common_release().init((pagingSource$LoadResult$Page0.getItemsBefore() == 0x80000000 ? 0 : pagingSource$LoadResult$Page0.getItemsBefore()), pagingSource$LoadResult$Page0, (pagingSource$LoadResult$Page0.getItemsAfter() == 0x80000000 ? 0 : pagingSource$LoadResult$Page0.getItemsAfter()), 0, this, pagingSource$LoadResult$Page0.getItemsBefore() != 0x80000000 && pagingSource$LoadResult$Page0.getItemsAfter() != 0x80000000);
        }
        else {
            this.getStorage$paging_common_release().init(0, pagingSource$LoadResult$Page0, 0, (pagingSource$LoadResult$Page0.getItemsBefore() == 0x80000000 ? 0 : pagingSource$LoadResult$Page0.getItemsBefore()), this, false);
        }
        this.b(LoadType.REFRESH, pagingSource$LoadResult$Page0.getData());
    }

    public final void a(boolean z, boolean z1) {
        BoundaryCallback pagedList$BoundaryCallback0 = this.k;
        if(z) {
            Intrinsics.checkNotNull(pagedList$BoundaryCallback0);
            pagedList$BoundaryCallback0.onItemAtFrontLoaded(this.getStorage$paging_common_release().getFirstLoadedItem$paging_common_release());
        }
        if(z1) {
            Intrinsics.checkNotNull(pagedList$BoundaryCallback0);
            pagedList$BoundaryCallback0.onItemAtEndLoaded(this.getStorage$paging_common_release().getLastLoadedItem$paging_common_release());
        }
    }

    public final void b(LoadType loadType0, List list0) {
        boolean z = false;
        if(this.k != null) {
            boolean z1 = this.getStorage$paging_common_release().size() == 0;
            boolean z2 = !z1 && loadType0 == LoadType.PREPEND && list0.isEmpty();
            if(!z1 && loadType0 == LoadType.APPEND && list0.isEmpty()) {
                z = true;
            }
            this.deferBoundaryCallbacks$paging_common_release(z1, z2, z);
        }
    }

    public final void c(boolean z) {
        boolean z1 = true;
        boolean z2 = this.o && this.q <= this.getConfig().prefetchDistance;
        if(!this.p || this.r < this.size() - 1 - this.getConfig().prefetchDistance) {
            z1 = false;
        }
        if(!z2 && !z1) {
            return;
        }
        if(z2) {
            this.o = false;
        }
        if(z1) {
            this.p = false;
        }
        if(z) {
            BuildersKt.launch$default(this.getCoroutineScope$paging_common_release(), this.getNotifyDispatcher$paging_common_release(), null, new q(this, z2, z1, null), 2, null);
            return;
        }
        this.a(z2, z1);
    }

    @AnyThread
    public final void deferBoundaryCallbacks$paging_common_release(boolean z, boolean z1, boolean z2) {
        if(this.k == null) {
            throw new IllegalStateException("Can\'t defer BoundaryCallback, no instance");
        }
        if(this.q == 0x7FFFFFFF) {
            this.q = this.getStorage$paging_common_release().size();
        }
        if(this.r == 0x80000000) {
            this.r = 0;
        }
        if(z || z1 || z2) {
            BuildersKt.launch$default(this.getCoroutineScope$paging_common_release(), this.getNotifyDispatcher$paging_common_release(), null, new i(z, this, z1, z2, null), 2, null);
        }
    }

    @Override  // androidx.paging.PagedList
    public void detach() {
        this.u.detach();
    }

    @Override  // androidx.paging.PagedList
    public void dispatchCurrentLoadState(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "callback");
        this.u.getLoadStateManager().dispatchCurrentLoadState(function20);
    }

    @Nullable
    public final BoundaryCallback getBoundaryCallback$paging_common_release() {
        return this.k;
    }

    @Override  // androidx.paging.PagedList
    @Nullable
    public Object getLastKey() {
        PagingState pagingState0 = this.getStorage$paging_common_release().getRefreshKeyInfo(this.getConfig());
        if(pagingState0 != null) {
            Object object0 = this.j.getRefreshKey(pagingState0);
            return object0 == null ? this.l : object0;
        }
        return this.l;
    }

    public static void getLastKey$annotations() {
    }

    @Override  // androidx.paging.PagedList
    @NotNull
    public final PagingSource getPagingSource() {
        return this.j;
    }

    @Override  // androidx.paging.PagedList
    public boolean isDetached() {
        return this.u.isDetached();
    }

    @Override  // androidx.paging.PagedList
    @MainThread
    public void loadAroundInternal(int v) {
        int v1 = ContiguousPagedList.Companion.getAppendItemsRequested$paging_common_release(this.getConfig().prefetchDistance, v, this.getStorage$paging_common_release().getDataCount() + this.getStorage$paging_common_release().getPlaceholdersBefore());
        int v2 = Math.max(ContiguousPagedList.Companion.getPrependItemsRequested$paging_common_release(this.getConfig().prefetchDistance, v, this.getStorage$paging_common_release().getPlaceholdersBefore()), this.m);
        this.m = v2;
        LegacyPageFetcher legacyPageFetcher0 = this.u;
        if(v2 > 0) {
            legacyPageFetcher0.trySchedulePrepend();
        }
        int v3 = Math.max(v1, this.n);
        this.n = v3;
        if(v3 > 0) {
            legacyPageFetcher0.tryScheduleAppend();
        }
        this.q = Math.min(this.q, v);
        this.r = Math.max(this.r, v);
        this.c(true);
    }

    @Override  // androidx.paging.PagedStorage$Callback
    @MainThread
    public void onInitialized(int v) {
        boolean z = false;
        this.notifyInserted$paging_common_release(0, v);
        if(this.getStorage$paging_common_release().getPlaceholdersBefore() > 0 || this.getStorage$paging_common_release().getPlaceholdersAfter() > 0) {
            z = true;
        }
        this.s = z;
    }

    @Override  // androidx.paging.PagedStorage$Callback
    @MainThread
    public void onPageAppended(int v, int v1, int v2) {
        this.notifyChanged(v, v1);
        this.notifyInserted$paging_common_release(v + v1, v2);
    }

    @Override  // androidx.paging.PagedStorage$Callback
    @MainThread
    public void onPagePrepended(int v, int v1, int v2) {
        this.notifyChanged(v, v1);
        this.notifyInserted$paging_common_release(0, v2);
        this.q += v2;
        this.r += v2;
    }

    @Override  // androidx.paging.LegacyPageFetcher$PageConsumer
    public boolean onPageResult(@NotNull LoadType loadType0, @NotNull Page pagingSource$LoadResult$Page0) {
        Intrinsics.checkNotNullParameter(loadType0, "type");
        Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "page");
        List list0 = pagingSource$LoadResult$Page0.getData();
        boolean z = true;
        boolean z1 = this.lastLoad() > this.getStorage$paging_common_release().getMiddleOfLoadedRange();
        boolean z2 = this.t;
        boolean z3 = z2 && this.getStorage$paging_common_release().shouldPreTrimNewPage(this.getConfig().maxSize, this.getRequiredRemainder$paging_common_release(), list0.size());
        LoadType loadType1 = LoadType.APPEND;
        if(loadType0 == loadType1) {
            if(!z3 || z1) {
                this.getStorage$paging_common_release().appendPage$paging_common_release(pagingSource$LoadResult$Page0, this);
                int v = this.n - list0.size();
                this.n = v;
                if(v <= 0 || list0.isEmpty()) {
                    goto label_16;
                }
                goto label_28;
            }
            else {
                this.n = 0;
            }
        label_16:
            z = false;
        }
        else if(loadType0 != LoadType.PREPEND) {
            throw new IllegalArgumentException("unexpected result type " + loadType0);
        }
        else if(!z3 || !z1) {
            this.getStorage$paging_common_release().prependPage$paging_common_release(pagingSource$LoadResult$Page0, this);
            int v1 = this.m - list0.size();
            this.m = v1;
            if(v1 <= 0 || list0.isEmpty()) {
                z = false;
            }
        }
        else {
            this.m = 0;
            z = false;
        }
    label_28:
        if(z2) {
            LegacyPageFetcher legacyPageFetcher0 = this.u;
            if(!z1) {
                if(!(legacyPageFetcher0.getLoadStateManager().getEndState() instanceof Loading) && this.getStorage$paging_common_release().trimFromEnd$paging_common_release(this.s, this.getConfig().maxSize, this.getRequiredRemainder$paging_common_release(), this)) {
                    legacyPageFetcher0.getLoadStateManager().setState(loadType1, NotLoading.Companion.getIncomplete$paging_common_release());
                }
            }
            else if(!(legacyPageFetcher0.getLoadStateManager().getStartState() instanceof Loading) && this.getStorage$paging_common_release().trimFromFront$paging_common_release(this.s, this.getConfig().maxSize, this.getRequiredRemainder$paging_common_release(), this)) {
                NotLoading loadState$NotLoading0 = NotLoading.Companion.getIncomplete$paging_common_release();
                legacyPageFetcher0.getLoadStateManager().setState(LoadType.PREPEND, loadState$NotLoading0);
            }
        }
        this.b(loadType0, list0);
        return z;
    }

    @Override  // androidx.paging.PagedStorage$Callback
    public void onPagesRemoved(int v, int v1) {
        this.notifyRemoved(v, v1);
    }

    @Override  // androidx.paging.PagedStorage$Callback
    public void onPagesSwappedToPlaceholder(int v, int v1) {
        this.notifyChanged(v, v1);
    }

    @Override  // androidx.paging.LegacyPageFetcher$PageConsumer
    public void onStateChanged(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadType0, "type");
        Intrinsics.checkNotNullParameter(loadState0, "state");
        this.dispatchStateChangeAsync$paging_common_release(loadType0, loadState0);
    }

    @Override  // androidx.paging.PagedList
    public void retry() {
        super.retry();
        this.u.retry();
        if(this.u.getLoadStateManager().getRefreshState() instanceof Error) {
            Runnable runnable0 = this.getRefreshRetryCallback$paging_common_release();
            if(runnable0 != null) {
                runnable0.run();
            }
        }
    }

    @Override  // androidx.paging.PagedList
    public void setInitialLoadState(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(loadState0, "loadState");
        this.u.getLoadStateManager().setState(loadType0, loadState0);
    }
}

