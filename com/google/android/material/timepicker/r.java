package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.string;

public final class r extends a {
    public final k e;

    public r(Context context0, int v, k k0) {
        this.e = k0;
        super(context0, v);
    }

    @Override  // com.google.android.material.timepicker.a
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setContentDescription(view0.getResources().getString(string.material_minute_suffix, new Object[]{String.valueOf(this.e.e)}));
    }
}

