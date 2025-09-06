package p3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static ColorStateList a(CompoundButton compoundButton0) {
        return compoundButton0.getButtonTintList();
    }

    @DoNotInline
    public static PorterDuff.Mode b(CompoundButton compoundButton0) {
        return compoundButton0.getButtonTintMode();
    }

    @DoNotInline
    public static void c(CompoundButton compoundButton0, ColorStateList colorStateList0) {
        compoundButton0.setButtonTintList(colorStateList0);
    }

    @DoNotInline
    public static void d(CompoundButton compoundButton0, PorterDuff.Mode porterDuff$Mode0) {
        compoundButton0.setButtonTintMode(porterDuff$Mode0);
    }
}

