package com.google.android.material.button;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class d extends AccessibilityDelegateCompat {
    public final MaterialButtonToggleGroup d;

    public d(MaterialButtonToggleGroup materialButtonToggleGroup0) {
        this.d = materialButtonToggleGroup0;
        super();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        int v = -1;
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        MaterialButtonToggleGroup materialButtonToggleGroup0 = this.d;
        materialButtonToggleGroup0.getClass();
        if(view0 instanceof MaterialButton) {
            int v2 = 0;
            for(int v1 = 0; v1 < materialButtonToggleGroup0.getChildCount(); ++v1) {
                if(materialButtonToggleGroup0.getChildAt(v1) == view0) {
                    v = v2;
                    break;
                }
                if(materialButtonToggleGroup0.getChildAt(v1) instanceof MaterialButton && materialButtonToggleGroup0.c(v1)) {
                    ++v2;
                }
            }
        }
        accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(0, 1, v, 1, false, ((MaterialButton)view0).isChecked()));
    }
}

