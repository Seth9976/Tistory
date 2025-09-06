package f3;

import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static int a(Drawable drawable0) {
        return drawable0.getLayoutDirection();
    }

    @DoNotInline
    public static boolean b(Drawable drawable0, int v) {
        return drawable0.setLayoutDirection(v);
    }
}

