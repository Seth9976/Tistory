package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy.SlotIdsSet;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class w implements SubcomposeSlotReusePolicy {
    public final LazyLayoutItemContentFactory a;
    public final LinkedHashMap b;

    public w(LazyLayoutItemContentFactory lazyLayoutItemContentFactory0) {
        this.a = lazyLayoutItemContentFactory0;
        this.b = new LinkedHashMap();
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(Object object0, Object object1) {
        return Intrinsics.areEqual(this.a.getContentType(object0), this.a.getContentType(object1));
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(SlotIdsSet subcomposeSlotReusePolicy$SlotIdsSet0) {
        LinkedHashMap linkedHashMap0 = this.b;
        linkedHashMap0.clear();
        Iterator iterator0 = subcomposeSlotReusePolicy$SlotIdsSet0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = this.a.getContentType(object0);
            Integer integer0 = (Integer)linkedHashMap0.get(object1);
            int v = integer0 == null ? 0 : ((int)integer0);
            if(v == 7) {
                iterator0.remove();
            }
            else {
                linkedHashMap0.put(object1, ((int)(v + 1)));
            }
        }
    }
}

