package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class mj extends Lambda implements Function3 {
    public final Density w;
    public final Animatable x;

    public mj(Density density0, Animatable animatable0) {
        this.w = density0;
        this.x = animatable0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        LayoutDirection layoutDirection0 = (LayoutDirection)object2;
        float f = Dp.constructor-impl((1.0f - ((Number)this.x.getValue()).floatValue()) * SearchBar_androidKt.b);
        float f1 = this.w.toPx-0680j_4(f);
        Path.addRoundRect$default(((Path)object0), RoundRectKt.RoundRect-sniSvfs(SizeKt.toRect-uvyYCjk(((Size)object1).unbox-impl()), CornerRadiusKt.CornerRadius$default(f1, 0.0f, 2, null)), null, 2, null);
        return Unit.INSTANCE;
    }
}

