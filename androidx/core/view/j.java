package androidx.core.view;

import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import java.util.List;

public abstract class j {
    @DoNotInline
    public static DisplayCutout a(Rect rect0, List list0) {
        return new DisplayCutout(rect0, list0);
    }

    @DoNotInline
    public static List b(DisplayCutout displayCutout0) {
        return displayCutout0.getBoundingRects();
    }

    @DoNotInline
    public static int c(DisplayCutout displayCutout0) {
        return displayCutout0.getSafeInsetBottom();
    }

    @DoNotInline
    public static int d(DisplayCutout displayCutout0) {
        return displayCutout0.getSafeInsetLeft();
    }

    @DoNotInline
    public static int e(DisplayCutout displayCutout0) {
        return displayCutout0.getSafeInsetRight();
    }

    @DoNotInline
    public static int f(DisplayCutout displayCutout0) {
        return displayCutout0.getSafeInsetTop();
    }
}

