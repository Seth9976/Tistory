package androidx.compose.material3;

import androidx.compose.material3.carousel.KeylinesKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function2 {
    public final int w;
    public final float x;
    public final Object y;

    public x1(Object object0, float f, int v) {
        this.w = v;
        this.y = object0;
        this.x = f;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SheetValue sheetValue1;
        if(this.w != 0) {
            float f = ((Density)this.y).toPx-0680j_4(this.x);
            return KeylinesKt.uncontainedKeylineList(((Density)this.y), ((Number)object0).floatValue(), f, ((Number)object1).floatValue());
        }
        long v = ((IntSize)object0).unbox-impl();
        DraggableAnchors draggableAnchors0 = AnchoredDraggableKt.DraggableAnchors(new w1(((SheetState)this.y), ((float)Constraints.getMaxHeight-impl(((Constraints)object1).unbox-impl())), this.x, ((float)IntSize.getHeight-impl(v))));
        SheetValue sheetValue0 = (SheetValue)((SheetState)this.y).getAnchoredDraggableState$material3_release().getTargetValue();
        switch(BottomSheetScaffoldKt.StandardBottomSheet.1.1.WhenMappings.$EnumSwitchMapping$0[sheetValue0.ordinal()]) {
            case 1: {
                return draggableAnchors0.hasAnchorFor(SheetValue.Hidden) ? TuplesKt.to(draggableAnchors0, SheetValue.Hidden) : TuplesKt.to(draggableAnchors0, sheetValue0);
            }
            case 2: {
                sheetValue1 = SheetValue.PartiallyExpanded;
                if(!draggableAnchors0.hasAnchorFor(sheetValue1)) {
                    sheetValue1 = SheetValue.Expanded;
                    if(!draggableAnchors0.hasAnchorFor(sheetValue1)) {
                        return draggableAnchors0.hasAnchorFor(SheetValue.Hidden) ? TuplesKt.to(draggableAnchors0, SheetValue.Hidden) : TuplesKt.to(draggableAnchors0, sheetValue0);
                    }
                }
                break;
            }
            case 3: {
                sheetValue1 = SheetValue.Expanded;
                if(!draggableAnchors0.hasAnchorFor(sheetValue1)) {
                    sheetValue1 = SheetValue.PartiallyExpanded;
                    if(!draggableAnchors0.hasAnchorFor(sheetValue1)) {
                        return draggableAnchors0.hasAnchorFor(SheetValue.Hidden) ? TuplesKt.to(draggableAnchors0, SheetValue.Hidden) : TuplesKt.to(draggableAnchors0, sheetValue0);
                    }
                }
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return TuplesKt.to(draggableAnchors0, sheetValue1);
    }
}

