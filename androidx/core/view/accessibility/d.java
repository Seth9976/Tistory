package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final TouchExplorationStateChangeListener a;

    public d(TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0) {
        this.a = accessibilityManagerCompat$TouchExplorationStateChangeListener0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d ? this.a.equals(((d)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.onTouchExplorationStateChanged(z);
    }
}

