package y0;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class s0 implements CompositionGroup, Iterable, KMappedMarker {
    public final SlotTable a;
    public final int b;
    public final int c;

    public s0(int v, SlotTable slotTable0, int v1) {
        this.a = slotTable0;
        this.b = v;
        this.c = v1;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public final CompositionGroup find(Object object0) {
        if(object0 instanceof Anchor) {
            SlotTable slotTable0 = this.a;
            if(slotTable0.ownsAnchor(((Anchor)object0))) {
                int v = slotTable0.anchorIndex(((Anchor)object0));
                if(v >= this.b && v - this.b < SlotTableKt.access$groupSize(slotTable0.getGroups(), this.b)) {
                    return new s0(v, slotTable0, this.c);
                }
            }
        }
        else if(object0 instanceof n1) {
            CompositionGroup compositionGroup0 = this.find(((n1)object0).a);
            return compositionGroup0 == null ? null : ((CompositionGroup)CollectionsKt___CollectionsKt.firstOrNull(CollectionsKt___CollectionsKt.drop(compositionGroup0.getCompositionGroups(), ((n1)object0).b)));
        }
        return null;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public final Iterable getCompositionGroups() {
        return this;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final Iterable getData() {
        SlotTable slotTable0 = this.a;
        int v = this.b;
        GroupSourceInformation groupSourceInformation0 = slotTable0.sourceInformationOf(v);
        return groupSourceInformation0 != null ? new k1(slotTable0, v, groupSourceInformation0) : new h(slotTable0, v);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final int getGroupSize() {
        return SlotTableKt.access$groupSize(this.a.getGroups(), this.b);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getIdentity() {
        SlotTable slotTable0 = this.a;
        if(slotTable0.getVersion$runtime_release() == this.c) {
            try(SlotReader slotReader0 = slotTable0.openReader()) {
                return slotReader0.anchor(this.b);
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getKey() {
        SlotTable slotTable0 = this.a;
        int v = this.b;
        if(SlotTableKt.access$hasObjectKey(slotTable0.getGroups(), v)) {
            Integer integer0 = slotTable0.getSlots()[SlotTableKt.access$objectKeyIndex(slotTable0.getGroups(), v)];
            Intrinsics.checkNotNull(integer0);
            return integer0;
        }
        return SlotTableKt.access$key(slotTable0.getGroups(), v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getNode() {
        return SlotTableKt.access$isNode(this.a.getGroups(), this.b) ? this.a.getSlots()[SlotTableKt.access$nodeIndex(this.a.getGroups(), this.b)] : null;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final int getSlotsSize() {
        int v = this.getGroupSize() + this.b;
        return v >= this.a.getGroupsSize() ? this.a.getSlotsSize() - SlotTableKt.access$dataAnchor(this.a.getGroups(), this.b) : SlotTableKt.access$dataAnchor(this.a.getGroups(), v) - SlotTableKt.access$dataAnchor(this.a.getGroups(), this.b);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public final String getSourceInfo() {
        SlotTable slotTable0 = this.a;
        int v = this.b;
        if(SlotTableKt.access$hasAux(slotTable0.getGroups(), v)) {
            Object object0 = slotTable0.getSlots()[SlotTableKt.access$auxIndex(slotTable0.getGroups(), v)];
            return object0 instanceof String ? ((String)object0) : null;
        }
        GroupSourceInformation groupSourceInformation0 = slotTable0.sourceInformationOf(v);
        return groupSourceInformation0 == null ? null : groupSourceInformation0.getSourceInformation();
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public final boolean isEmpty() {
        return SlotTableKt.access$groupSize(this.a.getGroups(), this.b) == 0;
    }

    @Override
    public final Iterator iterator() {
        SlotTable slotTable0 = this.a;
        if(slotTable0.getVersion$runtime_release() != this.c) {
            throw new ConcurrentModificationException();
        }
        int v = this.b;
        GroupSourceInformation groupSourceInformation0 = slotTable0.sourceInformationOf(v);
        return groupSourceInformation0 != null ? new l1(slotTable0, v, groupSourceInformation0, new b(v)) : new m(v + 1, slotTable0, SlotTableKt.access$groupSize(slotTable0.getGroups(), v) + v);
    }
}

