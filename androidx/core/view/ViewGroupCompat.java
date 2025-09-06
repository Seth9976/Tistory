package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    public static int getLayoutMode(@NonNull ViewGroup viewGroup0) {
        return viewGroup0.getLayoutMode();
    }

    public static int getNestedScrollAxes(@NonNull ViewGroup viewGroup0) {
        return u0.a(viewGroup0);
    }

    public static boolean isTransitionGroup(@NonNull ViewGroup viewGroup0) {
        return u0.b(viewGroup0);
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return viewGroup0.onRequestSendAccessibilityEvent(view0, accessibilityEvent0);
    }

    public static void setLayoutMode(@NonNull ViewGroup viewGroup0, int v) {
        viewGroup0.setLayoutMode(v);
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup0, boolean z) {
        viewGroup0.setMotionEventSplittingEnabled(z);
    }

    public static void setTransitionGroup(@NonNull ViewGroup viewGroup0, boolean z) {
        u0.c(viewGroup0, z);
    }
}

