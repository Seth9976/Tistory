package androidx.appcompat.widget;

import android.transition.Transition;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;

public abstract class b2 {
    @DoNotInline
    public static void a(PopupWindow popupWindow0, Transition transition0) {
        popupWindow0.setEnterTransition(transition0);
    }

    @DoNotInline
    public static void b(PopupWindow popupWindow0, Transition transition0) {
        popupWindow0.setExitTransition(transition0);
    }
}

