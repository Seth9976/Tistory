package y0;

import androidx.compose.runtime.SlotTable;
import g.a;

public final class q0 extends a {
    public final a l;
    public final int m;

    public q0(a a0, int v) {
        this.l = a0;
        this.m = v;
    }

    @Override  // g.a
    public final Object w(SlotTable slotTable0) {
        return new n1(this.l.w(slotTable0), this.m);
    }
}

