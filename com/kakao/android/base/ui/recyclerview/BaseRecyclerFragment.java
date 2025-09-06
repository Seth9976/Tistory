package com.kakao.android.base.ui.recyclerview;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.android.base.R.layout;
import com.kakao.android.base.databinding.FragmentRecyclerViewBinding;
import com.kakao.android.base.ui.BaseFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\rH\u0004¢\u0006\u0004\b\u000F\u0010\u0010R*\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00118\u0014@VX\u0094\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerFragment;", "Lcom/kakao/android/base/ui/BaseFragment;", "Lcom/kakao/android/base/databinding/FragmentRecyclerViewBinding;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "createLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/os/Bundle;)V", "", "enabled", "setSwipeRefreshEnabled", "(Z)V", "", "<set-?>", "C", "I", "getLayoutResourceId", "()I", "setLayoutResourceId", "(I)V", "layoutResourceId", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseRecyclerFragment extends BaseFragment {
    public int C;

    public BaseRecyclerFragment() {
        this.C = layout.fragment_recycler_view;
    }

    @NotNull
    public abstract LayoutManager createLayoutManager();

    @Override  // com.kakao.android.base.ui.BaseFragment
    public int getLayoutResourceId() {
        return this.C;
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onActivityCreated(@Nullable Bundle bundle0) {
        super.onActivityCreated(bundle0);
        RecyclerView recyclerView0 = ((FragmentRecyclerViewBinding)this.getDataBinding()).recyclerView;
        recyclerView0.setLayoutManager(this.createLayoutManager());
        recyclerView0.setItemAnimator(new DefaultItemAnimator());
    }

    public void setLayoutResourceId(int v) {
        this.C = v;
    }

    public final void setSwipeRefreshEnabled(boolean z) {
        ((FragmentRecyclerViewBinding)this.getDataBinding()).swipeRefreshLayout.setEnabled(z);
    }
}

