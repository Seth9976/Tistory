package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function0 {
    public final TextFieldSelectionState w;

    public d0(TextFieldSelectionState textFieldSelectionState0) {
        this.w = textFieldSelectionState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextFieldSelectionState textFieldSelectionState0 = this.w;
        boolean z = TextRange.getCollapsed-impl(textFieldSelectionState0.a.getVisualText().getSelection-d9O1mEE());
        if((z && TextFieldSelectionState.access$getTextToolbarState(textFieldSelectionState0) == TextToolbarState.Cursor || !z && TextFieldSelectionState.access$getTextToolbarState(textFieldSelectionState0) == TextToolbarState.Selection) && textFieldSelectionState0.getDraggingHandle() == null && textFieldSelectionState0.isInTouchMode()) {
            LayoutCoordinates layoutCoordinates0 = textFieldSelectionState0.d();
            Rect rect0 = null;
            Rect rect1 = layoutCoordinates0 == null ? null : SelectionManagerKt.visibleBounds(layoutCoordinates0);
            if(rect1 != null) {
                LayoutCoordinates layoutCoordinates1 = textFieldSelectionState0.d();
                Offset offset0 = layoutCoordinates1 == null ? null : Offset.box-impl(layoutCoordinates1.localToRoot-MK-Hz9U(rect1.getTopLeft-F1C5BW0()));
                Intrinsics.checkNotNull(offset0);
                Rect rect2 = RectKt.Rect-tz77jQw(offset0.unbox-impl(), rect1.getSize-NH-jbRc());
                Rect rect3 = TextFieldSelectionState.access$getContentRect(textFieldSelectionState0);
                if(rect2.overlaps(rect3)) {
                    rect0 = rect3;
                }
                if(rect0 != null) {
                    Rect rect4 = rect0.intersect(rect2);
                    return rect4 == null ? Rect.Companion.getZero() : rect4;
                }
                return Rect.Companion.getZero();
            }
            return Rect.Companion.getZero();
        }
        return Rect.Companion.getZero();
    }
}

