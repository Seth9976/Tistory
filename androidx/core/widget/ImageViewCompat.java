package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p3.g;

public class ImageViewCompat {
    @Nullable
    public static ColorStateList getImageTintList(@NonNull ImageView imageView0) {
        return g.a(imageView0);
    }

    @Nullable
    public static PorterDuff.Mode getImageTintMode(@NonNull ImageView imageView0) {
        return g.b(imageView0);
    }

    public static void setImageTintList(@NonNull ImageView imageView0, @Nullable ColorStateList colorStateList0) {
        g.c(imageView0, colorStateList0);
    }

    public static void setImageTintMode(@NonNull ImageView imageView0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        g.d(imageView0, porterDuff$Mode0);
    }
}

