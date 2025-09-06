package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;

public interface ItemTouchUIUtil {
    @SuppressLint({"UnknownNullness"})
    void clearView(View arg1);

    @SuppressLint({"UnknownNullness"})
    void onDraw(Canvas arg1, RecyclerView arg2, View arg3, float arg4, float arg5, int arg6, boolean arg7);

    @SuppressLint({"UnknownNullness"})
    void onDrawOver(Canvas arg1, RecyclerView arg2, View arg3, float arg4, float arg5, int arg6, boolean arg7);

    @SuppressLint({"UnknownNullness"})
    void onSelected(View arg1);
}

