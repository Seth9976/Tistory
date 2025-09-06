package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class q implements AccessibilityManager.AccessibilityStateChangeListener {
    public final AndroidComposeViewAccessibilityDelegateCompat a;

    public q(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        this.a = androidComposeViewAccessibilityDelegateCompat0;
    }

    @Override  // android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.a.l = z ? this.a.g.getEnabledAccessibilityServiceList(-1) : CollectionsKt__CollectionsKt.emptyList();
    }
}

