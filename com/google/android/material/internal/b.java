package com.google.android.material.internal;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class b extends AccessibilityDelegateCompat {
    public final int d;
    public final Object e;

    public b(Object object0, int v) {
        this.d = v;
        this.e = object0;
        super();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        switch(this.d) {
            case 0: {
                super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
                accessibilityEvent0.setChecked(((CheckableImageButton)this.e).isChecked());
                return;
            }
            case 4: {
                boolean z = true;
                super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
                accessibilityEvent0.setClassName("androidx.viewpager.widget.ViewPager");
                ViewPager viewPager0 = (ViewPager)this.e;
                if(viewPager0.e == null || viewPager0.e.getCount() <= 1) {
                    z = false;
                }
                accessibilityEvent0.setScrollable(z);
                if(accessibilityEvent0.getEventType() == 0x1000) {
                    PagerAdapter pagerAdapter0 = viewPager0.e;
                    if(pagerAdapter0 != null) {
                        accessibilityEvent0.setItemCount(pagerAdapter0.getCount());
                        accessibilityEvent0.setFromIndex(viewPager0.f);
                        accessibilityEvent0.setToIndex(viewPager0.f);
                    }
                }
                return;
            }
            default: {
                super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
            }
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        switch(this.d) {
            case 0: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.setCheckable(((CheckableImageButton)this.e).isCheckable());
                accessibilityNodeInfoCompat0.setChecked(((CheckableImageButton)this.e).isChecked());
                return;
            }
            case 1: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.setCheckable(((NavigationMenuItemView)this.e).w);
                return;
            }
            case 2: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                if(((com.google.android.material.sidesheet.b)this.e).j) {
                    accessibilityNodeInfoCompat0.addAction(0x100000);
                    accessibilityNodeInfoCompat0.setDismissable(true);
                    return;
                }
                accessibilityNodeInfoCompat0.setDismissable(false);
                return;
            }
            case 3: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.addAction(0x100000);
                accessibilityNodeInfoCompat0.setDismissable(true);
                return;
            }
            case 4: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.setClassName("androidx.viewpager.widget.ViewPager");
                ViewPager viewPager0 = (ViewPager)this.e;
                accessibilityNodeInfoCompat0.setScrollable(viewPager0.e != null && viewPager0.e.getCount() > 1);
                if(viewPager0.canScrollHorizontally(1)) {
                    accessibilityNodeInfoCompat0.addAction(0x1000);
                }
                if(viewPager0.canScrollHorizontally(-1)) {
                    accessibilityNodeInfoCompat0.addAction(0x2000);
                }
                return;
            }
            case 5: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                if(((BottomSheetDialog)this.e).k) {
                    accessibilityNodeInfoCompat0.addAction(0x100000);
                    accessibilityNodeInfoCompat0.setDismissable(true);
                    return;
                }
                accessibilityNodeInfoCompat0.setDismissable(false);
                return;
            }
            default: {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
            }
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void onPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        if(this.d != 6) {
            super.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
            return;
        }
        super.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
        if(accessibilityEvent0.getEventType() == 1) {
            ((BottomSheetDragHandleView)this.e).a();
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view0, int v, Bundle bundle0) {
        switch(this.d) {
            case 2: {
                if(v == 0x100000) {
                    com.google.android.material.sidesheet.b b0 = (com.google.android.material.sidesheet.b)this.e;
                    if(b0.j) {
                        b0.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view0, v, bundle0);
            }
            case 3: {
                if(v == 0x100000) {
                    ((BaseTransientBottomBar)this.e).dismiss();
                    return true;
                }
                return super.performAccessibilityAction(view0, v, bundle0);
            }
            case 4: {
                if(!super.performAccessibilityAction(view0, v, bundle0)) {
                    ViewPager viewPager0 = (ViewPager)this.e;
                    switch(v) {
                        case 0x1000: {
                            if(viewPager0.canScrollHorizontally(1)) {
                                viewPager0.setCurrentItem(viewPager0.f + 1);
                                return true;
                            }
                            break;
                        }
                        case 0x2000: {
                            if(viewPager0.canScrollHorizontally(-1)) {
                                viewPager0.setCurrentItem(viewPager0.f - 1);
                                return true;
                            }
                            break;
                        }
                        default: {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            case 5: {
                if(v == 0x100000) {
                    BottomSheetDialog bottomSheetDialog0 = (BottomSheetDialog)this.e;
                    if(bottomSheetDialog0.k) {
                        bottomSheetDialog0.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view0, v, bundle0);
            }
            default: {
                return super.performAccessibilityAction(view0, v, bundle0);
            }
        }
    }
}

