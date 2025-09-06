package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m3 extends Lambda implements Function1 {
    public final n3 w;
    public final Placeable x;
    public final MeasureScope y;

    public m3(n3 n30, Placeable placeable0, MeasureScope measureScope0) {
        this.w = n30;
        this.x = placeable0;
        this.y = measureScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        n3 n30 = this.w;
        Placeable placeable0 = this.x;
        MeasureScope measureScope0 = this.y;
        if(n30.r) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, measureScope0.roundToPx-0680j_4(n30.n), measureScope0.roundToPx-0680j_4(n30.o), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
        PlacementScope.place$default(((PlacementScope)object0), placeable0, measureScope0.roundToPx-0680j_4(n30.n), measureScope0.roundToPx-0680j_4(n30.o), 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

