package e8;

import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import com.google.android.material.tabs.TabLayoutMediator;

public final class e extends AdapterDataObserver {
    public final TabLayoutMediator a;

    public e(TabLayoutMediator tabLayoutMediator0) {
        this.a = tabLayoutMediator0;
        super();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onChanged() {
        this.a.a();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeChanged(int v, int v1) {
        this.a.a();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeChanged(int v, int v1, Object object0) {
        this.a.a();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeInserted(int v, int v1) {
        this.a.a();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeMoved(int v, int v1, int v2) {
        this.a.a();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeRemoved(int v, int v1) {
        this.a.a();
    }
}

