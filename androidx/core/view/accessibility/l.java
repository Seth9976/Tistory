package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;

public abstract class l {
    @DoNotInline
    public static void a(AccessibilityWindowInfo accessibilityWindowInfo0, Rect rect0) {
        accessibilityWindowInfo0.getBoundsInScreen(rect0);
    }

    @DoNotInline
    public static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo0, int v) {
        return accessibilityWindowInfo0.getChild(v);
    }

    @DoNotInline
    public static int c(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getChildCount();
    }

    @DoNotInline
    public static int d(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getId();
    }

    @DoNotInline
    public static int e(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getLayer();
    }

    @DoNotInline
    public static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getParent();
    }

    @DoNotInline
    public static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getRoot();
    }

    @DoNotInline
    public static int h(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getType();
    }

    @DoNotInline
    public static boolean i(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.isAccessibilityFocused();
    }

    @DoNotInline
    public static boolean j(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.isActive();
    }

    @DoNotInline
    public static boolean k(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.isFocused();
    }

    @DoNotInline
    public static AccessibilityWindowInfo l() {
        return AccessibilityWindowInfo.obtain();
    }

    @DoNotInline
    public static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return AccessibilityWindowInfo.obtain(accessibilityWindowInfo0);
    }
}

