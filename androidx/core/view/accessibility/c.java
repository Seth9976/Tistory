package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;

public abstract class c {
    @DoNotInline
    public static boolean a(AccessibilityManager accessibilityManager0) {
        return accessibilityManager0.isRequestFromAccessibilityTool();
    }
}

