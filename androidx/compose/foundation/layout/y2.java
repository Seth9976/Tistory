package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class y2 extends Lambda implements Function1 {
    public final Placeable w;
    public final int x;
    public final int y;

    public y2(Placeable placeable0, int v, int v1) {
        this.w = placeable0;
        this.x = v;
        this.y = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.place$default(((PlacementScope)object0), this.w, this.x, this.y, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

