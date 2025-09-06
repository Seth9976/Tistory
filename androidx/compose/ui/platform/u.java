package androidx.compose.ui.platform;

import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.ExploreByTouchHelper;

public final class u extends AccessibilityNodeProviderCompat {
    public final int b;
    public final AccessibilityDelegateCompat c;

    public u(AccessibilityDelegateCompat accessibilityDelegateCompat0, int v) {
        this.b = v;
        this.c = accessibilityDelegateCompat0;
        super();
    }

    @Override  // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public void addExtraDataToAccessibilityNodeInfo(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, String s, Bundle bundle0) {
        if(this.b != 0) {
            super.addExtraDataToAccessibilityNodeInfo(v, accessibilityNodeInfoCompat0, s, bundle0);
            return;
        }
        ((AndroidComposeViewAccessibilityDelegateCompat)this.c).a(v, accessibilityNodeInfoCompat0, s, bundle0);
    }

    @Override  // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int v) {
        if(this.b != 0) {
            return AccessibilityNodeInfoCompat.obtain(((ExploreByTouchHelper)this.c).d(v));
        }
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0 = (AndroidComposeViewAccessibilityDelegateCompat)this.c;
        Trace.beginSection("createAccessibilityNodeInfo");
        try {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AndroidComposeViewAccessibilityDelegateCompat.access$createNodeInfo(androidComposeViewAccessibilityDelegateCompat0, v);
            if(androidComposeViewAccessibilityDelegateCompat0.q && v == androidComposeViewAccessibilityDelegateCompat0.o) {
                androidComposeViewAccessibilityDelegateCompat0.p = accessibilityNodeInfoCompat0;
            }
            return accessibilityNodeInfoCompat0;
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final AccessibilityNodeInfoCompat findFocus(int v) {
        if(this.b != 0) {
            ExploreByTouchHelper exploreByTouchHelper0 = (ExploreByTouchHelper)this.c;
            int v1 = v == 2 ? exploreByTouchHelper0.k : exploreByTouchHelper0.l;
            return v1 == 0x80000000 ? null : this.createAccessibilityNodeInfo(v1);
        }
        return this.createAccessibilityNodeInfo(((AndroidComposeViewAccessibilityDelegateCompat)this.c).o);
    }

    @Override  // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final boolean performAction(int v, int v1, Bundle bundle0) {
        if(this.b != 0) {
            ExploreByTouchHelper exploreByTouchHelper0 = (ExploreByTouchHelper)this.c;
            View view0 = exploreByTouchHelper0.i;
            if(v != -1) {
                switch(v1) {
                    case 1: {
                        return exploreByTouchHelper0.requestKeyboardFocusForVirtualView(v);
                    }
                    case 2: {
                        return exploreByTouchHelper0.clearKeyboardFocusForVirtualView(v);
                    }
                    case 0x40: {
                        if(exploreByTouchHelper0.h.isEnabled() && exploreByTouchHelper0.h.isTouchExplorationEnabled()) {
                            int v2 = exploreByTouchHelper0.k;
                            if(v2 != v) {
                                if(v2 != 0x80000000) {
                                    exploreByTouchHelper0.k = 0x80000000;
                                    exploreByTouchHelper0.i.invalidate();
                                    exploreByTouchHelper0.sendEventForVirtualView(v2, 0x10000);
                                }
                                exploreByTouchHelper0.k = v;
                                view0.invalidate();
                                exploreByTouchHelper0.sendEventForVirtualView(v, 0x8000);
                                return true;
                            }
                        }
                        break;
                    }
                    case 0x80: {
                        if(exploreByTouchHelper0.k == v) {
                            exploreByTouchHelper0.k = 0x80000000;
                            view0.invalidate();
                            exploreByTouchHelper0.sendEventForVirtualView(v, 0x10000);
                            return true;
                        }
                        break;
                    }
                    default: {
                        return exploreByTouchHelper0.onPerformActionForVirtualView(v, v1, bundle0);
                    }
                }
                return false;
            }
            return ViewCompat.performAccessibilityAction(view0, v1, bundle0);
        }
        return AndroidComposeViewAccessibilityDelegateCompat.access$performActionHelper(((AndroidComposeViewAccessibilityDelegateCompat)this.c), v, v1, bundle0);
    }
}

