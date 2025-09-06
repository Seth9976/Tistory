package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import java.util.List;

public final class AccessibilityManagerCompat {
    @Deprecated
    public interface AccessibilityStateChangeListener {
        @Deprecated
        void onAccessibilityStateChanged(boolean arg1);
    }

    @Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean arg1);
    }

    @Deprecated
    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilityManager0, AccessibilityStateChangeListener accessibilityManagerCompat$AccessibilityStateChangeListener0) {
        return accessibilityManagerCompat$AccessibilityStateChangeListener0 == null ? false : accessibilityManager0.addAccessibilityStateChangeListener(new b(accessibilityManagerCompat$AccessibilityStateChangeListener0));
    }

    public static boolean addTouchExplorationStateChangeListener(@NonNull AccessibilityManager accessibilityManager0, @NonNull TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0) {
        return accessibilityManager0.addTouchExplorationStateChangeListener(new d(accessibilityManagerCompat$TouchExplorationStateChangeListener0));
    }

    @Deprecated
    public static List getEnabledAccessibilityServiceList(AccessibilityManager accessibilityManager0, int v) {
        return accessibilityManager0.getEnabledAccessibilityServiceList(v);
    }

    @Deprecated
    public static List getInstalledAccessibilityServiceList(AccessibilityManager accessibilityManager0) {
        return accessibilityManager0.getInstalledAccessibilityServiceList();
    }

    public static boolean isRequestFromAccessibilityTool(@NonNull AccessibilityManager accessibilityManager0) {
        return Build.VERSION.SDK_INT < 34 ? true : c.a(accessibilityManager0);
    }

    @Deprecated
    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilityManager0) {
        return accessibilityManager0.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilityManager0, AccessibilityStateChangeListener accessibilityManagerCompat$AccessibilityStateChangeListener0) {
        return accessibilityManagerCompat$AccessibilityStateChangeListener0 == null ? false : accessibilityManager0.removeAccessibilityStateChangeListener(new b(accessibilityManagerCompat$AccessibilityStateChangeListener0));
    }

    public static boolean removeTouchExplorationStateChangeListener(@NonNull AccessibilityManager accessibilityManager0, @NonNull TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0) {
        return accessibilityManager0.removeTouchExplorationStateChangeListener(new d(accessibilityManagerCompat$TouchExplorationStateChangeListener0));
    }
}

