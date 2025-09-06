package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q3 extends Lambda implements Function1 {
    public final Placeable w;
    public final MeasureScope x;
    public final r3 y;

    public q3(Placeable placeable0, MeasureScope measureScope0, r3 r30) {
        this.w = placeable0;
        this.x = measureScope0;
        this.y = r30;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.y.n.calculateLeftPadding-u2uoSUM(this.x.getLayoutDirection());
        int v = this.x.roundToPx-0680j_4(f);
        float f1 = this.y.n.calculateTopPadding-D9Ej5fM();
        int v1 = this.x.roundToPx-0680j_4(f1);
        PlacementScope.place$default(((PlacementScope)object0), this.w, v, v1, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

