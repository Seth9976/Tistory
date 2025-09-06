package m0;

import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.MeasureInputs.Companion.mutationPolicy.1;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.MeasureInputs.Companion;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

public final class b1 {
    public final Density a;
    public final LayoutDirection b;
    public final Resolver c;
    public final long d;
    public final float e;
    public final float f;
    public static final TextFieldLayoutStateCache.MeasureInputs.Companion g;
    public static final TextFieldLayoutStateCache.MeasureInputs.Companion.mutationPolicy.1 h;

    static {
        b1.g = new TextFieldLayoutStateCache.MeasureInputs.Companion(null);
        b1.h = new TextFieldLayoutStateCache.MeasureInputs.Companion.mutationPolicy.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public b1(Density density0, LayoutDirection layoutDirection0, Resolver fontFamily$Resolver0, long v) {
        this.a = density0;
        this.b = layoutDirection0;
        this.c = fontFamily$Resolver0;
        this.d = v;
        this.e = density0.getDensity();
        this.f = density0.getFontScale();
    }

    @Override
    public final String toString() {
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + Constraints.toString-impl(this.d) + ')';
    }
}

