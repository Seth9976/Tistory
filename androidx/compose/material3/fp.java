package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class fp extends Lambda implements Function1 {
    public final Placeable w;
    public final ip x;
    public final float y;

    public fp(Placeable placeable0, ip ip0, float f) {
        this.w = placeable0;
        this.x = ip0;
        this.y = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Animatable animatable0 = this.x.q;
        float f = animatable0 == null ? this.y : ((Number)animatable0.getValue()).floatValue();
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.w, ((int)f), 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

