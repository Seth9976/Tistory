package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;

public final class b implements AccessibilityManager.AccessibilityStateChangeListener {
    public final AccessibilityStateChangeListener a;

    public b(AccessibilityStateChangeListener accessibilityManagerCompat$AccessibilityStateChangeListener0) {
        this.a = accessibilityManagerCompat$AccessibilityStateChangeListener0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? this.a.equals(((b)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.a.onAccessibilityStateChanged(z);
    }
}

