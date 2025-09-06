package s;

import androidx.compose.animation.SharedTransitionScopeImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l1 extends Lambda implements Function1 {
    public final MeasureScope w;
    public final SharedTransitionScopeImpl x;
    public final Placeable y;

    public l1(MeasureScope measureScope0, SharedTransitionScopeImpl sharedTransitionScopeImpl0, Placeable placeable0) {
        this.w = measureScope0;
        this.x = sharedTransitionScopeImpl0;
        this.y = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LayoutCoordinates layoutCoordinates0 = ((PlacementScope)object0).getCoordinates();
        if(layoutCoordinates0 != null) {
            SharedTransitionScopeImpl sharedTransitionScopeImpl0 = this.x;
            if(this.w.isLookingAhead()) {
                sharedTransitionScopeImpl0.setNullableLookaheadRoot$animation_release(layoutCoordinates0);
            }
            else {
                sharedTransitionScopeImpl0.setRoot$animation_release(layoutCoordinates0);
            }
        }
        PlacementScope.place$default(((PlacementScope)object0), this.y, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

