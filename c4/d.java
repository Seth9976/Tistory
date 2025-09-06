package c4;

import android.view.View.AccessibilityDelegate;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public final class d extends AccessibilityDelegateCompat {
    public final int d;

    public d(int v) {
        this.d = v;
        super();
    }

    public d(View.AccessibilityDelegate view$AccessibilityDelegate0) {
        this.d = 4;
        super(view$AccessibilityDelegate0);
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        switch(this.d) {
            case 0: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                if(!DrawerLayout.h(view0)) {
                    accessibilityNodeInfoCompat0.setParent(null);
                }
                return;
            }
            case 1: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.setCollectionInfo(null);
                return;
            }
            case 2: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.setScrollable(false);
                return;
            }
            case 3: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.setCollectionInfo(null);
                return;
            }
            default: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.setContentDescription(null);
            }
        }
    }
}

