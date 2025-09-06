package n2;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.TextForegroundStyle;

public final class b implements TextForegroundStyle {
    public final long a;

    public b(long v) {
        this.a = v;
        if(v == 16L) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? Color.equals-impl0(this.a, ((b)object0).a) : false;
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public final float getAlpha() {
        return Color.getAlpha-impl(this.a);
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public final Brush getBrush() {
        return null;
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public final long getColor-0d7_KjU() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.a);
    }

    @Override
    public final String toString() {
        return "ColorStyle(value=" + Color.toString-impl(this.a) + ')';
    }
}

