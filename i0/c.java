package i0;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.room.a;

public final class c implements CornerSize, InspectableValue {
    public final float a;

    public c(float f) {
        this.a = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? Float.compare(this.a, ((c)object0).a) == 0 : false;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        StringBuilder stringBuilder0 = new StringBuilder();
        return a.h(this.a, "px", stringBuilder0);
    }

    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    @Override  // androidx.compose.foundation.shape.CornerSize
    public final float toPx-TmRCtEA(long v, Density density0) {
        return this.a;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CornerSize(size = ");
        return a.h(this.a, ".px)", stringBuilder0);
    }
}

