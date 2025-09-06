package androidx.recyclerview.widget;

public final class w1 extends OnScrollListener {
    public boolean a;
    public final SnapHelper b;

    public w1(SnapHelper snapHelper0) {
        this.b = snapHelper0;
        super();
        this.a = false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView0, int v) {
        super.onScrollStateChanged(recyclerView0, v);
        if(v == 0 && this.a) {
            this.a = false;
            this.b.a();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void onScrolled(RecyclerView recyclerView0, int v, int v1) {
        if(v != 0 || v1 != 0) {
            this.a = true;
        }
    }
}

