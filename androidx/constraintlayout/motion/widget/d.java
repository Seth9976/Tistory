package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

public abstract class d extends Key {
    protected static final float SELECTION_SLOPE = 20.0f;
    public int e;

    @Override  // androidx.constraintlayout.motion.widget.Key
    public final void getAttributeNames(HashSet hashSet0) {
    }

    public abstract boolean intersects(int arg1, int arg2, RectF arg3, RectF arg4, float arg5, float arg6);

    public abstract void positionAttributes(View arg1, RectF arg2, RectF arg3, float arg4, float arg5, String[] arg6, float[] arg7);
}

