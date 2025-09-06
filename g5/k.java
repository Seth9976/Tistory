package g5;

import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.viewpager2.widget.ViewPager2;

public final class k extends f {
    public final i a;
    public final j b;
    public d c;
    public final ViewPager2 d;

    public k(ViewPager2 viewPager20) {
        this.d = viewPager20;
        this.a = new i(this);
        this.b = new j(this);
    }

    public final void a() {
        ViewPager2 viewPager20 = this.d;
        int v = 0x1020048;
        ViewCompat.removeAccessibilityAction(viewPager20, 0x1020048);
        ViewCompat.removeAccessibilityAction(viewPager20, 0x1020049);
        ViewCompat.removeAccessibilityAction(viewPager20, 0x1020046);
        ViewCompat.removeAccessibilityAction(viewPager20, 0x1020047);
        if(viewPager20.getAdapter() == null) {
            return;
        }
        int v1 = viewPager20.getAdapter().getItemCount();
        if(v1 == 0) {
            return;
        }
        if(!viewPager20.isUserInputEnabled()) {
            return;
        }
        j j0 = this.b;
        i i0 = this.a;
        if(viewPager20.getOrientation() == 0) {
            boolean z = viewPager20.g.getLayoutDirection() == 1;
            if(z) {
                v = 0x1020049;
            }
            if(viewPager20.d < v1 - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager20, new AccessibilityActionCompat((z ? 0x1020048 : 0x1020049), null), null, i0);
            }
            if(viewPager20.d > 0) {
                ViewCompat.replaceAccessibilityAction(viewPager20, new AccessibilityActionCompat(v, null), null, j0);
            }
        }
        else {
            if(viewPager20.d < v1 - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager20, new AccessibilityActionCompat(0x1020047, null), null, i0);
            }
            if(viewPager20.d > 0) {
                ViewCompat.replaceAccessibilityAction(viewPager20, new AccessibilityActionCompat(0x1020046, null), null, j0);
            }
        }
    }
}

