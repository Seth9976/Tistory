package com.kakao.keditor.plugin.pluginspec.poll.creator;

import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\b\u0010\u000B\u001A\u00020\fH\u0016J \u0010\r\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\nH\u0016J\u0018\u0010\u000F\u001A\u00020\u00102\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u0006H\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "adapter", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;", "(Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;)V", "getMovementFlags", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isItemViewSwipeEnabled", "", "onMove", "target", "onSwiped", "", "direction", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PollItemTouchHelperCallback extends Callback {
    @NotNull
    private final PollCreatorAdapter adapter;

    public PollItemTouchHelperCallback(@NotNull PollCreatorAdapter pollCreatorAdapter0) {
        Intrinsics.checkNotNullParameter(pollCreatorAdapter0, "adapter");
        super();
        this.adapter = pollCreatorAdapter0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0) {
        Intrinsics.checkNotNullParameter(recyclerView0, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
        return recyclerView$ViewHolder0 instanceof PollItemViewHolder ? 0x30C0F : 0;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean onMove(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0, @NotNull ViewHolder recyclerView$ViewHolder1) {
        Intrinsics.checkNotNullParameter(recyclerView0, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder1, "target");
        if(recyclerView$ViewHolder1 instanceof PollItemViewHolder) {
            int v = recyclerView$ViewHolder0.getAdapterPosition();
            int v1 = ((PollItemViewHolder)recyclerView$ViewHolder1).getAdapterPosition();
            this.adapter.onItemMove(v, v1);
            return true;
        }
        return false;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void onSwiped(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
    }
}

