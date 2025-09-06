package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.platform.u;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import j7.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.a;

public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = 0x80000000;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final int[] g;
    public final AccessibilityManager h;
    public final View i;
    public u j;
    public int k;
    public int l;
    public int m;
    public static final Rect n;
    public static final d o;
    public static final d p;

    static {
        ExploreByTouchHelper.n = new Rect(0x7FFFFFFF, 0x7FFFFFFF, 0x80000000, 0x80000000);
        ExploreByTouchHelper.o = new d(11);
        ExploreByTouchHelper.p = new d(12);
    }

    public ExploreByTouchHelper(@NonNull View view0) {
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new int[2];
        this.k = 0x80000000;
        this.l = 0x80000000;
        this.m = 0x80000000;
        if(view0 == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view0;
        this.h = (AccessibilityManager)view0.getContext().getSystemService("accessibility");
        view0.setFocusable(true);
        if(ViewCompat.getImportantForAccessibility(view0) == 0) {
            ViewCompat.setImportantForAccessibility(view0, 1);
        }
    }

    public final AccessibilityEvent a(int v, int v1) {
        View view0 = this.i;
        if(v != -1) {
            AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(v1);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.d(v);
            accessibilityEvent0.getText().add(accessibilityNodeInfoCompat0.getText());
            accessibilityEvent0.setContentDescription(accessibilityNodeInfoCompat0.getContentDescription());
            accessibilityEvent0.setScrollable(accessibilityNodeInfoCompat0.isScrollable());
            accessibilityEvent0.setPassword(accessibilityNodeInfoCompat0.isPassword());
            accessibilityEvent0.setEnabled(accessibilityNodeInfoCompat0.isEnabled());
            accessibilityEvent0.setChecked(accessibilityNodeInfoCompat0.isChecked());
            if(accessibilityEvent0.getText().isEmpty() && accessibilityEvent0.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEvent0.setClassName(accessibilityNodeInfoCompat0.getClassName());
            AccessibilityRecordCompat.setSource(accessibilityEvent0, view0, v);
            accessibilityEvent0.setPackageName("net.daum.android.tistoryapp");
            return accessibilityEvent0;
        }
        AccessibilityEvent accessibilityEvent1 = AccessibilityEvent.obtain(v1);
        view0.onInitializeAccessibilityEvent(accessibilityEvent1);
        return accessibilityEvent1;
    }

    public final AccessibilityNodeInfoCompat b(int v) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.obtain();
        accessibilityNodeInfoCompat0.setEnabled(true);
        accessibilityNodeInfoCompat0.setFocusable(true);
        accessibilityNodeInfoCompat0.setClassName("android.view.View");
        Rect rect0 = ExploreByTouchHelper.n;
        accessibilityNodeInfoCompat0.setBoundsInParent(rect0);
        accessibilityNodeInfoCompat0.setBoundsInScreen(rect0);
        View view0 = this.i;
        accessibilityNodeInfoCompat0.setParent(view0);
        this.onPopulateNodeForVirtualView(v, accessibilityNodeInfoCompat0);
        if(accessibilityNodeInfoCompat0.getText() == null && accessibilityNodeInfoCompat0.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect1 = this.e;
        accessibilityNodeInfoCompat0.getBoundsInParent(rect1);
        if(rect1.equals(rect0)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int v1 = accessibilityNodeInfoCompat0.getActions();
        if((v1 & 0x40) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if((v1 & 0x80) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompat0.setPackageName("net.daum.android.tistoryapp");
        accessibilityNodeInfoCompat0.setSource(view0, v);
        if(this.k == v) {
            accessibilityNodeInfoCompat0.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat0.addAction(0x80);
        }
        else {
            accessibilityNodeInfoCompat0.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat0.addAction(0x40);
        }
        boolean z = this.l == v;
        if(z) {
            accessibilityNodeInfoCompat0.addAction(2);
        }
        else if(accessibilityNodeInfoCompat0.isFocusable()) {
            accessibilityNodeInfoCompat0.addAction(1);
        }
        accessibilityNodeInfoCompat0.setFocused(z);
        int[] arr_v = this.g;
        view0.getLocationOnScreen(arr_v);
        Rect rect2 = this.d;
        accessibilityNodeInfoCompat0.getBoundsInScreen(rect2);
        if(rect2.equals(rect0)) {
            accessibilityNodeInfoCompat0.getBoundsInParent(rect2);
            if(accessibilityNodeInfoCompat0.mParentVirtualDescendantId != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1 = AccessibilityNodeInfoCompat.obtain();
                for(int v2 = accessibilityNodeInfoCompat0.mParentVirtualDescendantId; v2 != -1; v2 = accessibilityNodeInfoCompat1.mParentVirtualDescendantId) {
                    accessibilityNodeInfoCompat1.setParent(view0, -1);
                    accessibilityNodeInfoCompat1.setBoundsInParent(rect0);
                    this.onPopulateNodeForVirtualView(v2, accessibilityNodeInfoCompat1);
                    accessibilityNodeInfoCompat1.getBoundsInParent(rect1);
                    rect2.offset(rect1.left, rect1.top);
                }
            }
            rect2.offset(arr_v[0] - view0.getScrollX(), arr_v[1] - view0.getScrollY());
        }
        Rect rect3 = this.f;
        if(view0.getLocalVisibleRect(rect3)) {
            rect3.offset(arr_v[0] - view0.getScrollX(), arr_v[1] - view0.getScrollY());
            if(rect2.intersect(rect3)) {
                accessibilityNodeInfoCompat0.setBoundsInScreen(rect2);
                if(!rect2.isEmpty() && view0.getWindowVisibility() == 0) {
                    for(ViewParent viewParent0 = view0.getParent(); true; viewParent0 = ((View)viewParent0).getParent()) {
                        if(!(viewParent0 instanceof View)) {
                            if(viewParent0 == null) {
                                break;
                            }
                            accessibilityNodeInfoCompat0.setVisibleToUser(true);
                            break;
                        }
                        if(((View)viewParent0).getAlpha() <= 0.0f || ((View)viewParent0).getVisibility() != 0) {
                            break;
                        }
                    }
                }
            }
        }
        return accessibilityNodeInfoCompat0;
    }

    public final boolean c(int v, Rect rect0) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        int v7;
        Object object0;
        ArrayList arrayList0 = new ArrayList();
        this.getVisibleVirtualViews(arrayList0);
        SparseArrayCompat sparseArrayCompat0 = new SparseArrayCompat();
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.b(((int)(((Integer)arrayList0.get(v1)))));
            sparseArrayCompat0.put(((int)(((Integer)arrayList0.get(v1)))), accessibilityNodeInfoCompat0);
        }
        int v2 = 0x80000000;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1 = this.l == 0x80000000 ? null : ((AccessibilityNodeInfoCompat)sparseArrayCompat0.get(this.l));
        d d0 = ExploreByTouchHelper.o;
        d d1 = ExploreByTouchHelper.p;
        View view0 = this.i;
        if(v == 1 || v == 2) {
            boolean z = ViewCompat.getLayoutDirection(view0) == 1;
            d1.getClass();
            int v13 = sparseArrayCompat0.size();
            ArrayList arrayList1 = new ArrayList(v13);
            for(int v3 = 0; v3 < v13; ++v3) {
                arrayList1.add(((AccessibilityNodeInfoCompat)sparseArrayCompat0.valueAt(v3)));
            }
            Collections.sort(arrayList1, new a(z, d0));
            switch(v) {
                case 1: {
                    int v14 = accessibilityNodeInfoCompat1 == null ? arrayList1.size() : arrayList1.indexOf(accessibilityNodeInfoCompat1);
                    object0 = v14 - 1 >= 0 ? arrayList1.get(v14 - 1) : null;
                    break;
                }
                case 2: {
                    int v15 = accessibilityNodeInfoCompat1 == null ? -1 : arrayList1.lastIndexOf(accessibilityNodeInfoCompat1);
                    object0 = v15 + 1 >= arrayList1.size() ? null : arrayList1.get(v15 + 1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat)object0;
        }
        else {
            if(v != 17 && v != 33 && v != 66 && v != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect1 = new Rect();
            int v4 = this.l;
            if(v4 != 0x80000000) {
                this.d(v4).getBoundsInParent(rect1);
            }
            else if(rect0 == null) {
                int v5 = view0.getWidth();
                int v6 = view0.getHeight();
                switch(v) {
                    case 17: {
                        rect1.set(v5, 0, v5, v6);
                        break;
                    }
                    case 33: {
                        rect1.set(0, v6, v5, v6);
                        break;
                    }
                    case 66: {
                        rect1.set(-1, 0, -1, v6);
                        break;
                    }
                    case 130: {
                        rect1.set(0, -1, v5, -1);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            else {
                rect1.set(rect0);
            }
            Rect rect2 = new Rect(rect1);
            switch(v) {
                case 17: {
                    v7 = 0;
                    rect2.offset(rect1.width() + 1, 0);
                    break;
                }
                case 33: {
                    v7 = 0;
                    rect2.offset(0, rect1.height() + 1);
                    break;
                }
                case 66: {
                    v7 = 0;
                    rect2.offset(-(rect1.width() + 1), 0);
                    break;
                }
                case 130: {
                    v7 = 0;
                    rect2.offset(0, -(rect1.height() + 1));
                    break;
                }
                default: {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            d1.getClass();
            int v8 = sparseArrayCompat0.size();
            Rect rect3 = new Rect();
            accessibilityNodeInfoCompat2 = null;
            while(v7 < v8) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = (AccessibilityNodeInfoCompat)sparseArrayCompat0.valueAt(v7);
                if(accessibilityNodeInfoCompat3 != accessibilityNodeInfoCompat1) {
                    d0.getClass();
                    accessibilityNodeInfoCompat3.getBoundsInParent(rect3);
                    if(g.a.G(v, rect1, rect3)) {
                        if(!g.a.G(v, rect1, rect2) || g.a.a(v, rect1, rect3, rect2)) {
                            rect2.set(rect3);
                            accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat3;
                        }
                        else if(!g.a.a(v, rect1, rect2, rect3)) {
                            int v9 = g.a.N(v, rect1, rect3);
                            int v10 = g.a.O(v, rect1, rect3);
                            int v11 = g.a.N(v, rect1, rect2);
                            int v12 = g.a.O(v, rect1, rect2);
                            if(v10 * v10 + v9 * 13 * v9 < v12 * v12 + v11 * 13 * v11) {
                                rect2.set(rect3);
                                accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat3;
                            }
                        }
                    }
                }
                ++v7;
            }
        }
        if(accessibilityNodeInfoCompat2 != null) {
            v2 = sparseArrayCompat0.keyAt(sparseArrayCompat0.indexOfValue(accessibilityNodeInfoCompat2));
        }
        return this.requestKeyboardFocusForVirtualView(v2);
    }

    public final boolean clearKeyboardFocusForVirtualView(int v) {
        if(this.l != v) {
            return false;
        }
        this.l = 0x80000000;
        this.onVirtualViewKeyboardFocusChanged(v, false);
        this.sendEventForVirtualView(v, 8);
        return true;
    }

    public final AccessibilityNodeInfoCompat d(int v) {
        if(v == -1) {
            View view0 = this.i;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.obtain(view0);
            ViewCompat.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
            ArrayList arrayList0 = new ArrayList();
            this.getVisibleVirtualViews(arrayList0);
            if(accessibilityNodeInfoCompat0.getChildCount() > 0 && arrayList0.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                accessibilityNodeInfoCompat0.addChild(view0, ((int)(((Integer)arrayList0.get(v2)))));
            }
            return accessibilityNodeInfoCompat0;
        }
        return this.b(v);
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent0) {
        if(this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            switch(motionEvent0.getAction()) {
                case 7: 
                case 9: {
                    int v = this.getVirtualViewAt(motionEvent0.getX(), motionEvent0.getY());
                    int v1 = this.m;
                    if(v1 != v) {
                        this.m = v;
                        this.sendEventForVirtualView(v, 0x80);
                        this.sendEventForVirtualView(v1, 0x100);
                    }
                    return v != 0x80000000;
                }
                case 10: {
                    int v2 = this.m;
                    if(v2 != 0x80000000) {
                        this.m = 0x80000000;
                        this.sendEventForVirtualView(0x80000000, 0x80);
                        this.sendEventForVirtualView(v2, 0x100);
                        return true;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent0) {
        int v = 0;
        if(keyEvent0.getAction() != 1) {
            int v1 = 66;
            int v2 = keyEvent0.getKeyCode();
            switch(v2) {
                case 19: 
                case 20: 
                case 21: 
                case 22: {
                    if(keyEvent0.hasNoModifiers()) {
                        switch(v2) {
                            case 19: {
                                v1 = 33;
                                break;
                            }
                            case 21: {
                                v1 = 17;
                                break;
                            }
                            case 22: {
                                break;
                            }
                            default: {
                                v1 = 130;
                            }
                        }
                        int v3 = keyEvent0.getRepeatCount();
                        boolean z;
                        for(z = false; v < v3 + 1 && this.c(v1, null); z = true) {
                            ++v;
                        }
                        return z;
                    }
                    break;
                }
                case 61: {
                    if(keyEvent0.hasNoModifiers()) {
                        return this.c(2, null);
                    }
                    if(keyEvent0.hasModifiers(1)) {
                        v = this.c(1, null);
                    }
                    break;
                }
                case 23: 
                case 66: {
                    if(keyEvent0.hasNoModifiers() && keyEvent0.getRepeatCount() == 0) {
                        int v4 = this.l;
                        if(v4 != 0x80000000) {
                            this.onPerformActionForVirtualView(v4, 16, null);
                        }
                        return true;
                    }
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return v != 0;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.k;
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view0) {
        if(this.j == null) {
            this.j = new u(this, 1);
        }
        return this.j;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return this.getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.l;
    }

    public abstract int getVirtualViewAt(float arg1, float arg2);

    public abstract void getVisibleVirtualViews(List arg1);

    public final void invalidateRoot() {
        this.invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int v) {
        this.invalidateVirtualView(v, 0);
    }

    public final void invalidateVirtualView(int v, int v1) {
        if(v != 0x80000000 && this.h.isEnabled()) {
            View view0 = this.i;
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null) {
                AccessibilityEvent accessibilityEvent0 = this.a(v, 0x800);
                AccessibilityEventCompat.setContentChangeTypes(accessibilityEvent0, v1);
                viewParent0.requestSendAccessibilityEvent(view0, accessibilityEvent0);
            }
        }
    }

    public final void onFocusChanged(boolean z, int v, @Nullable Rect rect0) {
        int v1 = this.l;
        if(v1 != 0x80000000) {
            this.clearKeyboardFocusForVirtualView(v1);
        }
        if(z) {
            this.c(v, rect0);
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        this.onPopulateNodeForHost(accessibilityNodeInfoCompat0);
    }

    public abstract boolean onPerformActionForVirtualView(int arg1, int arg2, @Nullable Bundle arg3);

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent0) {
    }

    public void onPopulateEventForVirtualView(int v, @NonNull AccessibilityEvent accessibilityEvent0) {
    }

    public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
    }

    public abstract void onPopulateNodeForVirtualView(int arg1, @NonNull AccessibilityNodeInfoCompat arg2);

    public void onVirtualViewKeyboardFocusChanged(int v, boolean z) {
    }

    public final boolean requestKeyboardFocusForVirtualView(int v) {
        if(!this.i.isFocused() && !this.i.requestFocus()) {
            return false;
        }
        int v1 = this.l;
        if(v1 == v) {
            return false;
        }
        if(v1 != 0x80000000) {
            this.clearKeyboardFocusForVirtualView(v1);
        }
        if(v == 0x80000000) {
            return false;
        }
        this.l = v;
        this.onVirtualViewKeyboardFocusChanged(v, true);
        this.sendEventForVirtualView(v, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int v, int v1) {
        if(v != 0x80000000 && this.h.isEnabled()) {
            ViewParent viewParent0 = this.i.getParent();
            return viewParent0 == null ? false : viewParent0.requestSendAccessibilityEvent(this.i, this.a(v, v1));
        }
        return false;
    }
}

