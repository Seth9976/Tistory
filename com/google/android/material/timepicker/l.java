package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.string;

public final class l extends a {
    public final int e;
    public final Object f;

    public l(Context context0, int v, k k0) {
        this.e = 1;
        this.f = k0;
        super(context0, v);
    }

    public l(n n0, Context context0, int v) {
        this.e = 0;
        this.f = n0;
        super(context0, v);
    }

    @Override  // com.google.android.material.timepicker.a
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        if(this.e != 0) {
            super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
            accessibilityNodeInfoCompat0.setContentDescription(view0.getResources().getString((((k)this.f).c == 1 ? string.material_hour_24h_suffix : string.material_hour_suffix), new Object[]{String.valueOf(((k)this.f).b())}));
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setContentDescription(view0.getResources().getString((((n)this.f).b.c == 1 ? string.material_hour_24h_suffix : string.material_hour_suffix), new Object[]{String.valueOf(((n)this.f).b.b())}));
    }
}

