package com.kakao.tistory.presentation.view.common.bottomsheet;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter.BaseRecyclerViewHolder;
import com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.databinding.ItemAccessibilityBottomDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u000E\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007J\u0018\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0006\u001A\u00020\u0007H\u0016J\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/bottomsheet/AccessibilityBottomDialogAdapter;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;", "Lcom/kakao/tistory/presentation/view/common/bottomsheet/AccessibilitySwipeItemType;", "()V", "checkNeedDivider", "", "position", "", "onBindViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BottomAccessibilityItemViewHolder", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AccessibilityBottomDialogAdapter extends BaseRecyclerAdapter {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001R\b\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/bottomsheet/AccessibilityBottomDialogAdapter$BottomAccessibilityItemViewHolder;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter$BaseRecyclerViewHolder;", "Lcom/kakao/tistory/presentation/databinding/ItemAccessibilityBottomDialogBinding;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;", "Lcom/kakao/tistory/presentation/view/common/bottomsheet/AccessibilitySwipeItemType;", "dataBinding", "(Lcom/kakao/tistory/presentation/view/common/bottomsheet/AccessibilityBottomDialogAdapter;Lcom/kakao/tistory/presentation/databinding/ItemAccessibilityBottomDialogBinding;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public final class BottomAccessibilityItemViewHolder extends BaseRecyclerViewHolder {
        public BottomAccessibilityItemViewHolder(@NotNull ItemAccessibilityBottomDialogBinding itemAccessibilityBottomDialogBinding0) {
            Intrinsics.checkNotNullParameter(itemAccessibilityBottomDialogBinding0, "dataBinding");
            super(itemAccessibilityBottomDialogBinding0);
        }
    }

    public static final int $stable;

    public final boolean checkNeedDivider(int v) {
        return v != this.getItemCount() - 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        Object object0 = this.getItems().get(v);
        ((BottomAccessibilityItemViewHolder)recyclerView$ViewHolder0).bind(BR.swipeItem, object0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(viewGroup0.getContext()), layout.item_accessibility_bottom_dialog, viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        return new BottomAccessibilityItemViewHolder(this, ((ItemAccessibilityBottomDialogBinding)viewDataBinding0));
    }
}

