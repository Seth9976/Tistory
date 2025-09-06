package androidx.core.view;

import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;

@Deprecated
public final class MarginLayoutParamsCompat {
    @Deprecated
    public static int getLayoutDirection(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        int v = viewGroup$MarginLayoutParams0.getLayoutDirection();
        return v == 0 || v == 1 ? v : 0;
    }

    @Deprecated
    public static int getMarginEnd(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.getMarginEnd();
    }

    @Deprecated
    public static int getMarginStart(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.getMarginStart();
    }

    @Deprecated
    public static boolean isMarginRelative(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.isMarginRelative();
    }

    @Deprecated
    public static void resolveLayoutDirection(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.resolveLayoutDirection(v);
    }

    @Deprecated
    public static void setLayoutDirection(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.setLayoutDirection(v);
    }

    @Deprecated
    public static void setMarginEnd(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.setMarginEnd(v);
    }

    @Deprecated
    public static void setMarginStart(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.setMarginStart(v);
    }
}

