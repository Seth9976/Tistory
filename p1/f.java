package p1;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final Placeable w;
    public final BlockGraphicsLayerModifier x;

    public f(Placeable placeable0, BlockGraphicsLayerModifier blockGraphicsLayerModifier0) {
        this.w = placeable0;
        this.x = blockGraphicsLayerModifier0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Function1 function10 = this.x.getLayerBlock();
        PlacementScope.placeWithLayer$default(((PlacementScope)object0), this.w, 0, 0, 0.0f, function10, 4, null);
        return Unit.INSTANCE;
    }
}

