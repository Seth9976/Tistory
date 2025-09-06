package androidx.recyclerview.widget;

public final class z extends OnScrollListener {
    public final b0 a;

    public z(b0 b00) {
        this.a = b00;
        super();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void onScrolled(RecyclerView recyclerView0, int v, int v1) {
        int v2 = recyclerView0.computeHorizontalScrollOffset();
        int v3 = recyclerView0.computeVerticalScrollOffset();
        b0 b00 = this.a;
        int v4 = b00.E.computeVerticalScrollRange();
        int v5 = b00.D;
        b00.F = v4 - v5 > 0 && v5 >= b00.m;
        int v6 = b00.E.computeHorizontalScrollRange();
        int v7 = b00.C;
        boolean z = v6 - v7 > 0 && v7 >= b00.m;
        b00.G = z;
        boolean z1 = b00.F;
        if(z1 || z) {
            if(z1) {
                b00.x = (int)((((float)v5) / 2.0f + ((float)v3)) * ((float)v5) / ((float)v4));
                b00.w = Math.min(v5, v5 * v5 / v4);
            }
            if(b00.G) {
                b00.A = (int)((((float)v7) / 2.0f + ((float)v2)) * ((float)v7) / ((float)v6));
                b00.z = Math.min(v7, v7 * v7 / v6);
            }
            if(b00.H == 0 || b00.H == 1) {
                b00.d(1);
            }
        }
        else if(b00.H != 0) {
            b00.d(0);
        }
    }
}

