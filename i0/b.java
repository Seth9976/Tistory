package i0;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import r0.a;

public final class b implements CornerSize, InspectableValue {
    public final float a;

    public b(float f) {
        this.a = f;
        if(f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? Float.compare(this.a, ((b)object0).a) == 0 : false;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return a.n(new StringBuilder(), this.a, '%');
    }

    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    @Override  // androidx.compose.foundation.shape.CornerSize
    public final float toPx-TmRCtEA(long v, Density density0) {
        float f = Size.getMinDimension-impl(v);
        return this.a / 100.0f * f;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CornerSize(size = ");
        return androidx.room.a.h(this.a, "%)", stringBuilder0);
    }
}

