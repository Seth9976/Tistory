package y0;

import androidx.compose.runtime.BitVector;
import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class k1 implements Iterable, Iterator, KMappedMarker {
    public final SlotTable a;
    public final int b;
    public final int c;
    public final int d;
    public final BitVector e;
    public int f;

    public k1(SlotTable slotTable0, int v, GroupSourceInformation groupSourceInformation0) {
        this.a = slotTable0;
        int v1 = SlotTableKt.access$dataAnchor(slotTable0.getGroups(), v);
        this.b = v1;
        this.c = groupSourceInformation0.getDataStartOffset();
        this.d = groupSourceInformation0.getDataEndOffset() > 0 ? groupSourceInformation0.getDataEndOffset() : (v + 1 >= slotTable0.getGroupsSize() ? slotTable0.getSlotsSize() : SlotTableKt.access$dataAnchor(slotTable0.getGroups(), v + 1)) - v1;
        BitVector bitVector0 = new BitVector();
        ArrayList arrayList0 = groupSourceInformation0.getGroups();
        if(arrayList0 != null) {
            int v2 = arrayList0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = arrayList0.get(v3);
                if(object0 instanceof GroupSourceInformation) {
                    bitVector0.setRange(((GroupSourceInformation)object0).getDataStartOffset(), ((GroupSourceInformation)object0).getDataEndOffset());
                }
            }
        }
        this.e = bitVector0;
        this.f = bitVector0.nextClear(this.c);
    }

    @Override
    public final boolean hasNext() {
        return this.f < this.d;
    }

    @Override
    public final Iterator iterator() {
        return this;
    }

    @Override
    public final Object next() {
        Object object0 = this.f < 0 || this.f >= this.d ? null : this.a.getSlots()[this.b + this.f];
        this.f = this.e.nextClear(this.f + 1);
        return object0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

