package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final LayoutNodeLayoutDelegate w;
    public final MeasurePassDelegate x;

    public v(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0, MeasurePassDelegate layoutNodeLayoutDelegate$MeasurePassDelegate0) {
        this.w = layoutNodeLayoutDelegate0;
        this.x = layoutNodeLayoutDelegate$MeasurePassDelegate0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PlacementScope placeable$PlacementScope0;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = this.w;
        NodeCoordinator nodeCoordinator0 = layoutNodeLayoutDelegate0.getOuterCoordinator().getWrappedBy$ui_release();
        if(nodeCoordinator0 == null) {
            placeable$PlacementScope0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a).getPlacementScope();
        }
        else {
            placeable$PlacementScope0 = nodeCoordinator0.getPlacementScope();
            if(placeable$PlacementScope0 == null) {
                placeable$PlacementScope0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a).getPlacementScope();
            }
        }
        MeasurePassDelegate layoutNodeLayoutDelegate$MeasurePassDelegate0 = this.x;
        Function1 function10 = layoutNodeLayoutDelegate$MeasurePassDelegate0.B;
        GraphicsLayer graphicsLayer0 = layoutNodeLayoutDelegate$MeasurePassDelegate0.C;
        if(graphicsLayer0 != null) {
            placeable$PlacementScope0.placeWithLayer-aW-9-wM(layoutNodeLayoutDelegate0.getOuterCoordinator(), layoutNodeLayoutDelegate$MeasurePassDelegate0.D, graphicsLayer0, layoutNodeLayoutDelegate$MeasurePassDelegate0.E);
            return Unit.INSTANCE;
        }
        if(function10 == null) {
            placeable$PlacementScope0.place-70tqf50(layoutNodeLayoutDelegate0.getOuterCoordinator(), layoutNodeLayoutDelegate$MeasurePassDelegate0.D, layoutNodeLayoutDelegate$MeasurePassDelegate0.E);
            return Unit.INSTANCE;
        }
        placeable$PlacementScope0.placeWithLayer-aW-9-wM(layoutNodeLayoutDelegate0.getOuterCoordinator(), layoutNodeLayoutDelegate$MeasurePassDelegate0.D, layoutNodeLayoutDelegate$MeasurePassDelegate0.E, function10);
        return Unit.INSTANCE;
    }
}

