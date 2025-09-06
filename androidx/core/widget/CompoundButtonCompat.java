package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p3.b;
import p3.c;

public final class CompoundButtonCompat {
    @Nullable
    public static Drawable getButtonDrawable(@NonNull CompoundButton compoundButton0) {
        return c.a(compoundButton0);
    }

    @Nullable
    public static ColorStateList getButtonTintList(@NonNull CompoundButton compoundButton0) {
        return b.a(compoundButton0);
    }

    @Nullable
    public static PorterDuff.Mode getButtonTintMode(@NonNull CompoundButton compoundButton0) {
        return b.b(compoundButton0);
    }

    public static void setButtonTintList(@NonNull CompoundButton compoundButton0, @Nullable ColorStateList colorStateList0) {
        b.c(compoundButton0, colorStateList0);
    }

    public static void setButtonTintMode(@NonNull CompoundButton compoundButton0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        b.d(compoundButton0, porterDuff$Mode0);
    }
}

