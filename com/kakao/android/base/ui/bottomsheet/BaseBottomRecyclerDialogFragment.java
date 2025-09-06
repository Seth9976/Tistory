package com.kakao.android.base.ui.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.android.base.R.layout;
import com.kakao.android.base.databinding.FragmentBaseBottomRecyclerDialogBinding;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000ER*\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F8\u0014@VX\u0094\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/kakao/android/base/ui/bottomsheet/BaseBottomRecyclerDialogFragment;", "Lcom/kakao/android/base/ui/bottomsheet/BaseBottomSheetDialogFragment;", "Lcom/kakao/android/base/databinding/FragmentBaseBottomRecyclerDialogBinding;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "createLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "<set-?>", "B", "I", "getLayoutResourceId", "()I", "setLayoutResourceId", "(I)V", "layoutResourceId", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseBottomRecyclerDialogFragment extends BaseBottomSheetDialogFragment {
    public int B;

    public BaseBottomRecyclerDialogFragment() {
        this.B = layout.fragment_base_bottom_recycler_dialog;
    }

    @NotNull
    public abstract LayoutManager createLayoutManager();

    @Override  // com.kakao.android.base.ui.bottomsheet.BaseBottomSheetDialogFragment
    public int getLayoutResourceId() {
        return this.B;
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        RecyclerView recyclerView0 = ((FragmentBaseBottomRecyclerDialogBinding)this.getDataBinding()).bottomDialogRecyclerView;
        recyclerView0.setLayoutManager(this.createLayoutManager());
        recyclerView0.setItemAnimator(new DefaultItemAnimator());
    }

    public void setLayoutResourceId(int v) {
        this.B = v;
    }
}

