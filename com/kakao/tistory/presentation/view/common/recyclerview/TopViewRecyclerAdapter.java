package com.kakao.tistory.presentation.view.common.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.android.base.ui.recyclerview.BaseHeaderFooterRecyclerAdapter;
import com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter.BaseRecyclerViewHolder;
import com.kakao.android.base.viewmodel.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0017J\u0018\u0010\n\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH&J\u0018\u0010\u000B\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016J\u0018\u0010\u0010\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0017J\u0018\u0010\u0011\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH&¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/recyclerview/TopViewRecyclerAdapter;", "T", "Lcom/kakao/android/base/ui/recyclerview/BaseHeaderFooterRecyclerAdapter;", "()V", "onBindHeaderFooterViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "onBindTopViewHolder", "onCreateFooterViewHolder", "layoutInflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onCreateHeaderViewHolder", "onCreateTopViewHolder", "BaseTopViewHolder", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class TopViewRecyclerAdapter extends BaseHeaderFooterRecyclerAdapter {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0096\u0004\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00032\u0012\u0012\u0004\u0012\u00028\u00010\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000F\u0012\u0006\u0010\u0007\u001A\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00028\u0002¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/recyclerview/TopViewRecyclerAdapter$BaseTopViewHolder;", "Landroidx/databinding/ViewDataBinding;", "VB", "Lcom/kakao/android/base/viewmodel/BaseViewModel;", "VM", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter$BaseRecyclerViewHolder;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;", "dataBinding", "<init>", "(Lcom/kakao/tistory/presentation/view/common/recyclerview/TopViewRecyclerAdapter;Landroidx/databinding/ViewDataBinding;)V", "", "viewModelBindingVariableId", "viewModel", "", "bind", "(ILcom/kakao/android/base/viewmodel/BaseViewModel;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public class BaseTopViewHolder extends BaseRecyclerViewHolder {
        public final ViewDataBinding a;

        public BaseTopViewHolder(@NotNull ViewDataBinding viewDataBinding0) {
            Intrinsics.checkNotNullParameter(viewDataBinding0, "dataBinding");
            super(viewDataBinding0);
            this.a = viewDataBinding0;
        }

        public final void bind(int v, @NotNull BaseViewModel baseViewModel0) {
            Intrinsics.checkNotNullParameter(baseViewModel0, "viewModel");
            this.a.setVariable(v, baseViewModel0);
            this.a.executePendingBindings();
        }
    }

    public static final int $stable;

    public TopViewRecyclerAdapter() {
        this.setHasFooter(false);
    }

    @Override  // com.kakao.android.base.ui.recyclerview.BaseHeaderFooterRecyclerAdapter
    @CallSuper
    public void onBindHeaderFooterViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        this.onBindTopViewHolder(recyclerView$ViewHolder0, v);
    }

    public abstract void onBindTopViewHolder(@NotNull ViewHolder arg1, int arg2);

    @Override  // com.kakao.android.base.ui.recyclerview.BaseHeaderFooterRecyclerAdapter
    @NotNull
    public ViewHolder onCreateFooterViewHolder(@NotNull LayoutInflater layoutInflater0, @NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        return this.onCreateItemViewHolder(layoutInflater0, viewGroup0, 0);
    }

    @Override  // com.kakao.android.base.ui.recyclerview.BaseHeaderFooterRecyclerAdapter
    @CallSuper
    @NotNull
    public ViewHolder onCreateHeaderViewHolder(@NotNull LayoutInflater layoutInflater0, @NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        return this.onCreateTopViewHolder(layoutInflater0, viewGroup0);
    }

    @NotNull
    public abstract ViewHolder onCreateTopViewHolder(@NotNull LayoutInflater arg1, @NotNull ViewGroup arg2);
}

