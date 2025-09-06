package u;

import android.graphics.Rect;
import androidx.compose.foundation.RectListNode;
import androidx.compose.runtime.collection.MutableVector;

public final class p1 extends RectListNode {
    @Override  // androidx.compose.foundation.RectListNode
    public final MutableVector currentRects() {
        MutableVector mutableVector0 = new MutableVector(new Rect[16], 0);
        mutableVector0.addAll(mutableVector0.getSize(), this.getView().getSystemGestureExclusionRects());
        return mutableVector0;
    }

    @Override  // androidx.compose.foundation.RectListNode
    public final void updateRects(MutableVector mutableVector0) {
        this.getView().setSystemGestureExclusionRects(mutableVector0.asMutableList());
    }
}

