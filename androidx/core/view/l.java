package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;

public abstract class l {
    @DoNotInline
    public static DisplayCutout a(Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3, Insets insets1) {
        return new DisplayCutout(insets0, rect0, rect1, rect2, rect3, insets1);
    }

    @DoNotInline
    public static Insets b(DisplayCutout displayCutout0) {
        return displayCutout0.getWaterfallInsets();
    }
}

