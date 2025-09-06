package androidx.core.view.accessibility;

import android.graphics.Region;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;

public abstract class p {
    @DoNotInline
    public static int a(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.getDisplayId();
    }

    @DoNotInline
    public static void b(AccessibilityWindowInfo accessibilityWindowInfo0, Region region0) {
        accessibilityWindowInfo0.getRegionInScreen(region0);
    }

    @DoNotInline
    public static AccessibilityNodeInfoCompat c(Object object0, int v) {
        return AccessibilityNodeInfoCompat.e(((AccessibilityWindowInfo)object0).getRoot(v));
    }
}

