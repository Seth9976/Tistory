package y0;

import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class h implements Iterable, Iterator, KMappedMarker {
    public final SlotTable a;
    public final int b;
    public int c;

    public h(SlotTable slotTable0, int v) {
        this.a = slotTable0;
        int v1 = SlotTableKt.access$dataAnchor(slotTable0.getGroups(), v);
        this.b = v + 1 >= slotTable0.getGroupsSize() ? slotTable0.getSlotsSize() : SlotTableKt.access$dataAnchor(slotTable0.getGroups(), v + 1);
        this.c = v1;
    }

    @Override
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override
    public final Iterator iterator() {
        return this;
    }

    @Override
    public final Object next() {
        Object object0;
        int v = this.c;
        if(v >= 0) {
            SlotTable slotTable0 = this.a;
            object0 = v < slotTable0.getSlots().length ? slotTable0.getSlots()[this.c] : null;
        }
        else {
            object0 = null;
        }
        ++this.c;
        return object0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

