package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

public final class r implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final AndroidComposeViewAccessibilityDelegateCompat a;

    public r(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        this.a = androidComposeViewAccessibilityDelegateCompat0;
    }

    @Override  // android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.l = this.a.g.getEnabledAccessibilityServiceList(-1);
    }
}

