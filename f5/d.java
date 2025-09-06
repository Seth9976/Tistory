package f5;

import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;

public abstract class d extends AdapterDataObserver {
    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public abstract void onChanged();

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeChanged(int v, int v1) {
        this.onChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeChanged(int v, int v1, Object object0) {
        this.onChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeInserted(int v, int v1) {
        this.onChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeMoved(int v, int v1, int v2) {
        this.onChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeRemoved(int v, int v1) {
        this.onChanged();
    }
}

