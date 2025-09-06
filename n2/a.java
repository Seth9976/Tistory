package n2;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.style.TextForegroundStyle;
import kotlin.jvm.internal.Intrinsics;

public final class a implements TextForegroundStyle {
    public final ShaderBrush a;
    public final float b;

    public a(ShaderBrush shaderBrush0, float f) {
        this.a = shaderBrush0;
        this.b = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((a)object0).a) ? Float.compare(this.b, ((a)object0).b) == 0 : false;
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public final float getAlpha() {
        return this.b;
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public final Brush getBrush() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public final long getColor-0d7_KjU() {
        return Color.Companion.getUnspecified-0d7_KjU();
    }

    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BrushStyle(value=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", alpha=");
        return r0.a.n(stringBuilder0, this.b, ')');
    }
}

