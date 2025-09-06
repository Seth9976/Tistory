package c4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.List;

public final class c extends AccessibilityDelegateCompat {
    public final Rect d;
    public final DrawerLayout e;

    public c(DrawerLayout drawerLayout0) {
        this.e = drawerLayout0;
        super();
        this.d = new Rect();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final boolean dispatchPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        if(accessibilityEvent0.getEventType() == 0x20) {
            List list0 = accessibilityEvent0.getText();
            DrawerLayout drawerLayout0 = this.e;
            View view1 = drawerLayout0.e();
            if(view1 != null) {
                CharSequence charSequence0 = drawerLayout0.getDrawerTitle(drawerLayout0.f(view1));
                if(charSequence0 != null) {
                    list0.add(charSequence0);
                }
            }
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        if(DrawerLayout.N) {
            super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        }
        else {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1 = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat0);
            super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat1);
            accessibilityNodeInfoCompat0.setSource(view0);
            ViewParent viewParent0 = ViewCompat.getParentForAccessibility(view0);
            if(viewParent0 instanceof View) {
                accessibilityNodeInfoCompat0.setParent(((View)viewParent0));
            }
            accessibilityNodeInfoCompat1.getBoundsInScreen(this.d);
            accessibilityNodeInfoCompat0.setBoundsInScreen(this.d);
            accessibilityNodeInfoCompat0.setVisibleToUser(accessibilityNodeInfoCompat1.isVisibleToUser());
            accessibilityNodeInfoCompat0.setPackageName(accessibilityNodeInfoCompat1.getPackageName());
            accessibilityNodeInfoCompat0.setClassName(accessibilityNodeInfoCompat1.getClassName());
            accessibilityNodeInfoCompat0.setContentDescription(accessibilityNodeInfoCompat1.getContentDescription());
            accessibilityNodeInfoCompat0.setEnabled(accessibilityNodeInfoCompat1.isEnabled());
            accessibilityNodeInfoCompat0.setFocused(accessibilityNodeInfoCompat1.isFocused());
            accessibilityNodeInfoCompat0.setAccessibilityFocused(accessibilityNodeInfoCompat1.isAccessibilityFocused());
            accessibilityNodeInfoCompat0.setSelected(accessibilityNodeInfoCompat1.isSelected());
            accessibilityNodeInfoCompat0.addAction(accessibilityNodeInfoCompat1.getActions());
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = ((ViewGroup)view0).getChildAt(v1);
                if(DrawerLayout.h(view1)) {
                    accessibilityNodeInfoCompat0.addChild(view1);
                }
            }
        }
        accessibilityNodeInfoCompat0.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfoCompat0.setFocusable(false);
        accessibilityNodeInfoCompat0.setFocused(false);
        accessibilityNodeInfoCompat0.removeAction(AccessibilityActionCompat.ACTION_FOCUS);
        accessibilityNodeInfoCompat0.removeAction(AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return DrawerLayout.N || DrawerLayout.h(view0) ? super.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0) : false;
    }
}

