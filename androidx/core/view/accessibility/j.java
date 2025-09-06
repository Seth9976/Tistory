package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import java.time.Duration;

public abstract class j {
    @DoNotInline
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    @DoNotInline
    public static void b(AccessibilityNodeInfo accessibilityNodeInfo0, Rect rect0) {
        accessibilityNodeInfo0.getBoundsInWindow(rect0);
    }

    @DoNotInline
    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.getContainerTitle();
    }

    @DoNotInline
    public static long d(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.getMinDurationBetweenContentChanges().toMillis();
    }

    @DoNotInline
    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.hasRequestInitialAccessibilityFocus();
    }

    @DoNotInline
    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.isAccessibilityDataSensitive();
    }

    @DoNotInline
    public static void g(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
        accessibilityNodeInfo0.setAccessibilityDataSensitive(z);
    }

    @DoNotInline
    public static void h(AccessibilityNodeInfo accessibilityNodeInfo0, Rect rect0) {
        accessibilityNodeInfo0.setBoundsInWindow(rect0);
    }

    @DoNotInline
    public static void i(AccessibilityNodeInfo accessibilityNodeInfo0, CharSequence charSequence0) {
        accessibilityNodeInfo0.setContainerTitle(charSequence0);
    }

    @DoNotInline
    public static void j(AccessibilityNodeInfo accessibilityNodeInfo0, long v) {
        accessibilityNodeInfo0.setMinDurationBetweenContentChanges(Duration.ofMillis(v));
    }

    @DoNotInline
    public static void k(AccessibilityNodeInfo accessibilityNodeInfo0, View view0, boolean z) {
        accessibilityNodeInfo0.setQueryFromAppProcessEnabled(view0, z);
    }

    @DoNotInline
    public static void l(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
        accessibilityNodeInfo0.setRequestInitialAccessibilityFocus(z);
    }
}

