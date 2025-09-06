package k1;

import androidx.compose.ui.ZIndexNode;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final Placeable w;
    public final ZIndexNode x;

    public g(Placeable placeable0, ZIndexNode zIndexNode0) {
        this.w = placeable0;
        this.x = zIndexNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.x.getZIndex();
        ((PlacementScope)object0).place(this.w, 0, 0, f);
        return Unit.INSTANCE;
    }
}

