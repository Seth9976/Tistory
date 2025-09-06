package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import p3.k;

public final class PopupWindowCompat {
    public static boolean getOverlapAnchor(@NonNull PopupWindow popupWindow0) {
        return k.a(popupWindow0);
    }

    public static int getWindowLayoutType(@NonNull PopupWindow popupWindow0) {
        return k.b(popupWindow0);
    }

    public static void setOverlapAnchor(@NonNull PopupWindow popupWindow0, boolean z) {
        k.c(popupWindow0, z);
    }

    public static void setWindowLayoutType(@NonNull PopupWindow popupWindow0, int v) {
        k.d(popupWindow0, v);
    }

    public static void showAsDropDown(@NonNull PopupWindow popupWindow0, @NonNull View view0, int v, int v1, int v2) {
        popupWindow0.showAsDropDown(view0, v, v1, v2);
    }
}

