package v2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import androidx.compose.ui.window.PopupLayoutHelper;

public class r implements PopupLayoutHelper {
    @Override  // androidx.compose.ui.window.PopupLayoutHelper
    public final void getWindowVisibleDisplayFrame(View view0, Rect rect0) {
        view0.getWindowVisibleDisplayFrame(rect0);
    }

    @Override  // androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view0, int v, int v1) {
    }

    @Override  // androidx.compose.ui.window.PopupLayoutHelper
    public final void updateViewLayout(WindowManager windowManager0, View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        windowManager0.updateViewLayout(view0, viewGroup$LayoutParams0);
    }
}

