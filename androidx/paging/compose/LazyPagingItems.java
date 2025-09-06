package androidx.paging.compose;

import androidx.activity.d0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.PagingData;
import androidx.paging.PagingDataEvent;
import androidx.paging.PagingDataPresenter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import t4.b;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001D\b\u0000\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\n\u001A\u0004\u0018\u00018\u00002\u0006\u0010\t\u001A\u00020\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u0004\u0018\u00018\u00002\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\f\u0010\u000BJ\r\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\r¢\u0006\u0004\b\u0010\u0010\u000FJ\u0010\u0010\u0013\u001A\u00020\rH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\rH\u0080@¢\u0006\u0004\b\u0014\u0010\u0012R7\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00168F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR+\u0010%\u001A\u00020\u001F2\u0006\u0010\u0017\u001A\u00020\u001F8F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b \u0010\u0019\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010(\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b&\u0010\'¨\u0006)"}, d2 = {"Landroidx/paging/compose/LazyPagingItems;", "", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "flow", "<init>", "(Lkotlinx/coroutines/flow/Flow;)V", "", "index", "get", "(I)Ljava/lang/Object;", "peek", "", "retry", "()V", "refresh", "collectLoadState$paging_compose_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectLoadState", "collectPagingData$paging_compose_release", "collectPagingData", "Landroidx/paging/ItemSnapshotList;", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getItemSnapshotList", "()Landroidx/paging/ItemSnapshotList;", "setItemSnapshotList", "(Landroidx/paging/ItemSnapshotList;)V", "itemSnapshotList", "Landroidx/paging/CombinedLoadStates;", "e", "getLoadState", "()Landroidx/paging/CombinedLoadStates;", "setLoadState", "(Landroidx/paging/CombinedLoadStates;)V", "loadState", "getItemCount", "()I", "itemCount", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyPagingItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItems\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,230:1\n81#2:231\n107#2,2:232\n81#2:234\n107#2,2:235\n*S KotlinDebug\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItems\n*L\n88#1:231\n88#1:232,2\n160#1:234\n160#1:235,2\n*E\n"})
public final class LazyPagingItems {
    public static final int $stable = 8;
    public final Flow a;
    public final CoroutineContext b;
    public final androidx.paging.compose.LazyPagingItems.pagingDataPresenter.1 c;
    public final MutableState d;
    public final MutableState e;

    public LazyPagingItems(@NotNull Flow flow0) {
        Intrinsics.checkNotNullParameter(flow0, "flow");
        super();
        this.a = flow0;
        CoroutineContext coroutineContext0 = AndroidUiDispatcher.Companion.getMain();
        this.b = coroutineContext0;
        androidx.paging.compose.LazyPagingItems.pagingDataPresenter.1 lazyPagingItems$pagingDataPresenter$10 = new PagingDataPresenter((flow0 instanceof SharedFlow ? ((PagingData)CollectionsKt___CollectionsKt.firstOrNull(((SharedFlow)flow0).getReplayCache())) : null)/*ERROR_MISSING_ARG_2/*) {
            @Override  // androidx.paging.PagingDataPresenter
            @Nullable
            public Object presentPagingDataEvent(@NotNull PagingDataEvent pagingDataEvent0, @NotNull Continuation continuation0) {
                LazyPagingItems.access$updateItemSnapshotList(coroutineContext0);
                return Unit.INSTANCE;
            }
        };
        this.c = lazyPagingItems$pagingDataPresenter$10;
        this.d = SnapshotStateKt.mutableStateOf$default(lazyPagingItems$pagingDataPresenter$10.snapshot(), null, 2, null);
        CombinedLoadStates combinedLoadStates0 = (CombinedLoadStates)lazyPagingItems$pagingDataPresenter$10.getLoadStateFlow().getValue();
        if(combinedLoadStates0 == null) {
            combinedLoadStates0 = new CombinedLoadStates(LazyPagingItemsKt.a.getRefresh(), LazyPagingItemsKt.a.getPrepend(), LazyPagingItemsKt.a.getAppend(), LazyPagingItemsKt.a, null, 16, null);
        }
        this.e = SnapshotStateKt.mutableStateOf$default(combinedLoadStates0, null, 2, null);
    }

    public static final void access$setLoadState(LazyPagingItems lazyPagingItems0, CombinedLoadStates combinedLoadStates0) {
        lazyPagingItems0.e.setValue(combinedLoadStates0);
    }

    public static final void access$updateItemSnapshotList(LazyPagingItems lazyPagingItems0) {
        ItemSnapshotList itemSnapshotList0 = lazyPagingItems0.c.snapshot();
        lazyPagingItems0.d.setValue(itemSnapshotList0);
    }

    @Nullable
    public final Object collectLoadState$paging_compose_release(@NotNull Continuation continuation0) {
        Object object0 = FlowKt.filterNotNull(this.c.getLoadStateFlow()).collect(new d0(this, 12), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object collectPagingData$paging_compose_release(@NotNull Continuation continuation0) {
        b b0 = new b(this, null);
        Object object0 = FlowKt.collectLatest(this.a, b0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object get(int v) {
        this.c.get(v);
        return this.getItemSnapshotList().get(v);
    }

    public final int getItemCount() {
        return this.getItemSnapshotList().size();
    }

    @NotNull
    public final ItemSnapshotList getItemSnapshotList() {
        return (ItemSnapshotList)this.d.getValue();
    }

    @NotNull
    public final CombinedLoadStates getLoadState() {
        return (CombinedLoadStates)this.e.getValue();
    }

    @Nullable
    public final Object peek(int v) {
        return this.getItemSnapshotList().get(v);
    }

    public final void refresh() {
        this.c.refresh();
    }

    public final void retry() {
        this.c.retry();
    }
}

