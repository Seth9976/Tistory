package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;

public abstract class m1 {
    @DoNotInline
    public static Insets a(Drawable drawable0) {
        return drawable0.getOpticalInsets();
    }
}

