package androidx.recyclerview.widget;

import androidx.core.util.Preconditions;

public final class z0 extends AdapterDataObserver {
    public final a1 a;

    public z0(a1 a10) {
        this.a = a10;
        super();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onChanged() {
        this.a.e = this.a.c.getItemCount();
        this.a.d.onChanged(this.a);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeChanged(int v, int v1) {
        this.a.d.onItemRangeChanged(this.a, v, v1, null);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeChanged(int v, int v1, Object object0) {
        this.a.d.onItemRangeChanged(this.a, v, v1, object0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeInserted(int v, int v1) {
        this.a.e += v1;
        l l0 = this.a.d;
        l0.onItemRangeInserted(this.a, v, v1);
        if(this.a.e > 0 && this.a.c.getStateRestorationPolicy() == StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            l0.b();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeMoved(int v, int v1, int v2) {
        Preconditions.checkArgument(v2 == 1, "moving more than 1 item is not supported in RecyclerView");
        this.a.d.onItemRangeMoved(this.a, v, v1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeRemoved(int v, int v1) {
        this.a.e -= v1;
        l l0 = this.a.d;
        l0.onItemRangeRemoved(this.a, v, v1);
        if(this.a.e < 1 && this.a.c.getStateRestorationPolicy() == StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            l0.b();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onStateRestorationPolicyChanged() {
        this.a.d.b();
    }
}

