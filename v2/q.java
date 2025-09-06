package v2;

import android.graphics.Rect;
import android.view.View;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class q extends r {
    @Override  // v2.r
    public final void setGestureExclusionRects(View view0, int v, int v1) {
        view0.setSystemGestureExclusionRects(CollectionsKt__CollectionsKt.mutableListOf(new Rect[]{new Rect(0, 0, v, v1)}));
    }
}

