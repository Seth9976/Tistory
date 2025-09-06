package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class ff extends Lambda implements Function1 {
    public final DrawerState w;
    public final Placeable x;
    public final Placeable y;
    public final MutableState z;

    public ff(DrawerState drawerState0, Placeable placeable0, Placeable placeable1, MutableState mutableState0) {
        this.w = drawerState0;
        this.x = placeable0;
        this.y = placeable1;
        this.z = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DrawerState drawerState0 = this.w;
        float f = drawerState0.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
        Placeable placeable0 = this.x;
        float f1 = -((float)placeable0.getWidth());
        MutableState mutableState0 = this.z;
        if(!NavigationDrawerKt.access$DismissibleNavigationDrawer$lambda$16(mutableState0) || f != f1) {
            if(!NavigationDrawerKt.access$DismissibleNavigationDrawer$lambda$16(mutableState0)) {
                NavigationDrawerKt.access$DismissibleNavigationDrawer$lambda$17(mutableState0, true);
            }
            AnchoredDraggableState.updateAnchors$default(drawerState0.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new ef(f1)), null, 2, null);
        }
        int v = c.roundToInt(drawerState0.requireOffset$material3_release());
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.y, v + placeable0.getWidth(), 0, 0.0f, 4, null);
        int v1 = c.roundToInt(drawerState0.requireOffset$material3_release());
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.x, v1, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

