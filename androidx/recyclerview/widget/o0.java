package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R.id;

public final class o0 implements ItemTouchUIUtil {
    public static final o0 a;

    static {
        o0.a = new o0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.recyclerview.widget.ItemTouchUIUtil
    public final void clearView(View view0) {
        Object object0 = view0.getTag(id.item_touch_helper_previous_elevation);
        if(object0 instanceof Float) {
            ViewCompat.setElevation(view0, ((float)(((Float)object0))));
        }
        view0.setTag(id.item_touch_helper_previous_elevation, null);
        view0.setTranslationX(0.0f);
        view0.setTranslationY(0.0f);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchUIUtil
    public final void onDraw(Canvas canvas0, RecyclerView recyclerView0, View view0, float f, float f1, int v, boolean z) {
        if(z && view0.getTag(id.item_touch_helper_previous_elevation) == null) {
            Float float0 = ViewCompat.getElevation(view0);
            int v1 = recyclerView0.getChildCount();
            float f2 = 0.0f;
            for(int v2 = 0; v2 < v1; ++v2) {
                View view1 = recyclerView0.getChildAt(v2);
                if(view1 != view0) {
                    float f3 = ViewCompat.getElevation(view1);
                    if(f3 > f2) {
                        f2 = f3;
                    }
                }
            }
            ViewCompat.setElevation(view0, f2 + 1.0f);
            view0.setTag(id.item_touch_helper_previous_elevation, float0);
        }
        view0.setTranslationX(f);
        view0.setTranslationY(f1);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchUIUtil
    public final void onDrawOver(Canvas canvas0, RecyclerView recyclerView0, View view0, float f, float f1, int v, boolean z) {
    }

    @Override  // androidx.recyclerview.widget.ItemTouchUIUtil
    public final void onSelected(View view0) {
    }
}

