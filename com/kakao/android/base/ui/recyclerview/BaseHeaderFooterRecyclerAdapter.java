package com.kakao.android.base.ui.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u001E\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H&\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\f\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H&\u00A2\u0006\u0004\b\f\u0010\u000BJ\'\u0010\u000F\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\rH&\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\rH&\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0017\u001A\u00020\u00132\u0006\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0016\u001A\u00020\rH&\u00A2\u0006\u0004\b\u0017\u0010\u0015J\u001F\u0010\u0018\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\rH\u0017\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001A\u001A\u00020\u00132\u0006\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u001A\u0010\u0015J\u000F\u0010\u001B\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001D\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\rH\u0017\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010\u001F\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\rH\u0004\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\u0015\u0010 \u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\r\u00A2\u0006\u0004\b \u0010!J\u001D\u0010$\u001A\u00020\u00132\u0006\u0010\"\u001A\u00020\r2\u0006\u0010#\u001A\u00020\r\u00A2\u0006\u0004\b$\u0010%J\u001D\u0010&\u001A\u00020\u00132\u0006\u0010\"\u001A\u00020\r2\u0006\u0010#\u001A\u00020\r\u00A2\u0006\u0004\b&\u0010%J\u0015\u0010\'\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\r\u00A2\u0006\u0004\b\'\u0010!R\u001A\u0010+\u001A\u00020\r8\u0004X\u0084D\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u001CR\u001A\u0010.\u001A\u00020\r8\u0004X\u0084D\u00A2\u0006\f\n\u0004\b,\u0010)\u001A\u0004\b-\u0010\u001CR\u001A\u0010/\u001A\u00020\r8\u0004X\u0084D\u00A2\u0006\f\n\u0004\b/\u0010)\u001A\u0004\b0\u0010\u001C\u00A8\u00061"}, d2 = {"Lcom/kakao/android/base/ui/recyclerview/BaseHeaderFooterRecyclerAdapter;", "T", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;", "<init>", "()V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateHeaderViewHolder", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateFooterViewHolder", "", "viewType", "onCreateItemViewHolder", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "", "onBindHeaderFooterViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "itemPosition", "onBindItemViewHolder", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onBindViewHolder", "getItemCount", "()I", "getItemViewType", "(I)I", "getContentItemPosition", "notifyContentItemInserted", "(I)V", "positionStart", "itemCount", "notifyContentItemRangeInserted", "(II)V", "notifyContentItemRangeRemoved", "notifyContentItemChanged", "l", "I", "getVIEW_TYPE_HEADER", "VIEW_TYPE_HEADER", "m", "getVIEW_TYPE_FOOTER", "VIEW_TYPE_FOOTER", "VIEW_TYPE_ITEM", "getVIEW_TYPE_ITEM", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseHeaderFooterRecyclerAdapter extends BaseRecyclerAdapter {
    public final int l;
    public final int m;

    public BaseHeaderFooterRecyclerAdapter() {
        this.l = -2;
        this.m = -1;
        this.setHasHeader(true);
        this.setHasFooter(true);
    }

    // 去混淆评级： 低(20)
    public final int getContentItemPosition(int v) {
        return this.getHasHeader() ? v - 1 : v;
    }

    @Override  // com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter
    public int getItemCount() {
        int v = this.getItems().size();
        if(this.getHasHeader()) {
            ++v;
        }
        return this.getHasFooter() ? v + 1 : v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @CallSuper
    public int getItemViewType(int v) {
        if(this.getHasHeader() && v == 0) {
            return this.l;
        }
        return !this.getHasFooter() || v != this.getItemCount() - 1 ? 0 : this.m;
    }

    public final int getVIEW_TYPE_FOOTER() {
        return this.m;
    }

    public final int getVIEW_TYPE_HEADER() {
        return this.l;
    }

    public final int getVIEW_TYPE_ITEM() [...] // Inlined contents

    public final void notifyContentItemChanged(int v) {
        if(this.getHasHeader()) {
            ++v;
        }
        this.notifyItemChanged(v);
    }

    public final void notifyContentItemInserted(int v) {
        if(this.getHasHeader()) {
            ++v;
        }
        this.notifyItemInserted(v);
    }

    public final void notifyContentItemRangeInserted(int v, int v1) {
        if(this.getHasHeader()) {
            ++v;
        }
        this.notifyItemRangeInserted(v, v1);
    }

    public final void notifyContentItemRangeRemoved(int v, int v1) {
        if(this.getHasHeader()) {
            ++v;
        }
        this.notifyItemRangeRemoved(v, v1);
    }

    public abstract void onBindHeaderFooterViewHolder(@NotNull ViewHolder arg1, int arg2);

    public abstract void onBindItemViewHolder(@NotNull ViewHolder arg1, int arg2);

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        int v1 = this.getItemViewType(v);
        if(v1 == this.l || v1 == this.m) {
            this.onBindHeaderFooterViewHolder(recyclerView$ViewHolder0, v);
            return;
        }
        if(this.getHasHeader()) {
            this.onBindItemViewHolder(recyclerView$ViewHolder0, v - 1);
            return;
        }
        this.onBindItemViewHolder(recyclerView$ViewHolder0, v);
    }

    @NotNull
    public abstract ViewHolder onCreateFooterViewHolder(@NotNull LayoutInflater arg1, @NotNull ViewGroup arg2);

    @NotNull
    public abstract ViewHolder onCreateHeaderViewHolder(@NotNull LayoutInflater arg1, @NotNull ViewGroup arg2);

    @NotNull
    public abstract ViewHolder onCreateItemViewHolder(@NotNull LayoutInflater arg1, @NotNull ViewGroup arg2, int arg3);

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @CallSuper
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(this.getHasHeader() && v == this.l) {
            Intrinsics.checkNotNull(layoutInflater0);
            return this.onCreateHeaderViewHolder(layoutInflater0, viewGroup0);
        }
        if(this.getHasFooter() && v == this.m) {
            Intrinsics.checkNotNull(layoutInflater0);
            return this.onCreateFooterViewHolder(layoutInflater0, viewGroup0);
        }
        Intrinsics.checkNotNull(layoutInflater0);
        return this.onCreateItemViewHolder(layoutInflater0, viewGroup0, v);
    }
}

