package c3;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;

public abstract class c {
    @DoNotInline
    public static Drawable a(Resources resources0, int v, Resources.Theme resources$Theme0) {
        return resources0.getDrawable(v, resources$Theme0);
    }

    @DoNotInline
    public static Drawable b(Resources resources0, int v, int v1, Resources.Theme resources$Theme0) {
        return resources0.getDrawableForDensity(v, v1, resources$Theme0);
    }
}

