package y0;

import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class m1 implements CompositionGroup, Iterable, KMappedMarker {
    public final SlotTable a;
    public final int b;
    public final GroupSourceInformation c;
    public final q0 d;
    public final Integer e;
    public final m1 f;

    public m1(SlotTable slotTable0, int v, GroupSourceInformation groupSourceInformation0, q0 q00) {
        this.a = slotTable0;
        this.b = v;
        this.c = groupSourceInformation0;
        this.d = q00;
        this.e = groupSourceInformation0.getKey();
        this.f = this;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public final Iterable getCompositionGroups() {
        return this.f;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final Iterable getData() {
        return new k1(this.a, this.b, this.c);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getIdentity() {
        return this.d.w(this.a);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getKey() {
        return this.e;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getNode() {
        return null;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final String getSourceInfo() {
        return this.c.getSourceInformation();
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public final boolean isEmpty() {
        ArrayList arrayList0 = this.c.getGroups();
        return (arrayList0 == null || arrayList0.isEmpty() ? 0 : 1) ^ 1;
    }

    @Override
    public final Iterator iterator() {
        return new l1(this.a, this.b, this.c, this.d);
    }
}

