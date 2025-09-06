package y0;

import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class m implements Iterator, KMappedMarker {
    public final SlotTable a;
    public final int b;
    public int c;
    public final int d;

    public m(int v, SlotTable slotTable0, int v1) {
        this.a = slotTable0;
        this.b = v1;
        this.c = v;
        this.d = slotTable0.getVersion$runtime_release();
        if(slotTable0.getWriter$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override
    public final Object next() {
        SlotTable slotTable0 = this.a;
        int v = this.d;
        if(slotTable0.getVersion$runtime_release() != v) {
            throw new ConcurrentModificationException();
        }
        int v1 = this.c;
        this.c = SlotTableKt.access$groupSize(slotTable0.getGroups(), v1) + v1;
        return new s0(v1, slotTable0, v);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

