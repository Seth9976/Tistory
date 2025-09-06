package p0;

import aa.e0;
import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.DraggableAnchors;
import androidx.compose.material.DrawerState;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v3 extends Lambda implements Function0 {
    public final DrawerState w;
    public final Density x;
    public final float y;

    public v3(DrawerState drawerState0, Density density0, float f) {
        this.w = drawerState0;
        this.x = density0;
        this.y = f;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.setDensity$material_release(this.x);
        DraggableAnchors draggableAnchors0 = AnchoredDraggableKt.DraggableAnchors(new e0(this.y, 11));
        AnchoredDraggableState.updateAnchors$default(this.w.getAnchoredDraggableState$material_release(), draggableAnchors0, null, 2, null);
        return Unit.INSTANCE;
    }
}

