package p0;

import androidx.compose.material.DraggableAnchors;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class b5 implements DraggableAnchors {
    public final Map a;

    public b5(Map map0) {
        this.a = map0;
    }

    @Override  // androidx.compose.material.DraggableAnchors
    public final Object closestAnchor(float f) {
        Iterator iterator0 = this.a.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            float f1 = Math.abs(f - ((Number)((Map.Entry)object0).getValue()).floatValue());
            while(true) {
                Object object1 = iterator0.next();
                float f2 = Math.abs(f - ((Number)((Map.Entry)object1).getValue()).floatValue());
                if(Float.compare(f1, f2) > 0) {
                    object0 = object1;
                    f1 = f2;
                }
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
        return ((Map.Entry)object0) == null ? null : ((Map.Entry)object0).getKey();
    }

    @Override  // androidx.compose.material.DraggableAnchors
    public final Object closestAnchor(float f, boolean z) {
        Iterator iterator0 = this.a.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            float f1 = ((Number)((Map.Entry)object0).getValue()).floatValue();
            float f2 = z ? f1 - f : f - f1;
            if(Float.compare(f2, 0.0f) < 0) {
                f2 = Infinityf;
            }
            while(true) {
                Object object1 = iterator0.next();
                float f3 = ((Number)((Map.Entry)object1).getValue()).floatValue();
                float f4 = z ? f3 - f : f - f3;
                if(f4 < 0.0f) {
                    f4 = Infinityf;
                }
                if(Float.compare(f2, f4) > 0) {
                    object0 = object1;
                    f2 = f4;
                }
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
        return ((Map.Entry)object0) == null ? null : ((Map.Entry)object0).getKey();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b5 ? Intrinsics.areEqual(this.a, ((b5)object0).a) : false;
    }

    @Override  // androidx.compose.material.DraggableAnchors
    public final int getSize() {
        return this.a.size();
    }

    @Override  // androidx.compose.material.DraggableAnchors
    public final boolean hasAnchorFor(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.material.DraggableAnchors
    public final float maxAnchor() {
        Float float0 = CollectionsKt___CollectionsKt.maxOrNull(this.a.values());
        return float0 == null ? NaNf : ((float)float0);
    }

    @Override  // androidx.compose.material.DraggableAnchors
    public final float minAnchor() {
        Float float0 = CollectionsKt___CollectionsKt.minOrNull(this.a.values());
        return float0 == null ? NaNf : ((float)float0);
    }

    @Override  // androidx.compose.material.DraggableAnchors
    public final float positionOf(Object object0) {
        Float float0 = (Float)this.a.get(object0);
        return float0 == null ? NaNf : ((float)float0);
    }

    @Override
    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}

