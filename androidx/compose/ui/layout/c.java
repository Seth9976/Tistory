package androidx.compose.ui.layout;

import java.util.Iterator;

public final class c implements SubcomposeSlotReusePolicy {
    public final int a;

    public c(int v) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(Object object0, Object object1) {
        return true;
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(SlotIdsSet subcomposeSlotReusePolicy$SlotIdsSet0) {
        int v = this.a;
        if(subcomposeSlotReusePolicy$SlotIdsSet0.size() > v) {
            int v1 = 0;
            Iterator iterator0 = subcomposeSlotReusePolicy$SlotIdsSet0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v1;
                if(v1 > v) {
                    iterator0.remove();
                }
            }
        }
    }
}

