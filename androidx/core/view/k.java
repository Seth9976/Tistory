package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;

public abstract class k {
    @DoNotInline
    public static DisplayCutout a(Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3) {
        return new DisplayCutout(insets0, rect0, rect1, rect2, rect3);
    }
}

