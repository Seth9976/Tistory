package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class AccessibilityClickableSpanCompat extends ClickableSpan {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    public final int a;
    public final AccessibilityNodeInfoCompat b;
    public final int c;

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public AccessibilityClickableSpanCompat(int v, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, int v1) {
        this.a = v;
        this.b = accessibilityNodeInfoCompat0;
        this.c = v1;
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(@NonNull View view0) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.performAction(this.c, bundle0);
    }
}

