package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

public final class o extends RecyclerViewAccessibilityDelegate {
    public final NavigationMenuPresenter f;

    public o(NavigationMenuPresenter navigationMenuPresenter0, RecyclerView recyclerView0) {
        this.f = navigationMenuPresenter0;
        super(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        k k0 = this.f.f;
        int v1 = 0;
        for(int v = 0; true; ++v) {
            NavigationMenuPresenter navigationMenuPresenter0 = k0.j;
            if(v >= navigationMenuPresenter0.f.g.size()) {
                break;
            }
            switch(navigationMenuPresenter0.f.getItemViewType(v)) {
                case 0: 
                case 1: {
                    ++v1;
                }
            }
        }
        accessibilityNodeInfoCompat0.setCollectionInfo(CollectionInfoCompat.obtain(v1, 1, false));
    }
}

