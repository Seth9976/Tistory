package a5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

public final class c extends AccessibilityDelegateCompat {
    public final Rect d;
    public final SlidingPaneLayout e;

    public c(SlidingPaneLayout slidingPaneLayout0) {
        this.e = slidingPaneLayout0;
        super();
        this.d = new Rect();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1 = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat0);
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat1);
        accessibilityNodeInfoCompat1.getBoundsInScreen(this.d);
        accessibilityNodeInfoCompat0.setBoundsInScreen(this.d);
        accessibilityNodeInfoCompat0.setVisibleToUser(accessibilityNodeInfoCompat1.isVisibleToUser());
        accessibilityNodeInfoCompat0.setPackageName(accessibilityNodeInfoCompat1.getPackageName());
        accessibilityNodeInfoCompat0.setClassName(accessibilityNodeInfoCompat1.getClassName());
        accessibilityNodeInfoCompat0.setContentDescription(accessibilityNodeInfoCompat1.getContentDescription());
        accessibilityNodeInfoCompat0.setEnabled(accessibilityNodeInfoCompat1.isEnabled());
        accessibilityNodeInfoCompat0.setClickable(accessibilityNodeInfoCompat1.isClickable());
        accessibilityNodeInfoCompat0.setFocusable(accessibilityNodeInfoCompat1.isFocusable());
        accessibilityNodeInfoCompat0.setFocused(accessibilityNodeInfoCompat1.isFocused());
        accessibilityNodeInfoCompat0.setAccessibilityFocused(accessibilityNodeInfoCompat1.isAccessibilityFocused());
        accessibilityNodeInfoCompat0.setSelected(accessibilityNodeInfoCompat1.isSelected());
        accessibilityNodeInfoCompat0.setLongClickable(accessibilityNodeInfoCompat1.isLongClickable());
        accessibilityNodeInfoCompat0.addAction(accessibilityNodeInfoCompat1.getActions());
        accessibilityNodeInfoCompat0.setMovementGranularities(accessibilityNodeInfoCompat1.getMovementGranularities());
        accessibilityNodeInfoCompat0.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        accessibilityNodeInfoCompat0.setSource(view0);
        ViewParent viewParent0 = ViewCompat.getParentForAccessibility(view0);
        if(viewParent0 instanceof View) {
            accessibilityNodeInfoCompat0.setParent(((View)viewParent0));
        }
        SlidingPaneLayout slidingPaneLayout0 = this.e;
        int v = slidingPaneLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = slidingPaneLayout0.getChildAt(v1);
            if(!slidingPaneLayout0.a(view1) && view1.getVisibility() == 0) {
                ViewCompat.setImportantForAccessibility(view1, 1);
                accessibilityNodeInfoCompat0.addChild(view1);
            }
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return this.e.a(view0) ? false : super.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
    }
}

