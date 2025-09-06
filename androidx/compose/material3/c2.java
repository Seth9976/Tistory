package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class c2 extends Lambda implements Function1 {
    public final String A;
    public final CoroutineScope B;
    public final SheetState w;
    public final boolean x;
    public final String y;
    public final String z;

    public c2(SheetState sheetState0, boolean z, String s, String s1, String s2, CoroutineScope coroutineScope0) {
        this.w = sheetState0;
        this.x = z;
        this.y = s;
        this.z = s1;
        this.A = s2;
        this.B = coroutineScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SheetState sheetState0 = this.w;
        if(sheetState0.getAnchoredDraggableState$material3_release().getAnchors().getSize() > 1 && this.x) {
            SheetValue sheetValue0 = sheetState0.getCurrentValue();
            SheetValue sheetValue1 = SheetValue.PartiallyExpanded;
            CoroutineScope coroutineScope0 = this.B;
            if(sheetValue0 != sheetValue1) {
                if(((Boolean)sheetState0.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(sheetValue1)).booleanValue()) {
                    z1 z11 = new z1(coroutineScope0, sheetState0, 1);
                    SemanticsPropertiesKt.collapse(((SemanticsPropertyReceiver)object0), this.z, z11);
                }
            }
            else if(((Boolean)sheetState0.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded)).booleanValue()) {
                z1 z10 = new z1(coroutineScope0, sheetState0, 0);
                SemanticsPropertiesKt.expand(((SemanticsPropertyReceiver)object0), this.y, z10);
            }
            if(!sheetState0.getSkipHiddenState$material3_release()) {
                z1 z12 = new z1(coroutineScope0, sheetState0, 2);
                SemanticsPropertiesKt.dismiss(((SemanticsPropertyReceiver)object0), this.A, z12);
            }
        }
        return Unit.INSTANCE;
    }
}

