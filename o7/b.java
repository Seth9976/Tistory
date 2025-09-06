package o7;

import android.view.View.AccessibilityDelegate;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.BadgeDrawable;

public final class b extends AccessibilityDelegateCompat {
    public final int d;
    public final BadgeDrawable e;

    public b(View.AccessibilityDelegate view$AccessibilityDelegate0, BadgeDrawable badgeDrawable0) {
        this.d = 0;
        this.e = badgeDrawable0;
        super(view$AccessibilityDelegate0);
    }

    public b(BadgeDrawable badgeDrawable0) {
        this.d = 1;
        this.e = badgeDrawable0;
        super();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        if(this.d != 0) {
            super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
            accessibilityNodeInfoCompat0.setContentDescription(this.e.getContentDescription());
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setContentDescription(this.e.getContentDescription());
    }
}

