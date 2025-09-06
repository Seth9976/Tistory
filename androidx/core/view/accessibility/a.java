package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static boolean a(AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.isAccessibilityDataSensitive();
    }

    @DoNotInline
    public static void b(AccessibilityEvent accessibilityEvent0, boolean z) {
        accessibilityEvent0.setAccessibilityDataSensitive(z);
    }
}

