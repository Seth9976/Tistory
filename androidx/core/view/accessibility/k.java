package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class k extends AccessibilityNodeProvider {
    public final AccessibilityNodeProviderCompat a;

    public k(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat0) {
        this.a = accessibilityNodeProviderCompat0;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int v, AccessibilityNodeInfo accessibilityNodeInfo0, String s, Bundle bundle0) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0);
        this.a.addExtraDataToAccessibilityNodeInfo(v, accessibilityNodeInfoCompat0, s, bundle0);
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int v) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.a.createAccessibilityNodeInfo(v);
        return accessibilityNodeInfoCompat0 == null ? null : accessibilityNodeInfoCompat0.unwrap();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String s, int v) {
        return null;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int v) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.a.findFocus(v);
        return accessibilityNodeInfoCompat0 == null ? null : accessibilityNodeInfoCompat0.unwrap();
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int v, int v1, Bundle bundle0) {
        return this.a.performAction(v, v1, bundle0);
    }
}

