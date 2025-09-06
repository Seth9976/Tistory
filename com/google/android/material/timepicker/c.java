package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.id;

public final class c extends AccessibilityDelegateCompat {
    public final ClockFaceView d;

    public c(ClockFaceView clockFaceView0) {
        this.d = clockFaceView0;
        super();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        int v = (int)(((Integer)view0.getTag(id.material_value_index)));
        if(v > 0) {
            accessibilityNodeInfoCompat0.setTraversalAfter(((View)this.d.h.get(v - 1)));
        }
        accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(0, 1, v, 1, false, view0.isSelected()));
        accessibilityNodeInfoCompat0.setClickable(true);
        accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_CLICK);
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view0, int v, Bundle bundle0) {
        if(v == 16) {
            long v1 = SystemClock.uptimeMillis();
            view0.getHitRect(this.d.e);
            float f = (float)this.d.e.centerX();
            float f1 = (float)this.d.e.centerY();
            MotionEvent motionEvent0 = MotionEvent.obtain(v1, v1, 0, f, f1, 0);
            this.d.d.onTouchEvent(motionEvent0);
            MotionEvent motionEvent1 = MotionEvent.obtain(v1, v1, 1, f, f1, 0);
            this.d.d.onTouchEvent(motionEvent1);
            return true;
        }
        return super.performAccessibilityAction(view0, v, bundle0);
    }
}

