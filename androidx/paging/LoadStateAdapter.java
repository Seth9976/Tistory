package androidx.paging;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\n\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\b¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0011\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\n\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0015H&¢\u0006\u0004\b\n\u0010\u0017J\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\u0015H&¢\u0006\u0004\b\u000F\u0010\u0018J\u0017\u0010\u0019\u001A\u00020\b2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u001C\u0010\u001DR*\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00158\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/paging/LoadStateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroidx/paging/LoadState;", "loadState", "(Landroid/view/ViewGroup;Landroidx/paging/LoadState;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/paging/LoadState;)V", "getStateViewType", "(Landroidx/paging/LoadState;)I", "", "displayLoadStateAsItem", "(Landroidx/paging/LoadState;)Z", "g", "Landroidx/paging/LoadState;", "getLoadState", "()Landroidx/paging/LoadState;", "setLoadState", "(Landroidx/paging/LoadState;)V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class LoadStateAdapter extends Adapter {
    public LoadState g;

    public LoadStateAdapter() {
        this.g = new NotLoading(false);
    }

    public boolean displayLoadStateAsItem(@NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadState0, "loadState");
        return loadState0 instanceof Loading || loadState0 instanceof Error;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemCount() {
        return this.displayLoadStateAsItem(this.g);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemViewType(int v) {
        return this.getStateViewType(this.g);
    }

    @NotNull
    public final LoadState getLoadState() {
        return this.g;
    }

    public int getStateViewType(@NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadState0, "loadState");
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        this.onBindViewHolder(recyclerView$ViewHolder0, this.g);
    }

    public abstract void onBindViewHolder(@NotNull ViewHolder arg1, @NotNull LoadState arg2);

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public final ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        return this.onCreateViewHolder(viewGroup0, this.g);
    }

    @NotNull
    public abstract ViewHolder onCreateViewHolder(@NotNull ViewGroup arg1, @NotNull LoadState arg2);

    public final void setLoadState(@NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadState0, "loadState");
        if(!Intrinsics.areEqual(this.g, loadState0)) {
            boolean z = this.displayLoadStateAsItem(this.g);
            boolean z1 = this.displayLoadStateAsItem(loadState0);
            if(z && !z1) {
                this.notifyItemRemoved(0);
            }
            else if(z1 && !z) {
                this.notifyItemInserted(0);
            }
            else if(z && z1) {
                this.notifyItemChanged(0);
            }
            this.g = loadState0;
        }
    }
}

