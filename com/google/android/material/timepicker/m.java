package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.string;

public final class m extends a {
    public final n e;

    public m(n n0, Context context0, int v) {
        this.e = n0;
        super(context0, v);
    }

    @Override  // com.google.android.material.timepicker.a
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setContentDescription(view0.getResources().getString(string.material_minute_suffix, new Object[]{String.valueOf(this.e.b.e)}));
    }
}

