package p3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.widget.NestedScrollView;

public final class h extends AccessibilityDelegateCompat {
    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.ScrollView");
        accessibilityEvent0.setScrollable(((NestedScrollView)view0).getScrollRange() > 0);
        accessibilityEvent0.setScrollX(((NestedScrollView)view0).getScrollX());
        accessibilityEvent0.setScrollY(((NestedScrollView)view0).getScrollY());
        AccessibilityRecordCompat.setMaxScrollX(accessibilityEvent0, ((NestedScrollView)view0).getScrollX());
        AccessibilityRecordCompat.setMaxScrollY(accessibilityEvent0, ((NestedScrollView)view0).getScrollRange());
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setClassName("android.widget.ScrollView");
        if(((NestedScrollView)view0).isEnabled()) {
            int v = ((NestedScrollView)view0).getScrollRange();
            if(v > 0) {
                accessibilityNodeInfoCompat0.setScrollable(true);
                if(((NestedScrollView)view0).getScrollY() > 0) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
                if(((NestedScrollView)view0).getScrollY() < v) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
            }
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view0, int v, Bundle bundle0) {
        if(super.performAccessibilityAction(view0, v, bundle0)) {
            return true;
        }
        if(!((NestedScrollView)view0).isEnabled()) {
            return false;
        }
        int v1 = ((NestedScrollView)view0).getHeight();
        Rect rect0 = new Rect();
        if(((NestedScrollView)view0).getMatrix().isIdentity() && ((NestedScrollView)view0).getGlobalVisibleRect(rect0)) {
            v1 = rect0.height();
        }
        switch(v) {
            case 0x2000: 
            case 0x1020038: {
                int v5 = ((NestedScrollView)view0).getPaddingBottom();
                int v6 = ((NestedScrollView)view0).getPaddingTop();
                int v7 = Math.max(((NestedScrollView)view0).getScrollY() - (v1 - v5 - v6), 0);
                if(v7 != ((NestedScrollView)view0).getScrollY()) {
                    ((NestedScrollView)view0).i(-((NestedScrollView)view0).getScrollX(), v7 - ((NestedScrollView)view0).getScrollY(), 0xFA, true);
                    return true;
                }
                return false;
            }
            case 0x1000: 
            case 0x102003A: {
                int v2 = ((NestedScrollView)view0).getPaddingBottom();
                int v3 = ((NestedScrollView)view0).getPaddingTop();
                int v4 = Math.min(((NestedScrollView)view0).getScrollY() + (v1 - v2 - v3), ((NestedScrollView)view0).getScrollRange());
                if(v4 != ((NestedScrollView)view0).getScrollY()) {
                    ((NestedScrollView)view0).i(-((NestedScrollView)view0).getScrollX(), v4 - ((NestedScrollView)view0).getScrollY(), 0xFA, true);
                    return true;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

