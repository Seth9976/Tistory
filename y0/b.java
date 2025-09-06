package y0;

import androidx.compose.runtime.SlotTable;
import g.a;

public final class b extends a {
    public final int l;

    public b(int v) {
        this.l = v;
    }

    @Override  // g.a
    public final Object w(SlotTable slotTable0) {
        return slotTable0.anchor(this.l);
    }
}

