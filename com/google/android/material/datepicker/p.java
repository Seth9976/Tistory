package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.string;

public final class p extends AccessibilityDelegateCompat {
    public final MaterialCalendar d;

    public p(MaterialCalendar materialCalendar0) {
        this.d = materialCalendar0;
        super();
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setHintText((this.d.L.getVisibility() == 0 ? this.d.getString(string.mtrl_picker_toggle_to_year_selection) : this.d.getString(string.mtrl_picker_toggle_to_day_selection)));
    }
}

