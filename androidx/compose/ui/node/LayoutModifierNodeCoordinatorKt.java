package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,321:1\n42#2,7:322\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n*L\n299#1:322,7\n*E\n"})
public final class LayoutModifierNodeCoordinatorKt {
    public static final int access$calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable0, AlignmentLine alignmentLine0) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable1 = lookaheadCapablePlaceable0.getChild();
        if(lookaheadCapablePlaceable1 == null) {
            InlineClassHelperKt.throwIllegalStateException(("Child of " + lookaheadCapablePlaceable0 + " cannot be null when calculating alignment line"));
        }
        if(lookaheadCapablePlaceable0.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine0)) {
            Integer integer0 = (Integer)lookaheadCapablePlaceable0.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine0);
            return integer0 == null ? 0x80000000 : ((int)integer0);
        }
        int v = lookaheadCapablePlaceable1.get(alignmentLine0);
        if(v != 0x80000000) {
            lookaheadCapablePlaceable1.setShallowPlacing$ui_release(true);
            lookaheadCapablePlaceable0.setPlacingForAlignment$ui_release(true);
            lookaheadCapablePlaceable0.replace$ui_release();
            lookaheadCapablePlaceable1.setShallowPlacing$ui_release(false);
            lookaheadCapablePlaceable0.setPlacingForAlignment$ui_release(false);
            return alignmentLine0 instanceof HorizontalAlignmentLine ? IntOffset.getY-impl(lookaheadCapablePlaceable1.getPosition-nOcc-ac()) + v : IntOffset.getX-impl(lookaheadCapablePlaceable1.getPosition-nOcc-ac()) + v;
        }
        return 0x80000000;
    }
}

