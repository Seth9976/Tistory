package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class c extends AccessibilityDelegateCompat {
    public final BaseBehavior d;

    public c(BaseBehavior appBarLayout$BaseBehavior0) {
        this.d = appBarLayout$BaseBehavior0;
        super();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setScrollable(this.d.E);
        accessibilityNodeInfoCompat0.setClassName("android.widget.ScrollView");
    }
}

