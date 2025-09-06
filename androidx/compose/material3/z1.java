package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class z1 extends Lambda implements Function0 {
    public final int w;
    public final CoroutineScope x;
    public final SheetState y;

    public z1(SheetState sheetState0, CoroutineScope coroutineScope0) {
        this.w = 3;
        this.y = sheetState0;
        this.x = coroutineScope0;
        super(0);
    }

    public z1(CoroutineScope coroutineScope0, SheetState sheetState0, int v) {
        this.w = v;
        this.x = coroutineScope0;
        this.y = sheetState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                y1 y10 = new y1(this.y, null);
                BuildersKt.launch$default(this.x, null, null, y10, 3, null);
                return true;
            }
            case 1: {
                a2 a20 = new a2(this.y, null);
                BuildersKt.launch$default(this.x, null, null, a20, 3, null);
                return true;
            }
            case 2: {
                b2 b20 = new b2(this.y, null);
                BuildersKt.launch$default(this.x, null, null, b20, 3, null);
                return true;
            }
            default: {
                SheetState sheetState0 = this.y;
                if(((Boolean)sheetState0.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded)).booleanValue()) {
                    ae ae0 = new ae(sheetState0, null);
                    BuildersKt.launch$default(this.x, null, null, ae0, 3, null);
                }
                return true;
            }
        }
    }
}

