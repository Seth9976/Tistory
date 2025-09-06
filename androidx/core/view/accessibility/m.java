package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;

public abstract class m {
    @DoNotInline
    public static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getAnchor();
    }

    @DoNotInline
    public static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getTitle();
    }
}

