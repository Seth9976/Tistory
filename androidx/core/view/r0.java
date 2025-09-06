package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;

public abstract class r0 {
    @DoNotInline
    public static float a(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.getScaledHorizontalScrollFactor();
    }

    @DoNotInline
    public static float b(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.getScaledVerticalScrollFactor();
    }
}

