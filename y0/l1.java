package y0;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotTable;
import g.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class l1 implements Iterator, KMappedMarker {
    public final SlotTable a;
    public final int b;
    public final GroupSourceInformation c;
    public final a d;
    public final int e;
    public int f;

    public l1(SlotTable slotTable0, int v, GroupSourceInformation groupSourceInformation0, a a0) {
        this.a = slotTable0;
        this.b = v;
        this.c = groupSourceInformation0;
        this.d = a0;
        this.e = slotTable0.getVersion$runtime_release();
    }

    @Override
    public final boolean hasNext() {
        ArrayList arrayList0 = this.c.getGroups();
        return arrayList0 != null && this.f < arrayList0.size();
    }

    @Override
    public final Object next() {
        Object object0;
        ArrayList arrayList0 = this.c.getGroups();
        if(arrayList0 == null) {
            object0 = null;
        }
        else {
            int v = this.f;
            this.f = v + 1;
            object0 = arrayList0.get(v);
        }
        SlotTable slotTable0 = this.a;
        if(object0 instanceof Anchor) {
            return new s0(((Anchor)object0).getLocation$runtime_release(), slotTable0, this.e);
        }
        if(object0 instanceof GroupSourceInformation) {
            q0 q00 = new q0(this.d, this.f - 1);
            return new m1(slotTable0, this.b, ((GroupSourceInformation)object0), q00);
        }
        ComposerKt.composeRuntimeError("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

