package p0;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class k5 extends Lambda implements Function0 {
    public final int w;
    public final ModalBottomSheetState x;
    public final CoroutineScope y;

    public k5(ModalBottomSheetState modalBottomSheetState0, CoroutineScope coroutineScope0, int v) {
        this.w = v;
        this.x = modalBottomSheetState0;
        this.y = coroutineScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                ModalBottomSheetState modalBottomSheetState1 = this.x;
                if(((Boolean)modalBottomSheetState1.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                    j5 j50 = new j5(modalBottomSheetState1, null);
                    BuildersKt.launch$default(this.y, null, null, j50, 3, null);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ModalBottomSheetState modalBottomSheetState2 = this.x;
                if(((Boolean)modalBottomSheetState2.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                    m5 m50 = new m5(modalBottomSheetState2, null);
                    BuildersKt.launch$default(this.y, null, null, m50, 3, null);
                }
                return true;
            }
            case 2: {
                ModalBottomSheetState modalBottomSheetState3 = this.x;
                if(((Boolean)modalBottomSheetState3.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded)).booleanValue()) {
                    n5 n50 = new n5(modalBottomSheetState3, null);
                    BuildersKt.launch$default(this.y, null, null, n50, 3, null);
                }
                return true;
            }
            default: {
                ModalBottomSheetState modalBottomSheetState0 = this.x;
                if(((Boolean)modalBottomSheetState0.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded)).booleanValue()) {
                    o5 o50 = new o5(modalBottomSheetState0, null);
                    BuildersKt.launch$default(this.y, null, null, o50, 3, null);
                }
                return true;
            }
        }
    }
}

