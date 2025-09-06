package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig.Builder;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.a;

@Deprecated(message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer<T>", imports = {"androidx.paging.AsyncPagingDataDiffer"}))
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010!\n\u0002\b\u000E\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002_`B#\b\u0017\u0012\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u00A2\u0006\u0004\b\u0007\u0010\bB\u001F\b\u0017\u0012\u0006\u0010\n\u001A\u00020\t\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B\u00A2\u0006\u0004\b\u0007\u0010\rJ\u0019\u0010\u0010\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u000F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0015\u001A\u00020\u00142\u000E\u0010\u0013\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0015\u001A\u00020\u00142\u000E\u0010\u0013\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0019JM\u0010#\u001A\u00020\u00142\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010 \u001A\u00020\u000E2\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0000\u00A2\u0006\u0004\b!\u0010\"J\u001D\u0010&\u001A\u00020\u00142\f\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00000$H\u0016\u00A2\u0006\u0004\b&\u0010\'J7\u0010&\u001A\u00020\u00142(\u0010)\u001A$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00140(\u00A2\u0006\u0004\b&\u0010*J\u001D\u0010+\u001A\u00020\u00142\f\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00000$H\u0016\u00A2\u0006\u0004\b+\u0010\'J7\u0010+\u001A\u00020\u00142(\u0010)\u001A$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00140(\u00A2\u0006\u0004\b+\u0010*J)\u0010.\u001A\u00020\u00142\u0018\u0010%\u001A\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00140(H\u0016\u00A2\u0006\u0004\b.\u0010*J)\u0010/\u001A\u00020\u00142\u0018\u0010%\u001A\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00140(H\u0016\u00A2\u0006\u0004\b/\u0010*R\"\u00100\u001A\u00020\t8\u0000@\u0000X\u0080.\u00A2\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u00105R&\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B8\u0000X\u0080\u0004\u00A2\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010;\u001A\u0004\b8\u00109R\"\u0010C\u001A\u00020<8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\"\u0004\bA\u0010BR,\u0010J\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0D8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010;\u001A\u0004\bG\u0010HR(\u0010R\u001A\u00020\u000E8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0004\bK\u0010L\u0012\u0004\bQ\u0010;\u001A\u0004\bM\u0010N\"\u0004\bO\u0010PR2\u0010X\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00140(0S8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010WR\u0014\u0010Z\u001A\u00020\u000E8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bY\u0010NR\"\u0010^\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\b]\u0010;\u001A\u0004\b[\u0010\\\u00A8\u0006a"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Landroidx/recyclerview/widget/ListUpdateCallback;", "listUpdateCallback", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "config", "(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "", "index", "getItem", "(I)Ljava/lang/Object;", "Landroidx/paging/PagedList;", "pagedList", "", "submitList", "(Landroidx/paging/PagedList;)V", "Ljava/lang/Runnable;", "commitCallback", "(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "newList", "diffSnapshot", "Landroidx/paging/PlaceholderPaddedDiffResult;", "diffResult", "Landroidx/paging/RecordingCallback;", "recordingCallback", "lastAccessIndex", "latchPagedList$paging_runtime_release", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Landroidx/paging/PlaceholderPaddedDiffResult;Landroidx/paging/RecordingCallback;ILjava/lang/Runnable;)V", "latchPagedList", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "listener", "addPagedListListener", "(Landroidx/paging/AsyncPagedListDiffer$PagedListListener;)V", "Lkotlin/Function2;", "callback", "(Lkotlin/jvm/functions/Function2;)V", "removePagedListListener", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "addLoadStateListener", "removeLoadStateListener", "updateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "getUpdateCallback$paging_runtime_release", "()Landroidx/recyclerview/widget/ListUpdateCallback;", "setUpdateCallback$paging_runtime_release", "(Landroidx/recyclerview/widget/ListUpdateCallback;)V", "a", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime_release", "()Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime_release$annotations", "()V", "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor$paging_runtime_release", "()Ljava/util/concurrent/Executor;", "setMainThreadExecutor$paging_runtime_release", "(Ljava/util/concurrent/Executor;)V", "mainThreadExecutor", "Ljava/util/concurrent/CopyOnWriteArrayList;", "c", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release$annotations", "listeners", "f", "I", "getMaxScheduledGeneration$paging_runtime_release", "()I", "setMaxScheduledGeneration$paging_runtime_release", "(I)V", "getMaxScheduledGeneration$paging_runtime_release$annotations", "maxScheduledGeneration", "", "i", "Ljava/util/List;", "getLoadStateListeners$paging_runtime_release", "()Ljava/util/List;", "loadStateListeners", "getItemCount", "itemCount", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "currentList", "androidx/paging/c", "PagedListListener", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAsyncPagedListDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncPagedListDiffer.kt\nandroidx/paging/AsyncPagedListDiffer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1855#2,2:595\n*S KotlinDebug\n*F\n+ 1 AsyncPagedListDiffer.kt\nandroidx/paging/AsyncPagedListDiffer\n*L\n505#1:595,2\n*E\n"})
public class AsyncPagedListDiffer {
    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002J(\u0010\u0003\u001A\u00020\u00042\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "T", "", "onCurrentListChanged", "", "previousList", "Landroidx/paging/PagedList;", "currentList", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface PagedListListener {
        void onCurrentListChanged(@Nullable PagedList arg1, @Nullable PagedList arg2);
    }

    public final AsyncDifferConfig a;
    public Executor b;
    public final CopyOnWriteArrayList c;
    public PagedList d;
    public PagedList e;
    public int f;
    public final androidx.paging.AsyncPagedListDiffer.loadStateManager.1 g;
    public final d h;
    public final CopyOnWriteArrayList i;
    public final androidx.paging.AsyncPagedListDiffer.pagedListCallback.1 j;
    public ListUpdateCallback updateCallback;

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                config.diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public AsyncPagedListDiffer(@NotNull ListUpdateCallback listUpdateCallback0, @NotNull AsyncDifferConfig asyncDifferConfig0) {
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "listUpdateCallback");
        Intrinsics.checkNotNullParameter(asyncDifferConfig0, "config");
        super();
        Executor executor0 = ArchTaskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executor0, "getMainThreadExecutor()");
        this.b = executor0;
        this.c = new CopyOnWriteArrayList();
        androidx.paging.AsyncPagedListDiffer.loadStateManager.1 asyncPagedListDiffer$loadStateManager$10 = new androidx.paging.AsyncPagedListDiffer.loadStateManager.1(this);
        this.g = asyncPagedListDiffer$loadStateManager$10;
        this.h = new d(asyncPagedListDiffer$loadStateManager$10);
        this.i = new CopyOnWriteArrayList();
        this.j = new androidx.paging.AsyncPagedListDiffer.pagedListCallback.1(this);
        this.setUpdateCallback$paging_runtime_release(listUpdateCallback0);
        this.a = asyncDifferConfig0;
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public AsyncPagedListDiffer(@NotNull Adapter recyclerView$Adapter0, @NotNull ItemCallback diffUtil$ItemCallback0) {
        Intrinsics.checkNotNullParameter(recyclerView$Adapter0, "adapter");
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        super();
        Executor executor0 = ArchTaskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executor0, "getMainThreadExecutor()");
        this.b = executor0;
        this.c = new CopyOnWriteArrayList();
        androidx.paging.AsyncPagedListDiffer.loadStateManager.1 asyncPagedListDiffer$loadStateManager$10 = new LoadStateManager() {
            @Override  // androidx.paging.PagedList$LoadStateManager
            public void onStateChanged(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
                Intrinsics.checkNotNullParameter(loadType0, "type");
                Intrinsics.checkNotNullParameter(loadState0, "state");
                for(Object object0: this.d.getLoadStateListeners$paging_runtime_release()) {
                    ((Function2)object0).invoke(loadType0, loadState0);
                }
            }
        };
        this.g = asyncPagedListDiffer$loadStateManager$10;
        this.h = new d(asyncPagedListDiffer$loadStateManager$10);
        this.i = new CopyOnWriteArrayList();
        this.j = new Callback() {
            @Override  // androidx.paging.PagedList$Callback
            public void onChanged(int v, int v1) {
                this.a.getUpdateCallback$paging_runtime_release().onChanged(v, v1, null);
            }

            @Override  // androidx.paging.PagedList$Callback
            public void onInserted(int v, int v1) {
                this.a.getUpdateCallback$paging_runtime_release().onInserted(v, v1);
            }

            @Override  // androidx.paging.PagedList$Callback
            public void onRemoved(int v, int v1) {
                this.a.getUpdateCallback$paging_runtime_release().onRemoved(v, v1);
            }
        };
        this.setUpdateCallback$paging_runtime_release(new AdapterListUpdateCallback(recyclerView$Adapter0));
        AsyncDifferConfig asyncDifferConfig0 = new Builder(diffUtil$ItemCallback0).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfig0, "Builder(diffCallback).build()");
        this.a = asyncDifferConfig0;
    }

    public final void a(PagedList pagedList0, PagedList pagedList1, Runnable runnable0) {
        for(Object object0: this.c) {
            ((PagedListListener)object0).onCurrentListChanged(pagedList0, pagedList1);
        }
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    public void addLoadStateListener(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "listener");
        PagedList pagedList0 = this.d;
        if(pagedList0 == null) {
            this.g.dispatchCurrentLoadState(function20);
        }
        else {
            pagedList0.addWeakLoadStateListener(function20);
        }
        this.i.add(function20);
    }

    public void addPagedListListener(@NotNull PagedListListener asyncPagedListDiffer$PagedListListener0) {
        Intrinsics.checkNotNullParameter(asyncPagedListDiffer$PagedListListener0, "listener");
        this.c.add(asyncPagedListDiffer$PagedListListener0);
    }

    public final void addPagedListListener(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "callback");
        c c0 = new c(function20);
        this.c.add(c0);
    }

    @NotNull
    public final AsyncDifferConfig getConfig$paging_runtime_release() {
        return this.a;
    }

    public static void getConfig$paging_runtime_release$annotations() {
    }

    @Nullable
    public PagedList getCurrentList() {
        return this.e == null ? this.d : this.e;
    }

    public static void getCurrentList$annotations() {
    }

    @Nullable
    public Object getItem(int v) {
        PagedList pagedList0 = this.e;
        PagedList pagedList1 = this.d;
        if(pagedList0 != null) {
            return pagedList0.get(v);
        }
        if(pagedList1 == null) {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        pagedList1.loadAround(v);
        return pagedList1.get(v);
    }

    public int getItemCount() {
        PagedList pagedList0 = this.getCurrentList();
        return pagedList0 == null ? 0 : pagedList0.size();
    }

    @NotNull
    public final CopyOnWriteArrayList getListeners$paging_runtime_release() {
        return this.c;
    }

    @VisibleForTesting
    public static void getListeners$paging_runtime_release$annotations() {
    }

    @NotNull
    public final List getLoadStateListeners$paging_runtime_release() {
        return this.i;
    }

    @NotNull
    public final Executor getMainThreadExecutor$paging_runtime_release() {
        return this.b;
    }

    public final int getMaxScheduledGeneration$paging_runtime_release() {
        return this.f;
    }

    public static void getMaxScheduledGeneration$paging_runtime_release$annotations() {
    }

    @NotNull
    public final ListUpdateCallback getUpdateCallback$paging_runtime_release() {
        ListUpdateCallback listUpdateCallback0 = this.updateCallback;
        if(listUpdateCallback0 != null) {
            return listUpdateCallback0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateCallback");
        return null;
    }

    public final void latchPagedList$paging_runtime_release(@NotNull PagedList pagedList0, @NotNull PagedList pagedList1, @NotNull PlaceholderPaddedDiffResult placeholderPaddedDiffResult0, @NotNull RecordingCallback recordingCallback0, int v, @Nullable Runnable runnable0) {
        Intrinsics.checkNotNullParameter(pagedList0, "newList");
        Intrinsics.checkNotNullParameter(pagedList1, "diffSnapshot");
        Intrinsics.checkNotNullParameter(placeholderPaddedDiffResult0, "diffResult");
        Intrinsics.checkNotNullParameter(recordingCallback0, "recordingCallback");
        PagedList pagedList2 = this.e;
        if(pagedList2 == null || this.d != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.d = pagedList0;
        pagedList0.addWeakLoadStateListener(this.h);
        this.e = null;
        PlaceholderPaddedListDiffHelperKt.dispatchDiff(pagedList2.getPlaceholderPaddedList(), this.getUpdateCallback$paging_runtime_release(), pagedList1.getPlaceholderPaddedList(), placeholderPaddedDiffResult0);
        recordingCallback0.dispatchRecordingTo(this.j);
        pagedList0.addWeakCallback(this.j);
        if(!pagedList0.isEmpty()) {
            pagedList0.loadAround(kotlin.ranges.c.coerceIn(PlaceholderPaddedListDiffHelperKt.transformAnchorIndex(pagedList2.getPlaceholderPaddedList(), placeholderPaddedDiffResult0, pagedList1.getPlaceholderPaddedList(), v), 0, pagedList0.size() - 1));
        }
        this.a(pagedList2, this.d, runnable0);
    }

    public void removeLoadStateListener(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "listener");
        this.i.remove(function20);
        PagedList pagedList0 = this.d;
        if(pagedList0 != null) {
            pagedList0.removeWeakLoadStateListener(function20);
        }
    }

    public void removePagedListListener(@NotNull PagedListListener asyncPagedListDiffer$PagedListListener0) {
        Intrinsics.checkNotNullParameter(asyncPagedListDiffer$PagedListListener0, "listener");
        this.c.remove(asyncPagedListDiffer$PagedListListener0);
    }

    public final void removePagedListListener(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "callback");
        e e0 = new e(function20);
        o.removeAll(this.c, e0);
    }

    public final void setMainThreadExecutor$paging_runtime_release(@NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(executor0, "<set-?>");
        this.b = executor0;
    }

    public final void setMaxScheduledGeneration$paging_runtime_release(int v) {
        this.f = v;
    }

    public final void setUpdateCallback$paging_runtime_release(@NotNull ListUpdateCallback listUpdateCallback0) {
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "<set-?>");
        this.updateCallback = listUpdateCallback0;
    }

    public void submitList(@Nullable PagedList pagedList0) {
        this.submitList(pagedList0, null);
    }

    public void submitList(@Nullable PagedList pagedList0, @Nullable Runnable runnable0) {
        int v = this.f + 1;
        this.f = v;
        PagedList pagedList1 = this.d;
        if(pagedList0 == pagedList1) {
            if(runnable0 != null) {
                runnable0.run();
            }
            return;
        }
        d d0 = this.h;
        androidx.paging.AsyncPagedListDiffer.pagedListCallback.1 asyncPagedListDiffer$pagedListCallback$10 = this.j;
        if(pagedList1 != null && pagedList0 instanceof InitialPagedList) {
            pagedList1.removeWeakCallback(asyncPagedListDiffer$pagedListCallback$10);
            pagedList1.removeWeakLoadStateListener(d0);
            this.g.setState(LoadType.REFRESH, Loading.INSTANCE);
            NotLoading loadState$NotLoading0 = new NotLoading(false);
            this.g.setState(LoadType.PREPEND, loadState$NotLoading0);
            NotLoading loadState$NotLoading1 = new NotLoading(false);
            this.g.setState(LoadType.APPEND, loadState$NotLoading1);
            if(runnable0 != null) {
                runnable0.run();
            }
            return;
        }
        PagedList pagedList2 = this.getCurrentList();
        if(pagedList0 == null) {
            int v1 = this.getItemCount();
            if(pagedList1 != null) {
                pagedList1.removeWeakCallback(asyncPagedListDiffer$pagedListCallback$10);
                pagedList1.removeWeakLoadStateListener(d0);
                this.d = null;
            }
            else if(this.e != null) {
                this.e = null;
            }
            this.getUpdateCallback$paging_runtime_release().onRemoved(0, v1);
            this.a(pagedList2, null, runnable0);
            return;
        }
        if(this.getCurrentList() == null) {
            this.d = pagedList0;
            pagedList0.addWeakLoadStateListener(d0);
            pagedList0.addWeakCallback(asyncPagedListDiffer$pagedListCallback$10);
            this.getUpdateCallback$paging_runtime_release().onInserted(0, pagedList0.size());
            this.a(null, pagedList0, runnable0);
            return;
        }
        PagedList pagedList3 = this.d;
        if(pagedList3 != null) {
            pagedList3.removeWeakCallback(asyncPagedListDiffer$pagedListCallback$10);
            pagedList3.removeWeakLoadStateListener(d0);
            List list0 = pagedList3.snapshot();
            Intrinsics.checkNotNull(list0, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer.submitList$lambda$0>");
            this.e = (PagedList)list0;
            this.d = null;
        }
        PagedList pagedList4 = this.e;
        if(pagedList4 == null || this.d != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        List list1 = pagedList0.snapshot();
        Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
        RecordingCallback recordingCallback0 = new RecordingCallback();
        pagedList0.addWeakCallback(recordingCallback0);
        this.a.getBackgroundThreadExecutor().execute(new a(pagedList4, ((PagedList)list1), this, v, pagedList0, recordingCallback0, runnable0));
    }
}

