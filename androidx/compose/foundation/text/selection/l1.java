package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;

public final class l1 extends SelectionMode {
    @Override  // androidx.compose.foundation.text.selection.SelectionMode
    public final int compare-3MmeM6k$foundation_release(long v, Rect rect0) {
        if(SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, v)) {
            return 0;
        }
        if(Float.compare(Offset.getX-impl(v), rect0.getLeft()) < 0) {
            return -1;
        }
        return Offset.getY-impl(v) >= rect0.getTop() || Offset.getX-impl(v) >= rect0.getRight() ? 1 : -1;
    }
}

