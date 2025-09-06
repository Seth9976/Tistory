package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class cf extends Lambda implements Function0 {
    public final int w;
    public final DrawerState x;
    public final CoroutineScope y;

    public cf(DrawerState drawerState0, CoroutineScope coroutineScope0, int v) {
        this.w = v;
        this.x = drawerState0;
        this.y = coroutineScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            DrawerState drawerState0 = this.x;
            if(((Boolean)drawerState0.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed)).booleanValue()) {
                lf lf0 = new lf(drawerState0, null);
                BuildersKt.launch$default(this.y, null, null, lf0, 3, null);
            }
            return true;
        }
        DrawerState drawerState1 = this.x;
        if(((Boolean)drawerState1.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed)).booleanValue()) {
            bf bf0 = new bf(drawerState1, null);
            BuildersKt.launch$default(this.y, null, null, bf0, 3, null);
        }
        return true;
    }
}

