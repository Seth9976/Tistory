package androidx.core.view.accessibility;

import android.os.LocaleList;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;

public abstract class q {
    @DoNotInline
    public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getLocales();
    }

    @DoNotInline
    public static long b(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getTransitionTimeMillis();
    }
}

