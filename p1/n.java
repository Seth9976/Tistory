package p1;

import androidx.compose.ui.graphics.b;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final Placeable w;
    public final b x;

    public n(Placeable placeable0, b b0) {
        this.w = placeable0;
        this.x = b0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.placeWithLayer$default(((PlacementScope)object0), this.w, 0, 0, 0.0f, this.x.E, 4, null);
        return Unit.INSTANCE;
    }
}

