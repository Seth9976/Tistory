package t2;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import r0.a;

public final class b implements FontScaleConverter {
    public final float a;

    public b(float f) {
        this.a = f;
    }

    @Override  // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float convertDpToSp(float f) {
        return f / this.a;
    }

    @Override  // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float convertSpToDp(float f) {
        return f * this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? Float.compare(this.a, ((b)object0).a) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return a.n(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}

