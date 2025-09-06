package p0;

import androidx.compose.material.BottomSheetState;
import androidx.compose.material.BottomSheetValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class p1 extends Lambda implements Function0 {
    public final int w;
    public final BottomSheetState x;
    public final CoroutineScope y;

    public p1(BottomSheetState bottomSheetState0, CoroutineScope coroutineScope0, int v) {
        this.w = v;
        this.x = bottomSheetState0;
        this.y = coroutineScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            BottomSheetState bottomSheetState0 = this.x;
            if(((Boolean)bottomSheetState0.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Collapsed)).booleanValue()) {
                q1 q10 = new q1(bottomSheetState0, null);
                BuildersKt.launch$default(this.y, null, null, q10, 3, null);
            }
            return true;
        }
        BottomSheetState bottomSheetState1 = this.x;
        if(((Boolean)bottomSheetState1.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Expanded)).booleanValue()) {
            o1 o10 = new o1(bottomSheetState1, null);
            BuildersKt.launch$default(this.y, null, null, o10, 3, null);
        }
        return true;
    }
}

