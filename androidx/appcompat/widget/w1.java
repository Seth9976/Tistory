package androidx.appcompat.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;

public abstract class w1 {
    @DoNotInline
    public static int a(PopupWindow popupWindow0, View view0, int v, boolean z) {
        return popupWindow0.getMaxAvailableHeight(view0, v, z);
    }
}

