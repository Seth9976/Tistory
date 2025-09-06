package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public abstract class a extends AccessibilityDelegateCompat {
    public final AccessibilityActionCompat d;

    public a(Context context0, int v) {
        this.d = new AccessibilityActionCompat(16, context0.getString(v));
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.addAction(this.d);
    }
}

