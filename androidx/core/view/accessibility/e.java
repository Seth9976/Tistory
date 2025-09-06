package androidx.core.view.accessibility;

import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.TracingConfig.Builder;

public abstract class e {
    public static DisplayCutout e(Object object0) [...] // Inlined contents

    public static TracingConfig.Builder g() {
        return new TracingConfig.Builder();
    }

    public static CharSequence m(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.getPaneTitle();
    }

    public static boolean v(CharSequence charSequence0) {
        return charSequence0 instanceof PrecomputedText;
    }

    public static boolean w(Object object0) {
        return object0 instanceof DisplayCutout;
    }

    public static CharSequence z(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.getTooltipText();
    }
}

