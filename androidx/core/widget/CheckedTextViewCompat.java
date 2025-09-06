package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class CheckedTextViewCompat {
    @Nullable
    public static Drawable getCheckMarkDrawable(@NonNull CheckedTextView checkedTextView0) {
        return checkedTextView0.getCheckMarkDrawable();
    }

    @Nullable
    public static ColorStateList getCheckMarkTintList(@NonNull CheckedTextView checkedTextView0) {
        return checkedTextView0.getCheckMarkTintList();
    }

    @Nullable
    public static PorterDuff.Mode getCheckMarkTintMode(@NonNull CheckedTextView checkedTextView0) {
        return checkedTextView0.getCheckMarkTintMode();
    }

    public static void setCheckMarkTintList(@NonNull CheckedTextView checkedTextView0, @Nullable ColorStateList colorStateList0) {
        checkedTextView0.setCheckMarkTintList(colorStateList0);
    }

    public static void setCheckMarkTintMode(@NonNull CheckedTextView checkedTextView0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        checkedTextView0.setCheckMarkTintMode(porterDuff$Mode0);
    }
}

