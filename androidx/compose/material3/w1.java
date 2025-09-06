package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w1 extends Lambda implements Function1 {
    public final SheetState w;
    public final float x;
    public final float y;
    public final float z;

    public w1(SheetState sheetState0, float f, float f1, float f2) {
        this.w = sheetState0;
        this.x = f;
        this.y = f1;
        this.z = f2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SheetState sheetState0 = this.w;
        float f = this.y;
        float f1 = this.x;
        if(!sheetState0.getSkipPartiallyExpanded$material3_release()) {
            ((DraggableAnchorsConfig)object0).at(SheetValue.PartiallyExpanded, f1 - f);
        }
        float f2 = this.z;
        if(f2 != f) {
            ((DraggableAnchorsConfig)object0).at(SheetValue.Expanded, Math.max(f1 - f2, 0.0f));
        }
        if(!sheetState0.getSkipHiddenState$material3_release()) {
            ((DraggableAnchorsConfig)object0).at(SheetValue.Hidden, f1);
        }
        return Unit.INSTANCE;
    }
}

