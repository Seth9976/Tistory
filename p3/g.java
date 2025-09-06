package p3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;

public abstract class g {
    @DoNotInline
    public static ColorStateList a(ImageView imageView0) {
        return imageView0.getImageTintList();
    }

    @DoNotInline
    public static PorterDuff.Mode b(ImageView imageView0) {
        return imageView0.getImageTintMode();
    }

    @DoNotInline
    public static void c(ImageView imageView0, ColorStateList colorStateList0) {
        imageView0.setImageTintList(colorStateList0);
    }

    @DoNotInline
    public static void d(ImageView imageView0, PorterDuff.Mode porterDuff$Mode0) {
        imageView0.setImageTintMode(porterDuff$Mode0);
    }
}

