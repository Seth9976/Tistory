package u;

import android.graphics.Rect;
import androidx.compose.foundation.RectListNode;
import androidx.compose.runtime.collection.MutableVector;

public final class v2 extends RectListNode {
    @Override  // androidx.compose.foundation.RectListNode
    public final MutableVector currentRects() {
        MutableVector mutableVector0 = new MutableVector(new Rect[16], 0);
        mutableVector0.addAll(mutableVector0.getSize(), this.getView().getPreferKeepClearRects());
        return mutableVector0;
    }

    @Override  // androidx.compose.foundation.RectListNode
    public final void updateRects(MutableVector mutableVector0) {
        this.getView().setPreferKeepClearRects(mutableVector0.asMutableList());
    }
}

