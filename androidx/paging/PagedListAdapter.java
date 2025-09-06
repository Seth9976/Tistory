package androidx.paging;

import aa.x;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.c1;
import s4.d1;

@Deprecated(message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter", replaceWith = @ReplaceWith(expression = "PagingDataAdapter<T, VH>", imports = {"androidx.paging.PagingDataAdapter"}))
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B\u0017\b\u0014\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u00A2\u0006\u0004\b\b\u0010\tB\u0017\b\u0014\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n\u00A2\u0006\u0004\b\b\u0010\fJ\u001F\u0010\u0010\u001A\u00020\u000F2\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001A\u00020\u000F2\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0014J\u0019\u0010\u0017\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0016\u001A\u00020\u0015H\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001F\u0010\u001C\u001A\u00020\u000F2\u000E\u0010\u001B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0017\u00A2\u0006\u0004\b\u001C\u0010\u0011J/\u0010\u001C\u001A\u00020\u000F2\u000E\u0010\u001D\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u000E\u0010\u001B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001EJ)\u0010#\u001A\u00020\u000F2\u0018\u0010\"\u001A\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000F0\u001FH\u0016\u00A2\u0006\u0004\b#\u0010$J)\u0010%\u001A\u00020\u000F2\u0018\u0010\"\u001A\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000F0\u001FH\u0016\u00A2\u0006\u0004\b%\u0010$J\u0019\u0010)\u001A\u00020(2\n\u0010\'\u001A\u0006\u0012\u0002\b\u00030&\u00A2\u0006\u0004\b)\u0010*J\u0019\u0010,\u001A\u00020(2\n\u0010+\u001A\u0006\u0012\u0002\b\u00030&\u00A2\u0006\u0004\b,\u0010*J%\u0010-\u001A\u00020(2\n\u0010\'\u001A\u0006\u0012\u0002\b\u00030&2\n\u0010+\u001A\u0006\u0012\u0002\b\u00030&\u00A2\u0006\u0004\b-\u0010.R&\u00106\u001A\b\u0012\u0004\u0012\u00028\u00000/8\u0000X\u0080\u0004\u00A2\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001A\u0004\b2\u00103R\"\u0010\u001B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\b9\u00105\u001A\u0004\b7\u00108\u00A8\u0006:"}, d2 = {"Landroidx/paging/PagedListAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "config", "(Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "Landroidx/paging/PagedList;", "pagedList", "", "submitList", "(Landroidx/paging/PagedList;)V", "Ljava/lang/Runnable;", "commitCallback", "(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "", "position", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "()I", "currentList", "onCurrentListChanged", "previousList", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "listener", "addLoadStateListener", "(Lkotlin/jvm/functions/Function2;)V", "removeLoadStateListener", "Landroidx/paging/LoadStateAdapter;", "header", "Landroidx/recyclerview/widget/ConcatAdapter;", "withLoadStateHeader", "(Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "footer", "withLoadStateFooter", "withLoadStateHeaderAndFooter", "(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "Landroidx/paging/AsyncPagedListDiffer;", "g", "Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime_release", "()Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime_release$annotations", "()V", "differ", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class PagedListAdapter extends Adapter {
    public final AsyncPagedListDiffer g;

    public PagedListAdapter(@NotNull AsyncDifferConfig asyncDifferConfig0) {
        Intrinsics.checkNotNullParameter(asyncDifferConfig0, "config");
        super();
        c1 c10 = new c1(this);
        AsyncPagedListDiffer asyncPagedListDiffer0 = new AsyncPagedListDiffer(new AdapterListUpdateCallback(this), asyncDifferConfig0);
        this.g = asyncPagedListDiffer0;
        asyncPagedListDiffer0.addPagedListListener(c10);
    }

    public PagedListAdapter(@NotNull ItemCallback diffUtil$ItemCallback0) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        super();
        c1 c10 = new c1(this);
        AsyncPagedListDiffer asyncPagedListDiffer0 = new AsyncPagedListDiffer(this, diffUtil$ItemCallback0);
        this.g = asyncPagedListDiffer0;
        asyncPagedListDiffer0.addPagedListListener(c10);
    }

    public void addLoadStateListener(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "listener");
        this.g.addLoadStateListener(function20);
    }

    @Nullable
    public PagedList getCurrentList() {
        return this.g.getCurrentList();
    }

    public static void getCurrentList$annotations() {
    }

    @NotNull
    public final AsyncPagedListDiffer getDiffer$paging_runtime_release() {
        return this.g;
    }

    public static void getDiffer$paging_runtime_release$annotations() {
    }

    @Nullable
    public Object getItem(int v) {
        return this.g.getItem(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.g.getItemCount();
    }

    @Deprecated(message = "Use the two argument variant instead.", replaceWith = @ReplaceWith(expression = "onCurrentListChanged(previousList, currentList)", imports = {}))
    public void onCurrentListChanged(@Nullable PagedList pagedList0) {
    }

    public void onCurrentListChanged(@Nullable PagedList pagedList0, @Nullable PagedList pagedList1) {
    }

    public void removeLoadStateListener(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "listener");
        this.g.removeLoadStateListener(function20);
    }

    public void submitList(@Nullable PagedList pagedList0) {
        this.g.submitList(pagedList0);
    }

    public void submitList(@Nullable PagedList pagedList0, @Nullable Runnable runnable0) {
        this.g.submitList(pagedList0, runnable0);
    }

    @NotNull
    public final ConcatAdapter withLoadStateFooter(@NotNull LoadStateAdapter loadStateAdapter0) {
        Intrinsics.checkNotNullParameter(loadStateAdapter0, "footer");
        this.addLoadStateListener(new d1(loadStateAdapter0, 0));
        return new ConcatAdapter(new Adapter[]{this, loadStateAdapter0});
    }

    @NotNull
    public final ConcatAdapter withLoadStateHeader(@NotNull LoadStateAdapter loadStateAdapter0) {
        Intrinsics.checkNotNullParameter(loadStateAdapter0, "header");
        this.addLoadStateListener(new d1(loadStateAdapter0, 1));
        return new ConcatAdapter(new Adapter[]{loadStateAdapter0, this});
    }

    @NotNull
    public final ConcatAdapter withLoadStateHeaderAndFooter(@NotNull LoadStateAdapter loadStateAdapter0, @NotNull LoadStateAdapter loadStateAdapter1) {
        Intrinsics.checkNotNullParameter(loadStateAdapter0, "header");
        Intrinsics.checkNotNullParameter(loadStateAdapter1, "footer");
        this.addLoadStateListener(new x(28, loadStateAdapter0, loadStateAdapter1));
        return new ConcatAdapter(new Adapter[]{loadStateAdapter0, this, loadStateAdapter1});
    }
}

