package i0;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

public final class a implements CornerSize, InspectableValue {
    public final float a;

    public a(float f) {
        this.a = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? Dp.equals-impl0(this.a, ((a)object0).a) : false;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return Dp.box-impl(this.a);
    }

    @Override
    public final int hashCode() {
        return Dp.hashCode-impl(this.a);
    }

    @Override  // androidx.compose.foundation.shape.CornerSize
    public final float toPx-TmRCtEA(long v, Density density0) {
        return density0.toPx-0680j_4(this.a);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CornerSize(size = ");
        return androidx.room.a.h(this.a, ".dp)", stringBuilder0);
    }
}

