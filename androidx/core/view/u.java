package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;

public abstract class u {
    @DoNotInline
    public static int a(MenuItem menuItem0) {
        return menuItem0.getAlphabeticModifiers();
    }

    @DoNotInline
    public static CharSequence b(MenuItem menuItem0) {
        return menuItem0.getContentDescription();
    }

    @DoNotInline
    public static ColorStateList c(MenuItem menuItem0) {
        return menuItem0.getIconTintList();
    }

    @DoNotInline
    public static PorterDuff.Mode d(MenuItem menuItem0) {
        return menuItem0.getIconTintMode();
    }

    @DoNotInline
    public static int e(MenuItem menuItem0) {
        return menuItem0.getNumericModifiers();
    }

    @DoNotInline
    public static CharSequence f(MenuItem menuItem0) {
        return menuItem0.getTooltipText();
    }

    @DoNotInline
    public static MenuItem g(MenuItem menuItem0, char c, int v) {
        return menuItem0.setAlphabeticShortcut(c, v);
    }

    @DoNotInline
    public static MenuItem h(MenuItem menuItem0, CharSequence charSequence0) {
        return menuItem0.setContentDescription(charSequence0);
    }

    @DoNotInline
    public static MenuItem i(MenuItem menuItem0, ColorStateList colorStateList0) {
        return menuItem0.setIconTintList(colorStateList0);
    }

    @DoNotInline
    public static MenuItem j(MenuItem menuItem0, PorterDuff.Mode porterDuff$Mode0) {
        return menuItem0.setIconTintMode(porterDuff$Mode0);
    }

    @DoNotInline
    public static MenuItem k(MenuItem menuItem0, char c, int v) {
        return menuItem0.setNumericShortcut(c, v);
    }

    @DoNotInline
    public static MenuItem l(MenuItem menuItem0, char c, char c1, int v, int v1) {
        return menuItem0.setShortcut(c, c1, v, v1);
    }

    @DoNotInline
    public static MenuItem m(MenuItem menuItem0, CharSequence charSequence0) {
        return menuItem0.setTooltipText(charSequence0);
    }
}

