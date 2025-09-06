package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;

public abstract class s0 {
    @DoNotInline
    public static int a(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.getScaledHoverSlop();
    }

    @DoNotInline
    public static boolean b(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}

