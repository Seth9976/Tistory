package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class j extends AccessibilityDelegateCompat {
    public final int d;
    public final boolean e;
    public final k f;

    public j(k k0, int v, boolean z) {
        this.f = k0;
        this.d = v;
        this.e = z;
        super();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        k k0;
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        int v = this.d;
        int v2 = v;
        for(int v1 = 0; true; ++v1) {
            k0 = this.f;
            if(v1 >= v) {
                break;
            }
            switch(k0.j.f.getItemViewType(v1)) {
                case 2: 
                case 3: {
                    --v2;
                }
            }
        }
        k0.getClass();
        boolean z = view0.isSelected();
        accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(v2, 1, 1, 1, this.e, z));
    }
}

