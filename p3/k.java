package p3;

import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;

public abstract class k {
    @DoNotInline
    public static boolean a(PopupWindow popupWindow0) {
        return popupWindow0.getOverlapAnchor();
    }

    @DoNotInline
    public static int b(PopupWindow popupWindow0) {
        return popupWindow0.getWindowLayoutType();
    }

    @DoNotInline
    public static void c(PopupWindow popupWindow0, boolean z) {
        popupWindow0.setOverlapAnchor(z);
    }

    @DoNotInline
    public static void d(PopupWindow popupWindow0, int v) {
        popupWindow0.setWindowLayoutType(v);
    }
}

