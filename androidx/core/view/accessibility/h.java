package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;

public abstract class h {
    @DoNotInline
    public static Object a(int v, float f, float f1, float f2) {
        return new AccessibilityNodeInfo.RangeInfo(v, f, f1, f2);
    }

    @DoNotInline
    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.getStateDescription();
    }

    @DoNotInline
    public static void c(AccessibilityNodeInfo accessibilityNodeInfo0, CharSequence charSequence0) {
        accessibilityNodeInfo0.setStateDescription(charSequence0);
    }
}

