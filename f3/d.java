package f3;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;

public abstract class d {
    @DoNotInline
    public static Drawable a(Drawable drawable0, Drawable drawable1) {
        return new AdaptiveIconDrawable(drawable0, drawable1);
    }

    @DoNotInline
    public static Icon b(Bitmap bitmap0) {
        return Icon.createWithAdaptiveBitmap(bitmap0);
    }
}

