package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class nf extends Lambda implements Function1 {
    public final MutableFloatState A;
    public final DrawerState w;
    public final int x;
    public final ArrayList y;
    public final MutableState z;

    public nf(DrawerState drawerState0, int v, ArrayList arrayList0, MutableState mutableState0, MutableFloatState mutableFloatState0) {
        this.w = drawerState0;
        this.x = v;
        this.y = arrayList0;
        this.z = mutableState0;
        this.A = mutableFloatState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DrawerState drawerState0 = this.w;
        float f = drawerState0.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
        float f1 = -((float)this.x);
        MutableState mutableState0 = this.z;
        if(!NavigationDrawerKt.access$ModalNavigationDrawer_FHprtrg$lambda$2(mutableState0) || f != f1) {
            if(!NavigationDrawerKt.access$ModalNavigationDrawer_FHprtrg$lambda$2(mutableState0)) {
                NavigationDrawerKt.access$ModalNavigationDrawer_FHprtrg$lambda$3(mutableState0, true);
            }
            NavigationDrawerKt.access$ModalNavigationDrawer_FHprtrg$lambda$6(this.A, f1);
            AnchoredDraggableState.updateAnchors$default(drawerState0.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new mf(this.A)), null, 2, null);
        }
        ArrayList arrayList0 = this.y;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v1)), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

