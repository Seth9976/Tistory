package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;

public final class m1 extends SelectionMode {
    @Override  // androidx.compose.foundation.text.selection.SelectionMode
    public final int compare-3MmeM6k$foundation_release(long v, Rect rect0) {
        if(SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, v)) {
            return 0;
        }
        if(Float.compare(Offset.getY-impl(v), rect0.getTop()) < 0) {
            return -1;
        }
        return Offset.getX-impl(v) >= rect0.getLeft() || Offset.getY-impl(v) >= rect0.getBottom() ? 1 : -1;
    }
}

