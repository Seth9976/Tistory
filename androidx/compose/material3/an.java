package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class an extends Lambda implements Function1 {
    public final Placeable w;
    public final MeasureScope x;
    public final float y;

    public an(Placeable placeable0, MeasureScope measureScope0, float f) {
        this.w = placeable0;
        this.x = measureScope0;
        this.y = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = this.x.roundToPx-0680j_4(this.y);
        PlacementScope.place$default(((PlacementScope)object0), this.w, v, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

