package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;

public abstract class x1 {
    @DoNotInline
    public static void a(PopupWindow popupWindow0, Rect rect0) {
        popupWindow0.setEpicenterBounds(rect0);
    }

    @DoNotInline
    public static void b(PopupWindow popupWindow0, boolean z) {
        popupWindow0.setIsClippedToScreen(z);
    }
}

